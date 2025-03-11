package Runner;

import org.testng.annotations.Listeners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import Utility.ExtentListener;

@Listeners(Utility.ExtentListener.class)  
/*
 * @CucumberOptions(features = {
 * "src\\test\\resources\\Features\\Signin.feature" }, glue = { "stepdefinition"
 * ,"hooks"},tags = "@SC1", plugin = { "pretty",
 * "html:src\\test\\resources\\Reports\\cucumber-reports.html",
 * "json:src\\test\\resources\\Reports\\json-reports.json",
 * "junit:src\\test\\resources\\Reports\\junit-reports.xml" })
 */
//
//@CucumberOptions(features = { "src\\test\\resources\\Features\\CreateAccount.feature" }, glue = {
//"stepdefinition" }, plugin = { "pretty", "html:src\\test\\resources\\Reports\\cucumber-reports.html",
//		"json:src\\test\\resources\\Reports\\json-reports.json",
//		"junit:src\\test\\resources\\Reports\\junit-reports.xml" })

@CucumberOptions(
	    features = { "src\\test\\resources\\Features\\CreateAccount.feature" }, 
	    glue = { "stepdefinition" }, 
	    plugin = {
	        "pretty",
	        "html:target/cucumber-reports.html",
	        "json:target/cucumber-reports.json",
	        "junit:target/junit-reports.xml"
	    }
	)


public class AuthenticationrunnerTestCase extends AbstractTestNGCucumberTests {
	

}
