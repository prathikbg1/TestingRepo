import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
		WebDriver dr = new FirefoxDriver();
		
		dr.get("http://qaclickacademy.com/practice.php");
		
		dr.findElement(By.id("checkBoxOption1")).click();
		System.out.println(dr.findElement(By.id("checkBoxOption1")).isSelected());
		dr.findElement(By.id("checkBoxOption1")).click();
		System.out.println(dr.findElement(By.id("checkBoxOption1")).isSelected());
		
	System.out.println(dr.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		

	}

}
