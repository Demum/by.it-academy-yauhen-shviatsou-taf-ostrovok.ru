package by.itacademy.taf.ostrovok.ui.tests;

import by.itacademy.taf.ostrovok.ui.pageobjects.MainPage;
import by.itacademy.taf.ostrovok.ui.pageobjects.ResultSearchByHotelPage;
import org.testng.annotations.Test;

public class ResultSearchByHotelPageTest extends BaseTest {


    @Test
    public void testResultSearchByHotelPage(){
        MainPage mainPage = new MainPage();
        ResultSearchByHotelPage resultSearchByHotelPage = new ResultSearchByHotelPage();
mainPage.setInputDestinationSting(resultSearchByHotelPage.getInputHotelName());
        System.out.println(mainPage.getInputDestinationSting());
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
    }
}
