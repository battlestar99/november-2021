package TestScripts;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class template_learn {
	
	
	
	// pre-requirment
	@BeforeTest
	public void testSetup() {
		
		System.out.println("This is before test");
	}
	
	// the main test
	// one test case or test scenario
	
	@Test
	public void btest() {
		
		System.out.println("This is the main test b");
		
		Assert.assertEquals("abc","abc");
		
	
		
	}
	
	@Test
	public void cTest() {
		
		System.out.println("This is the main test c");
		
		Assert.assertEquals(false, false);
		
		//Assert.assertFalse(false);
		
	}
	
	@Test
	public void aTest() {
		
		System.out.println("This is the main test");
		
		Assert.assertTrue(true);
		
		
		
	}
	
	
	
	
	// post-requiremnet
		@AfterTest
		public void testEnd() {
			
			System.out.println("This is after test");
			
		}
		
	
	

}
