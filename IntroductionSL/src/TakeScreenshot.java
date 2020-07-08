import java.io.File;	
import java.io.IOException;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
		WebDriver dr = new FirefoxDriver();
		dr.get("http://www.qaclickacademy.com/practice.php");
		
		File src = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("/home/prathik.g/Desktop/pp.png"));

	}

}
