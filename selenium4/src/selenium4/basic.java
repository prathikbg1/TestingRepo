package selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

public class basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement editname= driver.findElement(By.cssSelector("[name='name']"));
	String text=	driver.findElement(withTagName("label").above(editname)).getText();
	System.out.println(text);
	
WebElement date=	driver.findElement(By.cssSelector("[for='dateofBirth']"));
driver.findElement(withTagName("input").below(date)).sendKeys("01/07/1995");
	}

}
