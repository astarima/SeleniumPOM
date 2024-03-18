import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.CurrencyPage;
import pages.HomePage;

public class CurrencyPageTest extends BaseTest {
    HomePage homePage;
    CurrencyPage currencyPage;

    @Test
    void currencyCanChange() {
        homePage = new HomePage(driver);
        currencyPage = new CurrencyPage(driver);
        homePage.clickCurrencyLink();
        homePage.clickPoundSterlingLink();

        Assertions.assertEquals("£",currencyPage.getCurrencySymbol(), "Wrong symbol");
    }
}
