package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class helloAgain {

	public static void main(String[] args) throws InterruptedException {
		
     // setup the location of the driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\workspace\\ProgrammingLibraries\\chromedriver.exe");
        
		// declaring and initialzing the webdriver object named driver
		
	    // going to opne up a browser instance
		WebDriver driver = new ChromeDriver();	
		
		WebDriver driver1 = new ChromeDriver();
		
		// navigate to an url 
		
		driver.navigate().to("https://www.yahoo.com/");
		
	   // driver.get("https://www.yahoo.com/");
		
		driver1.get("https://www.google.com/");
		
		Thread.sleep(3000);
		
		
        driver.quit();
		
		driver1.quit();
		
		
		
		
		

	}

}
