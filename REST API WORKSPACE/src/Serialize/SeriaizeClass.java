package Serialize;
import static io.restassured.RestAssured.given;	
import static org.hamcrest.Matchers.equalTo;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;
import pojo.Addplace;
import pojo.Location;


public class SeriaizeClass {
	
	public static void main(String[] args) {
	
	RestAssured.baseURI="http://216.10.245.166/";
	
	Addplace p = new Addplace();
	p.setAccuracy(100);
	p.setName("Nike Shop");
	p.setPhone_number("+918217773480");
	p.setAddress("New york,Street 24");
	
	List<String> myList = new ArrayList<String>();
	myList.add("jordon");
	myList.add("HighPop");
	p.setTypes(myList);
	
	p.setWebsite("www.nike.in");
	p.setLanguage("EN");
	
	Location l = new Location();
	l.setLat(23.4534);
	l.setLng(101.455656);
	p.setLocation(l);
	
	String res = given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json").body(p).
	when().post("maps/api/place/add/json").then().assertThat().statusCode(200).and().extract().response().asString();
System.out.println(res);
}
}