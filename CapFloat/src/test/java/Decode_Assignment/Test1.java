package Decode_Assignment;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Test1 {
 public static	WebDriver dr;
 public static Properties p;
public  String str;
public  String str1;
 static String dir;

	@Test(priority=1)
		public void setUp() {
		System.setProperty("webdriver.gecko.driver", "/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
		 dr = new FirefoxDriver();
		 dr.get("https://www.base64encode.org/");

}
	
	
	@Test(priority=2)
	public void uploadFile() throws InterruptedException {
		WebElement upload = dr.findElement(By.id("upload"));
		JavascriptExecutor js = (JavascriptExecutor)dr;
		js.executeScript("arguments[0].scrollIntoView(true);",upload);
		dr.findElement(By.xpath("//*[@type='file']")).sendKeys("/home/prathik.g/Desktop/selenium.txt");
		Thread.sleep(3000);
		dr.findElement(By.xpath("//button[@id='submit_text']")).click();
	}
	
	@Test(priority=2)
	public void readText() throws IOException {
		 dir=	System.getProperty("user.dir");
FileReader fr = new FileReader(dir+"/src/test/java/Utils/selenium.txt");
 FileReader fr1 = new FileReader(dir+"/src/test/java/Utils/encoded-20201122063652.txt");
	
	BufferedReader br = new BufferedReader(fr);
	BufferedReader br1 = new BufferedReader(fr1);
	if(((str=br.readLine())!=null) && ((str1=br1.readLine())!=null)) {
		System.out.println(str);
		System.out.println(str1);
		Assert.assertEquals(str, str1);
	}
	}
	}
