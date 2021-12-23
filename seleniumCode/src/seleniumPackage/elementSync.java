package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class elementSync {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\workspace\\ProgrammingLibraries\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();	
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		WebElement signIn = driver.findElement(By.linkText("Sign in"));
		
		System.out.println(signIn.getAttribute("rel"));
		
		signIn.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		driver.findElement(By.id("email_create")).sendKeys("textemail@gmail.com");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().back();
		
		
		

	}

}
