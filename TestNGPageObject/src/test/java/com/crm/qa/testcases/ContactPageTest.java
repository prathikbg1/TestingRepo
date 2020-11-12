package com.crm.qa.testcases;		

import java.util.logging.LogManager;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;	
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class ContactPageTest extends TestBase{
	
	ContactPageTest cpt;
	HomePage hp;
	LoginPage lp;
	ContactPage cp;
	
	
	public ContactPageTest() {
		super();
	}


	
	@BeforeTest
	public void setUp() throws InterruptedException {
		invokeBrowser();
		
		cp=new ContactPage();
		lp=new LoginPage();
		hp=lp.login();
	    hp=new HomePage();
		cp=hp.createContacts();
		}
	
	@Test(priority=1)
	public void contactPagetitle() throws InterruptedException {
		cp=new ContactPage();
		cp.titleCheck();
		log.info("contact title check success");
		
	}
	
	@Test(priority=2)
	public void createContactCheck() throws InterruptedException {
		cp=new ContactPage();
		cp.createContact();
		Thread.sleep(5000);
		log.info("create contact success");
	}
	@Test(priority=3)
	public void verifyContactDetails() throws InterruptedException {
		cp=new ContactPage();
		
		
		cp.contactVerify();
		Thread.sleep(5000);
		log.info("verify contact done");
	}
	

	
	@AfterTest
	public void tearDown(){
		driver.quit();
		
	}
}
