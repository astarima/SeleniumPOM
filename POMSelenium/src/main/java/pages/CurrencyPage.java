package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class CurrencyPage extends BasePage {
    public CurrencyPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = ".btn strong")
    private WebElement currencySymbol;

    public String getCurrencySymbol() {
        return currencySymbol.getText();
    }
}
