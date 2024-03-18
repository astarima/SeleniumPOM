import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.SaerchPage;

public class SearchPageTest extends BaseTest {

    HomePage homePage;

    SaerchPage saerchPage;


    @Test
    void userCanSearch() {
        homePage = new HomePage(driver);
        saerchPage = new SaerchPage(driver);
        homePage.sendSearch("Iphone");
        homePage.clickSearchBtn();

        Assertions.assertEquals("iPhone", saerchPage.GetAccount(),"Wrong item");

    }
}