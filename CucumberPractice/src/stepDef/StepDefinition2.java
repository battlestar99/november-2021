package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.When;

public class StepDefinition2 {
	WebDriver driver;
	
	@When("^user insert valid username \"([^\"]*)\"$")
	public void user_insert_valid_username(String username) throws Throwable {
		WebElement userName = driver.findElement(By.name("user-name"));
		userName.sendKeys(username);
	}
	
	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		loginButton.click();
	}
}
