package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {
	
	WebDriver driver; 
	
	public homePage(WebDriver driver) {
		
		this.driver=driver; 
		
	}
	
	
	public WebElement getSpeciallink() {
		
		WebElement link = driver.findElement(By.linkText("Specials"));
		
		return link; 
		
	}
	
public WebElement getnewProductslink() {
		
		WebElement newp = driver.findElement(By.linkText("New products"));
		
		return newp; 
		
	}
	
public WebElement getbestSellerlink() {
	
	WebElement x = driver.findElement(By.linkText("Best sellers"));
	
	return x; 
	
}
	
public WebElement getOurStore() {
	
	WebElement x = driver.findElement(By.linkText("Our stores"));
	
	return x; 
	
}	
	

}
