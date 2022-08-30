package by.itacademy.taf.ostrovok.ui.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DatePicker {

    public String pickCheckInDate() {
        Calendar calendar = new GregorianCalendar();
        calendar.add(Calendar.DATE, +4);
        Date dateCheckIn = calendar.getTime();
        String startDate = dateCheckIn.toString();
        startDate = reverseDateStringToMMDDYYYY(startDate);
        return startDate;
    }

    public String pickCheckOutDate() {
        Calendar calendar = new GregorianCalendar();
        calendar.add(Calendar.DATE, +14);
        Date dateCheckOut = calendar.getTime();
        String outDate = dateCheckOut.toString();
        outDate = reverseDateStringToMMDDYYYY(outDate);
        return outDate;
    }

    public String reverseDateStringToMMDDYYYY(String dateString) {
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
    public String reverseDateFomatFromDDMMYYYYtoMMDDYYYY(String date) {
        if (date.length() < 11) {
            date = date.substring(2, 6) + date.substring(0, 2) + date.substring(6, 10);
            date = addZeroIfDateSmallerThenTen(date);
        } else {
            date = date.substring(3, 7) + date.substring(0, 3) + date.substring(7, 11);
        }
        return date;
    }

}
