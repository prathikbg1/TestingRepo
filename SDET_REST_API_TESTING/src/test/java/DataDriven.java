import org.json.simple.JSONObject;
import org.omg.PortableInterceptor.USER_EXCEPTION;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import junit.framework.Assert;
import Resourcedata.XLUtils;

import static io.restassured.RestAssured.given;	
import static org.hamcrest.Matchers.equalTo;

import java.io.IOException;

public class DataDriven {

	
	@Test(dataProvider="getData")
	public void createuser(String name,String age,String salary) {
		RestAssured.baseURI="http://dummy.restapiexample.com";
		
		// one way //
		/*JSONObject requestParam = new JSONObject();
		requestParam.put("name", "prathik");
		requestParam.put("age", "22");
		requestParam.put("salary", "10000");
		String payload = requestParam.toJSONString();
		
	Response res =	given().header("Content-Type","application/json").body(payload).when().post("/api/v1/create").then().
		statusCode(200).extract().response();
	String resBody = res.asString();
	JsonPath jp = new JsonPath(resBody);
	System.out.println(jp.get("status"));
	
		Assert.assertEquals(resBody.contains("prathik"), true);
		Assert.assertEquals(resBody.contains("22"), true);
		Assert.assertEquals(resBody.contains("10000"), true);*/
		
		// 2nd way---------------------------------------------------------------------------//
		JSONObject requestParam = new JSONObject();
		requestParam.put("name",name);
		requestParam.put("age",age);
		requestParam.put("salary",salary);
		String payload = requestParam.toJSONString();
		
	Response res =	given().header("Content-Type","application/json").body(payload).when().post("/api/v1/create").then().
		statusCode(200).extract().response();
	String resBody = res.asString();
	JsonPath jp = new JsonPath(resBody);
	System.out.println(jp.get("status"));
	System.out.println(resBody);
	}
	
	@DataProvider(name="getData")
	public String[][] storeData() throws IOException {
		
		String Path = System.getProperty("user.dir")+"/src/test/java/Resourcedata/Data.xlsx";
		int rowsCount = XLUtils.getRowCount(Path, "Sheet1");
		int colCount = XLUtils.getCellCount(Path, "Sheet1",1);
		
		String empdata[][]= new String[rowsCount][colCount];
		for(int i=1;i<=rowsCount;i++) {
			for(int j=0;i<colCount;j++) {
				empdata[i-1][j]=XLUtils.getCellData(Path, "Sheet1", i, j);
			}
		}
		return empdata;
		
		
		/*String dataSet[][]= {{"ram","11","5000"},{"sham","12","12000"},{"bham","33","45000"}};
		return dataSet;*/
	}
		
	

}
