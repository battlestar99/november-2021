package seleniumPackage;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementInteractionOne {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\workspace\\ProgrammingLibraries\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://login.yahoo.com/account/create");
		
		Thread.sleep(2000);
		
	WebElement firstName = driver.findElement(By.name("firstName"));
	WebElement lastName = driver.findElement(By.name("lastName"));
	WebElement email = driver.findElement(By.name("yid"));
	WebElement button = driver.findElement(By.id("reg-submit-button"));
		
	firstName.sendKeys("mike");
	Thread.sleep(1000);
	lastName.sendKeys("Schure");
	Thread.sleep(1000);
	email.sendKeys("mike.schure");
	Thread.sleep(1000);
	
	firstName.clear();
	Thread.sleep(1000);
	lastName.clear();
	Thread.sleep(1000);
	email.clear();
	Thread.sleep(1000);	
	
	String text = button.getText();
	
	
	
	
	System.out.println(text);
	
	driver.quit();
		

	}

}
