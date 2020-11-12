package StepDefinations;

	
	import cucumber.api.PendingException;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.When;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.And;
	import cucumber.api.junit.Cucumber;
import junit.framework.Assert;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	@RunWith(Cucumber.class)
	public class stepDefination {
		
	WebDriver dr;

	 /*   @Given("^User is in zoho HomePage$")
	    public void user_is_in_zoho_homepage() throws Throwable {
	    	System.setProperty("webdriver.gecko.driver", "/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
	    	dr=new FirefoxDriver();
	    	dr.get("https://crm.zoho.in/");
	    }

	    @When("^User clicks on Login Page$")
	    public void user_clicks_on_login_page() throws Throwable {
	     dr.findElement(By.linkText("LOGIN")).click();
	    }
	    
	    //hardcoded example
	/*    @And("^Enters email clicks next$")
	    public void enters_email_clicks_next() throws Throwable {
	        dr.findElement(By.xpath("//input[@id='login_id']")).sendKeys("prathikgwnkr9@gmail.com");
	        dr.findElement(By.xpath("//button[@id='nextbtn']")).click();
	        Thread.sleep(2000);
	    }
	    
	      @And("^Enters Password clicks SignIn$")
	    public void enters_password_clicks_signin() throws Throwable {
	        dr.findElement(By.id("password")).sendKeys("Prat1234@");
	        Thread.sleep(2000);
	        WebElement signin = dr.findElement(By.xpath("//button[@id='nextbtn']"));
	        JavascriptExecutor js = (JavascriptExecutor)dr;
	        js.executeScript("arguments[0].click();", signin); 
	        }*/
	/*    @And("^Enters \"([^\"]*)\" clicks next$")
	    public void enters_something_clicks_next(String strArg1) throws Throwable {
	    	   dr.findElement(By.xpath("//input[@id='login_id']")).sendKeys(strArg1);
	    	   dr.findElement(By.xpath("//button[@id='nextbtn']")).click();
		        Thread.sleep(2000);
	    }
	    
	    //not hardcoded
	    @And("^Enters \"([^\"]*)\" clicks SignIn$")
	    public void enters_something_clicks_signin(String strArg1) throws Throwable {
	    	dr.findElement(By.id("password")).sendKeys(strArg1);
	        Thread.sleep(2000);
	        WebElement signin = dr.findElement(By.xpath("//button[@id='nextbtn']"));
	        JavascriptExecutor js = (JavascriptExecutor)dr;
	        js.executeScript("arguments[0].click();", signin); 
	    }
	    
	    //examples keyword
	    @And("^Enters \"([^\"]*)\" clicks next$")
	    public void enters_something_clicks_next(String username) throws Throwable {
	    	dr.findElement(By.xpath("//input[@id='login_id']")).sendKeys(username);
	    	   dr.findElement(By.xpath("//button[@id='nextbtn']")).click();
		        Thread.sleep(2000);
	    } 

	    @And("^Enters \"([^\"]*)\" clicks SignIn$")
	    public void enters_something_clicks_signin(String password) throws Throwable {
	    	dr.findElement(By.id("password")).sendKeys(password);
	        Thread.sleep(2000);
	        WebElement signin = dr.findElement(By.xpath("//button[@id='nextbtn']"));
	        JavascriptExecutor js = (JavascriptExecutor)dr;
	        js.executeScript("arguments[0].click();", signin); 
	    }

	    @Then("^User will login succesfully verify it$")
	    public void user_will_login_succesfully_verify_it() throws Throwable {
	    	WebDriverWait w1 = new WebDriverWait(dr,60);
	    	w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='show-uName']")));
	    	
	     String title = dr.getTitle();
	     Assert.assertEquals("Zoho CRM - Home Page", title);
	    }
	    
	    @And("^close the browser$")
	    public void close_the_browser() throws Throwable {
	     dr.close();
	    } */
		
		
		//contact-feature
		@Given("^User is in zoho HomePage$")
	    public void user_is_in_zoho_homepage() throws Throwable {
	    	System.setProperty("webdriver.gecko.driver", "/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
	    	dr=new FirefoxDriver();
	    	dr.get("https://crm.zoho.in/");
	        
	    }

	    @When("^User clicks on Login Page$")
	    public void user_clicks_on_login_page() throws Throwable {
	    	dr.findElement(By.linkText("LOGIN")).click();
	    }
	    @And("^Enters \"([^\"]*)\" clicks next$")
	    public void enters_something_clicks_next(String username) throws Throwable {
	    	dr.findElement(By.xpath("//input[@id='login_id']")).sendKeys(username);
	    	   dr.findElement(By.xpath("//button[@id='nextbtn']")).click();
		        Thread.sleep(2000);
	    }
	    @And("^Enters \"([^\"]*)\" clicks SignIn$")
	    public void enters_something_clicks_signin(String password) throws Throwable {
	    	dr.findElement(By.id("password")).sendKeys(password);
	        Thread.sleep(2000);
	        WebElement signin = dr.findElement(By.xpath("//button[@id='nextbtn']"));
	        JavascriptExecutor js = (JavascriptExecutor)dr;
	        js.executeScript("arguments[0].click();", signin); 
	    }
	    
	    @And("^User will login succesfully verify it$")
	    public void user_will_login_succesfully_verify_it() throws Throwable {
	   /* 	WebDriverWait w1 = new WebDriverWait(dr,60);
	    	w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='show-uName']")));*/
	    	Thread.sleep(5000);
	    	
	     String title = dr.getTitle();
	     Assert.assertEquals("Zoho CRM - Home Page", title);
	    }


	    @Then("^User clicks on Plus sign option$")
	    public void user_clicks_on_plus_sign_option() throws Throwable {
	       dr.findElement(By.id("createIcon")).click();
	       Thread.sleep(2000);
	    }

	   @And("^user select contact option$")
	    public void user_select_contact_option() throws Throwable {
	        dr.findElement(By.id("submenu_Contacts")).click();
	        Thread.sleep(2000);
	    }

	    @And("^User Enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and clicks save option$")
	    public void user_enters_something_and_something_and_something_and_clicks_save_option(String fname, String lname, String department) throws Throwable {
	       dr.findElement(By.id("Crm_Contacts_FIRSTNAME")).sendKeys(fname);
	       Thread.sleep(2000);
	       dr.findElement(By.id("Crm_Contacts_LASTNAME")).sendKeys(lname);
	       Thread.sleep(2000);
	       dr.findElement(By.id("Crm_Contacts_DEPARTMENT")).sendKeys(department);
	       Thread.sleep(2000);
	       
	       dr.findElement(By.xpath("//*[@id='saveContactsBtn']")).click();
	       Thread.sleep(2000);
	       
	    }

	    @And("^verify the contact creation$")
	    public void verify_the_contact_creation() throws Throwable {
	    	 String title = dr.getTitle();
		     Assert.assertEquals("Zoho CRM - Contact Details", title);
	    }

	    @And("^close firefox browser$")
	    public void close_firefox_browser() throws Throwable {
	     dr.close();

	    }
}
