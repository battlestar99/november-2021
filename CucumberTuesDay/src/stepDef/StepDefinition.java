package stepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.loginPage;

public class StepDefinition {
	WebDriver driver; 
	loginPage lp;
	
	@Given("^user is in sign page$")
	public void user_is_in_sign_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\workspace\\ProgrammingLibraries\\chromedriver.exe");
		 driver = new ChromeDriver();	
		 lp = new loginPage(driver);
		 driver.get("https://www.saucedemo.com/");
	}

	@When("^user isert valid username$")
	public void user_isert_valid_username() throws Throwable {
		lp.getUserName().sendKeys("statnder_user");
	}

	@When("^user isert valid \"([^\"]*)\"$")
	public void user_isert_valid(String username) throws Throwable {
		lp.getUserName().sendKeys(username);
	}
	
	@When("^user insert valid password$")
	public void user_insert_valid_password() throws Throwable {
		lp.getpassword().sendKeys();
	}

	@When("^user insert valid \"([^\"]*)\"$")
	public void user_insert_valid(String password) throws Throwable {
		lp.getpassword().sendKeys(password);
	}

	@When("^user click on signin button$")
	public void user_click_on_signin_button() throws Throwable {
		lp.getloginButton().click();
	}

	@Then("^user should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
	    Assert.assertEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl());
	}

}
