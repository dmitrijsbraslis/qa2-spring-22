package selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {
    @Test
    public void openWebPage() {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://qaguru.lv");
    }
}
