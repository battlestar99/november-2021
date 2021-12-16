package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class yahooSignUPV2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\workspace\\ProgrammingLibraries\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://login.yahoo.com/account/create");
		
		
		 WebElement firstName = driver.findElement(By.name("firstName"));
		 WebElement lastName = driver.findElement(By.id("usernamereg-lastName"));
		 WebElement email = driver.findElement(By.xpath("//*[@id=\"usernamereg-yid\"]"));
		 WebElement password = driver.findElement(By.xpath("//*[@id=\"usernamereg-password\"]"));
		 WebElement helpLink = driver.findElement(By.linkText("Help"));
		 WebElement countryCode = driver.findElement(By.name("shortCountryCode"));
		 WebElement birthMonth = driver.findElement(By.name("mm"));
		 
		 
		 firstName.sendKeys("Michael");
		 Thread.sleep(1000);
		 lastName.sendKeys("Schure");
		 Thread.sleep(1000);
		 email.sendKeys("michaelscure347834");
		 Thread.sleep(1000);
		 password.sendKeys("djflkdsjf++");
		 
		 
		 Select cc = new Select(countryCode);
		 cc.selectByValue("CO");
		 Thread.sleep(1000);
		 
		 Select bm = new Select (birthMonth);
		 bm.selectByValue("4");
		 
		 
		 
		 
		 

	}

}
