package by.itacademy.taf.ostrovok.ui.tests;

import by.itacademy.taf.ostrovok.ui.pageobjects.MainPage;
import by.itacademy.taf.ostrovok.ui.pageobjects.ResultSearchByLocationPage;
import by.itacademy.taf.ostrovok.ui.steps.ResultSearchBylocationPageSteps;
import by.itacademy.taf.ostrovok.ui.utils.DatePicker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ResultSearchByLocationPageTest extends BaseTest{

    @Test
    public void testResultSearchByLocationPage() {
        ResultSearchBylocationPageSteps resultSearchBylocationPageSteps = new ResultSearchBylocationPageSteps();
        resultSearchBylocationPageSteps.searchByLocation();
        MainPage mainPage = new MainPage();
        ResultSearchByLocationPage resultSearchByLocationPage= new ResultSearchByLocationPage();
        Assert.assertEquals(resultSearchByLocationPage.getRegionInfoText(), mainPage.getInputDestinationSting(), "actual destination does not match with input destination" );
        DatePicker datePicker = new DatePicker();
        logger.info("checkin date from resultSearchByLocationPage " + resultSearchByLocationPage.getRegionInfoCheckInDateText()+"Picked checkIn Date"+ datePicker.pickCheckInDate());
        Assert.assertEquals(resultSearchByLocationPage.getRegionInfoCheckInDateText(), datePicker.pickCheckInDate(), "actual Check in date does not match chosen check IN date");
        logger.info("RegionInfoCheckOutDateText():"+resultSearchByLocationPage.getRegionInfoCheckOutDateText()+"picked date: "+datePicker.pickCheckOutDate());
        Assert.assertEquals(resultSearchByLocationPage.getRegionInfoCheckOutDateText(), datePicker.pickCheckOutDate(), "actual Check our date does not match chosen check out date");
        Assert.assertEquals(resultSearchByLocationPage.countInHotelCardsCorrectLocation(),resultSearchByLocationPage.countofHotelCards(),"Location of hotel/hotels in 1st search page does not match with typed Location");
        Assert.assertEquals(resultSearchByLocationPage.getRegionInfoGetGuests(), mainPage.getCountedNumberOfGuests(), "actual number of guests does not match input number of guests");
        Assert.assertEquals(resultSearchByLocationPage.getHeaderTextLocation(), resultSearchByLocationPage.getHotelLocationWithoutCountry(), "HeaderLocation does not match input Location");

    }
}
