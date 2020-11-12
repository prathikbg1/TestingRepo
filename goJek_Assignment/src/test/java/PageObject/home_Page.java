package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.TestBase;

public class home_Page extends TestBase{

	public home_Page() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@class='logo']/span")
	public WebElement buyNow;
	
	public void clickBuyNow() {
		buyNow.click();
	}
}
