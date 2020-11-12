package REST_API;
import static org.hamcrest.Matchers.equalTo;		

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
	
@Test
public class DeleteAPI {
	
	@Test
	public void delete() {
		
		RestAssured.baseURI="http://216.10.245.166";
		
	Response res=	given().
		     param("key","qaclick123").
		     body("{\n" + 
		     		"    \"place_id\":\"928b51f64aed18713b0d164d9be8d67f\" \n" + 
		     		"}").
		     when().get("/maps/api/place/delete/json").
		     then().assertThat().statusCode(200).extract().response();
	
	String resBody=res.asString();
	System.out.println(resBody);
		
	}
	

}
