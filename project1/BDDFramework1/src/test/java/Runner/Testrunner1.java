package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/main/java/Features", 
    glue = {"Stepdefination"},
    plugin = {"pretty", "html:target/cucumber-reports, json:json_output/cucumber.json, junit:junit_xml/cucmber.xml"},
    monochrome = true,
    dryRun = true
    )
public class Testrunner1 {


}
