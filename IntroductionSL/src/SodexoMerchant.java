import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class SodexoMerchant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
		WebDriver dr=new FirefoxDriver();
		dr.get("https://www.spicejet.com/");
		/* dr.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		dr.findElement(By.xpath("//a[@value='BLR']")).click();
		
		dr.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='IXL']")).click();
	dr.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click(); */
		
	System.out.println(dr.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected());
	
		dr.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	System.out.println(dr.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected());
		System.out.println(dr.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		System.out.println(dr.findElement(By.id("Div1")).getAttribute("style"));
		
		if(dr.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			
			System.out.println("Enables");
			Assert.assertTrue(true);
		}
	}

}
