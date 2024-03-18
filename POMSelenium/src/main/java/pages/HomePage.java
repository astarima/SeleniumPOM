package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[title='My Account']")
    private WebElement myAccountLink;

    @FindBy(css = ".dropdown-menu-right li:nth-child(2)")
    private WebElement loginLink;
    @FindBy(css = ".dropdown-menu-right li:nth-child(1)")
    private WebElement registrationLink;
    @FindBy(css = "[name='search']")
    private WebElement mySearch;
    @FindBy(css = ".btn-default")
    private WebElement searchBtn;
    @FindBy(css = ".dropdown-toggle")
    public WebElement currencyLink;
    @FindBy(css = ".dropdown-menu li:nth-child(2)")
    public WebElement poundSterlingLink;
    @FindBy(css = ".fa-exchange")
    public WebElement compareListBtn;
    @FindBy(xpath = "(//*[contains(@class,'fa-exchange')])[2]")
    public WebElement compareListBtn2;

    @FindBy(css = "a[href='https://demo.opencart-extensions.co.uk/index.php?route=product/compare']")
    public WebElement productComparisonLink;



    public void clickMyAccountLink() {
        myAccountLink.click();
    }

    public void clickLoginLink() {loginLink.click();
    }

    public void clickRegistrationLink() {registrationLink.click();
    }

    public void sendSearch(String iphone) {
        mySearch.sendKeys(iphone);
    }

    public void clickSearchBtn() {
        searchBtn.click();
    }

    public void clickCurrencyLink() {
        currencyLink.click();
    }

    public void clickPoundSterlingLink() {
        poundSterlingLink.click();
    }
    public  void clickCompareListBtn() { compareListBtn.click();}
    public  void clickCompareListBtn2() { compareListBtn2.click();}
    public void clickProductComparisonLink() {productComparisonLink.click();}



}