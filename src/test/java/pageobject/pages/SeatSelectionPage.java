package pageobject.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SeatSelectionPage {
    private BaseFunc baseFunc;

    private final By SEAT = By.xpath(".//div[@class = 'seat']");

    public SeatSelectionPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void selectSeat(int seatNr) {
        baseFunc.waitForElementCountAtLeast(SEAT, 5);

        WebElement seatToChose = null;

        for (WebElement we : baseFunc.findElements(SEAT)) {
            if (Integer.parseInt(we.getText()) == seatNr) {
                seatToChose = we;
                break;
            }
        }

        Assertions.assertNotNull(seatToChose, "Can't find seat");

        baseFunc.click(seatToChose);
    }
}
