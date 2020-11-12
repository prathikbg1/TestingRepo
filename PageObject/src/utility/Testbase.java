package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testbase {

	public static WebDriver dr;
	public static Properties prop;
	
	public Testbase() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("/home/prathik.g/eclipse-workspace/PageObject/src/data.properties");
		    prop.load(fis);
		    }
		catch (IOException e) {
			// TODO: handle exception
			e.getMessage();
		}
	}
	
	public static void initializeBrowser() {
	
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
	    	dr=new FirefoxDriver();
		}
		else if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/home/prathik.g/Documents/Softwares/study/testing/chromedriver");
	    	dr=new ChromeDriver();
	}
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		dr.manage().timeouts().pageLoadTimeout(3000,TimeUnit.SECONDS);
		

		dr.get(prop.getProperty("url"));
}
	
}
