import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
		WebDriver dr = new FirefoxDriver();
		
		dr.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		dr.findElement(By.cssSelector("[id='start'] button")).click();; //xpath[@id='start']"
		
		Wait <WebDriver> wait = new org.openqa.selenium.support.ui.FluentWait<WebDriver>(dr).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3));
		WebElement e = dr.findElement(By.cssSelector("[id='finish'] h4"));
		
		
	
		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
		public WebElement apply(WebDriver dr) {
			if(dr.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed())
			{
				return e;
			}
			else
			{
				return null;
			}
		}});

		System.out.println(dr.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed());

}}
