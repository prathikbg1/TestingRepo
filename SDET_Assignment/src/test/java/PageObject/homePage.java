package PageObject;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseClass.TestBase;

public class homePage extends TestBase{
	
	public homePage() {
		PageFactory.initElements(driver ,this);
	}
	
	int i=1;
	
	@FindBy(xpath="//*[contains(@class,'fltSwitchOpt')]/span[2]")
	public WebElement roundtrip;
	@FindBy(xpath="//*[@id='gosuggest_inputSrc']")
	public WebElement fcity;
	@FindBy(id="gosuggest_inputSrc")
	public WebElement drp1;
	@FindBy(id="gosuggest_inputDest")
	public WebElement drp2;

	@FindBy(xpath="//*[contains(@placeholder,'Destination')]")
	public WebElement toPlace;

	@FindBy(xpath="//*[@id='departureCalendar']")
	public WebElement deptDate;
	@FindBy(xpath="//*[@id='fare_20201023']")
	public WebElement fDate;
	@FindBy(xpath="//*[@id='fare_20201028']")
	public WebElement toDate;
	@FindBy(xpath="//*[@id='pax_link_common']")
	public  WebElement people;
	@FindBy(id="//*[@id='adultPaxBox']")
	public WebElement adults;
	@FindBy(xpath="//*[@id='gi_search_btn']")
	public WebElement search;
	
	
	
	public flightPage tripBooking() throws InterruptedException {
		JavascriptExecutor js =	(JavascriptExecutor)driver;
		Actions a= new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		

		roundtrip.click();
		Thread.sleep(2000);
		fcity.click();
		Thread.sleep(2000);
		fcity.sendKeys("Bengaluru");
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.id("react-autosuggest-1")));
		
		drp1.sendKeys(Keys.DOWN);
		drp1.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		toPlace.sendKeys("Mumbai");
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.id("react-autosuggest-1")));
			
			drp2.sendKeys(Keys.DOWN);
			drp2.sendKeys(Keys.ENTER);
			
			deptDate.click();
			fDate.click();
			Thread.sleep(2000);
			toDate.click();
			Thread.sleep(2000);
			search.click();
			return new flightPage();
			}
			
	}


