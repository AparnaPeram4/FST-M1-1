package cucumberTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Features",
    glue = "stepDefinitions",
    plugin = { "pretty", "html:target/cucumber-reports/reports" },
    tags = "@SmokeTest",
    strict = true
)

public class ActivitiesRunner {
    //empty
}