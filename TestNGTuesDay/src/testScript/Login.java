package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObject.loginPage;

public class Login {
	
	WebDriver driver; 
	loginPage lp;
	
	@BeforeSuite
	public void initializeBrowser() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\workspace\\ProgrammingLibraries\\chromedriver.exe");
		 driver = new ChromeDriver();	
		 lp = new loginPage(driver);
		 driver.get("https://www.saucedemo.com/");
	}
	
	@Parameters({"userName","password"})
	@Test
	public void login(String username, String password) {
		lp.getUserName().sendKeys(username);
		lp.getpassword().sendKeys(password);
		lp.getloginButton().click();
//		driver.navigate().back();
	}
	
//	@Test
//	public void login2() {
//		lp.getUserName().sendKeys("locked_out_user");
//		lp.getpassword().sendKeys("secret_sauce");
//		lp.getloginButton().click();
//		driver.navigate().refresh();
//	}
//	
//	@Test
//	public void login3() {
//		lp.getUserName().sendKeys("problem_user");
//		lp.getpassword().sendKeys("secret_sauce");
//		lp.getloginButton().click();
//		driver.navigate().back();
//	}
//	
//	@Test
//	public void login4() {
//		lp.getUserName().sendKeys("performance_glitch_user");
//		lp.getpassword().sendKeys("secret_sauce");
//		lp.getloginButton().click();
//	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
	
	
}
