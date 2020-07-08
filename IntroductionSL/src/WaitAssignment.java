import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
		WebDriver dr = new FirefoxDriver();
		
		dr.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		WebDriverWait wt = new WebDriverWait(dr,7);
		
		dr.findElement(By.linkText("Click to load get data via Ajax!")).click();
		wt.until(ExpectedConditions.visibilityOfElementLocated((By.id("results"))));
		
		System.out.println(dr.findElement(By.id("results")).getText());

	}

}
