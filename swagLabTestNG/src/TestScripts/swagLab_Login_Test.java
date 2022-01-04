package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class swagLab_Login_Test {
	
	WebDriver driver;
	
	@BeforeTest
	public void testSetup() {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\workspace\\ProgrammingLibraries\\chromedriver.exe");
	    
		 driver = new ChromeDriver();	
			
	}
	
	
	
	@BeforeMethod
	
	public void beforeEachTest() {
		
      driver.get("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
	
	@Test(priority=0) 
	public void validateValidLogin() {
		
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		loginButton.click();
		
		
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		
		String actualUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(actualUrl, expectedUrl);
		
		
		
	}
	
	
	@Test(priority=1) 
	public void validateinValidLogin() {
		
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		
		username.sendKeys("locked_out_user");
		password.sendKeys("secret_sauce");
		loginButton.click();
		
		
		String expectedUrl = "https://www.saucedemo.com/";
		
		String actualUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(actualUrl, expectedUrl);
		
		
		
	}
	
	
	@Test(priority=2) 
	public void validateprobUserLogin() {
		
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		
		username.sendKeys("problem_user");
		password.sendKeys("secret_sauce");
		loginButton.click();
		
		
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		
		String actualUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(actualUrl, expectedUrl);
		
		
		
	}
	
	@AfterTest
	
	public void testEnd() {
		
		driver.quit();
	}

}
