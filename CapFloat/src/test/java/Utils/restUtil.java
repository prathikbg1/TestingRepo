package Utils;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class restUtil {
	
	public static JsonPath rawToJson(String r)
	{ 
		JsonPath x=new JsonPath(r);
		System.out.println(r);
		return x;
	}

}
