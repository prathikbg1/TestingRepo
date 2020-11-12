package StepDefinations;


	
	import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
	import cucumber.api.java.en.When;
	import cucumber.api.java.en.Then;
	import cucumber.api.junit.Cucumber;
import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.utility.TestBase;

	@RunWith(Cucumber.class)
	public class hooksStepDefination extends TestBase{
		
		WebDriver dr;
		
		@Before
		public void invokeBrowser() {
			System.setProperty("webdriver.gecko.driver", "/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
	    	dr=new FirefoxDriver();
	    	dr.get("https://crm.zoho.in/");
	    	//initializeBrowser();
		}
		/*@AfterClass
		public void closeBrowser() {
			dr.close();
		}*/

	    @Given("^user is on CRM home page click on plus sign$")
	    public void user_is_on_crm_home_page_click_on_plus_sign() throws Throwable {
	    	dr.findElement(By.linkText("LOGIN")).click();
	    	Thread.sleep(2000);
	    	dr.findElement(By.xpath("//input[@id='login_id']")).sendKeys("prathikgwnkr9@gmail.com");
	    	   dr.findElement(By.xpath("//button[@id='nextbtn']")).click();
		        Thread.sleep(2000);
		        dr.findElement(By.id("password")).sendKeys("Prat1234@");
		        Thread.sleep(2000);
		        WebElement signin = dr.findElement(By.xpath("//button[@id='nextbtn']"));
		        JavascriptExecutor js = (JavascriptExecutor)dr;
		        js.executeScript("arguments[0].click();", signin); 
		        Thread.sleep(20000);
		        
	    
	    }

	    @When("^user select campaign option fill the form and click on save$")
	    public void user_select_campaign_option_fill_the_form_and_click_on_save() throws Throwable {
	    	dr.findElement(By.id("createIcon")).click();
		       Thread.sleep(2000);
	    	dr.findElement(By.id("submenu_Campaigns")).click();
	    	Thread.sleep(2000);
	       dr.findElement(By.id("Crm_Campaigns_CAMPAIGNNAME")).sendKeys("lockdown");
	       Thread.sleep(2000);
	       dr.findElement(By.xpath("//*[@id='Campaigns_fldRow_TYPE']/div[2]/div/span/span[1]/span")).sendKeys("webinar",Keys.ARROW_DOWN.ENTER);
	       Thread.sleep(2000);
	       dr.findElement(By.id("saveCampaignsBtn")).click();
	       Thread.sleep(20000);
	    }

	    @Then("^campaign is created$")
	    public void campaign_is_created() throws Throwable {
	       String title = dr.getTitle();
	       System.out.println(title);
	       Assert.assertEquals("Zoho CRM - Campaign Details",title);
	       Thread.sleep(10000);
	    }
	    
	    //scenario outline
	    @Given("^user is on campaign page click on plus sign$")
	    public void user_is_on_campaign_page_click_on_plus_sign() throws Throwable {
	    	dr.findElement(By.id("createIcon")).click();
	    	Thread.sleep(2000);
	    }

	    @When("^user select vendor option$")
	    public void user_select_vendor_option() throws Throwable {
	        dr.findElement(By.id("submenu_Vendors")).click();
	        Thread.sleep(2000);
	    }
	    
	    @And("^user enters \"([^\"]*)\" and click on save button$")
	    public void user_enters_something_and_click_on_save_button(String vendorname) throws Throwable {
	        dr.findElement(By.id("Crm_Vendors_VENDORNAME")).sendKeys(vendorname);
	        Thread.sleep(2000);
	        dr.findElement(By.id("saveVendorsBtn")).click();
	        Thread.sleep(2000);
	    }

	    @Then("^vendor is created$")
	    public void vendor_is_created() throws Throwable {
	    	String title = dr.getTitle();
	    	System.out.println(title);
	    	Assert.assertEquals("Zoho CRM - Vendors",title);
	        
	    }

	    

}
