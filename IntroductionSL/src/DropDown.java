import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
		WebDriver dr = new FirefoxDriver();
		dr.manage().window().maximize();
		
		dr.get("https://ksrtc.in/oprs-web/");
		
		String s="AIRPORT";
	    WebElement box=	dr.findElement(By.id("fromPlaceName"));
	
		dr.findElement(By.id("fromPlaceName")).sendKeys("Beng");
	
		dr.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		System.out.println(dr.findElement(By.id("fromPlaceName")).getText()); //u will get as html element is hidden
		
		JavascriptExecutor js = (JavascriptExecutor) dr;
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		String text =(String)js.executeScript(script);
		
		//Airport
		while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT")) {
			dr.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			
			text=(String) js.executeScript(script);
		}
		System.out.println(text);
}}