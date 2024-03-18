package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#input-email")
    private WebElement myAccountEmail;

    public void typeEmail(String email) {
        myAccountEmail.sendKeys(email);
    }

    @FindBy(css = "#input-password")
    private WebElement myAccountPassword;

    public void typePassword(String password) {
        myAccountPassword.sendKeys(password);
    }

    @FindBy(css = "[value='Login']")
    private WebElement buttonLogin;

    public void clickButtonLogin() {
        buttonLogin.click();

    }
}