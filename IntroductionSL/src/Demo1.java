import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
		WebDriver dr = new FirefoxDriver();
		dr.manage().window().maximize();
		
		dr.get("http://live.demoguru99.com/index.php/");
		System.out.println(dr.getTitle());
	System.out.println(dr.findElement(By.xpath("//div[@class='page-title']//h2")).getText());
	
	dr.findElement(By.xpath("//a[text()='Mobile']")).click();
	System.out.println(dr.getTitle());
	
	Select s = new Select(dr.findElement(By.xpath("//div[@class='sort-by']/select")));
    s.selectByVisibleText("Name");

	}

}
