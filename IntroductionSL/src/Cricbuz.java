import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cricbuz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver", "/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
		WebDriver dr=new FirefoxDriver();
		dr.get("https://www.cricbuzz.com/live-cricket-scorecard/23066/mlr-vs-sys-20th-match-big-bash-league-2019-20");
	WebElement table = dr.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
   int rowcount = table.findElements(By.cssSelector("div.cb-col.cb-col-100.cb-scrd-itms")).size();
  int count= table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
   int sum=0;
	for (int i=0;i<count-2;i++) {

	String value =	table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
	 int sum1 = Integer.parseInt(value);
	 sum=sum+sum1;
	
	}
	System.out.println(sum);
	
System.out.println(table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());	
System.out.println(table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());	


	
	}

}
