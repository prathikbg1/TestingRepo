package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	
	@Test(groups={"Smoke"})
	public void ton() {
		System.out.println("Smoke BeforeClass");
	}
	
	@Parameters({"URL"})
	@Test
	public void homeLoanWebLogin(String urlname) {
		System.out.println("loan succesful");
		System.out.println(urlname);
	}
	@BeforeMethod
	public void drive() {
		System.out.println("drive succesful");
	}
		@Test(groups={"Smoke"})
	public void homeLogin() {
		System.out.println("Smoke home login");
	}

}
