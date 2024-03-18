import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import utils.DataGenerator;

public class LoginPageTest extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;


    @Test
    void userCanLogin() {
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        myAccountPage = new MyAccountPage(driver);
        homePage.clickMyAccountLink();
        homePage.clickLoginLink();
        loginPage.typeEmail("saule125@mail.com");
        loginPage.typePassword("saulevilk25*");
        loginPage.clickButtonLogin();

        Assertions.assertEquals("My Account", myAccountPage.GetAccount(),"Login not success");
    }


}