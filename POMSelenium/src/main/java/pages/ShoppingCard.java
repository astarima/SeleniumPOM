package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCard extends BasePage {
    public ShoppingCard(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".alert-success")
    private WebElement addSuccess;
    @FindBy(css = "#cart-total")
    private WebElement totalCard;

    public String getAddSuccess() {
        return addSuccess.getText();
    }

    public String getTotalCard() {
        return totalCard.getText().trim().substring(0, 9);
    }
    public String getCardTotal() {
        return  totalCard.getText();
    }
    public  boolean isSuccessMessageDisplayed() {
        return totalCard.isDisplayed();
    }


}
