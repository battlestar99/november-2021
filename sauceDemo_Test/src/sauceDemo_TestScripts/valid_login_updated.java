package sauceDemo_TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.loginPage;

public class valid_login_updated {

	public static void main(String[] args) {
		
		String userNameDataValid = "standard_user";
		String passwordData = "secret_sauce";
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\workspace\\ProgrammingLibraries\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();	
		
		loginPage lp = new loginPage(driver);
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		lp.getUsername().sendKeys(userNameDataValid);
		lp.getPassword().sendKeys(passwordData);
		lp.getloginButton().click();
		
		
		String actualUrl = driver.getCurrentUrl();
		
		System.out.println(actualUrl);
		
		
		driver.quit();
		
		
		
		

	}

}
