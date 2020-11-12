package objectRepoistry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Testbase;

public class FacebookHomePage extends Testbase {


	public FacebookHomePage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(dr,this);
	}
	
	/*By search = By.xpath("//*[@id='u_x_2']/input[2]");
	By submit = By.xpath("//*[@id='js_26']/form/button");
	
	public WebElement search() {
		return dr.findElement(search);
	}
	
	public WebElement submit() {
		return dr.findElement(submit);
	}*/
	
	@FindBy(xpath="//*[@id='u_x_2']/input[2]") WebElement search;
	@FindBy(xpath="//*[@id='js_26']/form/button") WebElement submit;
	
	public WebElement search() {
		return search;
	}
	
	public WebElement submit() {
		return submit;
	}
	


}
