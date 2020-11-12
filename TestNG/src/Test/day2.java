package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class day2 {

	@Test(enabled=false)
	
	public void jump() {
		System.out.println("Jump");
	}
	
	@Test(timeOut=4000)
	public void stone() {
		System.out.println("last");
	}
}
