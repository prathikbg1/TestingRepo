import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
		WebDriver dr = new FirefoxDriver();
		dr.manage().window().maximize();
		
		dr.get("https://www.amazon.in/");
		
		Actions a = new Actions(dr);
		//a.moveToElement(dr.findElement(By.id("nav-link-prime"))).build().perform();
		
		//a.moveToElement(dr.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("mobile").doubleClick().build().perform();
		
		a.moveToElement(dr.findElement(By.id("twotabsearchtextbox"))).click().sendKeys("mobile").keyDown(Keys.ARROW_DOWN).doubleClick().build().perform();
	}

}
