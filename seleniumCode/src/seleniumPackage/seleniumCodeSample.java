package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumCodeSample {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\workspace\\ProgrammingLibraries\\chromedriver.exe");
    
		WebDriver driver = new ChromeDriver();	
		
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com/");
		
		String url; 
		
		url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		String title; 
		
		title = driver.getTitle();
		
		System.out.println(title);

	}

}
