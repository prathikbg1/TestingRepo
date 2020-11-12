package LibraryApi;

import static io.restassured.RestAssured.given;	
import static org.hamcrest.Matchers.equalTo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.annotations.Test;

import REST_API_Files.getPayload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class StaticJsonAddBook {
	String id;
	
	@Test
public void addBook() throws IOException {
		
		RestAssured.baseURI="http://216.10.245.166/";
	    String payload = generateStringFromResource("/home/prathik.g/Desktop/AddBook.json");
	    
	    Response res = given().header("Content-Type","application/json").body(payload).
	    when().post("Library/Addbook.php").then().assertThat().statusCode(200).
	    and().body("Msg",equalTo("successfully added")).extract().response();
	    
	    String msg = res.asString();
	    JsonPath js = new JsonPath(msg);
	    id = js.get("ID");
	   System.out.println("ID is : " + id); 
	   }

public static String generateStringFromResource(String Path) throws IOException {
	return new String(Files.readAllBytes(Paths.get(Path)));
}

}
