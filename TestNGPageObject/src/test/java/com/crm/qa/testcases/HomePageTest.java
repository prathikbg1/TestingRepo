package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase{
	
	HomePageTest hpt;
	LoginPage l;
	HomePage hp;
	ContactPage cp;
	
	public HomePageTest() {
		super();
	}
	
	
	
	@BeforeTest
	public void setUp() throws InterruptedException {
		invokeBrowser();
		
	//	hp=new HomePage();
	 //  cp=new ContactPage();
		l=new LoginPage(); // so we can access login method
		hp=l.login();
		}
	
	@Test(priority=1)
	public void nameCheck() {
		hp=new HomePage();
    	String name =hp.nameShow();
    	System.out.println(name);
			}
	
	@Test(priority=2)
	public void createContactCheck() throws InterruptedException {
		hp=new HomePage();
		cp=hp.createContacts();
		}
	
	
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}
	

}
