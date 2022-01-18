package runnerClass;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/Features",
		glue = "stepDef",
		tags = "@tests",
		plugin = {"pretty","html:cucumber/report2"}
		
		
		)

public class TestRunner {
	
	

}
