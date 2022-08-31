package pageobject.pages;

import io.cucumber.java.sl.In;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeatSelectionPage {
    private BaseFunc baseFunc;

    private final By SEAT = By.xpath(".//div[@class = 'seat']");
    private final By SELECTED_SEAT_NR = By.xpath(".//div[@class = 'line']");
    private final By BOOK_BTN = By.id("book3");

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

    public int getSelectedSeatNr() {
//        return Integer.parseInt(StringUtils.substringAfter(baseFunc.findElement(SELECTED_SEAT_NR).getText(), ": "));
        String fullText = baseFunc.findElement(SELECTED_SEAT_NR).getText();
//        fullText.substring(fullText.length() - 2);
        fullText = StringUtils.substringAfter(fullText, ": ");
        return Integer.parseInt(fullText);
    }

    public FinalPage pressBookBtn() {
        baseFunc.click(BOOK_BTN);
        return new FinalPage(baseFunc);
    }
}
