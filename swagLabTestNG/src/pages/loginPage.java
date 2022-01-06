package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	
	
	WebDriver driver; 
	
	
	public loginPage(WebDriver driver) {
		
		
		this.driver=driver; 
		
	}
	
	public WebElement getUserName() {
		
		WebElement username = driver.findElement(By.name("user-name"));
		return username; 
	}
	
	public WebElement getpassword() {
		
	WebElement password = driver.findElement(By.id("password"));
		return password; 
	}

	public WebElement getloginButton() {
	
	WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		return loginButton; 
	}
	
	
	
	
	
	
	
	
	
	

}
