package model.reservation;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.RandomStringUtils;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Reservation {
    @JsonProperty("name")
    private String firstName;

    @JsonProperty("surname")
    private String lastName;
    private String discount;

    @JsonProperty("flight")
    private String flightDate;

    @JsonProperty("afrom")
    private String departureAirport;

    @JsonProperty("ato")
    private String arrivalAirport;

    @JsonProperty("seat")
    private int seatNumber;

    @JsonProperty("adults")
    private int adultsCount;

    @JsonProperty("children")
    private int childCount;

    @JsonProperty("bugs")
    private int bagsCount;

    public Reservation() {
    }

    public Reservation(String firstName, String lastName, String discount, String flightDate,
                       String departureAirport, String arrivalAirport, int seatNumber,
                       int adultsCount, int childCount, int bagsCount) {

        this.firstName = firstName.equals("random") ? RandomStringUtils.randomAlphabetic(10) : firstName;
        this.lastName = lastName.equals("random") ? RandomStringUtils.randomAlphabetic(10) : lastName;
        this.discount = discount.equals("random") ? RandomStringUtils.randomAlphabetic(6) : discount;

        this.flightDate = flightDate;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.seatNumber = seatNumber;
        this.adultsCount = adultsCount;
        this.childCount = childCount;
        this.bagsCount = bagsCount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getAdultsCount() {
        return adultsCount;
    }

    public void setAdultsCount(int adultsCount) {
        this.adultsCount = adultsCount;
    }

    public int getChildCount() {
        return childCount;
    }

    public void setChildCount(int childCount) {
        this.childCount = childCount;
    }

    public int getBagsCount() {
        return bagsCount;
    }

    public void setBagsCount(int bagsCount) {
        this.bagsCount = bagsCount;
    }
}
