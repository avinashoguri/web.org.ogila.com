package cucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(

		features="src/test/java/features/SignUP.feature",
		glue="stepDefenations",
		format= {"pretty","html:test-htmloutput","json:json_output/cucumber.json"},
		monochrome = true,
		dryRun = false)
		


public class TestRunner extends AbstractTestNGCucumberTests{



}

