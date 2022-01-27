package sauceDemo_TestScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class valid_login_test {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		String userNameDataValid = "standard_user";
		String passwordData = "secret_sauce";
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\workspace\\ProgrammingLibraries\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement searchBox = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		
		searchBox.click();
		
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		action.click().build().perform();
		
		
//		driver.quit();
		
//		WebElement username = driver.findElement(By.id("user-name"));
//		WebElement password = driver.findElement(By.id("password"));
//		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
//		
//		username.sendKeys(userNameDataValid);
//		password.sendKeys(passwordData);
//		loginButton.click();
//		
//		String actualUrl = driver.getCurrentUrl();
//		
//		System.out.println(actualUrl);
		
		
		
		
		
		

	}

}
