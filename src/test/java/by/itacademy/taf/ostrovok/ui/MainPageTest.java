package by.itacademy.taf.ostrovok.ui;

import by.itacademy.taf.ostrovok.ui.pageobjects.MainPage;
import by.itacademy.taf.ostrovok.ui.utils.RandomValue;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainPageTest extends BaseTest {
    @Test
    public void testLogInWithValidValueMainSearchPage() {
        //GIVEN
        MainPage mainPage = new MainPage();
        mainPage.openPage()
                        .clickButtonLogin()
                        .clickButtonSignUp()
                        .typeEmail()
                        .clickButtonSignUpWithCreatedEmail();
        Assert.assertEquals(mainPage.getUserEmail(), RandomValue.randomValidEmail);

      }

      @Test
    public void testLogInWithInValidValueMainSearchPage(){

      }
}