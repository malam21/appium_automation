package sampletestcases;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.print.attribute.standard.Media;
import java.net.URL;




public class SampleTwo {

    AndroidDriver<MobileElement> driver;

    @BeforeTest
    public void setuptwo() {

        try {
            DesiredCapabilities caps = new DesiredCapabilities();

            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Uiautomator2");
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "c2c3a0db");

            //Step One
            //driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);

            //Step two
//            caps.setCapability("appPackage", "com.android.launcher3");
//            caps.setCapability("appActivity", "com.android.launcher3.Launcher");



            //Step One
            caps.setCapability("appPackage", "com.accutime.testmode");
            caps.setCapability("appActivity", "com.accutime.testmode.MainActivity");
            //Step two
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);




        } catch (Exception exp) {

            System.out.println("Cause is : " + exp.getCause());
            System.out.println("Message is : " + exp.getMessage());
            exp.printStackTrace();

        }
    }

    @Test
    public void sampleTest1() throws InterruptedException {
//        Thread.sleep(3000);
        //Click Set Setup Parameter
        driver.findElement(By.id("com.accutime.testmode:id/btn_keypad_fragment")).click();


        Thread.sleep(5000);
        //Enter serial number or password
        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_var_password")).sendKeys("2019061");


        //Set Ethernet Settings
        //---------------------------Ethernet Settings---------------------------



        //Check Ethernet DHCP
        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/cb_dhcp")).click();

        //Uncheck Ethernet DHCP
        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/cb_dhcp")).click();

        //Check Ethernet DHCP
        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/cb_dhcp")).click();

        //driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().description(\""+parentScrollViewId+"\")).scrollForward()"));
        driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollForward()");
        //driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Time Region\").instance(0))").click();







    }
}


