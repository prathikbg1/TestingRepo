package PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseClass.TestBase;

public class HotelPage extends TestBase{
	
	public HotelPage() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//*[@class='_3DVpbQ1t']")
	public WebElement scroll;
	@FindBy(linkText="Write a review")
	public WebElement review;
	
	
	public void reviewSection() throws InterruptedException {
		JavascriptExecutor js =	(JavascriptExecutor)driver;
		Actions a= new Actions(driver);
		//js.executeScript("arguments[0].scrollIntoView(true);", scroll);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		review.click();
	}
}
