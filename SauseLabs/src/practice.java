import java.net.MalformedURLException;
import java.net.URI;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class practice {
	
	public static void main(String[] args) throws MalformedURLException {
		
	
	/*final String USERNAME = "prathikgnova";

	  final String ACCESS_KEY = "cb635dc9-db33-422c-8dc4-727fc7474ebf";

	  final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.us-west-1.saucelabs.com:443/wd/hub"; */
	  
	  MutableCapabilities sauceOpts = new MutableCapabilities();
		
		sauceOpts.setCapability("build", "Java-W3C-Examples");
		sauceOpts.setCapability("seleniumVersion", "3.141.59");
		sauceOpts.setCapability("username", "prathikgnova");
		sauceOpts.setCapability("accessKey", "cb635dc9-db33-422c-8dc4-727fc7474ebf");
		sauceOpts.setCapability("tags", "w3c-chrome-tests");
	
	
		// TODO Auto-generated method stub
	DesiredCapabilities browserOptions = DesiredCapabilities.chrome();
		browserOptions.setCapability("sauce:options", sauceOpts);
		browserOptions.setCapability("platformName", "Linux");
		browserOptions.setCapability("browserName", "Chrome");
		

		
		WebDriver dr = new RemoteWebDriver(new java.net.URL("https://@ondemand.us-west-1.saucelabs.com:443/wd/hub"),browserOptions);
		
		
		
		dr.get("https://freecrm.co.in/");
		System.out.println(dr.getTitle());
	}
}
