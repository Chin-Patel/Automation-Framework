package stepdefs
import cucumber.api.java.en.Given
import cucumber.runtime.java.guice.ScenarioScoped

@ScenarioScoped
class DemoAPI {
    @Given("I calculate an equation")
    public void i_calculate_x() {
        println(1 + 2)
    }
}