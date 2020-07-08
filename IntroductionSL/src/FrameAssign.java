import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
		WebDriver dr = new FirefoxDriver();
		dr.manage().window().maximize();
		
		dr.get("https://the-internet.herokuapp.com/");
		
		dr.findElement(By.linkText("Nested Frames")).click();
		
		System.out.println(dr.findElements(By.tagName("iframe")).size());
		
		dr.switchTo().frame("frame-top");
		dr.switchTo().frame("frame-middle");
	System.out.println(dr.findElement(By.xpath("//html/body/div")).getText());


	}

}
