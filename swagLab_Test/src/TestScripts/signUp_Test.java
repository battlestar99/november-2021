package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class signUp_Test {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\workspace\\ProgrammingLibraries\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();	
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		WebElement signInLink = driver.findElement(By.linkText("Sign in"));
		
		signInLink.click();
		
		WebElement emailBox = driver.findElement(By.id("email_create"));
		WebElement createAccountButton = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));

		
		emailBox.sendKeys("abcdef1234@gmail.com");
		createAccountButton.click();
		
		WebElement gender1Selection = driver.findElement(By.id("id_gender1"));
		WebElement firstName = driver.findElement(By.name("customer_firstname"));
		WebElement lastName = driver.findElement(By.name("customer_lastname"));
		
		
		gender1Selection.click();
		firstName.sendKeys("John");
		lastName.sendKeys("Smith");
		
		
		
		
	}

}
