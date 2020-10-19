package PageObject;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.TestBase;

public class flightPage extends TestBase {
	
	public flightPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@value='BOOK']")
	public WebElement book;
	
	public UserDetails bookFlight() {
		
		book.click();
		return new UserDetails();
	}

}
