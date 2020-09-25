package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources\\projectApplogin\\applogin.feature"},glue= {"stepdefinition"},
tags= "@validateMail",
dryRun= false ,
monochrome = true , 
strict = true , 
plugin = {"html:testoutput1.html","junit:juni_xml/cucumber.xml","json:json_xml/cucumber.json"})

public class Test_runner {

}
