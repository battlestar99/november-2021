package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObject.loginPage;

public class Login2 {
	
	WebDriver driver; 
	loginPage lp;
	
	@BeforeTest
	public void initializeBrowser() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\workspace\\ProgrammingLibraries\\chromedriver.exe");
		 driver = new ChromeDriver();	
		 lp = new loginPage(driver);
		 driver.get("https://www.saucedemo.com/");
	}
	
	@Parameters({"userName","passWord"})
	@Test
	public void login(String userName, String passWord) {
		lp.getUserName().sendKeys(userName);
		lp.getpassword().sendKeys(passWord);
		lp.getloginButton().click();
	}
	
	
	
	
//	@AfterTest
//	public void closeBrowser() {
//		driver.quit();
//	}
	
	
}
