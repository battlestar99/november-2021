package sauceDemo_TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class end_to_end_product_buy {

	public static void main(String[] args) throws InterruptedException {
		
		String userNameDataValid = "standard_user";
		String passwordData = "secret_sauce";
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\workspace\\ProgrammingLibraries\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));

		
		username.sendKeys(userNameDataValid);
		password.sendKeys(passwordData);
		loginButton.click();
		
		String actualUrl = driver.getCurrentUrl();
		
		
		Thread.sleep(1000);
		
		
		System.out.println("user successfully logged in");
		
		WebElement backPackCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		
		backPackCart.click();
		
		Thread.sleep(1000);
		
		WebElement cartButton = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
		
		cartButton.click();
		
		System.out.println("user successfully added product to the cart");
		
		Thread.sleep(1000);
		
		WebElement checkoutContinue = driver.findElement(By.id("checkout"));
		
		checkoutContinue.click();
		
		System.out.println("user successfully in the checkout page");
		
		Thread.sleep(1000);
		
		WebElement firstName = driver.findElement(By.id("first-name"));
		WebElement lastName = driver.findElement(By.id("last-name"));
		WebElement zipcode = driver.findElement(By.name("postalCode"));
		WebElement contButton = driver.findElement(By.name("continue"));
		
		
		
		firstName.sendKeys("Michael");
		lastName.sendKeys("Scott");
		zipcode.sendKeys("22030");
		contButton.click();
		
		
		WebElement finishButton = driver.findElement(By.name("finish"));
		finishButton.click();
		
		System.out.println("user successfully finished buying the product");
		
		String checkoutUrl = driver.getCurrentUrl();
		
		System.out.println(checkoutUrl);
		
		driver.quit();
		
		
		
		
		
		
		
		
		

	}

}
