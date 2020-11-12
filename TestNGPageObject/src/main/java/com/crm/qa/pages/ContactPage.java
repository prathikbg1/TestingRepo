package com.crm.qa.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import com.crm.qa.base.TestBase;

public class ContactPage extends TestBase {

	
	public ContactPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="Crm_Contacts_FIRSTNAME")
	WebElement fName;
	@FindBy(id="Crm_Contacts_LASTNAME")
	WebElement lName;
	@FindBy(id="Crm_Contacts_TITLE")
	WebElement title;
	@FindBy(id="Crm_Contacts_DEPARTMENT")
    WebElement department;
	@FindBy(id="saveContactsBtn")
	WebElement saveButton;
	
	public void titleCheck() {
		String title =driver.getTitle();
		Assert.assertEquals(title,"Zoho CRM - Contacts");
	}
	
	public void createContact() throws InterruptedException {
		fName.sendKeys("jhon");
		Thread.sleep(2000);
		lName.sendKeys("sin");
		Thread.sleep(2000);
		title.sendKeys("fixing");
		Thread.sleep(2000);
		department.sendKeys("IT");
		Thread.sleep(2000);
		saveButton.click();
		
	}
	
	public void contactVerify() {
		String name = driver.getTitle();
		Assert.assertEquals(name,"Zoho CRM - Contact Details");
	}
	
	}
