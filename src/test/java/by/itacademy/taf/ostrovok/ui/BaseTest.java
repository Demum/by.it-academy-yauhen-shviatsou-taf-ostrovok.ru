package by.itacademy.taf.ostrovok.ui;

import by.itacademy.taf.ostrovok.ui.driver.DriverSingleton;
import org.testng.annotations.AfterMethod;

public class BaseTest {



    @AfterMethod
    public void finishTest() {
        DriverSingleton.closeDriver();
    }
}
