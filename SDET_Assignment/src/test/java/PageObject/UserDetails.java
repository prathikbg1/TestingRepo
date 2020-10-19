package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseClass.TestBase;

public class UserDetails extends TestBase{
	
	public UserDetails() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="Adulttitle1")
	public WebElement title;
	
	@FindBy(id="AdultfirstName1")
	public WebElement fName;
	@FindBy(id="AdultmiddleName1")
	public WebElement mName;
	@FindBy(id="AdultlastName1")
	public WebElement lName; 
	@FindBy(id="email")
	public WebElement email;
	@FindBy(id="mobile")
	public WebElement mobile;
	@FindBy(xpath="//*[contains(@class,'borderTop padLR15')]/button") 
	public WebElement proceed;
	@FindBy(id="secure-trip")
	public WebElement secure;
	@FindBy(xpath="//*[contains(@class,'flightDetails fl')]/div[2]/div[2]/div/div[3]/div/div/div/input")
	public WebElement opt;
	
	public void fillUserDetails() throws InterruptedException {
		secure.click();
		Thread.sleep(2000);
		opt.click();
		Thread.sleep(2000);
		title.click();
		Select s = new Select(title);
		s.selectByValue("1");
		fName.sendKeys("Prathik");
		mName.sendKeys("B");
		lName.sendKeys("Gaonkar");
		email.sendKeys("prathikgwnkr@gmail.com");
		mobile.sendKeys("8217773480");
		Thread.sleep(2000);
		proceed.click();
		
		
	}
	
}
