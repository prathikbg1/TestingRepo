import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggestiveDropDownAssign {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
		WebDriver dr = new FirefoxDriver();
		dr.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		String sample="India";
		
		JavascriptExecutor js  = (JavascriptExecutor)dr;
		WebElement offer = dr.findElement(By.linkText("Limited offer - FREE Core Java & QA Resume course"));
		js.executeScript("arguments[0].click();",offer);
		Thread.sleep(3000);
		String name = (String)js.executeScript("return document.title");
		System.out.println(name);
		
		Actions a = new Actions(dr);
		a.contextClick(dr.findElement(By.linkText("Practice Projects"))).build().perform();
		
			
		}
	
		
	/*	dr.findElement(By.id("autocomplete")).sendKeys("ind");
		dr.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		dr.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		
		JavascriptExecutor js = (JavascriptExecutor) dr;
		String script = "return document.getElementById(\"autocomplete\").value;";
		String text = (String) js.executeScript(script);
		System.out.println(text);
		if(text.equals(sample)) {
			System.out.println("Test Pass");
		}
		else {
			System.out.println("Test Fail");
		}*/

	}


