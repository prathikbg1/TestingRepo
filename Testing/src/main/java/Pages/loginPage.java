package Pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.baseClass;
import junit.framework.Assert;

public class loginPage extends baseClass {
	
	public loginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="uid") WebElement userid;
	@FindBy(name="password") WebElement password;
	@FindBy(name="btnLogin") WebElement submit;
	WebElement useridCheck = driver.findElement(By.xpath("//td[contains(text(),'Manger Id :')]"));
	
	public homePage loginFlow() throws InterruptedException {
		
		userid.sendKeys(prop.getProperty("USERNAME")); Thread.sleep(2000);
		password.sendKeys(prop.getProperty("PASSWORD")); Thread.sleep(2000);
		submit.click(); Thread.sleep(2000);
		
		return new homePage();
	}
	
	public void loginVerify() {
		String user = useridCheck.getText();
		System.out.println(user);
		Assert.assertEquals(user, "Manger Id : mngr264253");
	
	}

}
