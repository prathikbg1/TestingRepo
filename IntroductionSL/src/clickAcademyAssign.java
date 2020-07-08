import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class clickAcademyAssign {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
		WebDriver dr = new FirefoxDriver();
		dr.get("http://www.qaclickacademy.com/practice.php");
		
		//1.select any checkbox,grab the label of the selected checkbox
		//2.select an option from dropdown here option should be come from step 2
		//3. enter the option in alert and verify
		
		String expected = "Hello option2, share this practice page and share your knowledge";
		
		//select checkbox
		dr.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]/input")).click();
		//grab the option
	String label=dr.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]/input")).getAttribute("value");
	System.out.println(label);
	
	    //dropdown
	   WebElement dropDown = dr.findElement(By.id("dropdown-class-example"));
	   Select s=new Select(dropDown);
	   s.selectByValue(label);
	   Thread.sleep(3000);
	   
	   //alert
	   dr.findElement(By.id("name")).sendKeys(label);
	   Thread.sleep(3000);
	   dr.findElement(By.id("alertbtn")).click();
	   String alertText=dr.switchTo().alert().getText();
	   
	   if(alertText.contentEquals(expected)) {
		   System.out.println("Test passed");
		   dr.switchTo().alert().accept();
	   }
	   else {
		   System.out.println("Test Fail");
		   dr.switchTo().alert().dismiss();
	   }
         
	}

}
