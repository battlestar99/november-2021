package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	
	WebDriver driver; 
	
	public loginPage(WebDriver mdriver) {
		
		//this.driver=driver; 
		
		driver = mdriver; 
		
	}
	
	
	
	public WebElement getUsername() {
		
		WebElement username = driver.findElement(By.id("user-name"));
		return username; 
		
	}
	
	
    public WebElement getPassword() {
		
    	WebElement password = driver.findElement(By.id("password"));
		return password; 
		
	}
    
    public WebElement getloginButton() {
		
    	WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		return loginButton; 
		
	}
	

}
