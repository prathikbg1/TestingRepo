package APITests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.restassured.RestAssured;

public class readMethod {
	static String dir;

	public void readDate() throws IOException {
		 dir=	System.getProperty("user.dir");
		 Properties p = new Properties();
		FileInputStream fis = new FileInputStream(dir+"/src/test/java/Utils/config.properties");
		p.load(fis);
		
		RestAssured.baseURI=p.getProperty("baseurl");
	}
}
