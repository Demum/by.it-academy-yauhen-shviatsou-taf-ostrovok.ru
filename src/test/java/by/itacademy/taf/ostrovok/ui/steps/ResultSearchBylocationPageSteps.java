package by.itacademy.taf.ostrovok.ui.steps;

import by.itacademy.taf.ostrovok.ui.pageobjects.MainPage;

public class ResultSearchBylocationPageSteps {
    public void searchByLocation(){
        MainPageSteps mainPageSteps = new MainPageSteps();
        mainPageSteps.createSearchByLocation();
        MainPage mainPage = new MainPage();
        mainPage.clickButtonSearch();
    }
}
