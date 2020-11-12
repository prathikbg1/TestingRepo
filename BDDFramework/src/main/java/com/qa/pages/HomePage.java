package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.TestBase;

public class HomePage extends TestBase {
	
	public HomePage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(dr,this);
	}
	
	@FindBy(id="show-uName")
	WebElement userName;
	
	public String getTitle() {
		return dr.getTitle();
	}
	
	public String getUserName() {
	return userName.getText();
	}

}
