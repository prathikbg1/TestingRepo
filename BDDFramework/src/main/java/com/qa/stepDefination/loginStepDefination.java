package com.qa.stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;

import java.io.IOException;

import org.junit.runner.RunWith;

import com.qa.pages.HomePage;
import com.qa.pages.loginPage;
import com.qa.utility.TestBase;


@RunWith(Cucumber.class)
public class loginStepDefination extends TestBase {
	
	loginPage l;
	HomePage p;


    @Given("^user open the browser and User will be in CRM home page$")
    public void user_open_the_browser_and_user_will_be_in_crm_home_page() throws IOException   {
    	
    	
    	TestBase.initializeBrowser();
    
         }

    @When("^User clicks on LOGIN option$")
    public void user_clicks_on_login_option() throws InterruptedException   {
    	l = new loginPage();
    	l.loginButtonClick();
        
    }

    @Then("^User enters useremail and password$")
    public void user_enters_useremail_and_password() throws InterruptedException   {
    	l = new loginPage();
    	
  p =  l.loginFlow(prop.getProperty("USERNAME"),prop.getProperty("PASSWORD"));
        
    }

    @And("^verify the login$")
    public void verify_the_login()   {
    	p=new HomePage();
    	System.out.println("In home page");
    String title = 	p.getTitle();
    Assert.assertEquals("Zoho CRM - Home Page", title);
    
   
    String name= p.getUserName();
    System.out.println(name);
   Assert.assertEquals("Welcome Prathik Bommayya Gaonkar",name);
    	
    }

}
