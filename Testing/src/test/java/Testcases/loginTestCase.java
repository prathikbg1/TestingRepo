package Testcases;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.baseClass;
import Pages.homePage;
import Pages.loginPage;

public class loginTestCase extends baseClass {

	loginPage lp;
	homePage hp;
	
	public loginTestCase() {
		super();
	}
	
	@BeforeTest
	public void browserSetup() {
		invokeBrowser();
	}
	
	@Test(priority=0)
	public void login() throws InterruptedException {
		lp=new loginPage();
		hp=lp.loginFlow();
	}
	
	@Test(priority=1)
	public void loginCheck() {
		lp=new loginPage();
		lp.loginVerify();
	}
	
	@AfterTest
	public void close() {
		driver.quit();
	}
}
