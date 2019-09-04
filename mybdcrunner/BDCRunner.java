package mybdcrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features99",glue = "bdcstepdefinitions",tags= {"@Sanity,@Regression"},plugin= {"pretty","html:target/cucumber-html-report","json:target/vindhyaDemo-JSON-report"})

public class BDCRunner {
	
	
}
