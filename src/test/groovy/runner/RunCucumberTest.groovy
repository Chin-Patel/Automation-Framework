package runner

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith


@RunWith(Cucumber.class)
@CucumberOptions(
        glue = ['stepdefs'],
        features = ["classpath:features"],
        plugin = [
                'pretty'
        ],
        monochrome = true
)
public class RunCucumberTest {

}