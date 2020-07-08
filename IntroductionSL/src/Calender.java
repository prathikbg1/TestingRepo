import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
		WebDriver dr = new FirefoxDriver();
		dr.get("https://www.spicejet.com/");
		dr.findElement(By.cssSelector("button.ui-datepicker-trigger")).click();
		
	while(!dr.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/div/span[1]")).getText().contains("May"))
	{
	
		dr.findElement(By.cssSelector("span.ui-icon.ui-icon-circle-triangle-e")).click();
	}
		
	List<WebElement> dates	= dr.findElements(By.cssSelector("a.ui-state-default"));
	int count = dr.findElements(By.cssSelector("a.ui-state-default")).size();
	
	for (int i=0;i<count;i++){
	WebElement d=	dr.findElement(By.cssSelector("div.ui-datepicker-group.ui-datepicker-group-last"));
	String name = dr.findElements(By.cssSelector("a.ui-state-default")).get(i).getText();
		if(name.equalsIgnoreCase("25")) {
			d.findElements(By.cssSelector("a.ui-state-default")).get(i).click();
			break;
		}
	}

	}

}
