package Test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day3 {
	
	@Test(groups={"Smoke"})
	
	public void carLoanWebLogin() {
		System.out.println("Smoke login succesful");
	}
	
	@BeforeSuite
	
	public void stone() {
		System.out.println("high");
	}

}
