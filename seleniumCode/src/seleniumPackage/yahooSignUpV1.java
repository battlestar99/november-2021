package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahooSignUpV1 {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\workspace\\ProgrammingLibraries\\chromedriver.exe");
		    
			WebDriver driver = new ChromeDriver();	
			
			driver.get("https://login.yahoo.com/account/create");
			
			
			 WebElement firstName = driver.findElement(By.name("firstName"));
			 WebElement lastName = driver.findElement(By.id("usernamereg-lastName"));
			 WebElement email = driver.findElement(By.xpath("//*[@id=\"usernamereg-yid\"]"));
			 WebElement password = driver.findElement(By.xpath("//*[@id=\"usernamereg-password\"]"));
			 WebElement helpLink = driver.findElement(By.linkText("Help"));
			 
			 
			 
			 boolean firstNamedisplay = firstName.isDisplayed();
			 System.out.println(firstNamedisplay);
			 
			 if(firstNamedisplay) {
				 
				 System.out.println("First Name is displayed in the page");
				 
			 }
			 
			 else {
				 
				 System.out.println("First Name is not displayed in the page");
			 }
			 
			
			 firstName.sendKeys("Michael");
			 Thread.sleep(2000);
			 firstName.clear();
			 Thread.sleep(2000);
			 firstName.sendKeys("Michael");
			 
			 Thread.sleep(1000);
			 lastName.sendKeys("Schure");
			 
			 Thread.sleep(1000);
			 email.sendKeys("michaelscure347834");
			 
			 Thread.sleep(1000);
			 password.sendKeys("djflkdsjf++");
			 
			 
			 Thread.sleep(1000);
			 helpLink.click();
			 
			 
			 Thread.sleep(2000);
			 
			 driver.navigate().back();
			 
			 Thread.sleep(2000);
			 
			 driver.findElement(By.name("firstName")).clear();
			 driver.findElement(By.name("firstName")).sendKeys("test");
			 
			 
			 
			 
			 
			 
			 
			 
	}

}
