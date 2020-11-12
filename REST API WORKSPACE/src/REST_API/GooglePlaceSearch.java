package REST_API;

import static org.testng.Assert.assertEquals;
import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GooglePlaceSearch {
	
	@Test
	public void Search() {
		
		RestAssured.baseURI="https://maps.googleapis.com";
		
		RequestSpecification req=RestAssured.given().queryParam("key","AIzaSyBwUkfQYPKSZn7k49XX-sKtujuOv2IY0is").
				queryParam("input","%2B61293744000").queryParam("inputtype","phonenumber");
		
		Response res = req.get("maps/api/place/findplacefromtext/json");
		int statuscode = res.getStatusCode();
		System.out.println("status code is " + statuscode);
	Assert.assertEquals(statuscode,200, "correct status code");
	Reporter.log("got the correct status code : 200 ok");
	
	}

}
