import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.dom.UserDataHandler;

public class multipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String location = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver",location+"/browser/geckodriver");
		WebDriver dr = new FirefoxDriver();
		dr.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		dr.get("https://www.microsoft.com/en-in/windows");
		dr.findElement(By.xpath("//span[text()='Windows Support']")).click();
		System.out.println("before switching");
		System.out.println(dr.getTitle());
		
		Set<String>ids = dr.getWindowHandles(); 
		Iterator<String>it = ids.iterator();
		String parentid = it.next();
		String Childid = it.next();
		dr.switchTo().window(Childid);
		System.out.println("After switching");
		System.out.println(dr.getTitle());
		
		dr.switchTo().window(parentid);
		System.out.println("back to parent");
		System.out.println(dr.getTitle());

	}

}
