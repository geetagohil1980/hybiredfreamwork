package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith ( Cucumber.class )
@CucumberOptions(
  features = "C:\\Users\\sidgo\\IdeaProjects\\NopcommerceBdd\\src\\test\\resources\\Features ",
   glue = {"Stepdefinitions"} ,

      dryRun = false

)



public class TestRunner {


}
