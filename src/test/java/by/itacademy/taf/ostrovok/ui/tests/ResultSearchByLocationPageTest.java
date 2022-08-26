package by.itacademy.taf.ostrovok.ui.tests;

import by.itacademy.taf.ostrovok.ui.pageobjects.MainPage;
import by.itacademy.taf.ostrovok.ui.pageobjects.ResultSearchByLocationPage;
import by.itacademy.taf.ostrovok.ui.utils.DatePicker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ResultSearchByLocationPageTest extends BaseTest{

    @Test
    public void testResultSearchByLocationPage() {
        MainPage mainPage = new MainPage();
        mainPage.openPage()
                .typeDestination(mainPage.getInputDestinationSting())
                .clickSugestDestination()
                .clickButtonCheckInDatePicker()
                .clickDatePickerCheckIn()
                .clickDatePickerCheckOut()
                .clickButtonGuestInput()
                .clickButtonAdultMinus()
                .clickButtonAddChild()
                .clickButtonAddChildTwoYearsOld()
                .clickButtonDoneWithChild()
                .clickButtonSearch();

        ResultSearchByLocationPage resultSearchByLocationPage= new ResultSearchByLocationPage();
        Assert.assertEquals(resultSearchByLocationPage.getRegionInfoText(), mainPage.getInputDestinationSting(), "actual destination does not match with input destination" );
        System.out.println(resultSearchByLocationPage.getRegionInfoDatesText());
        System.out.println(resultSearchByLocationPage.getRegionInfoCheckInDateText());
        DatePicker datePicker = new DatePicker();

        Assert.assertEquals(resultSearchByLocationPage.getRegionInfoCheckInDateText(), datePicker.pickCheckInDate(), "actual Check in date does not match chosen check IN date");
        System.out.println(resultSearchByLocationPage.getRegionInfoCheckOutDateText());
        System.out.println(datePicker.pickCheckOutDate());
        Assert.assertEquals(resultSearchByLocationPage.getRegionInfoCheckOutDateText(), datePicker.pickCheckOutDate(), "actual Check our date does not match chosen check out date");
        Assert.assertTrue(resultSearchByLocationPage.isDisplayedHotelLocation());
        Assert.assertEquals(resultSearchByLocationPage.getHeaderText(), resultSearchByLocationPage.getHotelLocationWithoutCountry(), "HeaderLocation does not match input Location");
    }
}
