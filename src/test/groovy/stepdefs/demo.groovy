import cucumber.api.java.en.Given

public class demo{
    @Given("I calculate {int} x {int}")
    public void i_calculate_x(Integer int1, Integer int2) {
        println(int1 + int2)
    }
}