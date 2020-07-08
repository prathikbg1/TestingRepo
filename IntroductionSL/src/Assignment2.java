import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
		WebDriver dr = new FirefoxDriver();
		dr.get("https://www.cleartrip.com/");
		int a=10;

		dr.findElement(By.id("DepartDate")).click();
		dr.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		Select s = new Select(dr.findElement(By.id("Adults")));
		s.selectByValue("2");

		Select s1 = new Select(dr.findElement(By.id("Childrens")));
		s1.selectByIndex(3);

		Select s2 = new Select(dr.findElement(By.id("Infants")));
		s2.selectByVisibleText("1");

		dr.findElement(By.id("MoreOptionsLink")).click();
		Select s3 = new Select(dr.findElement(By.id("Class")));
		s3.selectByValue("Business");
		WebElement s4 = dr.findElement(By.id("AirlineAutocomplete"));
		s4.sendKeys("Indigo");
		s4.sendKeys(Keys.ENTER);

		System.out.println(dr.findElement(By.id("homeErrorMessage")).getText());

	}

}
