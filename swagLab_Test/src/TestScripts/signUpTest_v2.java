package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.homePage;
import pages.signInPage;
import pages.signUpPage;

public class signUpTest_v2 {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\workspace\\ProgrammingLibraries\\chromedriver.exe");
	    
       
		WebDriver driver; 
		
		driver= new ChromeDriver();
		
		homePage hp = new homePage(driver);
		signInPage sp = new signInPage(driver);
		signUpPage sup = new signUpPage(driver);
		
		
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		hp.getSignInLink().click();
		sp.getEmailAdress().sendKeys("abcldhfdkd@gmail.com");
		sp.getcreateButton().click();
		
		sup.getSelectGender1().click();
		sup.getfirstName().sendKeys("John");
		sup.getlastName().sendKeys("Voit");
		
		
		
		
		
		

	}

}
