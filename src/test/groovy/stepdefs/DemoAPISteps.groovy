package stepdefs

import automationFramework.cucumber.World
import automationFramework.utils.RESTLibrary
import com.fasterxml.jackson.databind.JsonNode
import com.google.inject.Inject
import cucumber.api.java.en.Given
import cucumber.runtime.java.guice.ScenarioScoped

@ScenarioScoped
class DemoAPISteps {
    @Inject World world
    @Inject RESTLibrary restLibrary
    @Given("I make a get request to json place holder")
    public void i_calculate_x() {
        JsonNode result = restLibrary.makeRestCall("https://jsonplaceholder.typicode.com/todos/1", "")

    }
}