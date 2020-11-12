package LibraryApi;

import static io.restassured.RestAssured.given;	
import static org.hamcrest.Matchers.equalTo;

import org.openqa.selenium.remote.Response;

import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;



public class Auth20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Url ="https://rahulshettyacademy.com/getCourse.php?state=verifyfjdss&code=4%2FvAHBQUZU6o4WJ719NrGBzSELBFVBI9XbxvOtYpmYpeV47bFVExkaxWaF_XR14PHtTZf7ILSEeamywJKwo_BYs9M&scope=email+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email+openid&authuser=0&session_state=0c32992f0d47e93d273922018ade42d1072b9d1f..a35c&prompt=none#";
		String partialUrl = Url.split("code=")[1];
		String code = partialUrl.split("&scope")[0];
		System.out.println("code is :" + code);
		
		//gettoken
	String accessToken =	given().urlEncodingEnabled(false).
		queryParam("code",code).
		queryParam("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com").
		queryParam("client_secret", "erZOWM9g3UtwNRj340YYaK_W").
		queryParam("redirect_uri", "https://rahulshettyacademy.com/getCourse.php").
        queryParam("grant_type","authorization_code").log().all().when().post("https://www.googleapis.com/oauth2/v4/token").then().extract().response().asString();
	JsonPath js = new JsonPath(accessToken);
String token=	js.getString("access_token");
System.out.println(token);
	

     //getcource
String res = given().queryParam("Content-Type","application/json").queryParam("access_code",token).
log().all().expect().defaultParser(Parser.JSON).when().get("https://rahulshettyacademy.com/getCourse.php").asString();
JsonPath js1=new JsonPath(res);
System.out.println(js1);
	}

}
