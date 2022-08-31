package pageobject.pages;

import org.openqa.selenium.By;

public class FinalPage {
    private BaseFunc baseFunc;
    private final String SUCCESS_TXT = "Thank You for flying with us!";
    private final By SUCCESS_MSG = By.xpath(".//div[@class = 'finalTxt']");

    public FinalPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public boolean isReservationSuccessful() {
        return baseFunc.findElement(SUCCESS_MSG).getText().equals(SUCCESS_TXT);
    }
}
