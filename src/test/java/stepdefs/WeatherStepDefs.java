package stepdefs;

import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.weather.WeatherResponse;
import org.junit.jupiter.api.Assertions;
import requesters.WeatherRequester;

import java.util.Map;

public class WeatherStepDefs {
    private long cityId;
    private WeatherResponse response;

    @Given("city id: {long}")
    public void set_city_id(long cityId) {
        this.cityId = cityId;
    }

    @When("we are requesting weather data")
    public void request_weather() throws JsonProcessingException {
        WeatherRequester requester = new WeatherRequester();
        response = requester.requestWeather(cityId);
    }

    @Then("coords are:")
    public void check_coords(Map<String, Double> params) {
        Assertions.assertEquals(params.get("lon"), response.getCoord().getLon(), "Wrong Lon!");
        Assertions.assertEquals(params.get("lat"), response.getCoord().getLat(), "Wrong Lat!");
    }

    @Then("weather is:")
    public void check_weather(Map<String, String> params) {

    }

    @Then("base is {string}")
    public void check_base(String base) {

    }

    //TODO: add all other step definitions
}
