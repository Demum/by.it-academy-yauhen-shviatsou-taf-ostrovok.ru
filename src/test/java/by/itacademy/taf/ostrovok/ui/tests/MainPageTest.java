package by.itacademy.taf.ostrovok.ui.tests;

import by.itacademy.taf.ostrovok.ui.pageobjects.MainPage;
import by.itacademy.taf.ostrovok.ui.steps.MainPageSteps;
import by.itacademy.taf.ostrovok.ui.utils.DatePicker;
import by.itacademy.taf.ostrovok.ui.utils.RandomValue;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MainPageTest extends BaseTest {
    @Test
    public void testLogInWithValidValueMainPage() {
        MainPageSteps mainPageSteps = new MainPageSteps();
        mainPageSteps.createValidAccount();
        MainPage mainPage = new MainPage();
        Assert.assertEquals(mainPage.getUserEmail(), RandomValue.randomValidEmail, "Entered email does not equals with account email");
    }

    @Test
    public void testLogInWithInValidValueMainPage() {
        MainPageSteps mainPageSteps = new MainPageSteps();
        mainPageSteps.createInValidAccount();
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.isDisplayedErrorPleaseEnterValidEmail(), "NOT Displayed Error Please Enter ValidEmail()");
    }

    @Test
    public void testSearchByLocationMainPage()  {
        MainPageSteps mainPageSteps = new MainPageSteps();
        mainPageSteps.createSearchByLocation();
        MainPage mainPage = new MainPage();

        Assert.assertEquals(mainPage.getInputDestinationText(), mainPage.getInputDestinationSting(), "Displyed input destination does not matched Typed Input Destination  ");
        DatePicker datePicker = new DatePicker();
        Assert.assertEquals(mainPage.getDisplayedButtonCheckInDatePickerText(), datePicker.pickCheckInDate(), "Displayed date Check in does not matched picked checkin date");
        Assert.assertEquals(mainPage.getDisplayedButtonCheckOutDatePickerText(), datePicker.pickCheckOutDate(), "Displayed date Check out does not matched picked checkout date");
        Assert.assertEquals(mainPage.getDisplayedNumberGuests(), mainPage.getCountedNumberOfGuests(), "getDisplayedNumberGuests() does not equals getCountedNumberOfGuests()");
        Assert.assertTrue(mainPage.isDisplayedButtonSearch());
    }

}

