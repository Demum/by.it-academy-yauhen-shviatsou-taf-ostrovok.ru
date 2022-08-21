package by.itacademy.taf.ostrovok.ui.pageobjects;

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

    @FindBy(xpath = " (//div[@class='zen-hotelcard-location-value'] /following::span)[1]")
    private WebElement hotelLocation;


}
