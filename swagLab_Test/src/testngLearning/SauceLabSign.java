package testngLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class SauceLabSign {
	WebDriver driver;
	loginPage lp;
	@BeforeTest
	public void testSetup() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\workspace\\ProgrammingLibraries\\chromedriver.exe");
	    
		driver = new ChromeDriver();
		 
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		lp = new loginPage(driver);

	}
	
	@Test
	public void ownTest() {
				
		System.out.println("Test");
		lp.getUserName().sendKeys("some value");
	}
	
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
	
}
