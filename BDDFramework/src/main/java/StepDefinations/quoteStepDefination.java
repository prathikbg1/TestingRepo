package StepDefinations;


	
	import cucumber.api.DataTable;	
import cucumber.api.PendingException;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.When;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.And;
	import cucumber.api.junit.Cucumber;
import gherkin.lexer.Th;
import junit.framework.Assert;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*	@RunWith(Cucumber.class)
	public class quoteStepDefination {
		
		WebDriver dr;

	    @Given("^User is in zoho HomePage1$")
	    public void user_is_in_zoho_homepage() throws Throwable {
	    	System.setProperty("webdriver.gecko.driver", "/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
	    	dr=new FirefoxDriver();
	    	dr.get("https://crm.zoho.in/");
	    }

	    @When("^User clicks on Login Page1$")
	    public void user_clicks_on_login_page() throws Throwable {
	    	dr.findElement(By.linkText("LOGIN")).click();
	    }
	    @And("^Enters username clicks next$")
	    public void enters_username_clicks_next(DataTable credentials) throws Throwable {
	    	List<List<String>> data = credentials.raw();
	    	dr.findElement(By.id("login_id")).sendKeys(data.get(0).get(0));
	    	   dr.findElement(By.xpath("//button[@id='nextbtn']")).click();
		        Thread.sleep(2000);
	    }
	    @And("^Enters password clicks SignIn$")
	    public void enters_password_clicks_signin(DataTable cred) throws Throwable {
	    	List<List<String>> data = cred.raw();
	    	dr.findElement(By.id("password")).sendKeys(data.get(0).get(0));
	        Thread.sleep(2000);
	        WebElement signin = dr.findElement(By.xpath("//button[@id='nextbtn']"));
	        JavascriptExecutor js = (JavascriptExecutor)dr;
	        js.executeScript("arguments[0].click();", signin);
	        Thread.sleep(2000);        
	    }
	    
	    @And("^User will login succesfully verify it1$")
	    public void user_will_login_succesfully_verify_it() throws Throwable {
	    	WebDriverWait w1 = new WebDriverWait(dr,80);
	    	w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='show-uName']")));
	    	
	     String title = dr.getTitle();
	     Assert.assertEquals("Zoho CRM - Home Page", title);
	    }

	    @Then("^User clicks on plus option$")
	    public void user_clicks_on_plus_option() throws Throwable {
	    	dr.findElement(By.id("createIcon")).click();
		       Thread.sleep(2000);
	    }

	       
	    @And("^User select quote option$")
	    public void user_select_quote_option() throws Throwable {
	    	
		      dr.findElement(By.id("submenu_Quotes")).click();
		      Thread.sleep(2000);
	    	 }

	    @And("^User Enters Subject and ContactName and AccountName$")
	    public void user_enters_subject_and_contactname_and_accountname(DataTable addData) throws Throwable {
	       List<List<String>> data = addData.raw();
	       dr.findElement(By.id("Crm_Quotes_QUOTESUBJECT")).sendKeys(data.get(0).get(0));
	       Thread.sleep(2000);
	       dr.findElement(By.id("Crm_Quotes_CONTACTID")).sendKeys(data.get(0).get(1),Keys.ARROW_DOWN);
	       Thread.sleep(4000);
	       dr.findElement(By.id("Crm_Quotes_ACCOUNTID")).sendKeys(data.get(0).get(2),Keys.ARROW_DOWN.ENTER);
	       Thread.sleep(4000);
	       
	       dr.findElement(By.linkText("Add Line Items")).click();
	       dr.findElement(By.id("codein1")).sendKeys("trip",Keys.ARROW_DOWN.ENTER);
	       Thread.sleep(3000);
	       dr.findElement(By.xpath("/html/body/ul[2]/li[1]")).click();
	       Thread.sleep(2000);
	       dr.findElement(By.id("qtyin1")).sendKeys("2");
	       Thread.sleep(2000);
	       dr.findElement(By.id("addPrdbtn")).click();
	    }	    

	    @And("^user select save option$")
	    public void user_select_save_option() throws Throwable {
	       dr.findElement(By.id("saveQuotesBtn")).click();
	       Thread.sleep(2000);
	    }

	    @And("^verify the quote Page$")
	    public void verify_the_quote_page() throws Throwable {
	    	String title = dr.getTitle();
	    	System.out.println(title);
		     Assert.assertEquals("Zoho CRM - Quotes", title);
	    }
	    

	    @And("^close browser firefox$")
	    public void close_browser_firefox() throws Throwable {
	       dr.close();
	    }

	}*/
	
