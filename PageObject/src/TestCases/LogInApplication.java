package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import objectRepoistry.FacebookHomePage;
import objectRepoistry.RediffLoginPage;
import utility.Testbase;

public class LogInApplication extends Testbase{
	
	FacebookHomePage fb;
	RediffLoginPage rd;
	
	@BeforeTest
	public void invokebrowser() {
		initializeBrowser();
	}

	@Test
	public void login() throws InterruptedException {
		
		/*System.setProperty("webdriver.gecko.driver", "/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
		WebDriver dr = new FirefoxDriver();
		//dr.get("https://en-gb.facebook.com/login/");
		dr.get("https://www.facebook.com/");*/
		
		//facebook login
	 rd = new RediffLoginPage();
		rd.email().sendKeys("prathikgwnkr@gmail.com");
		rd.password().sendKeys("Prat12345678@"); Thread.sleep(2000);
		rd.go().click(); 
		
		//facebook home search
		
		fb = new FacebookHomePage();
		fb.search().sendKeys("salman khan"); Thread.sleep(2000);
		fb.submit().click();
		

	}
	
	@AfterTest
	public void close() {
		dr.close();
	}

}
