package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.TestBase;

import junit.framework.Assert;

public class loginPage extends TestBase {
	
	@FindBy(linkText="LOGIN")
	WebElement loginButton;
	
	@FindBy(xpath="//input[@id='login_id']")
	WebElement email;
	
	@FindBy(xpath="//button[@id='nextbtn']")
	WebElement nextButton;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//button[@id='nextbtn']")
	WebElement signINButton;
	
	public loginPage() {
		PageFactory.initElements(dr,this);
	}
	
	public void loginButtonClick() throws InterruptedException {
		loginButton.click();
		Thread.sleep(2000);
	}
	public void titleCheck() {
	String title = dr.getTitle();
	Assert.assertEquals("Zoho CRM - Home Page", title);
	}
	
	public HomePage loginFlow(String un,String pwd) throws InterruptedException {
	
		email.sendKeys(un);
		Thread.sleep(2000);
		nextButton.click();
		password.sendKeys(pwd);
		signINButton.click();
		Thread.sleep(2000);
		
		return new HomePage();
		
	}
	
	
	

}
