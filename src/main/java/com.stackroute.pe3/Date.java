/* program to calculate first and last date of a week. */


package com.stackroute.pe3;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date {



    public static void main(String[] args) {

        Date date = new Date();
        int sub = 0;

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE");
        switch (simpleDateFormat.format(date).toUpperCase()){
            case "TUE" : sub = 1;break;
            case "WED" : sub = 2;break;
            case "THU" : sub = 3;break;
            case "FRI" : sub = 4;break;
            case "SAT" : sub = 5;break;
            case "SUN" : sub = 6;break;
        }

        System.out.println("DAY "+simpleDateFormat.format(date).toUpperCase());

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        date = new Date();
//        System.out.println(formatter.format(date));

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, (-sub));
        Date first_date = cal.getTime();
        System.out.println("Mon " + formatter.format(first_date));


        cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, (6-sub));
        Date last_date = cal.getTime();
        System.out.println("Sun "+ formatter.format(last_date));

    }
}

