package by.itacademy.taf.ostrovok.ui.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultSearchByHotelPage extends BasePage {
    @FindBy(xpath = "//h1[@class='zen-roomspage-title-name']")
    private WebElement titleOfTheHotel;

    private   String inputHotelName = "Radisson Slavyanskaya Hotel & Business Center, Moscow";

    public String getInputHotelName() {
        return inputHotelName;
    }

    public String getNameOfTheOpenedHotel(){
       return waitForVisibilityOfElement(titleOfTheHotel).getText();

    }
}

