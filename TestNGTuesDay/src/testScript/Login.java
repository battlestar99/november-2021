package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.loginPage;

public class Login {
	
	WebDriver driver; 
	loginPage lp;
	
	@BeforeTest
	public void initializeBrowser() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\workspace\\ProgrammingLibraries\\chromedriver.exe");
		 driver = new ChromeDriver();	
		 lp = new loginPage(driver);
		 driver.get("https://www.saucedemo.com/");
	}
	
	
	@Test
	public void login() {
		lp.getUserName().sendKeys("standard_user");
		lp.getpassword().sendKeys("secret_sauce");
		lp.getloginButton().click();
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
	
	
}
