package pageobject;

import org.junit.jupiter.api.Test;
import pageobject.pages.BaseFunc;
import pageobject.pages.HomePage;

public class CatalogTests {
    private final String HOME_PAGE_URL = "1a.lv";
    private final String PRODUCT_TO_FIND = "Apple";

    @Test
    public void productDetailsCheck() {
        BaseFunc baseFunc = new BaseFunc();
        baseFunc.openUrl(HOME_PAGE_URL);

        HomePage homePage = new HomePage(baseFunc);
        homePage.acceptCookies();
        homePage.searchFor(PRODUCT_TO_FIND);

        SearchResultPage resultPage = new SearchResultPage(baseFunc);
        //....
    }
}
