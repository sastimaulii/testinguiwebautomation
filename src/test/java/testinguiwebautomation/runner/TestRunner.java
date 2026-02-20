package testinguiwebautomation.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"testinguiwebautomation.stepDefinitions", "testinguiwebautomation.hooks"},
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)
@Test
public class TestRunner extends AbstractTestNGCucumberTests {
}