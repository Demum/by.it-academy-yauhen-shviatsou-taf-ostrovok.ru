package by.itacademy.taf.ostrovok.ui.pageobjects;

import by.itacademy.taf.ostrovok.ui.utils.RandomValue;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainSearchPage extends BasePage {
    @FindBy(xpath = "//div[text()='Log in']")
    private WebElement buttonLogin;
    @FindBy(xpath = "//span[@data-testid='user-widget-sign-up-tab']")
    private WebElement buttonSignUp;
    @FindBy(xpath = "//input[@name='email']")
    private WebElement inputEmail;

    @FindBy(xpath = "//button[@data-testid='user-widget-sign-up-button']")
    private WebElement clickButtonSignUpWithCreatedEmail;





    public MainSearchPage openPage(){
        driver.get(BasePage.BASE_URL);
        return this;
    }

    public MainSearchPage clickButtonLogin(){
        waitForElementToBeClickable(buttonLogin);
        buttonLogin.click();
        return this;
    }
    public MainSearchPage clickButtonSignUp(){
        waitForVisibilityOfElement(buttonSignUp);
        buttonSignUp.click();
        return this;
    }
    public MainSearchPage typeEmail() {
        inputEmail.clear();
        inputEmail.sendKeys(RandomValue.newEmail);
        return this;
    }

    public MainSearchPage clickButtonSignUpWithCreatedEmail(){
        waitForElementToBeClickable(clickButtonSignUpWithCreatedEmail);
        clickButtonSignUpWithCreatedEmail.click();
        return this;
    }
}