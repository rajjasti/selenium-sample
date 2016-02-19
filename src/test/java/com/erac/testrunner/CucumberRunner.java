package com.erac.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:cucumber",glue = "com.erac.cucumber.steps", format={"pretty","html:target/reports/test-report"},tags= {})
public class CucumberRunner {
}
