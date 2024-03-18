import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.SaerchPage;
import pages.ShoppingCard;

public class ShoppingCardTest extends BaseTest {
    HomePage homePage;

    SaerchPage saerchPage;
    ShoppingCard shoppingCard;


    @Test
    void userPutItem() {
        homePage = new HomePage(driver);
        saerchPage = new SaerchPage(driver);
        shoppingCard = new ShoppingCard(driver);
        homePage.sendSearch("iPhone");
        homePage.clickSearchBtn();
        saerchPage.clickAddItemLink();

        Assertions.assertEquals("Success: You have added iPhone to your shopping cart!\n" +
                "×", shoppingCard.getAddSuccess(), "Item not added");

        Assertions.assertEquals("1 item(s)",shoppingCard.getTotalCard(),"Empty");


        boolean isItemAdded = shoppingCard.getCardTotal().startsWith("1");
        Assertions.assertTrue(isItemAdded);
    }
}
