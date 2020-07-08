import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GreenCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
		WebDriver dr = new FirefoxDriver();
		dr.get("https://rahulshettyacademy.com/seleniumPractise/");
		
	List <WebElement> products = dr.findElements(By.cssSelector("h4.product-name")); // multiple product name so used list to iterate
	
	for(int i=0 ; i<products.size() ; i++) 
	{
		String name = products.get(i).getText();
		
		if(name.contains("Cucumber"))
		{	
			dr.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			break;
		}
	}

	}

}
