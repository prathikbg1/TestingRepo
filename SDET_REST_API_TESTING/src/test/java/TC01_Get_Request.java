import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.given;	
import static org.hamcrest.Matchers.equalTo;

public class TC01_Get_Request {

	
	@Test
	public void getWeatherDetails() {
		
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		
	    Response res = given().when().get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad").then().
		statusCode(200).and().statusLine("HTTP/1.1 200 OK").log().all().body("City",equalTo("Hyderabad")).extract().response();
	    Assert.assertEquals(res.getStatusCode(),200);
	    Assert.assertEquals(res.getStatusLine(),"HTTP/1.1 200 OK");
	    
	System.out.println("status is : " + res.getStatusCode());
    System.out.println("status line is : " + res.getStatusLine());
	 }
}
