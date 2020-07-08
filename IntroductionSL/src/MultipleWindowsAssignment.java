import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
		WebDriver dr = new FirefoxDriver();
		dr.manage().window().maximize();
		
		dr.get("https://the-internet.herokuapp.com/");
		dr.findElement(By.linkText("Multiple Windows")).click();
		dr.findElement(By.linkText("Click Here")).click(); 
		
		Set<String>ids = dr.getWindowHandles();
		Iterator<String>it = ids.iterator();
		String parent = it.next();
		
		dr.switchTo().window(it.next());
		System.out.println("Child Window Title: " + dr.getTitle());
		System.out.println("Child window Text: " + dr.findElement(By.xpath("//div[@class='example']//h3")).getText());
		
		dr.switchTo().window(parent);
		System.out.println("Parent Window Title: " + dr.getTitle());
		System.out.println("Parent window Text: " + dr.findElement(By.xpath("//div[@class='example']//h3")).getText());

		
	}

}
