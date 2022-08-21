package by.itacademy.taf.ostrovok.ui.utils;

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
    public String  pickCheckOutDate() {
        Calendar calendar = new GregorianCalendar();
        calendar.add(Calendar.DATE, +14);
        Date dateCheckOut = calendar.getTime();
        String outDate = dateCheckOut.toString();
        outDate = reverseDateString(outDate);
        return outDate;
    }

    public String reverseDateString(String dateString) {
        String dateStringTmp = dateString.substring(4,11) +  dateString.substring(24);
        return dateStringTmp;
    }
}
