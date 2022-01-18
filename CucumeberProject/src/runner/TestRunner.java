package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/Features2",
		glue = "stepDef",
		tags = "@tests"
		
		)


public class TestRunner {

}
