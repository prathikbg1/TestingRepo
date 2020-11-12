package REST_API;

import org.testng.annotations.BeforeTest;	
import org.testng.annotations.Test;

import REST_API_Files.getPayload;
import REST_API_Files.getResource;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.equalTo;

import java.io.FileInputStream;
import REST_API_Files.getResource;
import REST_API_Files.getPayload;
import java.io.IOException;
import java.util.Properties;

import static io.restassured.RestAssured.given;

public class GrabAddPlaceToDelete {
	
	Properties p;
	
	@BeforeTest
	public void getData() throws IOException {
		
		 p = new Properties();
		FileInputStream fis = new FileInputStream("/home/prathik.g/eclipse-workspace/REST API WORKSPACE/src/REST_API_Files/env.properties");
        p.load(fis);
	}
	
	@Test
	public void addPlace2() {
		
		
		RestAssured.baseURI= p.getProperty("Host");
		/*String payload="{\n" + 
				"\n" + 
				"    \"location\":{\n" + 
				"\n" + 
				"        \"lat\" : -38.383494,\n" + 
				"\n" + 
				"        \"lng\" : 33.427362\n" + 
				"\n" + 
				"    },\n" + 
				"\n" + 
				"    \"accuracy\":50,\n" + 
				"\n" + 
				"    \"name\":\"Frontline house\",\n" + 
				"\n" + 
				"    \"phone_number\":\"(+91) 983 893 3937\",\n" + 
				"\n" + 
				"    \"address\" : \"29, side layout, cohen 09\",\n" + 
				"\n" + 
				"    \"types\": [\"shoe park\",\"shop\"],\n" + 
				"\n" + 
				"    \"website\" : \"http://google.com\",\n" + 
				"\n" + 
				"    \"language\" : \"French-IN\"\n" + 
				"\n" + 
				"}";
		*/
		
		Response res=given().
				
				queryParam("key",p.getProperty("key")).body(getResource.addRes()).when().post(getResource.addRes()).then().assertThat().
				statusCode(200).and().contentType(ContentType.JSON).extract().response();
		
		String resString=res.asString();
		System.out.println(resString);   
		JsonPath js = new JsonPath(resString);
		String placeId = js.get("place_id");
		System.out.println(placeId);
		
		given().
		queryParam("key",p.getProperty("key")).
		body("{"+ 
				"\"place_id\": \""+placeId+"\""+ 
				"}").
		when().post(getResource.deleteRes()).then().assertThat().statusCode(200).and().contentType(ContentType.JSON).
		and().body("status",equalTo("OK"));
		
		
	}

}
