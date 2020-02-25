package ebay;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

    features = "src\\test\\resource\\search.feature"
   // glue={}

)

public class RunCuke {
}
