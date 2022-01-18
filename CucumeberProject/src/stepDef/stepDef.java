package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.cartPage;
import pages.checkoutStepOne;
import pages.checkoutStepTwo;
import pages.homePage;
import pages.inventoryPage;
import pages.loginPage;

public class stepDef {
	
	
	
	WebDriver driver;
	loginPage lp;
	homePage hp; 
	inventoryPage ip; 
	cartPage cp; 
	checkoutStepOne cpOne; 
	checkoutStepTwo cpTwo; 
	
	@Given("^A$")
	public void a() throws Throwable {
		
		
		System.out.println("this is step a");
		
		Assert.assertEquals("abc", "abcd");
	   
	}

	@When("^B$")
	public void b() throws Throwable {
	  
		System.out.println("this is step b");
	}

	@When("^C$")
	public void c() throws Throwable {
	    
		System.out.println("this is step c");
	}

	@When("^D$")
	public void d() throws Throwable {

		System.out.println("this is step d");
	}

	@Then("^E$")
	public void e() throws Throwable {
	   
		System.out.println("this is step e");
	}
	
// ----------------------------------------------
	
	@Given("^user is on the login page$")
	public void user_is_on_the_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\workspace\\ProgrammingLibraries\\chromedriver.exe");
	    
		 driver = new ChromeDriver();
		 
		 lp = new loginPage(driver);
		 ip = new inventoryPage(driver);
		 cp = new cartPage(driver);
		 cpOne = new checkoutStepOne(driver);
		 cpTwo = new checkoutStepTwo(driver);
		 
		 
		 driver.get("https://www.saucedemo.com/");
			
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	
	@When("^user should not be able to login$")
	public void user_should_not_be_able_to_login() throws Throwable {
	   
		String url = driver.getCurrentUrl(); 
		
		
	}

	@When("^user enters valid username$")
	public void user_enters_valid_username() throws Throwable {
	   
	    lp.getUserName().sendKeys("standard_user");
	
	}

	@When("^user enters valid password$")
	public void user_enters_valid_password() throws Throwable {
	   
		lp.getpassword().sendKeys("secret_sauce");
		
		
	}
	
	@When("^user enters valid password \"([^\"]*)\"$")
	public void user_enters_valid_password(String password) throws Throwable {
	    lp.getpassword().sendKeys(password);
	}

	@When("^user enters valid username \"([^\"]*)\"$")
	public void user_enters_valid_username(String username) throws Throwable {
	    lp.getUserName().sendKeys(username);
	}

	@When("^user clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
	    
		lp.getloginButton().click();
	}

	@Then("^user should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
	  
		String url = driver.getCurrentUrl();
	}

	@When("^user enters invalid username$")
	public void user_enters_invalid_username() throws Throwable {
	  
		lp.getUserName().sendKeys("locked_out_user");
	}

	@When("^user enters invalid password$")
	public void user_enters_invalid_password() throws Throwable {
		lp.getpassword().sendKeys("secret_sauce");
	}

// -----------------------------------------------
	
	@Given("^user is in the home page$")
	public void user_is_in_the_home_page() throws Throwable {
	    
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\workspace\\ProgrammingLibraries\\chromedriver.exe");
	    
		 driver = new ChromeDriver();
		 
		 hp = new homePage(driver);
		 
		 driver.get("http://automationpractice.com/index.php");
			
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		
	}

	@When("^user clicks on the special link$")
	public void user_clicks_on_the_special_link() throws Throwable {
	   
		hp.getSpeciallink().click();
		
	}

	@Then("^user should be on the special page$")
	public void user_should_be_on_the_special_page() throws Throwable {
	    
		String expectedTtitle = "";
		String title = driver.getTitle(); 
		
	     Assert.assertEquals("Prices drop - My Store", title);
		
		
	}

	@When("^user clicks on the new products link$")
	public void user_clicks_on_the_new_products_link() throws Throwable {
	   
		
		hp.getnewProductslink().click();
	}

	@Then("^user should be on the new product page$")
	public void user_should_be_on_the_new_product_page() throws Throwable {
	   
		String title = driver.getTitle(); 
	}

	@When("^user clicks on the best sellers link$")
	public void user_clicks_on_the_best_sellers_link() throws Throwable {
	   
		hp.getbestSellerlink().click();
	}

	@Then("^user should be on the best sellers page$")
	public void user_should_be_on_the_best_sellers_page() throws Throwable {
		
		String title = driver.getTitle(); 
	}

	@When("^user clicks on the our stores link$")
	public void user_clicks_on_the_our_stores_link() throws Throwable {
	   
		hp.getOurStore().click();
	}

	@Then("^user should be on the our stores page$")
	public void user_should_be_on_the_our_stores_page() throws Throwable {
	  
		String title = driver.getTitle(); 
	}

// -----------------------------------------------
	
	@When("^user adds the backpack to the cart$")
	public void user_adds_the_backpack_to_the_cart() throws Throwable {
	    
		ip.getBackpack().click();
	}

	@When("^user clicks on the cart button on the homepage$")
	public void user_clicks_on_the_cart_button_on_the_homepage() throws Throwable {
	    
		ip.getcartButton().click();
	}

	@Then("^user should navigate to the checkout page$")
	public void user_should_navigate_to_the_checkout_page() throws Throwable {
	   
		String url = driver.getCurrentUrl();
		
		Assert.assertEquals("https://www.saucedemo.com/cart.html", url);
	}

	@When("^user clicks on the checkout button$")
	public void user_clicks_on_the_checkout_button() throws Throwable {
	  
		cp.getcheckoutButton().click();
	}

	@Then("^user should be on the checkout page$")
	public void user_should_be_on_the_checkout_page() throws Throwable {
	    
		String url = driver.getCurrentUrl();
		
		// need to add assertion
	}

	@When("^user enters firstname$")
	public void user_enters_firstname() throws Throwable {
	    
		cpOne.getfirstName().sendKeys("michael");
	}

	@When("^user enters lastname$")
	public void user_enters_lastname() throws Throwable {
	    cpOne.getlastName().sendKeys("scott");
	}

	@When("^user enters zipcode$")
	public void user_enters_zipcode() throws Throwable {
	   cpOne.getzipcode().sendKeys("22030");
	}

	@When("^user clicks on the continue button$")
	public void user_clicks_on_the_continue_button() throws Throwable {
	   cpOne.getcontButton().click();
	}

	@Then("^user should be on the checkout step two page$")
	public void user_should_be_on_the_checkout_step_two_page() throws Throwable {
		String url = driver.getCurrentUrl();
		
		// need to add assertion
	}

	@When("^user clicks on the finish button$")
	public void user_clicks_on_the_finish_button() throws Throwable {
	    
		cpTwo.getfinishButton().click();
	}

	@Then("^checkout should be successful$")
	public void checkout_should_be_successful() throws Throwable {
	    
		String url = driver.getCurrentUrl();
		
		// need to add assertion
	}
	
	@After
	public void endTest() {
		
		driver.quit();
		
	}
	
	@Before
	public void setupTest() {
		
		
		
	}



	
	
	
	
	
	
	
	
	
	
	


}
