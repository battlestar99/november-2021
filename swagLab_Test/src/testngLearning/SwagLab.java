package testngLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLab {
	 public static void main(String[] args) throws InterruptedException {
		  
		  
		  String userNameDataValid = "standard_user";
		  String passwordData = "secret_sauce";
		  
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\workspace\\ProgrammingLibraries\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();  
		  driver.get("https://www.saucedemo.com/");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  
		  WebElement userName= driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		  userName.sendKeys(userNameDataValid);
		  
		  WebElement passWord= driver.findElement(By.xpath("//*[@id=\"password\"]"));
		  passWord.sendKeys(passwordData);
		  
		  Thread.sleep(2000);// just for checking purpose

		  
		  WebElement login=driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		  login.click();
		  
		  System.out.println(driver.getCurrentUrl()); //different way: check SauceDemoLockedOutUser2
		  System.out.println(driver.getTitle()); //different way: check SauceDemoLockedOutUser2

		  driver.navigate().back();
		  Thread.sleep(2000);// just for checking purpose
		  //driver.quit();
		  
		  
		  driver.navigate().refresh();
		  WebElement userName2=driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		  userName.sendKeys("locked_out_user");
		  passWord.sendKeys(passwordData);
		  login.click();


		 }
}
