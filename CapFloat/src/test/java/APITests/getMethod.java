package APITests;

import org.testng.annotations.DataProvider;	
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utils.restUtil;

import org.testng.annotations.Test;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import junit.framework.Assert;

public class getMethod {
	static String dir;
	static Properties p;
	String id1;
	
	@Test(dataProvider="SearchProvider",priority=0)
	public void createRequest(String body) throws IOException {
		 dir=	System.getProperty("user.dir");
		p = new Properties();
		FileInputStream fis = new FileInputStream(dir+"/src/test/java/Utils/config.properties");
		p.load(fis);
	RestAssured.baseURI=p.getProperty("baseurl");
	String payload ="{\"sample\": \""+body+"\"}";
	Response res=	RestAssured.given().header("Content-Type", "application/json").
		header("secret-key",p.getProperty("secretKey")).body(payload).
		when().post("/b").then().assertThat().statusCode(200).extract().response();
	org.testng.Assert.assertEquals(res.getStatusCode(),200);
	org.testng.Assert.assertEquals(res.getContentType(),"application/json; charset=utf-8");
		
	String res1 = res.asString();
		io.restassured.path.json.JsonPath js = restUtil.rawToJson(res1);
		id1 =js.get("id");
		System.out.println(js.get("success"));
		System.out.println(js.get("id"));
		System.out.println(js.get("data.sample"));
		
		
	}
	 @DataProvider(name="SearchProvider")
     public  Object[][] getDataFromDataprovider(){
		 return new Object[][] {{"Prathik"},{"gaonkar"},{"  %^^^_"},{"111111"}};
	 }
	 
	 @Test(priority=1)
	 public void readData() {
		 RestAssured.baseURI=p.getProperty("baseurl");
		Response res = RestAssured.given().header("secret-key",p.getProperty("secretKey")).
		 when().get("/b/"+p.getProperty("id")+"").then().assertThat().statusCode(200).extract().response();
		
		org.testng.Assert.assertEquals(res.getContentType(),"application/json; charset=utf-8");
		System.out.println(res.getSessionId());
		System.out.println(res.getStatusLine());
		System.out.println(res.getTime());
		
		
		String res1 = res.asString();
		JsonPath js  = restUtil.rawToJson(res1);
		System.out.println(js.get("sample"));
		
		 }
	 
	 @Test(priority=2)
		 public void updateData() {
		 RestAssured.baseURI=p.getProperty("baseurl");
		 String payload ="{\"sample\": \"changes been done11\"}";
		Response res = RestAssured.given().header("Content-Type","application/json").header("secret-key",p.getProperty("secretKey")).body(payload).
		 when().put(("/b/"+p.getProperty("id")+"")).then().assertThat().statusCode(200).extract().response();
		
		String res1 = res.asString();
		JsonPath js  = restUtil.rawToJson(res1);
	String key=	js.get("parentId");
			System.out.println(js.get("data.sample"));
			
			org.testng.Assert.assertEquals(p.getProperty("id"), key);
	 
	 }
	 
	 @Test(priority=3)
	 public void deleteData() {
		 RestAssured.baseURI=p.getProperty("baseurl");
		 Response res = RestAssured.given().header("secret-key",p.getProperty("secretKey")).
				 when().delete(("/b/"+p.getProperty("id")+"")).then().assertThat().statusCode(200).extract().response();
		
		 String res1 = res.asString();
		 JsonPath js  = restUtil.rawToJson(res1);
		String id1= js.get("id");
		String msg = js.get("message");
		org.testng.Assert.assertEquals(p.getProperty("id"), id1);
		System.out.println(msg);
	 }
	 }

