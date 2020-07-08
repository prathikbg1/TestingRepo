import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AutoGeneratingLoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
		WebDriver dr = new FirefoxDriver();
		
		dr.get("https://www.spicejet.com/");
		
	/*	System.out.println(dr.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());//
		Assert.assertFalse(dr.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		dr.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		//System.out.println(dr.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());//
		Assert.assertTrue(dr.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		//to find the count of checkboxes //
		
		System.out.println(dr.findElements(By.cssSelector("input[type='checkbox']")).size()); */
		
		dr.findElement(By.id("divpaxinfo")).click();
	Select s= new Select(dr.findElement(By.id("ctl00_mainContent_ddl_Adult")));
	s.selectByValue("3");
	Assert.assertEquals(dr.findElement(By.id("divpaxinfo")).getText(),"3 Adult");
		
		
	/*	dr.findElement(By.id("fromCity")).click();
WebElement source = dr.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));
source.click();
source.sendKeys("Bom");
source.sendKeys(Keys.ARROW_DOWN);
source.sendKeys(Keys.ENTER);

WebElement dest = dr.findElement(By.xpath("//*[@id='toCity']"));
dest.click();
dest.sendKeys("Del");
int i=1;
while (i<4) {
	dest.sendKeys(Keys.ARROW_DOWN);
	i++;
	dest.sendKeys(Keys.ENTER);
} */
	
	}
	

}
