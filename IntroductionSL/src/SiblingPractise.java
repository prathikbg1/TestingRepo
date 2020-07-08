import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SiblingPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
		WebDriver dr=new FirefoxDriver();
		dr.get("http://www.qaclickacademy.com/interview.php");
		
		dr.findElement(By.xpath("//*[@id=\'tablist1-tab1\']")).click();
		dr.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li")).click();
		dr.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[2]")).click();
		dr.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[3]")).click();
		
		dr.findElement(By.xpath("//*[text()=' Selenium ']")).click();
		dr.findElement(By.xpath("//a[text()='Courses']")).click();
		
		//dr.findElement(By.xpath("//*[text()='Home']")).click();//
		
	//	dr.findElement(By.xpath("/html/body/header/div[1]/div/nav/ul/li[1]/a")).click();//
		
		
	}

}
