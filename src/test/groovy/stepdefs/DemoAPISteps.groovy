package stepdefs

import automationFramework.cucumber.World
import com.google.inject.Inject
import cucumber.api.java.en.Given
import cucumber.runtime.java.guice.ScenarioScoped

@ScenarioScoped
class DemoAPISteps {
    @Inject World world

    @Given("I calculate an equation")
    public void i_calculate_x() {
        println(world.env)
        println(1 + 2)
    }
}