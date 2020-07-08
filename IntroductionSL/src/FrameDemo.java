import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.gecko.driver", "/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
		WebDriver dr = new FirefoxDriver();
		dr.manage().window().maximize();
		
		dr.get("https://jqueryui.com/droppable/");
		
	//	dr.switchTo().frame(dr.findElement(By.cssSelector("iframe[class='demo-frame']")));  OR
		System.out.println(dr.findElements(By.tagName("iframe")).size());
		dr.switchTo().frame(0);
		
		Actions a = new Actions(dr);
		WebElement source = dr.findElement(By.id("draggable"));
		WebElement dest = dr.findElement(By.id("droppable"));
		a.dragAndDrop(source, dest).build().perform();
	}

}
