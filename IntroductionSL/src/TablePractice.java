import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TablePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
		WebDriver dr=new FirefoxDriver();
		dr.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
	WebElement table=	dr.findElement(By.xpath("//table[@id='product']"));
	
	int size = table.findElements(By.tagName("tr")).size();
	System.out.println("row count" + table.findElements(By.tagName("tr")).size());
	//System.out.println("column count" + table.findElements(By.tagName("th")).size());
	table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th"));
	
	List<WebElement> data = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
	System.out.println(data.get(0).getText());
	System.out.println(data.get(1).getText());
	System.out.println(data.get(2).getText());
	
	
	
	//System.out.println(table.findElement(By.xpath("//table[@id='product']/tbody/tr[3]")).getText());

	}

}
