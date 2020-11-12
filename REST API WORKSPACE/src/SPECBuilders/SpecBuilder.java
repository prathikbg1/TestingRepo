package SPECBuilders;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.internal.RequestSpecificationImpl;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.Addplace;
import pojo.Location;


public class SpecBuilder {
	
	public static void main(String[] args) {
	
	
	
	Addplace p = new Addplace();
	p.setAccuracy(100);
	p.setName("Nike Shop2");
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
	
	RequestSpecification req = new RequestSpecBuilder().setBaseUri("http://216.10.245.166/").addQueryParam("key","qaclick123").
			setContentType(ContentType.JSON).build();
	
	ResponseSpecification res = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
	
	RequestSpecification res1 = given().spec(req).body(p);
	String response = res1.when().post("maps/api/place/add/json").then().spec(res).extract().response().asString();
System.out.println(response);
}
}