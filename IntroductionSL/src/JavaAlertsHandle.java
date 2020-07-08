import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaAlertsHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver","/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
		WebDriver dr=new FirefoxDriver();
		dr.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		dr.findElement(By.id("name")).sendKeys("Prathik");
		
		/*dr.findElement(By.id("alertbtn")).click();
	    System.out.println(dr.switchTo().alert().getText());
        dr.switchTo().alert().accept(); */  
		
		dr.findElement(By.id("confirmbtn")).click();
		System.out.println(dr.switchTo().alert().getText());
		dr.switchTo().alert().dismiss();
		

	}

}
