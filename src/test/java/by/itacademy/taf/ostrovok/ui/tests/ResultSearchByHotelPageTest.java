package by.itacademy.taf.ostrovok.ui.tests;

import by.itacademy.taf.ostrovok.ui.pageobjects.ResultSearchByHotelPage;
import by.itacademy.taf.ostrovok.ui.steps.ResultSearchByHotelPageSteps;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ResultSearchByHotelPageTest extends BaseTest {

    @Test
    public void testResultSearchByHotelPage(){
        ResultSearchByHotelPageSteps resultSearchByHotelPageSteps = new ResultSearchByHotelPageSteps();
        resultSearchByHotelPageSteps.searchByHotel();
        ResultSearchByHotelPage resultSearchByHotelPage = new ResultSearchByHotelPage();
        Assert.assertEquals(resultSearchByHotelPage.getNameOfTheOpenedHotel(), resultSearchByHotelPage.getInputHotelName(),
                "Opened Hotel "+resultSearchByHotelPage.getNameOfTheOpenedHotel()+ "does not match with inputNameHotel:"+resultSearchByHotelPage.getInputHotelName());
    }
}
