import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/home/prathik.g/Documents/Softwares/study/testing/chromedriver.exe");
		
		WebDriver dr=new ChromeDriver();
		dr.get("https://login.salesforce.com/?locale=in");
		/*	dr.findElement(By.id("username")).sendKeys("prathikgwnkr@gmail.com");
        dr.findElement(By.id("password")).sendKeys("Prat@1234");
        dr.findElement(By.cssSelector("#Login")).click();
        System.out.println(dr.findElement(By.cssSelector("#error")).getText());
        //dr.findElement(By.xpath("//*[@id='Login']"));
       // dr.findElement(By.id("Login")).click(); */
		
	/*	dr.findElement(By.xpath("//input[@id='username']")).sendKeys("hjdhddsgdg");
		dr.findElement(By.cssSelector("input[id='password']")).sendKeys("12121212");
		dr.findElement(By.xpath("//input[@id='Login']")).click(); 
		
		System.out.println(dr.findElement(By.cssSelector("div[id='error']")).getText()); */
		
		dr.findElement(By.xpath("//input[@id='username']")).sendKeys("qwer");
		dr.findElement(By.cssSelector("input.password")).sendKeys("121222");
		dr.findElement(By.xpath("//input[contains(@class,'primar')]")).click();
		
	}

}
