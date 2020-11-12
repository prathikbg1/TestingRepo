package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.TaskPage;

public class TaskPageTest extends TestBase {
	
	TaskPage tp;
	LoginPage l;
	HomePage hp;
	
	public  TaskPageTest() {
		super();
	}
	
	
	
	@BeforeTest
	public void setUp() throws InterruptedException {
		invokeBrowser();
		
		tp=new TaskPage();
		l=new LoginPage();
		hp=l.login();
		hp=new HomePage();
	    tp=hp.createTask();
		
	}
	@Test(priority=1)
	public void verifyTaskPage() throws InterruptedException {
		tp=new TaskPage();
		tp.taskPage();
		Thread.sleep(3000);
	}
	
	@Test(priority=2)
	public void createOneTask() throws InterruptedException {
		tp=new TaskPage();
		tp.createTask();
		Thread.sleep(5000);
	}
	@Test(priority=3)
	public void veriftTaskCreatePage() throws InterruptedException {
		tp=new TaskPage();
		tp.taskDetails();
		Thread.sleep(5000);
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}

}
