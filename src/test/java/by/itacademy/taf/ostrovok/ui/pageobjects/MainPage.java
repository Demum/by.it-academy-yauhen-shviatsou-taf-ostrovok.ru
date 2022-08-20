package by.itacademy.taf.ostrovok.ui.pageobjects;

import by.itacademy.taf.ostrovok.ui.utils.RandomValue;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {
    @FindBy(xpath = "//div[text()='Log in']")
    private WebElement buttonLogin;
    @FindBy(xpath = "//span[@data-testid='user-widget-sign-up-tab']")
    private WebElement buttonSignUp;
    @FindBy(xpath = "//input[@name='email']")
    private WebElement inputEmail;
    @FindBy(xpath = "//div[@class='Authorization-module__error--17cEq']")
    private WebElement errorPleaseEnterValidEmail;

    @FindBy(xpath = "//button[@data-testid='user-widget-sign-up-button']")
    private WebElement clickButtonSignUpWithCreatedEmail;
    @FindBy(xpath = "//div[@class='Control-module__username--3qcGq']")
    private WebElement userEmailINnMainPage;
    @FindBy(xpath = "//input[@data-testid='destination-input']")
    private WebElement inputDestination;
    @FindBy(xpath = "//div[@data-testid='date-start-input']")
    private WebElement buttonCheckInDatePicker;

    @FindBy(xpath = "//div[contains(@data-day, 'Sun Aug 21 2022')]")
    private WebElement datePickerChenIn;

    @FindBy(xpath = "//div[contains(@data-day, 'Sat Sep 03 2022')]")
    private WebElement datePickerChenOut;


    public MainPage openPage() {
        driver.get(BasePage.BASE_URL);
        return this;
    }

    public MainPage clickButtonLogin() {
        waitForElementToBeClickable(buttonLogin);
        buttonLogin.click();
        return this;
    }

    public MainPage clickButtonSignUp() {
        waitForVisibilityOfElement(buttonSignUp);
        buttonSignUp.click();
        return this;
    }

    public MainPage typeRandomValidEmail() {
        inputEmail.clear();
        inputEmail.sendKeys(RandomValue.randomValidEmail);
        return this;
    }

    public MainPage typeRandomInValidEmail() {
        inputEmail.clear();
        inputEmail.sendKeys(RandomValue.randomInValidEmail);
        return this;
    }

    public MainPage clickButtonSignUpWithCreatedEmail() {
        waitForElementToBeClickable(clickButtonSignUpWithCreatedEmail);
        clickButtonSignUpWithCreatedEmail.click();
        return this;
    }

    public MainPage typeDestination() {
        inputDestination.clear();
        inputDestination.sendKeys("Paris, Ile-de-France, France");
        return this;
    }

    public String getUserEmail() {
        waitForVisibilityOfElement(userEmailINnMainPage);
        return userEmailINnMainPage.getAttribute("innerHTML");
    }

    public boolean isDisplayedErrorPleaseEnterValidEmail() {
        waitForVisibilityOfElement(errorPleaseEnterValidEmail);
        return errorPleaseEnterValidEmail.isDisplayed();
    }

    public MainPage clickButtonCheckInDatePicker() {
        waitForElementToBeClickable(buttonCheckInDatePicker);
        buttonCheckInDatePicker.click();
        return this;
    }

    public MainPage clickDatePickerCheckIn() {
        waitForElementToBeClickable(datePickerChenIn);
        datePickerChenIn.click();
        return this;
    }

    public MainPage clickDatePickerCheckOut() {
                waitForElementToBeClickable(datePickerChenOut);
        datePickerChenOut.click();
        return this;
    }
}