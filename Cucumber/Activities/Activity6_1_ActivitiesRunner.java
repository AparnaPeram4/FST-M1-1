package cucumberTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Features",
    glue = "stepDefinitions",
    plugin = { "json: test-reports/json-report.json\"" },
    monochrome = true,
    tags = "@activity2_5"
    
)

public class ActivitiesRunner {
    //empty
}