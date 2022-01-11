package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cartPage {
	
	WebDriver driver; 
	
	public cartPage(WebDriver driver) {
		
		this.driver=driver; 
		
	}
	
	public WebElement getcheckoutButton() {
		
		WebElement checkoutContinue = driver.findElement(By.id("checkout"));
		return checkoutContinue;
		
	}

}
