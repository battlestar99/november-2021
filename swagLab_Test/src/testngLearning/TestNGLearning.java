package testngLearning;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGLearning {
	
	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@BeforeGroups
	public void beforeGroup() {
		System.out.println("Before Group");
	}
	
	@Test
	public void test() {
		System.out.println("Test");
	}
	
	@AfterGroups
	public void afterGroup() {
		System.out.println("After Group");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	
	@AfterClass
	public void aftyerClass() {
		System.out.println("After Class");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
}
