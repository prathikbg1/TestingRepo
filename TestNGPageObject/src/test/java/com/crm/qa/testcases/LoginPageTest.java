package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.AssertJUnit;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage l;
	HomePage hp;
	
	public  LoginPageTest() {
		// TODO Auto-generated constructor stub
		super(); //will call Testbase class contstructor
	}
	


	@BeforeTest
	public void setUp() {
		invokeBrowser();
		
		l = new LoginPage();
		}
	
	@Test(priority=1)
	public void loginCheck() throws InterruptedException {
		l= new LoginPage();
	hp=l.login();
	}
	
	@Test(priority=2)
	public void titleCheck() {
		l = new LoginPage();
		String title = l.getTitle();
		System.out.println(title);
		AssertJUnit.assertEquals(title,"Zoho CRM - Home Page");
	}
	
	@Test(priority=3)
	public void nameCheck() {
		l = new LoginPage();
		l.getUname();
	}
	
	@AfterMethod
	public void takescreenshot(ITestResult result) {
		if(ITestResult.FAILURE==result.getStatus()) {
			File Src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(Src, to);
		}
	}
	
	
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}

}
