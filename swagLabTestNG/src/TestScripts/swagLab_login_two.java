package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.loginPage;

public class swagLab_login_two {
	
WebDriver driver;

loginPage lp; 
	
	@BeforeTest
	public void testSetup() {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\workspace\\ProgrammingLibraries\\chromedriver.exe");
	    
		 driver = new ChromeDriver();
		 lp = new loginPage(driver);
			
	}
	
	
	
	@BeforeMethod
	
	public void beforeEachTest() {
		
      driver.get("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
	
	@Test(priority=0) 
	public void validateValidLogin() {
		
		lp.getUserName().sendKeys("standard_user");
		lp.getpassword().sendKeys("secret_sauce");
		lp.getloginButton().click();
		
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		
		String actualUrl = driver.getCurrentUrl();
		
		Reporter.log("Validating valid credential test");
		
		Assert.assertEquals(actualUrl, expectedUrl);
		
		
		
		
		
	}
	
	
	@Test(priority=1) 
	public void validateinValidLogin() {
		
		lp.getUserName().sendKeys("locked_out_user");
		lp.getpassword().sendKeys("secret_sauce");
		lp.getloginButton().click();
		
		String expectedUrl = "https://www.saucedemo.com/";
		
		String actualUrl = driver.getCurrentUrl();
		
		Reporter.log("Validating invalid credential test");
		
		Assert.assertEquals(actualUrl, expectedUrl);
		
		
		
	}
	
	
	@Test(priority=2) 
	public void validateprobUserLogin() {
		
		lp.getUserName().sendKeys("problem_user");
		lp.getpassword().sendKeys("secret_sauce");
		lp.getloginButton().click();
		
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		
		String actualUrl = driver.getCurrentUrl();
		
		Reporter.log("Validating problem user test");
		
		Assert.assertEquals(actualUrl, expectedUrl);
		
		
		
		
		
	}
	
	@AfterTest
	
	public void testEnd() {
		
		driver.quit();
	}

	
	
	

}
