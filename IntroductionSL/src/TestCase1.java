import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/home/prathik.g/Documents/Softwares/study/testing/chromedriver.exe");  

		WebDriver dr = new ChromeDriver();
		//dr.get("https://twitter.com/home");
	//	System.out.println(dr.getTitle());
		
		System.out.println(dr.getCurrentUrl());
		
		dr.get("https://sp-dash.zetaapps.in/");
		//dr.navigate().back();
		dr.close();
	/*	dr.quit(); */// to quit parent and child window
		
	}

}
