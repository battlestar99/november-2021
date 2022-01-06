package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.cartPage;
import pages.checkoutStepOne;
import pages.checkoutStepTwo;
import pages.inventoryPage;
import pages.loginPage;

public class end_to_end_test {
	
	WebDriver driver; 
	loginPage lp; 
	inventoryPage ip; 
	cartPage cp; 
	checkoutStepOne cpOne; 
	checkoutStepTwo cpTwo; 
	int x; 
	
	@BeforeTest
	public void setupTest() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\workspace\\ProgrammingLibraries\\chromedriver.exe");
	    
		 driver = new ChromeDriver();
		 lp = new loginPage(driver);
		 x = 12; 
		 ip = new inventoryPage(driver);
		 cp = new cartPage(driver);
		 cpOne = new checkoutStepOne(driver);
		 cpTwo = new checkoutStepTwo(driver);
		 
		 driver.get("https://www.saucedemo.com/");
			
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
	
	
	@Test
	public void endtoEndBuy() throws InterruptedException {
		
		lp.getUserName().sendKeys("standard_user");
		lp.getpassword().sendKeys("secret_sauce");
		lp.getloginButton().click();
		
		System.out.println(x);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		System.out.println("user successfully logged in");
		
		ip.getBackpack().click();
		ip.getcartButton().click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		System.out.println("user successfully added product to the cart");
		
		Thread.sleep(1000);
		
		cp.getcheckoutButton().click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		System.out.println("user successfully in the checkout page");
		
		Thread.sleep(1000);
		
		cpOne.getfirstName().sendKeys("Michael");
		cpOne.getlastName().sendKeys("Scott");
		cpOne.getzipcode().sendKeys("22030");
		cpOne.getcontButton().click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		cpTwo.getfinishButton().click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		System.out.println("user successfully finished buying the product");
		
		String actualUrl = driver.getCurrentUrl();
		
		String expectedUrl = "https://www.saucedemo.com/checkout-complete.html";
		
		Assert.assertEquals(actualUrl, expectedUrl);
		
		
		
		
		
		
		
		
	}


	
	@AfterTest
	public void endTest() {
		
		driver.quit();
		
	}

}
