package by.itacademy.taf.ostrovok.ui.utils;

import org.openqa.selenium.WebElement;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DatePicker {

    public String pickCheckInDate() {
        Calendar calendar = new GregorianCalendar();
        calendar.add(Calendar.DATE, +2);
        Date dateCheckIn = calendar.getTime();
        String startDate = dateCheckIn.toString();
        startDate = reverseDateString(startDate);
        return startDate;
    }

    public String pickCheckOutDate() {
        Calendar calendar = new GregorianCalendar();
        calendar.add(Calendar.DATE, +14);
        Date dateCheckOut = calendar.getTime();
        String outDate = dateCheckOut.toString();
        outDate = reverseDateString(outDate);
        return outDate;
    }

    public String reverseDateString(String dateString) {
        String dateStringTmp = dateString.substring(4, 11) + dateString.substring(24);
        return dateStringTmp;
    }

    public String addZeroIfDateSmallerThenTen(String checkInOut) {
        String addZeroIfDateSmallerThenTenString = checkInOut;
        if (addZeroIfDateSmallerThenTenString.length() < 11) {
            addZeroIfDateSmallerThenTenString = addZeroIfDateSmallerThenTenString.substring(0, 4) + "0" + addZeroIfDateSmallerThenTenString.substring(4);
            return addZeroIfDateSmallerThenTenString;
        }
        return addZeroIfDateSmallerThenTenString;
    }
    public String reverseDateFomat(String date) {
        if (date.length() < 11) {
            date = date.substring(2, 6) + date.substring(0, 2) + date.substring(6, 10);
            date = addZeroIfDateSmallerThenTen(date);
        } else {
            date = date.substring(3, 7) + date.substring(0, 3) + date.substring(7, 11);
        }
        return date;
    }

}
