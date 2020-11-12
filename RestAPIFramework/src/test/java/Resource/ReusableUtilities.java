package Resource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import com.sun.xml.fastinfoset.sax.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ReusableUtilities {
	
	RequestSpecification req;
	
	public RequestSpecification RequestSpec() throws IOException {
		if(req==null) {
		
		PrintStream log = new PrintStream(new FileOutputStream("logging.txt"));
		
 req = new RequestSpecBuilder().setBaseUri(globalValue("baseurl")).addQueryParam("key","qaclick123")
	    		.addFilter(RequestLoggingFilter.logRequestTo(log))
	    	    .addFilter(ResponseLoggingFilter.logResponseTo(log)).setContentType(ContentType.JSON).build();
		return req;
		}
		 
		 return req;
	}
	
	public static String globalValue(String key) throws IOException {
		java.util.Properties p = new java.util.Properties();
		FileInputStream fis = new FileInputStream("/home/prathik.g/eclipse-workspace/RestAPIFramework/src/test/java/Resource/gobalvalue.properties");
        p.load(fis);	
        return p.getProperty(key);
        
       
	}
	
	public String getJsonElements(Response response,String key) {
		String resp = response.asString();
		JsonPath js = new JsonPath(resp);
		 return  js.get(key).toString();
	}

}
