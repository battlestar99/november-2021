package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkoutStepTwo {

	
	
WebDriver driver; 
	
	public checkoutStepTwo(WebDriver driver) {
		
		this.driver=driver; 
		
	}
	
public WebElement getfinishButton() {
		
	WebElement finishButton = driver.findElement(By.name("finish"));
		return finishButton;
		
	}
}
