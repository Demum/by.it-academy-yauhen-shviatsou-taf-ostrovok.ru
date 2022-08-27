package by.itacademy.taf.ostrovok.api.tests;

import by.itacademy.taf.ostrovok.api.utils.Constants;
import org.testng.Assert;

import org.testng.annotations.Test;

public class HomeApiOstrovokRuTest extends BaseTest{
    @Test
        public void testIsResponseOK() {
        Assert.assertEquals(Constants.codeOK, homeApiOstrovokRu.getResponseCode(Constants.BASE_URL));
    }

    @Test
        public void testIsResponseUnauthorized() {
        Assert.assertEquals(Constants.codeUnauthorized, homeApiOstrovokRu.postResponseCode(Constants.BASE_URL));
    }
}

