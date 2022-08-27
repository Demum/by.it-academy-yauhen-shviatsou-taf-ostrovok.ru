package by.itacademy.taf.ostrovok.api.tests;

import by.itacademy.taf.ostrovok.api.model.HomeApiOstrovokRu;
import by.itacademy.taf.ostrovok.api.utils.Constants;
import org.testng.annotations.Test;

public class BaseTest {
    HomeApiOstrovokRu homeApiOstrovokRu = new HomeApiOstrovokRu();

    @Test
    public void getHeadersInfo() {
        //получение headers
        String headersInfo = homeApiOstrovokRu.getHeaders(Constants.BASE_URL);
        System.out.println(headersInfo);
    }

    @Test
    public void getStatusLine() {
        //получение statusLine: протокол, код ответа, фраза ответа
        String statusLine = homeApiOstrovokRu.getStatusLine(Constants.BASE_URL);
        System.out.println(statusLine);
    }

    @Test
    public void getContentType() {
        //получение ContentType
        String contentType = homeApiOstrovokRu.getContentType(Constants.BASE_URL);
        System.out.println(contentType);
    }
}

