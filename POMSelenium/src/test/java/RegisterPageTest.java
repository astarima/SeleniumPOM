import com.github.javafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.AccountCreatedPage;
import pages.HomePage;
import pages.RegisterPage;
import utils.DataGenerator;

import static utils.DataGenerator.*;

public class RegisterPageTest extends BaseTest {

    HomePage homePage;
    RegisterPage registerPage;
    AccountCreatedPage accountCreatedPage;
    DataGenerator dataGenerator;


    @Test
    void userCanRegister() throws InterruptedException {
        Faker faker = new Faker();
        dataGenerator = new DataGenerator();
        String name = getRandomName();
        String nameLast = DataGenerator.getRandomLastName();
        String email = DataGenerator.getRandomEmail();
//        String email = faker.internet().emailAddress();
        String phone = DataGenerator.getRandomPhone();
        String address = DataGenerator.getRandomStreet();
        String city = DataGenerator.getRandomCity();
        String postcode = DataGenerator.getRandomPostCode();
        String password = DataGenerator.getRandomPassword();
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        accountCreatedPage = new AccountCreatedPage(driver);
        homePage.clickMyAccountLink();
        homePage.clickRegistrationLink();
        registerPage.typeFirstName(getRandomName());
        registerPage.typeLastName(getRandomLastName());
        registerPage.typeEmail(getRandomEmail());
        registerPage.typeTelephone(getRandomPhone());
        registerPage.typeAddress(getRandomStreet());
        registerPage.typeCity(getRandomCity());
        registerPage.selectMyCountry("Lithuania");
        registerPage.selectMyRegion("Vilnius");
        registerPage.typeAddress(getRandomPostCode());
        registerPage.typeMyPassword(password);
        registerPage.typeConfirmMyPassword(password);
        registerPage.clickMyAgreeLink();
        registerPage.clickMySubmitBtn();

        Assertions.assertEquals("Your Account Has Been Created!", accountCreatedPage.GetAccount(), "Account not created");

    }
}


