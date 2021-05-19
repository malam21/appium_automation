package sampletestcases;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.ReadConfigFiles;

import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.DecimalFormat;

import java.util.Date;
import java.util.Stack;

public class DateTime {
    AndroidDriver<MobileElement> driver;

    public static void main(String [] Args) throws ParseException {
        String SystemTime = "SystemTime:15:41:11";
        String []SystemTimeArray = SystemTime.split(":");
        String SysTime = SystemTimeArray[SystemTimeArray.length-1];
        int timeOne = Integer.parseInt(SysTime);

        String RTCTime = "RTCTime:19:41:15";
        String []RTCTimeArray = RTCTime.split(":");
        String RtcTime = RTCTimeArray[RTCTimeArray.length-1];
        int timeTwo = Integer.parseInt(RtcTime);

        int dif = timeTwo - timeOne;
        System.out.println(dif);

    }

    public void captureScreenShots(String file_name ) throws IOException {
        //String folder_name = "screenshot";
        String folder_name = ReadConfigFiles.getPropertyValue("screenshot");
        File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //create dir with given folder name
        new File(folder_name).mkdir();
        //Setting file name
        NumberFormat df = DecimalFormat.getInstance();
        file_name= df.format(new Date())+".png";
        //copy screenshot file into screenshot folder.
        FileUtils.copyFile(f,new File(folder_name + "/" + file_name));
    }



}








//    public static void main(String [] Args) throws ParseException {
//        String SystemTime = "15:41:11";
//        String RTCTime = "19:41:11";
//
//        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
//        Date timeOne = sdf.parse(SystemTime);
//        Date timeTwo = sdf.parse(RTCTime);
//
//        Long dif = timeTwo.getTime() - timeOne.getTime();
//        System.out.println(dif / 1000);
//
//    }
//}