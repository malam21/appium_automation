package sampletestcases;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.net.URL;


public class SampleOne {

    AndroidDriver<MobileElement> driver;




    @BeforeTest
    public void setup() {

        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "hcm");
            caps.setCapability(MobileCapabilityType.UDID, "c2c3a0db");
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Uiautomator2");

            //-------------------------------------------------
            caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\malam\\Desktop\\Build\\ATSMgmtDemo-3-17-21.apk");

            driver = new AndroidDriver (new URL("http://127.0.0.1:4723/wd/hub"), caps);
            //caps.setCapability("appPackage", "com.android.launcher3");
            //caps.setCapability("appActivity", "com.android.launcher3.Launcher");
        } catch (Exception exp) {

            System.out.println("Cause is : " + exp.getCause());
            System.out.println("Message is : " + exp.getMessage());
            exp.printStackTrace();

        }
    }

    @Test

    public void sampleTest4() throws InterruptedException {

        //Enter password

        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/btn_go_to_get_setup_params_activity")).click();
        Thread.sleep(5000);
        //Enter serial number or password
        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_var_password")).sendKeys("2019061");

        //Click Get Serial Number
        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/btn_get_serial_number")).click();

        //Capture displayed serial number and the message
        String SerialNumberResponse = driver.findElement(By.id("com.accutime.atsmgmtdemo:id/response")).getText();
        System.out.println("response code : " + SerialNumberResponse);

        //Validate the message as expected or not
        Assert.assertEquals(SerialNumberResponse, "{\"Action\":\"clock_response_key\",\"Success\":true,\"Message\":\"com.accutime.clocksetup.action.get_serial_number : 2019061\"}");


        //Click Get time Region
        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/btn_get_time_region")).click();

        //Capture displayed time Region and the message
        String timeRegion = driver.findElement(By.id("com.accutime.atsmgmtdemo:id/response")).getText();
        System.out.println("response code : " + timeRegion);

        //Validate the message as expected or not
        Assert.assertEquals(timeRegion, "{\"Action\":\"clock_response_key\",\"Success\":true,\"Message\":\"com.accutime.clocksetup.action.get_time_region : America\"}");


        //Click to get Time Location
        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/btn_get_time_location")).click();

        //Capture displayed serial number and the message
        String timeLocation = driver.findElement(By.id("com.accutime.atsmgmtdemo:id/response")).getText();
        System.out.println("response code : " + timeLocation);

        //Validate the message as expected or not
        Assert.assertEquals(timeLocation, "{\"Action\":\"clock_response_key\",\"Success\":true,\"Message\":\"com.accutime.clocksetup.action.get_time_location : New_York\"}");


        //Click Get terminal name
        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/btn_get_terminal_name")).click();

        //Capture displayed serial number and the message
        String terminalName = driver.findElement(By.id("com.accutime.atsmgmtdemo:id/response")).getText();
        System.out.println("response code : " + terminalName);

        //Validate the message as expected or not
        Assert.assertEquals(terminalName, "{\"Action\":\"clock_response_key\",\"Success\":true,\"Message\":\"com.accutime.clocksetup.action.get_terminal_name : abc123\"}");

    }


    @AfterTest
    public void teardown() {
        driver.quit();

    }

}


