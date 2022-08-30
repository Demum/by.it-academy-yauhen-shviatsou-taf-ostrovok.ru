package by.itacademy.taf.ostrovok.api.tests;

import by.itacademy.taf.ostrovok.api.model.HomeApiOstrovokRu;
import by.itacademy.taf.ostrovok.api.utils.Constants;
import org.testng.annotations.Test;

public class BaseTest {
    HomeApiOstrovokRu homeApiOstrovokRu = new HomeApiOstrovokRu();

    @Test
    public void getHeadersInfo() {
        String headersInfo = homeApiOstrovokRu.getHeaders(Constants.BASE_URL);
        System.out.println(headersInfo);
    }

    @Test
    public void getStatusLine() {
        String statusLine = homeApiOstrovokRu.getStatusLine(Constants.BASE_URL);
        System.out.println(statusLine);
    }

    @Test
    public void getContentType() {
        String contentType = homeApiOstrovokRu.getContentType(Constants.BASE_URL);
        System.out.println(contentType);
    }
}

