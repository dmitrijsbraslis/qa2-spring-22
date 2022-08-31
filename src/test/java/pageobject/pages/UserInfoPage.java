package pageobject.pages;

import model.reservation.Reservation;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UserInfoPage {
    private final By AIRPORTS = By.xpath(".//span[@class = 'bTxt']");
    private final By NAME = By.id("name");
    private final By SURNAME = By.id("surname");
    private final By DISCOUNT = By.id("discount");
    private final By ADULTS = By.id("adults");
    private final By CHILDREN = By.id("children");
    private final By BAGS = By.id("bugs");
    private final By FLIGHT = By.id("flight");
    private final By GET_PRICE_BTN = By.xpath(".//span[@onclick = 'setLang();']");
    private final By GET_PRICE_RESPONSE = By.id("response");
    private final By BOOK_BTN = By.id("book2");

    private BaseFunc baseFunc;

    public UserInfoPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public List<WebElement> getSelectedAirports() {
        return baseFunc.findElements(AIRPORTS);
    }

    public void fillInInfoForm(Reservation reservation) {
        baseFunc.type(NAME, reservation.getFirstName());
        baseFunc.type(SURNAME, reservation.getLastName());
        baseFunc.type(DISCOUNT, reservation.getDiscount());
        baseFunc.type(ADULTS, reservation.getAdultsCount());
        baseFunc.type(CHILDREN, reservation.getChildCount());
        baseFunc.type(BAGS, reservation.getBagsCount());
        baseFunc.select(FLIGHT, reservation.getFlightDate());
    }

    public void pressGetPriceBtn() {
        baseFunc.click(GET_PRICE_BTN);
    }

    public String getPassengerName() {
        String responseText = baseFunc.findElement(GET_PRICE_RESPONSE).getText();
        return StringUtils.substringBetween(responseText, "Mr/Ms ", "!");
    }

    public int getPrice() {
        String responseText = baseFunc.findElement(GET_PRICE_RESPONSE).getText();
        return Integer.parseInt(StringUtils.substringBetween(responseText, "to for ", " EUR"));
    }

    public SeatSelectionPage pressBookBtn() {
        baseFunc.click(BOOK_BTN);
        return new SeatSelectionPage(baseFunc);
    }
}
