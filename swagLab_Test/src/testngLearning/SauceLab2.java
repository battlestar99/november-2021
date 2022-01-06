package testngLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SauceLab2 {
	WebDriver driver;
	
	public SauceLab2(int money) {
		
	}
	
	public SauceLab2(int money, int sum) {
		
	}
	
	@Test
	public void ownTest() {
		System.out.println("Test");
	}
	
	@Test
	public void ownTest2() {
		System.out.println("Test2");
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}
