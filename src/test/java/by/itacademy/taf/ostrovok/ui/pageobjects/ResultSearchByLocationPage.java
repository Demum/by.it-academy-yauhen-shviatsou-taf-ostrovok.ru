package by.itacademy.taf.ostrovok.ui.pageobjects;

import by.itacademy.taf.ostrovok.ui.utils.DatePicker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultSearchByLocationPage extends BasePage{
    @FindBy(xpath = "//div[@class='zenserpresult-header']")
    private WebElement header;

    @FindBy(xpath = "(//div//p[@class='link zenregioninfo-region'])[1]")
    private WebElement regionInfo;

    @FindBy(xpath = "(//p[@class='zenregioninfo-dates'])[1]")
    private WebElement regionInfoDates;

    @FindBy(xpath = "(//p[@class='zenregioninfo-rooms'])[1]")
    private WebElement regionInfoRoomsGuests;

    @FindBy(xpath = " //div[@class='zen-hotelcard-location-value'] /following::span[1]")
    private WebElement hotelLocation;


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
        actualCheckIn = actualCheckIn.substring(3, 7)+actualCheckIn.substring(0, 3)+actualCheckIn.substring(7, 11);
        return datePicker.addZeroIfDateSmallerThenTen(actualCheckIn);
    }
    public String getRegionInfoCheckOutDateText(){
        String actualCheckOut = regionInfoDates.getText();
        actualCheckOut = actualCheckOut.split("—")[1].trim();
        System.out.println("///////////"+actualCheckOut);
        actualCheckOut = actualCheckOut.substring(3, 7)+actualCheckOut.substring(0, 3)+actualCheckOut.substring(7, 11);
        return datePicker.addZeroIfDateSmallerThenTen(actualCheckOut);

    }

}
