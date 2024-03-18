import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.ProductCopmarison;

public class CompareProductTest extends BaseTest {
    HomePage homePage;
    ProductCopmarison productCopmarison;


    @Test
    void compareProduct() throws InterruptedException {
        homePage = new HomePage(driver);
        productCopmarison = new ProductCopmarison(driver);
        homePage.clickCompareListBtn();
        homePage.clickCompareListBtn2();
        Thread.sleep(2000);
        homePage.clickProductComparisonLink();
        Assertions.assertEquals("iPhone", productCopmarison.getFirstProductText());
        Assertions.assertEquals("iPod Classic", productCopmarison.getSecondProductText());


    }
}
