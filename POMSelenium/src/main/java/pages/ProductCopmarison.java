package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductCopmarison extends BasePage {
    public ProductCopmarison(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".table tr td:nth-child(2) a")
    private WebElement firstProduct;
    @FindBy(css = ".table tr td:nth-child(3) a")
    private WebElement secondProduct;

    public String getFirstProductText() {
        return firstProduct.getText();
    }

    public String getSecondProductText() {
        return secondProduct.getText();
    }
}
