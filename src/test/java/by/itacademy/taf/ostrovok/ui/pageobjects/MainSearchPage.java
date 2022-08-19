package by.itacademy.taf.ostrovok.ui.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainSearchPage extends BasePage {
    @FindBy(xpath = "//div[text()='Log in']")
    private WebElement buttonLogin;




    public MainSearchPage openPage(){
        driver.get(BasePage.BASE_URL);
        return this;
    }
}