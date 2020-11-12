package LibraryApi;

import io.restassured.RestAssured;		
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import REST_API_Files.*;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AddBook {
	String id;
	
	@Test(dataProvider="BookData")
	public void addBook(String isbn,String aisle) {
		
		RestAssured.baseURI="http://216.10.245.166/";
	    String payload = getPayload.addBookPayload(isbn,aisle);
	    
	    Response res = given().header("Content-Type","application/json").body(payload).
	    when().post("Library/Addbook.php").then().assertThat().statusCode(200).
	    and().body("Msg",equalTo("successfully added")).extract().response();
	    
	    String msg = res.asString();
	    JsonPath js = new JsonPath(msg);
	    id = js.get("ID");
	   System.out.println("ID is : " + id); 
	   }
	    
	   //deleteBook
	
	@Test
	public void deleteBook() {
	String payload1 = "{\n" + 
			" \n" + 
			"\"ID\" : \""+id+"\"\n" + 
			" \n" + 
			"}";
    Response res1 = given().header("Content-Type","application/json").body(payload1).
    		when().post("Library/DeleteBook.php").then().assertThat().log().all().statusCode(200).and().
    		body("msg",equalTo("book is successfully deleted")).extract().response();
    
    String msg1 = res1.asString();
    JsonPath js = new JsonPath(msg1);
  String status = js.get("msg");
  System.out.println(status); 
 } 
	
@DataProvider(name="BookData")
public Object[][] getData() {
	Object book[][]= new Object[3][2];
	book[0][0]="CA";
	book[0][1]="1111";
	
	book[1][0]="Math";
	book[1][1]="2222";
	
	book[2][0]="Chem";
	book[2][1]="3333";
	
	return book;
}

}
