package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.loginPage;

public class loginElementValidation {
	
	WebDriver driver; 
	loginPage lp; 
	
	@BeforeTest
	public void testSetup() {
		
     System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\workspace\\ProgrammingLibraries\\chromedriver.exe");
	    
		 driver = new ChromeDriver();	
		 lp = new loginPage(driver);
		 
		 driver.get("https://www.saucedemo.com/");
			
	}
	
	@Test 
	public void checkloginDisplay() {
		
	boolean x= 	lp.getUserName().isDisplayed();
	
	Assert.assertTrue(x);
	
	boolean y = lp.getpassword().isDisplayed();
	
	Assert.assertEquals(y, true);
		
		
		
	}
	
	@AfterTest
	public void endtest() {
		
		driver.quit();
	}
	
	
	
	
	
	
	
	

}
