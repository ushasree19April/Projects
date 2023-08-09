package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
publish = true,
plugin = { "pretty", "html:target/cucumberReports/CucumberReport.html" },
glue = { "stepDefinitions" })

public class TestRunner {

}
