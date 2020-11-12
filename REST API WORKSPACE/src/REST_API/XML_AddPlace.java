package REST_API;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
import REST_API_Files.ReusableMethods;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
public class XML_AddPlace {
	
	Properties p;
	
	/*@BeforeTest
	public void getEnv() throws IOException {
	    p = new Properties();
		FileInputStream fis = new FileInputStream("/home/prathik.g/eclipse-workspace/REST API WORKSPACE/src/REST_API_Files/env.properties");
		p.load(fis);
		
	}*/
	
	@Test
	public void addPlace() throws IOException {
		String payload1 = generateStringFromXml("/home/prathik.g/Desktop/addPlaceXml.xml");
		RestAssured.baseURI = "http://216.10.245.166";
		/*String body = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" + 
				"<root>\n" + 
				"    <location>\n" + 
				"        <lat>-38.383494</lat>\n" + 
				"        <lng>33.427362</lng>\n" + 
				"    </location>\n" + 
				"    <accuracy>50</accuracy>\n" + 
				"    <name>The Mens store</name>\n" + 
				"    <phone_number>(+91) 983 893 3937</phone_number>\n" + 
				"    <address>Anna Salai, Chennai</address>\n" + 
				"    <types>shoe park</types>\n" + 
				"    <types>kadai</types>\n" + 
				"    <website>http://google.com</website>\n" + 
				"    <language>tamil-IN</language>\n" + 
				"</root>"; */
		
		Response res =  given().
				queryParam("key","qaclick123").
				body(payload1).when().post("/maps/api/place/add/xml").then().assertThat().statusCode(200).and().
			contentType(ContentType.XML).and().body("status",equalTo("OK")).extract().response();
		
	XmlPath x= ReusableMethods.rawtoXml(res);
	System.out.println(x.get("place_id"));
	
		
		}
	public String generateStringFromXml(String path) throws IOException {
		return new String(Files.readAllBytes(Paths.get(path)));
	}

}
