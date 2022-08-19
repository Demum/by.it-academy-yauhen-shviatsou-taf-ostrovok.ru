package by.itacademy.taf.ostrovok.ui;

import by.itacademy.taf.ostrovok.ui.pageobjects.MainPage;
import by.itacademy.taf.ostrovok.ui.utils.RandomValue;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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
    public void testSearchMainPage() {
        MainPage mainPage = new MainPage();
        mainPage.openPage()
                .typeDestination()
                .clickCheckInDatePicker();
        Calendar calendar = new GregorianCalendar();
        Date date = calendar.getTime();
        System.out.println(date);
        calendar.add(Calendar.DATE, +7);
        Date date2 = calendar.getTime();
        System.out.println(date2);

    }

}