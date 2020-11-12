import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
		//System.setProperty("webdriver.chrome.driver","/home/prathik.g/Documents/Softwares/study/testing/chromedriver.exe");//
      WebDriver dr = new FirefoxDriver();
	
    /*    dr.get("https://www.spicejet.com/");
      // dr.findElement(By.id("divpaxinfo")).click(); //
      //  dr.findElement(By.cssSelector("select[id*='Adult']")).click(); //
        
        //------------static dropdown---//
        dr.findElement(By.id("divpaxinfo")).click();
        Select s = new Select(dr.findElement(By.id("ctl00_mainContent_ddl_Adult")));
       
        
        s.selectByValue("3");
       s.selectByIndex(4);
       s.selectByVisibleText("6");
		
       Select s1 = new Select(dr.findElement(By.id("ctl00_mainContent_ddl_Child")));
       s1.selectByValue("1");
       
       Select s2 = new Select(dr.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
       s2.selectByVisibleText("USD"); */
    
      
      /*    + sign to add multiple adults 
      dr.get("https://www.easemytrip.com/");
      dr.findElement(By.className("drpNoTrv")).click();
      Thread.sleep(2000);
      
      int i=1;
      while (i<5) {
    	  dr.findElement(By.cssSelector("input[class*='box1']")).click();
    	  i++;
      } */
      
      // ----- Dynamic Dropdown-----//
      dr.get("https://www.spicejet.com/");
      dr.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
      dr.findElement(By.xpath("//a[@value='BLR']")).click();
   //   dr.findElement(By.xpath("(//a[@value='COK'])[2]")).click();  //few people  will not like indexes at that time use parent and child relationship
	  
 
     
 dr.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='COK']")).click();
	
	}

}
