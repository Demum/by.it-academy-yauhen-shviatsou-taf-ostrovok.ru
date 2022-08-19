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

    @FindBy(xpath = "//button[@data-testid='user-widget-sign-up-button']")
    private WebElement clickButtonSignUpWithCreatedEmail;
    @FindBy(xpath = "//div[@class='Control-module__username--3qcGq']")
    private WebElement userEmailINnMainPage;
    @FindBy(xpath = "//input[@data-testid='destination-input']")
    private WebElement inputDestination;
    @FindBy(xpath = "//div[@data-testid='date-start-input']")
    private WebElement checkInDatePicker;





    public MainPage openPage(){
        driver.get(BasePage.BASE_URL);
        return this;
    }

    public MainPage clickButtonLogin(){
        waitForElementToBeClickable(buttonLogin);
        buttonLogin.click();
        return this;
    }
    public MainPage clickButtonSignUp(){
        waitForVisibilityOfElement(buttonSignUp);
        buttonSignUp.click();
        return this;
    }
    public MainPage typeEmail() {
        inputEmail.clear();
        inputEmail.sendKeys(RandomValue.randomValidEmail);
        return this;
    }

    public MainPage clickButtonSignUpWithCreatedEmail(){
        waitForElementToBeClickable(clickButtonSignUpWithCreatedEmail);
        clickButtonSignUpWithCreatedEmail.click();
        return this;
    }

    public MainPage typeDestination() {
        inputDestination.clear();
        inputDestination.sendKeys("Paris, Ile-de-France, France");
        return this;
    }
    public String getUserEmail(){
        waitForVisibilityOfElement(userEmailINnMainPage);
        return userEmailINnMainPage.getAttribute("innerHTML");
         }
    }