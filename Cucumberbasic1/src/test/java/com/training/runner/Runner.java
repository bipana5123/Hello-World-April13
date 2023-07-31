package com.training.runner;
import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/bipanakoirala/eclipse-workspace/Cucumberbasic1/Features/SalesforceLogin.feature",
                glue= {"com.training.steps"},
                plugin= {"pretty","html:target/cucumber-reports/cucumber.html",
                		"json:target/cucumber-reports/cucumber.json"})
                



public class Runner {

}
