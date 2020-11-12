package testingFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

@Test
public class Anot2 {
	
	public WebDriver dr=null;

	public void login() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("/home/prathik.g/eclipse-workspace/TestNG2/src/testingFiles/datadriven.properties");
	
		prop.load(fis);
	//	System.out.println(prop.getProperty("username"));
		
		if(prop.getProperty("browser").contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/home/prathik.g/Documents/Softwares/study/testing/geckodriver/chromedriver.exe");
			dr=new ChromeDriver();
			}
		else if(prop.getProperty("browser").contains("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
			dr=new FirefoxDriver();
		}
		else {
			dr=new InternetExplorerDriver();
		}
		dr.get(prop.getProperty("url"));
	
	}
}
