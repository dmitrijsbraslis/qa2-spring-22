package model;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

public class Main {
    @JsonProperty("temp_min")
    private double minTemp;
}
