package by.itacademy.taf.ostrovok.ui.pageobjects;

import by.itacademy.taf.ostrovok.ui.utils.DatePicker;
import by.itacademy.taf.ostrovok.ui.utils.RandomValue;
import org.openqa.selenium.By;
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
    @FindBy(xpath = "//div[@data-testid='date-end-input']")
    private WebElement buttonCheckOutDatePicker;

    @FindBy(xpath = "//div[@class='Suggest-module__destination--17nJ9'][@title='Heliport De Paris, France']")
    private WebElement suggestDestination;
    @FindBy(xpath = " //div[@data-testid='guests-input']")
    private WebElement buttonGuestInput;
    @FindBy(xpath = "(//*[text()='Adults'] /following::div/button[text()='−'])[1]")
    private WebElement buttonAdultMinus;
    @FindBy(xpath = "(//*[text()='Adults'] /following::div/button[text()='+'])[1]")
    private WebElement buttonAdultPlus;
    @FindBy(xpath = "((//*[text()='Adults'] /following::div/button[text()='−'])[1]/following::div)[1]")
    private WebElement numberOfAdults;
    @FindBy(xpath = " //div[@class='Room-module__kidUnits--3skA4'] ")
    private WebElement buttonAddChild;
    @FindBy(xpath = " //div[@class='Room-module__kidUnits--3skA4']//option[text()='2 years']")
    private WebElement buttonAddChildTwoYearsOld;
    @FindBy(xpath = "  //div[text()='Done']")
    private WebElement buttonDoneWithChild;
    @FindBy(xpath = "//button[@data-testid='search-button']")
    private WebElement buttonSearch;


    int numberOfGuests = 2;



 private    String inputDestinationSting="Heliport De Paris, France";

    public  final By SUGGEST_DESTINATION = By.xpath("//div[@class='Suggest-module__destination--17nJ9'][@title='Heliport De Paris, France']");


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
       inputDestination.clear();
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
    public boolean isDisplayedButtonSearch() {
        waitForVisibilityOfElement(buttonSearch);
        return buttonSearch.isDisplayed();
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

    public MainPage clickSugestDestination() throws InterruptedException {
//waitForVisibilityOfElement(driver.findElement(SUGGEST_DESTINATION));
//        driver.findElement(SUGGEST_DESTINATION).click();

       waitForVisibilityOfElement(suggestDestination);
        suggestDestination.click();

        return this;
    }
    public MainPage clickButtonGuestInput (){
        waitForElementToBeClickable(buttonGuestInput);
        buttonGuestInput.click();
        return this;
    }
    public MainPage clickButtonAddChild (){
        waitForElementToBeClickable(buttonAddChild);
        buttonAddChild.click();
        return this;
    }
    public MainPage clickButtonAddChildTwoYearsOld (){
        waitForElementToBeClickable(buttonAddChildTwoYearsOld);
        buttonAddChildTwoYearsOld.click();
        numberOfGuests = numberOfGuests+1;
        return this;
    }
    public MainPage clickButtonDoneWithChild (){
        waitForElementToBeClickable(buttonDoneWithChild);
        buttonDoneWithChild.click();
        return this;
    }

    public MainPage clickButtonAdultMinus (){
        waitForElementToBeClickable(buttonAdultMinus);
        buttonAdultMinus.click();
        numberOfGuests = numberOfGuests-1;
        return this;
    }

    public MainPage clickButtonAdultPlus (){
        waitForElementToBeClickable(buttonAdultPlus);
        buttonAdultPlus.click();
        numberOfGuests = numberOfGuests+1;
        return this;
    }
    public String getInputDestinationText() {
        waitForVisibilityOfElement(inputDestination);
        return inputDestination.getAttribute("value");
    }
    public String getDisplayedButtonCheckInDatePickerText() {
        waitForVisibilityOfElement(buttonCheckInDatePicker);
        return ifDateSmallerThenTen(buttonCheckInDatePicker);
    }
    public String getDisplayedButtonCheckOutDatePickerText() {
        waitForVisibilityOfElement(buttonCheckOutDatePicker);
        return ifDateSmallerThenTen(buttonCheckOutDatePicker);


    }

    public String ifDateSmallerThenTen(WebElement webElement){
        String  ifDateSmallerThenTenString= webElement.getText();
        if(ifDateSmallerThenTenString.length()<11) {
            ifDateSmallerThenTenString = ifDateSmallerThenTenString.substring(0, 4)+"0" +ifDateSmallerThenTenString.substring(4);
            return ifDateSmallerThenTenString;
        }
       return ifDateSmallerThenTenString;
    }

    public int getCountedNumberOfGuests() {
        return numberOfGuests;
    }

    public String getInputDestinationSting() {
        return inputDestinationSting;
    }



    public int getDisplayedNumberGuests(){
   waitForVisibilityOfElement(buttonGuestInput);
  String stringNumberGuests= buttonGuestInput.getText();
  stringNumberGuests = stringNumberGuests.substring(0, 2);
   stringNumberGuests = stringNumberGuests.trim();
  int numberGuests = Integer.parseInt(stringNumberGuests);
     return numberGuests;

}






}