package AutomationFramework.TestNGPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class simple {
	
	WebDriver dr;

	@BeforeTest
	public void invokeBrowser() {
		System.setProperty("webdriver.gecko.driver", "/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
		 dr = new FirefoxDriver();
		
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		dr.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		
		dr.get("https://www.google.com/");
	}
	
	@Test
	public void verify() {
		String title = dr.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
	}
	
	@AfterTest
	public void quit() {
		dr.quit();
	}
	
	
	
	
}
