package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AccountCreatedPage extends BasePage {

    public AccountCreatedPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#content h1")
    private WebElement myAccountCreated;

    public String GetAccount() {
        return myAccountCreated.getText();
    }


}
