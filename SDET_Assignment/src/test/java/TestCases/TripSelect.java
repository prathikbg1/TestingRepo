package TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.TestBase;
import PageObject.UserDetails;
import PageObject.flightPage;
import PageObject.homePage;

public class TripSelect extends TestBase{
	homePage hp;
	flightPage fp;
	UserDetails ud;
	
	
	public TripSelect() {
		super();
	}
	
/*	@BeforeTest
	public void invokeBrowserSetup() {
		invokeBrowser();
	} */
	
	@Test(priority=1)
		public void flightSelect() throws InterruptedException {
		hp = new homePage();
		fp = new flightPage();
		fp=hp.tripBooking();
	} 
	@Test(priority=2)
	public void bookTicket() {
		fp = new flightPage();
		ud=fp.bookFlight();
	}
	@Test(priority=3)
	public void userDetails() throws InterruptedException {
		ud = new UserDetails();
		ud.fillUserDetails();
	}

}
