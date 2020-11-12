package TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import BaseClass.TestBase;
import PageObject.home_Page;

public class sampleTest extends TestBase{
	
	home_Page hp;
	
	public sampleTest() {
		super();
	}
	
	@Test(priority=0)
	public void buyOption() {
		hp= new home_Page();
		hp.clickBuyNow();
	}
	

}
