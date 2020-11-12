package StepDefinations;


	


import java.util.ArrayList;			
import java.util.List;

import org.junit.Assert;
import org.junit.runner.RunWith;

import Resource.AddPlacePayload;
import Resource.CRUDResource;
import Resource.EnumResource;
import Pojo.Addplace;
import Pojo.Location;
import Resource.ReusableUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;



	


	@RunWith(Cucumber.class)
	public class addPlaceStepDefination extends ReusableUtilities{
		ResponseSpecification res;
		RequestSpecification req1;
		RequestSpecification req2;
		Response response;
		
        Resource.AddPlacePayload ap = new Resource.AddPlacePayload();
        CRUDResource cd = new CRUDResource();
        @Given("^Add place payload pass \"([^\"]*)\" and \"([^\"]*)\"$")
        public void add_place_payload_pass_something_and_something(String language, String cityname) throws Throwable {
         
	    	
	      req1 = RestAssured.given().spec(RequestSpec()).body(ap.getAddPlacePayload(language,cityname));
	    	
	    }

        @When("^Users calls \"([^\"]*)\" with \"([^\"]*)\" Http request$")
        public void users_calls_something_with_something_http_request(String resource,String methodType) throws Throwable {
	    	
	  EnumResource getResource =  EnumResource.valueOf(resource);
	     res = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
	     
	     if(methodType.equalsIgnoreCase("POST")) {
	    	 response =req1.when().post(getResource.getResourceAPI()).then().log().all().spec(res).extract().response();
	        }
	     else if(methodType.equalsIgnoreCase("GET")) {
	    	 response =req1.when().get(getResource.getResourceAPI()).then().log().all().spec(res).extract().response();
	     }
        }
        
        
	    @Then("^API call is success with status code 200$")
	    public void api_call_is_success_with_status_code_200() throws Throwable {
	    	Assert.assertEquals(response.getStatusCode(), 200);
	        
	    }

	    @And("^In body \"([^\"]*)\" is code \"([^\"]*)\"$")
	    public void in_body_something_is_code_something(String keyValue, String expectedValue) throws Throwable {
	    String res =response.asString();
	  JsonPath js = new JsonPath(res);
	    Assert.assertEquals(js.get("status").toString(),expectedValue);
	    
	//   String status = getJsonElements(response, "status");

	        
	    }
	    @And("^verify the placeid created that maps to \"([^\"]*)\" using \"([^\"]*)\" Api$")
	    public void verify_the_placeid_created_that_maps_to_something_using_something_api(String expectedname, String resource) throws Throwable {
	        String placeid = getJsonElements(response, "place_id");
	    	req2 = RestAssured.given().spec(RequestSpec()).queryParam("place_id",placeid);
	    			users_calls_something_with_something_http_request(resource,"GET");
	    			String actualName = getJsonElements(response,"name");
	    			Assert.assertEquals(expectedname, actualName);
	    }
	    
	    @Given("^Verify deleteAPI$")
	    public void verify_deleteapi() throws Throwable {
	       
	    }

	    @When("^Users calls \"([^\"]*)\" with \"([^\"]*)\" request$")
	    public void users_calls_something_with_something_request(String strArg1, String strArg2) throws Throwable {
	       
	    }

	    @Then("^And In body \"([^\"]*)\" is code \"([^\"]*)\"$")
	    public void and_in_body_something_is_code_something(String strArg1, String strArg2) throws Throwable {
	       
	    }



}
