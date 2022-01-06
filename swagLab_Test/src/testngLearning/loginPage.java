package testngLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginPage {
	
	
	
	
	WebDriver internalDriver;
		
	public loginPage(WebDriver driver) {
		internalDriver = driver;
	}
	
	
	public WebElement getUserName() {
		
		WebElement username = internalDriver.findElement(By.id("user-name"));
		return username; 
	}
	
	public WebElement getpassword() {
		
	WebElement password = internalDriver.findElement(By.id("password"));
		return password; 
	}

	public WebElement getloginButton() {
	
	WebElement loginButton = internalDriver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		return loginButton; 
	}
	
	
	
	
	
	
	
	
	
	

}
