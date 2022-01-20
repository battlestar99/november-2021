package runnerClasses;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/Features",
		glue = "stepDef",
		plugin = {"pretty","html:reports"},
		tags = {"@neg,@pos"}
		
		)



public class TestRunner {

}
