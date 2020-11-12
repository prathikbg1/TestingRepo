package com.crm.qa.pages;

import org.openqa.selenium.WebElement;	
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="show-uName")
	WebElement uName;
	
	@FindBy(id="createIcon")
	WebElement Create;
	
	@FindBy(id="submenu_Contacts")
	WebElement Contact;
	
	@FindBy(id="submenu_Tasks")
	WebElement Task;
	
	public String nameShow() {
		return uName.getText();
	}
	
	public ContactPage createContacts() throws InterruptedException {
		Create.click();
		Thread.sleep(2000);
		Contact.click();
		Thread.sleep(2000);
		
		return new ContactPage();
	}
	public TaskPage createTask() throws InterruptedException {
		Create.click();
		Thread.sleep(2000);
		Task.click();
		Thread.sleep(2000);
		
		return new TaskPage();
	}

}
