package by.itacademy.taf.ostrovok.ui.pageobjects;
import by.itacademy.taf.ostrovok.ui.driver.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    public static final String BASE_URL = "https://ostrovok.ru";
    protected final int WAIT_TIMEOUT_SECONDS = 20;

    protected BasePage() {
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    protected WebElement waitForElementToBeClickable(WebElement webElement) {
        return new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS).until(ExpectedConditions.elementToBeClickable(webElement));
    }

    protected WebElement waitForVisibilityOfElement(WebElement webElement) {
        return new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS).until(ExpectedConditions
                .visibilityOf(webElement));
    }

//    public WebElement waitWebElementIsVisible(WebElement element) {
//        new WebDriverWait(driver, Duration.ofSeconds(15)).
//                until(ExpectedConditions.visibilityOf(element));
//        return element;
//    }

    protected WebElement waitForVisibilityOfElement(By webElementLocator) {
        return new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT_SECONDS))
                .until(ExpectedConditions.visibilityOfElementLocated(webElementLocator));
    }

}