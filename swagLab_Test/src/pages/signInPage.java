package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signInPage {
	
WebDriver driver; 
	
	public signInPage(WebDriver driver) {
		
		this.driver=driver; 
		
	}
	
	
	public WebElement getEmailAdress() {
		
		WebElement emailAddress = driver.findElement(By.id("email_create"));
		return emailAddress;
		
		
	}
	

	public WebElement getcreateButton() {
		
		WebElement create = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
		return create;
		
		
	}
	
	
	

}
