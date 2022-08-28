package by.itacademy.taf.ostrovok.ui.steps;

import by.itacademy.taf.ostrovok.ui.pageobjects.MainPage;

public class MainPageSteps {
    public void createValidAccount(){
        MainPage mainPage = new MainPage();
        mainPage.openPage()
                .clickButtonLogin()
                .clickButtonSignUp()
                .typeRandomValidEmail()
                .clickButtonSignUpWithCreatedEmail();
    }
    public void createInValidAccount() {
        MainPage mainPage = new MainPage();
        mainPage.openPage()
                .clickButtonLogin()
                .clickButtonSignUp()
                .typeRandomInValidEmail()
                .clickButtonSignUpWithCreatedEmail();
    }
    public void createSearchByLocation(){
        MainPage mainPage = new MainPage();
        mainPage.openPage()
                .typeDestination(mainPage.getInputDestinationSting())
                .clickSugestDestination()
                .clickButtonCheckInDatePicker()
                .clickDatePickerCheckIn()
                .clickDatePickerCheckOut()
                .clickButtonGuestInput()
                .clickButtonAdultMinus()
                .clickButtonAddChild()
                .clickButtonAddChildTwoYearsOld()
                .clickButtonDoneWithChild();
    }

}
