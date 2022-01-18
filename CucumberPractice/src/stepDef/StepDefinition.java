package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
WebDriver driver;
	
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\workspace\\ProgrammingLibraries\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
	}
	
	@Given("^user is in signin page$")
	public void user_is_in_signin_page() throws Throwable {
		 driver.get("https://www.saucedemo.com/");
	}
	
	
	
	
	
	
	@When("^user insert valid username \"([^\"]*)\"$")
	public void user_insert_valid_username(String username) throws Throwable {
		WebElement userName = driver.findElement(By.name("user-name"));
		userName.sendKeys(username);
	}

	@When("^user insert valid password \"([^\"]*)\"$")
	public void user_insert_valid_password(String password) throws Throwable {
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys(password);
	}

	
	
	
	
	
	@When("^user insert valid username$")
	public void user_insert_valid_username() throws Throwable {
		WebElement userName = driver.findElement(By.name("user-name"));
		userName.sendKeys("standard_user");
	}

	@When("^user insert valid password$")
	public void user_insert_valid_password() throws Throwable {
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		loginButton.click();
	}

	@Then("^user should login$")
	public void user_should_login() throws Throwable {
	   
	}
	
	@After
	public void closeBrowser() {
		driver.quit();
	}

}
