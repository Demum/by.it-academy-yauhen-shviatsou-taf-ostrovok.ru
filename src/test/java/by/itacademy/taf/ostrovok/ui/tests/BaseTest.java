package by.itacademy.taf.ostrovok.ui.tests;

import by.itacademy.taf.ostrovok.ui.driver.DriverSingleton;
import by.itacademy.taf.ostrovok.ui.pageobjects.MainPage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected static final Logger logger = LogManager.getLogger();
    @BeforeMethod
    public void logIn() {
        new MainPage().openPage();

    }
    @AfterMethod
    public void finishTest() {
        DriverSingleton.closeDriver();
    }
}
