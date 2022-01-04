package TestScripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class template_learn_two {
	
	
	@BeforeTest
	public void testSetup() {
		
		System.out.println("this is test setup");
		
	}
	
	
	@BeforeMethod 
	public void testSetupone() {
		
		System.out.println("this is before method");
		
	}
	
	@AfterMethod 
	public void testendOne() {
		
		System.out.println("this is after method");
		
	}
	
	@Test(priority=1) 
	public void aTest() {
		
		System.out.println("this is test a");
		
		Assert.assertEquals("abcd", "abc");
	}
	
	@Test (priority=0)
	public void bTest() {
		
		System.out.println("this is test b");
	}
	
	
	@AfterTest
	public void endTest() {
		
		System.out.println("this is the end of the test");
		
	}
	

}
