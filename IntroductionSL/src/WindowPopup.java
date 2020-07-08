import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
		WebDriver dr = new FirefoxDriver();
		dr.manage().window().maximize();
		
		//dr.get("https://the-internet.herokuapp.com/");
	dr.get("https://admin:admin@the-internet.herokuapp.com/");
		dr.findElement(By.linkText("Basic Auth")).click();

	}

}
