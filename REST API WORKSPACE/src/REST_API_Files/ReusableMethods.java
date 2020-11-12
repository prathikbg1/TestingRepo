package REST_API_Files;

import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class ReusableMethods {
	
	public static XmlPath rawtoXml(Response r) {
		String resString = r.asString();
		XmlPath xp = new XmlPath(resString);
		return xp;

	}

	public static JsonPath rawtoJson(Response r) {
		String resString = r.asString();
        JsonPath jp = new JsonPath(resString);
		return jp;
		
	}
}
