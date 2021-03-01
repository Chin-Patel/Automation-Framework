package stepdefs

import automationFramework.cucumber.World
import automationFramework.utils.CustomFunctions
import automationFramework.utils.RESTLibrary
import com.fasterxml.jackson.databind.JsonNode
import com.google.inject.Inject
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.sl.In
import cucumber.runtime.java.guice.ScenarioScoped

@ScenarioScoped
class DemoAPISteps {
    @Inject World world
    @Inject RESTLibrary restLibrary
    @Inject CustomFunctions customFunctions
    @Given("I make a get request to json place holder")
    public void i_calculate_x() {
        l
        JsonNode result = restLibrary.makeRestCall("https://jsonplaceholder.typicode.com/todos/1", "")

    }

    @Then("the values should match")
    public void theValuesShouldMatch() {
        customFunctions.loadDataFile()

    }
}