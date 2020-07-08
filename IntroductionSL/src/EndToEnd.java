import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
		WebDriver dr=new FirefoxDriver();
		dr.get("https://www.spicejet.com/");
		
		dr.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		dr.findElement(By.xpath("//a[@value='BLR']")).click();
		dr.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='GOI']")).click();
        dr.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
        
        if(dr.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
        {
        	System.out.println("Disabled");
        }
        else {
        	System.out.println("Enabled");
        }
        
        dr.findElement(By.id("divpaxinfo")).click();
        
        Select s = new Select(dr.findElement(By.id("ctl00_mainContent_ddl_Adult")));

        s.selectByValue("5");
        System.out.println(dr.findElement(By.id("divpaxinfo")).getText());
        
     Select s1 = new Select(dr.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
     s1.selectByVisibleText("INR");
     
     dr.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
	}

}
