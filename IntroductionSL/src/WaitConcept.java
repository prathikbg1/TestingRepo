import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
		WebDriver dr = new FirefoxDriver();
		String [] itemsneeded = {"Brocolli","Cauliflower","Beetroot"};
		//dr.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); //if promocode didn't apply in 5 sec then test will fail
		
	
		
		dr.get("https://rahulshettyacademy.com/seleniumPractise/");
		addItems(dr, itemsneeded);}
	
	public static void addItems(WebDriver dr,String [] itemsneeded) throws InterruptedException {
		
		
		
		
		
	WebDriverWait wt = new WebDriverWait(dr, 5);
		List <WebElement> products = dr.findElements(By.cssSelector("h4.product-name"));
		int j=0;
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
				}}}
		dr.findElement(By.cssSelector("img[alt='Cart']")).click();
		dr.findElement(By.xpath("//div[@class='action-block']/button")).click();
		
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
	
		dr.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
		dr.findElement(By.cssSelector("button.promoBtn")).click();
		
		
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		Wait <WebDriver> wait = new FluentWait<WebDriver>(dr).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3));
	
		
		System.out.println(dr.findElement(By.cssSelector("span.promoInfo")).getText()); }}

	


