package by.itacademy.taf.ostrovok.ui;

import by.itacademy.taf.ostrovok.ui.driver.DriverSingleton;
import by.itacademy.taf.ostrovok.ui.pageobjects.MainSearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void testMainSearchPage() throws InterruptedException {
        //GIVEN
        MainSearchPage mainSearchPage = new MainSearchPage();
        mainSearchPage.openPage();

        Thread.sleep(3000);
    }
}