import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
		WebDriver dr = new FirefoxDriver();
		dr.manage().window().maximize();
		
		dr.get("http://demo.guru99.com/test/upload/");
	dr.findElement(By.xpath("//input[@type='file']")).sendKeys("/home/prathik.g/Desktop/ARN.pdf");
	dr.findElement(By.id("terms")).click();
	dr.findElement(By.id("submitbutton")).click();


	}

}
