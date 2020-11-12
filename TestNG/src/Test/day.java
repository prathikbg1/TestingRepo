package Test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class day {
	
	
	@Test(dataProvider="getData")
	
	public void run(String user,String pwd) {
		System.out.println("helo");
		System.out.println(user);
		System.out.println(pwd);
	}
	@Test
	public void star() {
		System.out.println("Shine"); // these 2 methods will execute 1st
		assertTrue(false);
	}
	
	@Test(dependsOnMethods= {"run","star"})
	public void abc() {
		System.out.println("Bye");
	}
	
	@DataProvider
	//1. username,pwd - good credit histry row
	//2. no credit histry
	//3. fraud credit histry
	public Object[][] getData() {
		Object o1[][]=new Object[3][2];
		
		//1st set
		o1[0][0]="firstname";
		o1[0][1]="password";
		
		//2nd set
		o1[1][0]="secoundUsername";
		o1[1][1]="secoundpassword";
		
		//3rd set
		o1[2][0]="ThirdUsername";
		o1[2][1]="Thirdpassword"; 
		return o1;
	}
	

}
