package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementVerification {

	public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\workspace\\ProgrammingLibraries\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://login.yahoo.com/account/create");
		
		
		
		
		WebElement fName = driver.findElement(By.id("usernamereg-firstName"));
		
		
		WebElement button = driver.findElement(By.name("signup"));
		
		//boolean x = driver.findElement(By.id("usernamereg-firstName")).isDisplayed();
		
		//driver.findElement(By.id("usernamereg-firstName")).sendKeys("mike");
		
		
		
		boolean x = fName.isDisplayed();
		
	    fName.sendKeys("Mike");
	    
	   boolean y =  button.isEnabled();
	   
	   String buttonText = button.getText();
	   
	   System.out.println(buttonText);
	    
	    
	   System.out.println(x);
	    
		
		// isdisplayed, it returns boolean value true - web element is displayed
		// isdisplayed, it returns boolean value false - web element is not displayed
		
		
		
		
		
		
         
	}

}
