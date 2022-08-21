package by.itacademy.taf.ostrovok.ui;

import by.itacademy.taf.ostrovok.ui.pageobjects.MainPage;
import by.itacademy.taf.ostrovok.ui.utils.RandomValue;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MainPageTest extends BaseTest {
    @Test
    public void testLogInWithValidValueMainPage() {
        MainPage mainPage = new MainPage();
        mainPage.openPage()
                .clickButtonLogin()
                .clickButtonSignUp()
                .typeRandomValidEmail()
                .clickButtonSignUpWithCreatedEmail();
        Assert.assertEquals(mainPage.getUserEmail(), RandomValue.randomValidEmail, "Entered email does not equals with account email");
    }

    @Test
    public void testLogInWithInValidValueMainPage() {
        MainPage mainPage = new MainPage();
        mainPage.openPage()
                .clickButtonLogin()
                .clickButtonSignUp()
                .typeRandomInValidEmail()
                .clickButtonSignUpWithCreatedEmail();
        Assert.assertTrue(mainPage.isDisplayedErrorPleaseEnterValidEmail(),"NOT Displayed Error Please Enter ValidEmail()");
    }

    @Test
    public void testSearchMainPage() throws InterruptedException {
        MainPage mainPage = new MainPage();
        mainPage.openPage()
                .typeDestination()
                .clickSugestDestination()
                .clickButtonCheckInDatePicker()
                .clickDatePickerCheckIn()
                .clickDatePickerCheckOut()
                .clickButtonGuestInput()
                .clickButtonAdultMinus()
                .clickButtonAddChild()
                .clickButtonAddChildTwoYearsOld();


        mainPage.clickButtonDoneWithChild();



Assert.assertEquals(mainPage.getDisplayedNumberGuests(), mainPage.getCountedNumberOfGuests(),"getDisplayedNumberGuests() does not equals getCountedNumberOfGuests()");
        Thread.sleep(2000);
    }


    }

