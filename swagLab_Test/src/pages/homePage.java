package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {
	
	WebDriver driver; 
	
	public homePage(WebDriver driver) {
		
		this.driver=driver; 
		
	}
	

	public WebElement getSignInLink() {
		
		WebElement signIn = driver.findElement(By.linkText("Sign in"));
		
		return signIn; 
		
	}
	
	
  public WebElement getSearchBox() {
		
		WebElement searchBox = driver.findElement(By.id("search_query_top"));
		
		return searchBox; 
		
	}
	
	
	
	
	
	
	
	

}
