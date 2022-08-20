package by.itacademy.taf.ostrovok.ui.pageobjects;

import by.itacademy.taf.ostrovok.ui.utils.DatePicker;
import by.itacademy.taf.ostrovok.ui.utils.RandomValue;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

    String inputDestinationSting="Heliport De Paris, France";

    DatePicker datePicker = new DatePicker();


    public  final By ENTERED_INPUT_DESTINATION = By.xpath("//input[@value='Heliport De Paris, France']");

    public  final By DATE_PICKER_CHECK_IN = By.xpath("//div[contains(@data-day, '"+datePicker.pickCheckInDate()  +"')]");
    public  final By DATE_PICKER_CHECK_OUT = By.xpath("//div[contains(@data-day, '"+datePicker.pickCheckOutDate()  +"')]");



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
       waitForVisibilityOfElement(inputDestination);
       inputDestination.sendKeys(inputDestinationSting);
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

    public MainPage clickDatePickerCheckIn (){
        waitForElementToBeClickable(driver.findElement(DATE_PICKER_CHECK_IN));
        driver.findElement(DATE_PICKER_CHECK_IN).click();
        return this;
    }
    public MainPage clickDatePickerCheckOut (){
       waitForElementToBeClickable(driver.findElement(DATE_PICKER_CHECK_OUT));
        driver.findElement(DATE_PICKER_CHECK_OUT).click();
        return this;
    }

    public MainPage clickEnterInputDestination() throws InterruptedException {
      //  Thread.sleep(1000);
        waitForVisibilityOfElement(driver.findElement(ENTERED_INPUT_DESTINATION));
        waitForElementToBeClickable(driver.findElement(ENTERED_INPUT_DESTINATION));
        inputDestination.sendKeys(Keys.ENTER);
        return this;
    }
}