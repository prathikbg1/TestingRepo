package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="LOGIN")
	WebElement loginButton;
	
	@FindBy(id="login_id")
	WebElement email;
	
	@FindBy(id="nextbtn")
	WebElement nxtButton;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="nextbtn")
	WebElement signinButton;
	
	@FindBy(id="show-uName")
	WebElement uName;
	
	public String getTitle() {
		return driver.getTitle();
			}
	
	public boolean getUname() {
		return uName.isDisplayed();
	}
	
	public HomePage login() throws InterruptedException {
		loginButton.click();
		email.sendKeys(prop.getProperty("USERNAME"));
		Thread.sleep(2000);
		nxtButton.click();
		password.sendKeys(prop.getProperty("PASSWORD"));
		Thread.sleep(2000);
		signinButton.click();
		Thread.sleep(5000);
		
		return new HomePage();
	}
	

}
