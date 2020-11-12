package objectRepoistry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Testbase;

public class RediffLoginPage extends Testbase {


	public RediffLoginPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(dr,this);
	}

/*By username = By.xpath("//*[@id='email']");
By Password = By.xpath("//*[@id='pass']");
By go = By.id("loginbutton");

public WebElement email() {
	return dr.findElement(username);
}
public WebElement password() {
	return dr.findElement(Password);
}
public WebElement go() {
	return dr.findElement(go);
}*/

//OR

@FindBy(xpath="//*[@id='email']")
WebElement username;

@FindBy(xpath="//*[@id='pass']")
WebElement Password;

@FindBy(id="u_0_b")
WebElement go;		

public WebElement email() {
	return username;
}
public WebElement password() {
	return Password;
}
public WebElement go() {
	return go;
}
		
	}


