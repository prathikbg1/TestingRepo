package REST_API_Files;

public class getPayload {
	
	
	public static String getBody1() {
	String	body = "{\n" + 
			"\n" + 
			"    \"location\":{\n" + 
			"\n" + 
			"        \"lat\" : -38.383494,\n" + 
			"\n" + 
			"        \"lng\" : 33.427362\n" + 
			"\n" + 
			"    },\n" + 
			"\n" + 
			"    \"accuracy\":50,\n" + 
			"\n" + 
			"    \"name\":\"Frontline house\",\n" + 
			"\n" + 
			"    \"phone_number\":\"(+91) 983 893 3937\",\n" + 
			"\n" + 
			"    \"address\" : \"29, side layout, cohen 09\",\n" + 
			"\n" + 
			"    \"types\": [\"shoe park\",\"shop2\"],\n" + 
			"\n" + 
			"    \"website\" : \"http://google.com\",\n" + 
			"\n" + 
			"    \"language\" : \"French-IN\"\n" + 
			"\n" + 
			"}";
		
		return body;
	}
	
	public static String addBookPayload(String isbn,String aisle) {
		String payload="{\n" + 
				"\"name\":\"Learn Appium Automation with Java\",\n" + 
				"\"isbn\":\""+isbn+"\",\n" + 
				"\"aisle\":\""+aisle+"\",\n" + 
				"\"author\":\"John foe\"\n" + 
				"}";
		
		return payload;
	}
	
}
