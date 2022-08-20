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
        Assert.assertEquals(mainPage.getUserEmail(), RandomValue.randomValidEmail);
    }

    @Test
    public void testLogInWithInValidValueMainPage() {
        MainPage mainPage = new MainPage();
        mainPage.openPage()
                .clickButtonLogin()
                .clickButtonSignUp()
                .typeRandomInValidEmail()
                .clickButtonSignUpWithCreatedEmail();
        Assert.assertTrue(mainPage.isDisplayedErrorPleaseEnterValidEmail());
    }

    @Test
    public void testSearchMainPage() throws InterruptedException {
        MainPage mainPage = new MainPage();
        mainPage.openPage()
                .typeDestination()
                .clickSugestDestination()
                .clickButtonCheckInDatePicker()
                .clickDatePickerCheckIn()
                .clickDatePickerCheckOut();

        Thread.sleep(1000);
    }


    }

