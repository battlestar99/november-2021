package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementInteraction {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\workspace\\ProgrammingLibraries\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://login.yahoo.com/account/create");
		
		Thread.sleep(2000);
		
		// typing value in first name text box
		
		driver.findElement(By.name("firstName")).sendKeys("Mike");
		
		// typing value in last name text box
		
		driver.findElement(By.id("usernamereg-lastName")).sendKeys("Scure");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("yid")).sendKeys("mike.schure");
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
