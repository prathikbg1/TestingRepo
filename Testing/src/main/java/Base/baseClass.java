package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseClass {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public baseClass() {
		
		try {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("/home/prathik.g/eclipse-workspace/Testing/src/main/java/resource/config.properties");
	    prop.load(fis); }
		catch(Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static void invokeBrowser() {
		String bName = prop.getProperty("BROWSER");
		if(bName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
	    	driver=new FirefoxDriver();
		}
		else if(bName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "/home/prathik.g/Documents/Softwares/study/testing/chromedriver");
	    	driver=new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("URL"));
	}
}
