package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class HelloWorldStepDefs {
    private int alexApplesCount;
    private int kateApplesCount;
    private int applesTotalCount;

    @Given("Alex has {int} apples")
    public void set_apples_for_alex(int count) {
        alexApplesCount = count;
    }

    @Given("Jekaterina has {int} apples")
    public void set_apples_for_kate(int count) {
        kateApplesCount = count;
    }

    @When("they are putting all apples together")
    public void put_apples_together() {
        applesTotalCount = alexApplesCount + kateApplesCount;
    }

    @Then("they have {int} apples")
    public void check_apples_count(int count) {
        Assertions.assertEquals(count, applesTotalCount, "Wrong apples count");
    }
}
