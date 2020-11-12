package REST_API;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetWallet {

@Test
public void getWallet() throws InterruptedException {
	
	RestAssured.baseURI="https://api.gw.zetapay.in/zeta.in";
	String token="SGFNektUcno3WU5tcjVtMnhSemFndlVDd1ZDM1hDdXBNa2dVdHh6Q1dNVXlpc090OTdLVTFtRlJjY2s9OkFRR3RXMVVQSjBvNm1HTFFpSnJsZDh2TWhoZVlkS01GNGhtOTJlaUUvVnkrdXYyYWZFS2d6eEN0YjFtUFdrL0Yza25tNndxNDJJc1pZMlJuZzlCUG9SZ2hRVXh3cHo0TDhodlRQMjdqaGY1VkZyd3A0NDlISlBmaytOMzdpc2tSUWhSSHhVU3FVV1Nydzg2WXNDUTFVYnpwWVJXRXJYZ1hnWTNMeGZzM21nPT0";
	String payload="{  \"cardCriteria\":\n" + 
			"  {    \"*\":\n" + 
			"  \n" + 
			"    {        \"includeZeroBalance\":true,        \n" + 
			"            \"states\":[\"BLOCKED\", \"CLOSED\", \"DISABLED\", \"ENABLED\"]  \n" + 
			"      \n" + 
			"    }  \n" + 
			"   \n" + 
			"  },  \"walletID\":\"5577775\"\n" + 
			"  ,\"getAllCards\": true \n" + 
			"}";
	
	RequestSpecification req=RestAssured.given().
	header("content-type","application/json").
	header("hostname","https://api.stage.zeta.in/zeta.in").
	queryParam("token",token).
	body(payload);
	
	Response res = req.post("/wallet/1.0/getWalletV3");
	Thread.sleep(2000);
	int statuscode=res.getStatusCode();
	System.out.println("status code is " + statuscode);
	Assert.assertEquals(statuscode, 200,"Its correct status code");
	Reporter.log("got the correct status code : 200 ok");


	}

}
