package differentDataType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationPractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\workspace\\ProgrammingLibraries\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");
		
		WebElement signinButton = driver.findElement(By.className("login"));
		
		signinButton.click();
		
		WebElement emailTextBox = driver.findElement(By.id("email_create"));
		
		emailTextBox.sendKeys("abc1234567sdgsgssgsgsgsg@gmail.com");
		
		WebElement createAnAccountButton = driver.findElement(By.id("SubmitCreate"));
		
		createAnAccountButton.click();
	}

}
