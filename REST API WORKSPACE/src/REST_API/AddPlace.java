package REST_API;

import java.io.FileInputStream;	
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import files.AddPlaceBody;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AddPlace {
	
	Properties p = new Properties();
	
	@BeforeTest
	public void getEnv() throws IOException {
	
		FileInputStream fis = new FileInputStream("/home/prathik.g/eclipse-workspace/REST API WORKSPACE/src/REST_API_Files/env.properties");
		p.load(fis);
	
		
	}
	@Test
	public void addPlace() {
		
		//RestAssured.baseURI="http://216.10.245.166";
		RestAssured.baseURI=p.getProperty("Host");
		
		String payload=AddPlaceBody.payLoad();
		
		
		
		 RequestSpecification req = RestAssured.given().queryParam("key",p.getProperty("key")).body(payload);
		
		Response res = req.post("maps/api/place/add/json");
		int statuscode = res.getStatusCode();
		System.out.println("status code is " + statuscode);
		Assert.assertEquals(statuscode,200, "200 is correct status code");
		Reporter.log("got correct status code : 200 OK"); 
		 
	
	}

}
