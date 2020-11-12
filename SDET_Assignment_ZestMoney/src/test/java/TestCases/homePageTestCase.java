package TestCases;

import org.testng.annotations.Test;

import BaseClass.TestBase;
import PageObject.HotelPage;
import PageObject.homePage;

public class homePageTestCase extends TestBase {
	homePage hp;
	HotelPage htp;
	
	public homePageTestCase() {
		super();
	}
	
	@Test(priority=0)
	public void search() throws Exception {
		VideoRecorder_utlity.startRecord("GoogleTestRecording");
		hp=new homePage();
		hp.searchFucntion();
		VideoRecorder_utlity.stopRecord();
	}
	
	@Test(priority=1)
	public void reviewFuction() throws InterruptedException {
		htp=new HotelPage();
		htp.reviewSection();
	}

}
