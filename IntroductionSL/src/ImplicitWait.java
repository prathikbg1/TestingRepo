import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
		WebDriver dr=new FirefoxDriver();
		dr.get("https://rahulshettyacademy.com/AutomationPractice/");
		dr.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		String Title="Practice 1Page";
		String aTitile = dr.getTitle();
		System.out.println(aTitile);
		
		if(Title.equals(aTitile))
		{
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}

	}

}
