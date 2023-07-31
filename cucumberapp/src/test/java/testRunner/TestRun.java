package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "/home/coder/project/workspace/cucumberapp/src/test/resources/Features" }, glue = {
		"stepDefinition" }, monochrome = false, plugin = { "pretty", "html:target/HTMLReports/report.html" }

)
public class TestRun {

}