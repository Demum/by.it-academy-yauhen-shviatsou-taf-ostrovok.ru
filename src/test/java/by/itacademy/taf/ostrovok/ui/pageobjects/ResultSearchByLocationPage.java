package by.itacademy.taf.ostrovok.ui.pageobjects;

import by.itacademy.taf.ostrovok.ui.utils.DatePicker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResultSearchByLocationPage extends BasePage{

    @FindBy(xpath = "//div[@class='zenserpresult-header']")
    private WebElement header;

    @FindBy(xpath = "(//div//p[@class='link zenregioninfo-region'])[1]")
    private WebElement regionInfo;

    @FindBy(xpath = "(//p[@class='zenregioninfo-dates'])[1]")
    private WebElement regionInfoDates;

    @FindBy(xpath = "(//p[@class='zenregioninfo-rooms'])[1]")
    private WebElement regionInfoRoomsGuests;
    MainPage mainPage = new MainPage();

    public String getHotelLocationWithoutCountry() {
        return hotelLocationWithoutCountry;
    }

    String hotelLocationWithoutCountry = mainPage.getInputDestinationSting().split(",")[0].trim();
    public final By HOTEL_LOCATION = By.xpath("//div[@class='zen-hotelcard-location-value'] /following::span[contains(text(),'"+ hotelLocationWithoutCountry +"')]");
    @FindBy(xpath = "  //button[text()='Forward']")
    private WebElement buttonForward;
    public String getHeaderText() {
        waitForVisibilityOfElement(header);
        String headerText = header.getText();
        System.out.println(headerText);
       headerText  = headerText.split(":")[0];
        System.out.println(headerText);
       return headerText;

    }
    public String  getRegionInfoText(){
        waitForVisibilityOfElement(regionInfo);
        String regionIfoText = regionInfo.getText();
        return regionIfoText;
    }

    public String getRegionInfoDatesText(){
    String actualRegionIfoDatesText =regionInfoDates.getText();
    return actualRegionIfoDatesText;
    }
    DatePicker datePicker = new DatePicker();
    public String getRegionInfoCheckInDateText(){
        String actualCheckIn = regionInfoDates.getText();
        actualCheckIn = actualCheckIn.split("—")[0].trim();
        return datePicker.reverseDateFomat(actualCheckIn);
    }
    public String getRegionInfoCheckOutDateText(){
        String actualCheckOut = regionInfoDates.getText();
        actualCheckOut = actualCheckOut.split("—")[1].trim();
        return datePicker.reverseDateFomat(actualCheckOut);

    }

    public boolean isDisplayedButtonForward() {
       return buttonForward.isDisplayed();
    }

int count=0;

    public boolean isDisplayedHotelLocation(){
        waitForVisibilityOfElement(HOTEL_LOCATION);
        List<WebElement> allElements = driver.findElements(HOTEL_LOCATION);
        for (WebElement element: allElements) {
            System.out.println(element.getText());
            count+=1;
             }
        System.out.println(count);
return buttonForward.isDisplayed();
    }

    }




