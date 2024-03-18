package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;
import utils.Waiters;

public class RegisterPage extends BasePage {
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[name='firstname']")
    private WebElement myFirstName;
    @FindBy(css = "[name='lastname']")
    private WebElement myLastName;
    @FindBy(css = "[name='email']")
    private WebElement myEmail;
    @FindBy(css = "[name='telephone']")
    private WebElement myTelephone;
    @FindBy(css = "[name='address_1']")
    private WebElement myAddress;
    @FindBy(css = "[name='city']")
    private WebElement myCity;
    @FindBy(css = "[name='postcode']")
    private WebElement myPostCode;
    @FindBy(css = "#input-country")
    private WebElement myCountry;
    @FindBy(css = "#input-zone")
    private WebElement myRegion;
    @FindBy(css = "[name='password']")
    private WebElement myPassword;
    @FindBy(css = "[name='confirm']")
    private WebElement confirmMyPassword;
    @FindBy(css = "[type='checkbox']")
    private WebElement myAgreeLink;
    @FindBy(css = "[type='submit']")
    private WebElement mySubmitBtn;

    public void typeFirstName(String first) {
        myFirstName.sendKeys(first);
    }
    public void typeLastName(String lastname) {
        myLastName.sendKeys(lastname);
    }
    public void typeEmail(String email) {
        myEmail.sendKeys(email);
    }
    public void typeTelephone(String phone) {
        myTelephone.sendKeys(phone);
    }
    public void typeAddress(String address) {
        myAddress.sendKeys(address);
    }
    public void typeCity(String city) {
        myCity.sendKeys(city);
    }
    public void typePostCode(String post) {
        myPostCode.sendKeys(post);
    }
    public void selectMyCountry(String country) {
        Select objSelect = new Select(myCountry);
        objSelect.selectByVisibleText(country);
    }
    public void selectMyRegion(String zone) {
        Waiters.waitForTextInElement(driver, myRegion, zone);
        Select objSelect = new Select(myRegion);
        objSelect.selectByVisibleText(zone);
    }
    public void typeMyPassword(String pass) {
        myPassword.sendKeys(pass);
    }
    public void typeConfirmMyPassword(String confirm) {
        confirmMyPassword.sendKeys(confirm);
    }
    public void clickMyAgreeLink() {
        myAgreeLink.click();
    }
    public void clickMySubmitBtn() {
        mySubmitBtn.click();
    }
}