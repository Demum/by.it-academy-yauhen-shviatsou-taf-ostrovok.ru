package by.itacademy.taf.ostrovok.ui.tests;

import by.itacademy.taf.ostrovok.ui.driver.DriverSingleton;
import by.itacademy.taf.ostrovok.ui.pageobjects.MainPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeMethod
    public void logIn() {
        new MainPage().openPage();

    }
    @AfterMethod
    public void finishTest() {
        DriverSingleton.closeDriver();
    }
}
