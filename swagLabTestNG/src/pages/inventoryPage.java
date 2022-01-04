package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class inventoryPage {
	
	WebDriver driver; 
	
	public inventoryPage(WebDriver driver) {
		
		this.driver=driver; 
		
	}
	
	
	public WebElement getBackpack() {
		
		WebElement backPackCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		return backPackCart; 
	}
	
public WebElement getcartButton() {
		
	WebElement cartButton = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
		return cartButton; 
	}
	
	

}
