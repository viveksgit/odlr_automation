package common; 

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(
		monochrome = true,
		features = "classpath:features/login.feature",
		plugin = {"pretty", "html:target/cucumber"},
		glue = "stepDefs",
		tags = {}
	) 

public class RunCukesTest { 

}
