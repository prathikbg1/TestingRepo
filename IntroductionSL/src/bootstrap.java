import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class bootstrap {
	
	public static void main(String[] args) {
	

	System.setProperty("webdriver.gecko.driver", "/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
	WebDriver dr = new FirefoxDriver();
	dr.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
	 
	dr.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
	
 List<WebElement> l1=	dr.findElements(By.xpath("//ul[contains(@class,'multiselect')]//li//a//label"));

 int size = l1.size();
 System.out.println(size);
 
 for(int i=0;i<size;i++) {
	 if(l1.get(i).getText().equalsIgnoreCase("Java")) {
		 l1.get(i).click();
		 break;
	 }
 }
 
}
}