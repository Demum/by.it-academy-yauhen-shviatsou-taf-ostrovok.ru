package by.itacademy.taf.ostrovok.ui.pageobjects;

import by.itacademy.taf.ostrovok.ui.utils.DatePicker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResultSearchByLocationPage extends BasePage {

    MainPage mainPage = new MainPage();
    String hotelLocationWithoutCountry = mainPage.getInputDestinationSting().split(",")[0].trim();

    public final By HOTEL_LOCATION = By.xpath("//div[@class='zen-hotelcard-location-value'] /following::span[contains(text(),'" + hotelLocationWithoutCountry + "')]");

    DatePicker datePicker = new DatePicker();
    @FindBy(xpath = "//div[@class='zenserpresult-header']")
    private WebElement header;
    @FindBy(xpath = "(//div//p[@class='link zenregioninfo-region'])[1]")
    private WebElement regionInfo;
    @FindBy(xpath = "(//p[@class='zenregioninfo-dates'])[1]")
    private WebElement regionInfoDates;
    @FindBy(xpath = "(//p[@class='zenregioninfo-rooms'])[1]")
    private WebElement regionInfoRoomsGuests;
    @FindBy(xpath = "  //button[text()='Forward']")
    private WebElement buttonForward;
    @FindBy(xpath = " //div[@class = 'zen-hotelcard-wrapper']")
    private WebElement hotelcard;

    private int countIsDisplayedHotelLocationMatched = 0;

    public String getHotelLocationWithoutCountry() {
        return hotelLocationWithoutCountry;
    }

    public String getHeaderTextLocation() {
        waitForVisibilityOfElement(header);
        String headerText = header.getText();
        headerText = headerText.split(":")[0];
        return headerText;

    }

    public String getRegionInfoText() {
        waitForVisibilityOfElement(regionInfo);
        String regionIfoText = regionInfo.getText();
        return regionIfoText;
    }

    public int getRegionInfoGetGuests() {
        waitForVisibilityOfElement(regionInfoRoomsGuests);
        String stringRegionInfoRoomsGuest = regionInfoRoomsGuests.getText();
        stringRegionInfoRoomsGuest = stringRegionInfoRoomsGuest.split("for ")[1];
        stringRegionInfoRoomsGuest = stringRegionInfoRoomsGuest.split(" ")[0];
        return Integer.parseInt(stringRegionInfoRoomsGuest);
    }

    public String getRegionInfoCheckInDateText() {
        String actualCheckIn = regionInfoDates.getText();
        actualCheckIn = actualCheckIn.split("—")[0].trim();
        return datePicker.reverseDateFomatFromDDMMYYYYtoMMDDYYYY(actualCheckIn);
    }

    public String getRegionInfoCheckOutDateText() {
        String actualCheckOut = regionInfoDates.getText();
        actualCheckOut = actualCheckOut.split("—")[1].trim();
        return datePicker.reverseDateFomatFromDDMMYYYYtoMMDDYYYY(actualCheckOut);
    }

    public int countInHotelCardsCorrectLocation() {
        waitForVisibilityOfElement(HOTEL_LOCATION);
        boolean hotelLocationMatched = true;
        List<WebElement> allElements = driver.findElements(HOTEL_LOCATION);
        for (WebElement element : allElements) {
            countIsDisplayedHotelLocationMatched += 1;
            }
        logger.info("countInHotelCardsCorrectLocation is:"+ countIsDisplayedHotelLocationMatched );
        return countIsDisplayedHotelLocationMatched;
    }

    int countOfHotelCards = 0;

    public int countofHotelCards() {
        waitForVisibilityOfElement(hotelcard);
        List<WebElement> allElements = driver.findElements(By.xpath("//div[@class = 'zen-hotelcard-wrapper']"));
        for (WebElement element : allElements) {
            countOfHotelCards += 1;
                  }
        logger.info("countOfHotelCards is:"+ countOfHotelCards );
        return countOfHotelCards;
    }
}





