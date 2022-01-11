package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkoutStepOne {
	
	WebDriver driver; 
	
	public checkoutStepOne(WebDriver driver) {
		
		this.driver=driver; 
		
	}
	
public WebElement getzipcode() {
		
	WebElement zipcode = driver.findElement(By.name("postalCode"));
		return zipcode;
		
	}

public WebElement getfirstName() {
	
	WebElement firstName = driver.findElement(By.id("first-name"));
	return firstName; 
	
	
	
	
}

public WebElement getlastName() {
	
	WebElement lastName = driver.findElement(By.id("last-name"));
	return lastName;
	
}

public WebElement getcontButton() {
	
	WebElement contButton = driver.findElement(By.name("continue"));
	return contButton;
	
}
	

}
