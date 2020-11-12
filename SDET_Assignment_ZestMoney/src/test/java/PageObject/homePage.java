package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseClass.TestBase;

public class homePage extends TestBase {
	
	public homePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='_34qv-ubY']/button")
	public WebElement close;
	@FindBy(xpath="//*[@class='i3bZ_gBa _3TPJs5_m']//input[@class='_3qLQ-U8m']")
	public WebElement serachBox;
	@FindBy(xpath="//*[@class='i3bZ_gBa _3TPJs5_m']//input[@class='_3qLQ-U8m']")
	public WebElement drp1;
	@FindBy(xpath="//*[@class='location-meta-block']//span[text()='Club Mahindra Madikeri, Coorg']")
	public WebElement place;
	
	
	public HotelPage searchFucntion() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebDriverWait w = new WebDriverWait(driver, 10);
		//close.click();
		
		js.executeScript("arguments[0].click()", serachBox);
		serachBox.sendKeys("Club Mahindra",Keys.DOWN.RETURN);
		Thread.sleep(2000);
		place.click();
		
		return new HotelPage();
		
		
		/*w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='_27pk-lCQ']")));
		drp1.sendKeys(Keys.ARROW_DOWN);
		drp1.sendKeys(Keys.ENTER); */
	}

}
