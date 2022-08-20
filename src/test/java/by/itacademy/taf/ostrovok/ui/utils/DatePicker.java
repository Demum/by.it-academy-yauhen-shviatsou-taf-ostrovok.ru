package by.itacademy.taf.ostrovok.ui.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DatePicker {

    public String pickCheckInDate() {
        Calendar calendar = new GregorianCalendar();
        Date dateCheckIn = calendar.getTime();
        String startDate = dateCheckIn.toString();
        startDate = reverseDareString(startDate);
        return startDate;



    }
    public String  pickCheckOutDate() {
        Calendar calendar = new GregorianCalendar();
        calendar.add(Calendar.DATE, +14);
        Date dateCheckOut = calendar.getTime();
        String outDate = dateCheckOut.toString();
        outDate = reverseDareString(outDate);
        return outDate;
    }




    public String reverseDareString(String dateString) { //input date format 12-12-1985, UserViewPage: 1985-12-12
        String dateStringTmp = dateString.substring(0,11) +  dateString.substring(24);
        return dateStringTmp;
    }



}
