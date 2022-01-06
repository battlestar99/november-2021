package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.loginPage;

public class swagLabLoginData {
	
	
	WebDriver driver; 
	loginPage lp; 
	
	@BeforeTest
	public void testSetup() {
		
     System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\workspace\\ProgrammingLibraries\\chromedriver.exe");
	    
		 driver = new ChromeDriver();	
		 lp = new loginPage(driver);
		 
		 driver.get("https://www.saucedemo.com/");
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			
	}
	
	@Parameters({"username","password","expectedUrl"})
	@Test
	
    public void validateLogin(String username, String password, String expectedUrl ) throws InterruptedException {
		
		lp.getUserName().sendKeys(username);
		Thread.sleep(1000);
		lp.getpassword().sendKeys(password);
		Thread.sleep(1000);
		lp.getloginButton().click();
		
		//Thread.sleep(1000);
		

		
		String actualUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(actualUrl, expectedUrl);
		
		
		
	}
	
	@AfterTest
	public void endTest() {
		
		driver.quit();
		
		
	}
	
	
	
	

}
