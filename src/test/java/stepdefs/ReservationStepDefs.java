package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.reservation.Reservation;
import org.openqa.selenium.WebElement;
import pageobject.pages.BaseFunc;
import pageobject.pages.TicketsHomePage;
import pageobject.pages.UserInfoPage;

import java.util.List;
import java.util.Map;

import static java.lang.Integer.*;
import static org.junit.jupiter.api.Assertions.*;

public class ReservationStepDefs {
    private Reservation reservation;
    private BaseFunc baseFunc = new BaseFunc();
    private TicketsHomePage homePage;
    private UserInfoPage infoPage;

    private final String HOME_PAGE_URL = "http://qaguru.lv:8089/tickets";

    @Given("random client with:")
    public void create_client(Map<String, String> params) {
        reservation = new Reservation("random", "random", params.get("discount"), params.get("flight_date"),
                params.get("airport_from"), params.get("airport_to"), parseInt(params.get("seat_number")),
                2, 3, 2);
    }

    @Given("home page is opened")
    public void open_home_page() {
        baseFunc.openUrl(HOME_PAGE_URL);
        homePage = new TicketsHomePage(baseFunc);
    }

    @When("we are selecting airports")
    public void select_airports() {
        homePage.selectAirports(reservation);
        homePage.pressGoBtn();
        infoPage = new UserInfoPage(baseFunc);
    }

    @Then("selected airports appears on client info page")
    public void check_airports() {
        List<WebElement> airports = infoPage.getSelectedAirports();
        assertEquals(reservation.getDepartureAirport(), airports.get(0).getText(), "Incorrect dep airport");
        assertEquals(reservation.getArrivalAirport(), airports.get(1).getText(), "Incorrect arrival airport");
    }

    @When("we are filling in passenger info form")
    public void fill_passenger_info_form() {
        infoPage.fillInInfoForm(reservation);
    }
}
