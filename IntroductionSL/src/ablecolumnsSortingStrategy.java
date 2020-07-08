import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class ablecolumnsSortingStrategy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
		WebDriver dr = new FirefoxDriver();
		dr.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
	
		
	
List <WebElement> namesList = dr.findElements(By.cssSelector("tr td:nth-child(2)"));
ArrayList<String> originalList = new ArrayList<String>();

for(int i=0;i<namesList.size();i++)
{
     originalList.add(namesList.get(i).getText());
}
System.out.println("-------------------------------------------------------------------------");

ArrayList<String> copiedList =  new ArrayList<String>();
for(int i=0;i<namesList.size();i++)
{
	copiedList.add(originalList.get(i)); // add original list
}
Collections.sort(copiedList); //sort copied list

System.out.println("----------------------------SortedList---------------------------------------------");
for(String s : copiedList) {
	
	System.out.println(s);
}
System.out.println("----------------------------OriginalList------------------------------------------");
for(String s1 : originalList) {
	System.out.println(s1);
}
if(originalList.equals(copiedList)) {
	System.out.println("Test Pass");
}
else {
	System.out.println("Test Fail");
}

/*--------------------------Descending order-------------------------------------------------------*/

dr.findElement(By.xpath("//*[@id='sortableTable']/thead/tr/th[2]/b")).click();
dr.findElement(By.xpath("//*[@id='sortableTable']/thead/tr/th[2]/b")).click();
List<WebElement> finalList = dr.findElements(By.cssSelector("tr td:nth-child(2)"));
ArrayList<String> finalListCopy = new ArrayList<String>();
for(int i=0;i<finalList.size();i++) {
	finalListCopy.add(finalList.get(i).getText());
}
System.out.println("--------------------------AscendingList-----------------------------");
for (String s2 : finalListCopy) {
	System.out.println(s2);
}
Assert.assertTrue(finalListCopy.equals(copiedList));



	}

}
