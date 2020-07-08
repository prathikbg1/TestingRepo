import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class qaAcademy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
		WebDriver dr = new FirefoxDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		dr.get("http://www.qaclickacademy.com/practice.php");
		
		//give me the counts of link
		
	System.out.println(dr.findElements(By.tagName("a")).size());
	
	//get me the links in footer section
	
WebElement e =dr.findElement(By.id("gf-BIG")); //footer
System.out.println(e.findElements(By.tagName("a")).size());

//1st column links
WebElement e1=dr.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
System.out.println(e1.findElements(By.tagName("a")).size());

//click each link in column 1st
for(int i=1;i<e1.findElements(By.tagName("a")).size();i++) {
	
	String press = Keys.chord(Keys.CONTROL,Keys.ENTER); //open multiple tabs
	e1.findElements(By.tagName("a")).get(i).sendKeys(press);
	Thread.sleep(3000);
}
Set<String> ids =  dr.getWindowHandles();
Iterator<String> it =  ids.iterator();

while(it.hasNext()){
	
	dr.switchTo().window(it.next());
	System.out.println(dr.getTitle());
}

	}
}
