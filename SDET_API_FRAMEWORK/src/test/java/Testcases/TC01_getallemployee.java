package Testcases;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import basepackage.TestBase;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC01_getallemployee extends TestBase {

	RequestSpecification request;
	 Response response;
	
	@BeforeClass
	public void getallEmp() throws InterruptedException {
		logger.info("-------------Started TC01------------");
	
		RestAssured.baseURI="http://dummy.restapiexample.com/";
		request = RestAssured.given();
		response = request.when().get("api/v1/employees");
		
		Thread.sleep(3000);
		}
	
	@Test
	public void checkResponseBody() {
		logger.info("-------------check RES Body-----------");
		
		String resBody = response.asString();
		logger.info("Response body--> " +resBody);
		Assert.assertTrue(resBody!=null);
	}
	
	@Test
	public void checkStatusCode() {
		logger.info("--------------check status code-----------");
	
		int statusCode = response.getStatusCode();
		logger.info("status code ---> " + statusCode);
		Assert.assertEquals(statusCode,200);
	}
	
	@Test
	public void checkResponseTime() {
		logger.info("--------------Check Response Time-----------");
		
		long resTime= response.getTime();
		logger.info("ResponseTime --> " + resTime);
		if(resTime>10000) {
			logger.warn("Response Time is greater than 2000");
			
			Assert.assertTrue(resTime<10000);
		}
	}
	@Test
	public void checkstatusLine(){
		
			logger.info("--------------check Status Line-----------");
			
			String statusLine= response.getStatusLine();
			logger.info("statusLine --> " + statusLine);
		Assert.assertEquals(statusLine,"HTTP/1.1 200 OK");
		
		
	}
	
	

}
