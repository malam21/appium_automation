package utilities;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class DateUtils {


    public static String returnNextMonth(){
        Date dNow = new Date();
        Calendar calender =new GregorianCalendar();
        calender.setTime(dNow);

// Jan 2020
        SimpleDateFormat sdf = new SimpleDateFormat("MMM-YYYY");
        calender.add(Calendar.MONTH,1);
        String date = sdf.format(calender.getTime());
        return date;
    }

}




