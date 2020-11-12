package com.crm.qa.pages;

import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.qa.base.TestBase;

public class TaskPage extends TestBase {
	
	public TaskPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Crm_Tasks_SUBJECT")
	WebElement subject;
	
	@FindBy(id="Crm_Tasks_CONTACTID")
	WebElement contact;
	
	@FindBy(id="Crm_Tasks_DESCRIPTION")
	WebElement describption;
	
	@FindBy(id="saveTasksBtn")
	WebElement save;
	
	@FindBy(id="subvalue_SUBJECT")
	WebElement sName;
	
	public void taskPage() throws InterruptedException {
		String title = driver.getTitle();
		Assert.assertEquals(title,"Zoho CRM - Activities");
		
	}
	
	public void createTask() throws InterruptedException {
		subject.sendKeys("hiphop");
		Thread.sleep(2000);
		contact.sendKeys("jhon",Keys.ARROW_DOWN);
		Thread.sleep(2000);
		describption.sendKeys("slim shady");
		Thread.sleep(2000);
		save.click();
	
		
		
	}
	public void  taskDetails() {
		String name = sName.getText();
		Assert.assertEquals(name,"hiphop");
		
	}

	
	
}
