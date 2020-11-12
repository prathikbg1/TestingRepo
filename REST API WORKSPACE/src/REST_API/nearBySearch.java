package REST_API;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.equalTo;

import java.lang.*;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class nearBySearch {

	//public static void main(String[] args) { we can do without testng
		// TODO Auto-generated method stub
	
	@Test
	public  void search() {
		
		RestAssured.baseURI="https://maps.googleapis.com";
		
	Response res=	given().
		      param("location","-33.8670522,151.1957362").
		      param("radius","1500").
		      param("type","restaurant").
		      param("keyword","cruise").
		      param("key","AIzaSyBpeA55NpD-cPXEgFgm2absyvCOJ8yfi54").
		      when().get("/maps/api/place/nearbysearch/json").
		      then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
		   //   body("results[0].geometry.location.lat",equalTo("-33.8675921")).and().
		    //  body("results[0].name",equalTo("Cruise Bar")).and().
		     // body("results[1].place_id",equalTo("ChIJrTLr-GyuEmsRBfy61i59si0")).and().
		    extract().response();
	
	String resBody = res.asString();
	System.out.println(resBody);
	JsonPath js = new JsonPath(resBody);
	String s = js.get("status");
	System.out.println(s);

	
	}

}
