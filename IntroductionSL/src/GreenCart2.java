import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GreenCart2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
		WebDriver dr = new FirefoxDriver();
		int j=0;
	
		dr.get("https://rahulshettyacademy.com/seleniumPractise/");
		String [] itemsneeded = {"Brocolli","Cauliflower","Beetroot"};
	
		Thread.sleep(2000);
		
		
		List <WebElement> products = dr.findElements(By.cssSelector("h4.product-name"));
		
		for ( int i=0; i<products.size(); i++)
		{
			String [] name = products.get(i).getText().split("-"); // will spilt Brocolli - 1 Kg
			String formattedName = name[0].trim(); // will get Brocolli 
			List finalItem = Arrays.asList(itemsneeded);
			//format it to get actual vegetable name

			//convert array into array list for easy search

			//  check whether name you extracted is present in arrayList or not-
			
			if(finalItem.contains(formattedName)) {
				j++;
				
				dr.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(j==3) {
					break; // we need only 3 times so.
				}
			}
		}}}
		
	
