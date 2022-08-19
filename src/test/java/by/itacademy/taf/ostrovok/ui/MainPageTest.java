package by.itacademy.taf.ostrovok.ui;

import by.itacademy.taf.ostrovok.ui.pageobjects.MainSearchPage;
import org.testng.annotations.Test;

public class MainPageTest extends BaseTest {
    @Test
    public void testLogInMainSearchPage() throws InterruptedException {
        //GIVEN
        MainSearchPage mainSearchPage = new MainSearchPage();
        mainSearchPage.openPage()
                        .clickButtonLogin()
                .clickButtonSignUp()
                                .typeEmail()
                                        .clickButtonSignUpWithCreatedEmail();

        Thread.sleep(3000);
    }
}