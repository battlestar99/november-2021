package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signUpPage {
	
	WebDriver driver; 
	
	public signUpPage(WebDriver driver) {
		
		this.driver=driver;   
			
	}
	
	
	
	
	public WebElement getSelectGender1() {
		
		WebElement gender1 = driver.findElement(By.id("id_gender1")); 
		return gender1; 
		
		
	}
	
public WebElement getfirstName() {
		
		WebElement fname = driver.findElement(By.name("customer_firstname")); 
		return fname; 
		
		
	}

public WebElement getlastName() {
	
	WebElement lname = driver.findElement(By.name("customer_lastname")); 
	return lname; 
	
	
}


	
	
	
	
	
	
	
	
	
	
	

}
