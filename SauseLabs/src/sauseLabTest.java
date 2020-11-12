import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class sauseLabTest {
	
	static WebDriver dr;
	
	public static void main(String[] args) {
		
		setup("chrome");
	}
	public static void setup(String bName) {
	MutableCapabilities sause = new MutableCapabilities();
	
	sause.setCapability("username", "prathikgnova");
	sause.setCapability("seleniumVersion", "3.141.59");
	sause.setCapability("accessKey", "cb635dc9-db33-422c-8dc4-727fc7474ebf");
		sause.setCapability("tags", "w3c-chrome-tests");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("sauce:options",sause);
		cap.setCapability("browserVersion","latest");
		cap.setCapability("platformName","linux");
	
		if(bName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
	    	cap.setCapability("browserName","firefox");
		}
		else if(bName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/home/prathik.g/Documents/Softwares/study/testing/chromedriver.exe");
			cap.setCapability("browserName","chrome");
	}
		try {
		dr= new RemoteWebDriver(new URL("https://prathikgnova:cb635dc9-db33-422c-8dc4-727fc7474ebf@ondemand.us-west-1.saucelabs.com:443/wd/hub"),cap);
		}
		catch(MalformedURLException ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		
	}
}

