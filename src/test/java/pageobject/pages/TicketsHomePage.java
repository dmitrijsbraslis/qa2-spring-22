package pageobject.pages;

import model.reservation.Reservation;
import org.openqa.selenium.By;

public class TicketsHomePage {
    private final By FROM = By.id("afrom");
    private final By TO = By.id("bfrom");
    private final By GO_BTN = By.xpath(".//span[@class = 'gogogo']");

    private BaseFunc baseFunc;

    public TicketsHomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void selectAirports(Reservation reservation) {
        baseFunc.select(FROM, reservation.getDepartureAirport());
        baseFunc.select(TO, reservation.getArrivalAirport());
    }

    public void pressGoBtn() {
        baseFunc.click(GO_BTN);
    }
}
