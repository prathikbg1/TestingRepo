import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;	
import static org.hamcrest.Matchers.equalTo;
import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import junit.framework.Assert;

public class TC02_Post_Request {
	
	@Test
	public void registartion() {
		
		RestAssured.baseURI="http://restapi.demoqa.com/customer";
		
		PreemptiveBasicAuthScheme basicauth = new PreemptiveBasicAuthScheme();
	basicauth.setUserName("abx");
		basicauth.setPassword("xxx");
		
		RestAssured.authentication=basicauth;
		
		
		JSONObject requestParams = new JSONObject();
	   	requestParams.put("FirstName","Prat123");
		  requestParams.put("LastName","XYZJohn");
		  requestParams.put("UserName","prat123");
		  requestParams.put("Password","JohnXYZxyx");
		  requestParams.put("Email","prat123@gmail.com");
		  String payload=requestParams.toJSONString();
		  
		 Response res= given().header("ContentType","application/json").body(payload).when().post("http://restapi.demoqa.com/customer/register").
		  then().statusCode(201).body("Message",equalTo("Operation completed successfully")).extract().response();
		 
		 Assert.assertEquals(201, res.getStatusCode());
		 System.out.println(res.getStatusCode());
		
		 
		String re = res.asString();
		JsonPath js = new JsonPath(re);
		Assert.assertEquals("OPERATION_SUCCESS", js.get("SuccessCode"));
		System.out.println(js.get("SuccessCode"));
		
		Headers allheaders = res.getHeaders();
		for(Header h:allheaders) {
			System.out.println(h.getName() + "     " + h.getValue());

		}
	}

}
