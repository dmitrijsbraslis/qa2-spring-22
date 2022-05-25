package selenium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WebShopTest {
    private final String HOME_PAGE_URL = "http://1a.lv";
    private final By SEARCH_INPUT_FIELD = By.id("q");
    private final By PRODUCT_TYPE = By.xpath(".//span[@class = 'single-title']");
    private final By ACCEPT_COOKIES_BTN = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");

    private final String CATEGORY_NAME = "Apple AirPods";

    @Test
    public void searchFieldsCheck() {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE_URL);

        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));

        browser.findElement(ACCEPT_COOKIES_BTN).click();

        WebElement searchField = browser.findElement(SEARCH_INPUT_FIELD);
        searchField.sendKeys("Apple");
        searchField.sendKeys(Keys.ENTER);

        List<WebElement> subMenuItems = browser.findElements(PRODUCT_TYPE);

        boolean isCategoryFound = false;
        for (WebElement we : subMenuItems) {
            if (we.getText().equals(CATEGORY_NAME)) {
                isCategoryFound = true;
                wait.until(ExpectedConditions.elementToBeClickable(we));

                try {
                    we.click();
                } catch (ElementClickInterceptedException e) {
                    System.out.println("Can't click from the first try");
                    we.click();
                }

                break;
            }
        }

        Assertions.assertTrue(isCategoryFound, "Category not found");
    }
}
