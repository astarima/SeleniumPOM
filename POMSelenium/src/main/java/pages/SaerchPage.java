package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SaerchPage extends BasePage {

    public SaerchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".caption h4 a:nth-child(1)")
    private WebElement myiPhone;
    @FindBy(css = ".button-group i:nth-child(1)")
    private WebElement addItemLink;

    public String GetAccount() {return myiPhone.getText();
    }
    public void clickAddItemLink() {addItemLink.click();
    }



}
