package pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HomePage {
    // Attributes -> Locators
    private final By ACCEPT_COOKIES_BTN = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    private final By SEARCH_INPUT_FIELD = By.id("q");
    private BaseFunc baseFunc;

    // Constructor
    public HomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    // Methods (works with this page objects using locators)
    public void acceptCookies() {
        baseFunc.click(ACCEPT_COOKIES_BTN);
    }

    public void searchFor(String textToFind) {
        baseFunc.type(SEARCH_INPUT_FIELD, textToFind);
        baseFunc.pressKey(SEARCH_INPUT_FIELD, Keys.ENTER);
    }
}
