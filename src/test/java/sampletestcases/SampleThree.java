package sampletestcases;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class SampleThree {


    static AndroidDriver<MobileElement> driver;

    @BeforeTest
    public void setupThree() {

        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            //caps.setCapability("noReset", "true");
            //caps.setCapability("fullReset", "false");
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
            //caps.setCapability(MobileCapabilityType.DEVICE_NAME, "hcm");
            //caps.setCapability(MobileCapabilityType.DEVICE_NAME, "c2c3a0db");
            caps.setCapability(MobileCapabilityType.UDID, "192.168.129.124:3121");
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Uiautomator2");


            //-Build Location
            //driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            //caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\malam\\Desktop\\Build\\ATSMgmtDemo-3-17-21.apk");
            //caps.setCapability("appPackage", "com.android.launcher3");
            //caps.setCapability("appActivity", "com.android.launcher3.Launcher");


            //Correct sequence to open the installed app in the device without build
            //driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            caps.setCapability("appWaitDuration,30000", true);
            caps.setCapability("appPackage", "com.accutime.testmode");
            caps.setCapability("appActivity", "com.accutime.testmode.MainActivity");


            //caps.setCapability("appWaitDuration,30000",true);
            //caps.setCapability("appPackage", "com.accutime.clocksetup");
            //caps.setCapability("appActivity", "com.accutime.clocksetup.activities.MainActivity");

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);

            //caps.setCapability("appWaitDuration,30000",true);
            //AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);


        } catch (Exception exp) {

            System.out.println("Cause is : " + exp.getCause());
            System.out.println("Message is : " + exp.getMessage());
            exp.printStackTrace();

        }
    }


    @Test
    public void sampleTest2() throws InterruptedException, ParseException, IOException {


        driver.findElement(By.id("com.accutime.testmode:id/btn_dido_fragment")).click();




        TimeUnit.SECONDS.sleep(8);
        WebElement checkbox = driver.findElement(By.id("com.accutime.testmode:id/cb_relay_1"));
        //if  (checkbox.getAttribute("checked") == String.valueOf(false)){
        //if (checkbox.isSelected() == true) {
            if(checkbox.getAttribute("checked") == ("true")){
            //ActOn.element(driver, PASS_BUTTON).click();
            //driver.findElement(By.id("com.accutime.testmode:id/cb_relay_1")).click();
            System.out.println(true);
        } else
            System.out.println(false);
            driver.findElement(By.id("com.accutime.testmode:id/cb_relay_1")).click();
            driver.findElement(By.id("com.accutime.testmode:id/btn_dido_command_out")).click();
            takeScreenShot(driver, "c://test.png");
            //randomNumber();
           System.out.println(""+randomNumber());
           System.out.println(getRandomIpv4Address());
           driver.findElement(By.id("com.accutime.testmode:id/cb_relay_1")).setValue(""+randomNumber());
    }




    public static void takeScreenShot(AndroidDriver<MobileElement> driver, String s) throws IOException {
        Date currentdate = new Date();
        String screenshotfilename = currentdate.toString().replace(" ", "-").replace(":", "-");
        System.out.println(screenshotfilename);
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File(".//screenshot//" + screenshotfilename + ".png"));

        //Move image file to new destination
//        File DestFile=new File(fileWithPath);
        //Copy file at destination
//        FileUtils.copyFile(SrcFile, DestFile);
    }


    public static int randomNumber()
    {
        Random rand = new Random();
        int minRange = 1000, maxRange= 5000;
        int value = rand.nextInt(maxRange - minRange) + minRange;
        System.out.println(value);
        return value;
    }


    public static String getRandomIpv4Address() {
        return "192." + "168." + (int) (Math.random() * 255) + "."
                + (int) (Math.random() * 255);
    }











        //public ElementActions iscChecked() {

//             (driver.findElement(By.id("com.accutime.clocksetup:id/btn_setup")).isSelected();

//        WebElement checkbox = driver.findElement(By.cssSelector("input[ng-model='checkboxModel.value1']"));
//        if checkbox.getAttribute("true");{
//            ActOn.element(driver, PASS_BUTTON).click();
//            checkbox.click();
//        } else if {
//            ActOn.element(driver, PASS_BUTTON).click();
//
//        }


//        if ActOn.element(driver, PASS_BUTTON).getAttribute("checked")= true;
//       // checkbox driver.findElement(By.id("com.accutime.atsmgmtdemo:id/cb_dhcp"));
//
//        //if(checkbox.getAttribute("true"));{
//            ActOn.element(driver, PASS_BUTTON).click();
//            //checkbox.click();
//        } else if{
//            ActOn.element(driver, PASS_BUTTON).click();
//
//        }


//
    //(checkbox.getAttribute("checked"));{
    //driver.findElement(By.id("com.accutime.atsmgmtdemo:id/cb_dhcp")).GetAttribute("checked").Equals("true"))

//    WebElement checkbox = driver.findElement(By.id("com.accutime.atsmgmtdemo:id/cb_dhcp"));
//    if  (checkbox.getAttribute("checked") == String.valueOf(true));{
//        //if(checkbox.getAttribute("true"));{
//        ActOn.element(driver, PASS_BUTTON).click();
//
//    } else if
//        ActOn.element(driver, PASS_BUTTON).click();
//
//    }







//        String SystemTime = "15:41:14";
//       String RTCTime = "15:41:15";
//
//        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
//        Date timeOne = sdf.parse(SystemTime);
//        Date timeTwo = sdf.parse(RTCTime);
//
//        Long dif = timeTwo.getTime()-timeOne.getTime();
//        //System.out.println(dif/1000);
//        System.out.println(dif);










    @AfterTest
    public void teardown() {
        //driver.quit();

    }

}













//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//        //Click Set Setup Parameter
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/btn_go_to_set_setup_params_activity")).click();
//
//
//
//        Thread.sleep(5000);
//        //Enter serial number or password
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_var_password")).sendKeys("2019061");
//
//
//        //Set Ehernet Settings
//        //---------------------------Ehernet Settings---------------------------
//
//        driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollForward()");
//
//
//
//        //Check Ehernet DHCP
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/cb_dhcp")).click();
//
//        //Uncheck Ehernet DHCP
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/cb_dhcp")).click();
//
//        //Check Ehernet DHCP
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/cb_dhcp")).click();
//
//        //Enter fix ip address
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_fixed_ip")).sendKeys("198.168.122.231");
//
//        //Enter subnet Mask
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_subnet_mask")).sendKeys("198.168.122.231");
//
//
//        //Enter DNS Server
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_dns_server")).sendKeys("198.168.122.231");
//
//
//        //Enter Getway
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_gateway")).sendKeys("198.168.122.231");
//
//
//        //Click Set Ethernet settings
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/btn_set_ethernet_settings")).click();
//
//        Thread.sleep(2000);
//        //Enter serial number or password
//        //driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_var_password")).sendKeys("2019061");
//
//        //Uncheck Ehernet DHCP (Remove settings)
//        Thread.sleep(3000);
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/cb_dhcp")).click();
//        Thread.sleep(2000);
//
//        //Check Ehernet DHCP
////        Thread.sleep(3000);
////        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/cb_dhcp")).clear();
////        Thread.sleep(2000);
//
//        //Remove fix ip address
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_fixed_ip")).clear();
//
//        //Remove subnet Mask
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_subnet_mask")).clear();
//
//
//        //Remove DNS Server
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_dns_server")).clear();
//
//
//        //Remove Getway
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_gateway")).clear();
//
//
//        //Remove Ethernet settings
//        //driver.findElement(By.id("com.accutime.atsmgmtdemo:id/btn_set_ethernet_settings")).click();;
//
//        //**************************************************************
//
//        //---------------------------WiFi Settings---------------------------
//        //Thread.sleep(5000);
//        //Enter serial number or password
//        //driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_var_password")).sendKeys("2019061");
//        driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"WIFI\").instance(0))").click();
//
//
//
//
//        //Set WiFi Settings
//        //---------------------------
//
//
//        //Click wifi enable checkmark
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/cb_wifi_enable")).click();
//
//
//        //Enter Gwifi SSID
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_ssid")).sendKeys("ABC");
//
//        //Enter Encripted key
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_encryption_key")).sendKeys("ABC123");
//
//        //Click set wifi settings
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/btn_set_wifi_settings")).click();
//
//
//        //Thread.sleep(5000);
//        //Enter serial number or password
//        //driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_var_password")).sendKeys("2019061");
//
//        //Click wifi enable uncheck
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/cb_wifi_enable")).click();
//
//        //Enter Gwifi SSID (remove)
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_ssid")).clear();
//
//        //Enter Encripted key (remove)
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_encryption_key")).clear();
//
//        //Click set wifi settings (remove)
//        // driver.findElement(By.id("com.accutime.atsmgmtdemo:id/btn_set_wifi_settings")).click();
//
//
//        //*****************************************************************************************
//
//
//        //---------------------------Cellular Settings---------------------------
//
//        Thread.sleep(2000);
//        //Enter serial number or password
//        //driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_var_password")).sendKeys("2019061");
//
//        //Set Cellular Settings
//        //---------------------------
//        driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"APN\").instance(0))").click();
//
//
//        //Click Cellular enable checkmark
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/cb_cellular_enable")).click();
//
//        //Enter Cellular Name
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_cell_name")).sendKeys("TMobile");
//
//        //Enter Cellular APN
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_cell_apn")).sendKeys("ABC1");
//
//        //Enter Cellular Proxy
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_cell_proxy")).sendKeys("198.168.122.231");
//
//        //Enter Cellular Port
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_cell_port")).sendKeys("4567");
//
//        driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"MCC\").instance(0))").click();
//
//        //Enter Cellular User
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_cell_user")).sendKeys("John");
//
//        //Enter Cellular password
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_cell_password")).sendKeys("ABC123");
//
//        //Enter Cellular Server
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_cell_server")).sendKeys("Bingo22");
//        //Enter Cellular MCC
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_cell_mcc")).sendKeys("198168122231");
//        driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"CELLULAR SETTINGS\").instance(0))").click();
//
//        //Enter Cellular MNC
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_cell_mnc")).sendKeys("198168122231");
//
//        //Click Cellular Settings
//        //driver.findElement(By.id("com.accutime.atsmgmtdemo:id/btn_set_cellular_settings")).click();
//
//
//        //****************************Cellur Remove ***************************************
//
//        Thread.sleep(2000);
//        //Enter serial number or password
//        //driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_var_password")).sendKeys("2019061");
//
//        driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Cellular Name\").instance(0))").click();
//
//        //Remove Cellular Settings
//        //---------------------------
//
//        //Click Cellular enable checkmark to dissable
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/cb_cellular_enable")).click();
//
//        //Enter Cellular Name (Remove)
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_cell_name")).clear();
//
//        //Enter Cellular APN (Remove)
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_cell_apn")).clear();
//
//        //Enter Cellular Proxy (Remove)
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_cell_proxy")).clear();
//
//        //Enter Cellular Port (Remove)
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_cell_port")).clear();
//        driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Cellular MNC\").instance(0))").click();
//        //Enter Cellular User (Remove)
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_cell_user")).clear();
//
//        //Enter Cellular password (Remove)
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_cell_password")).clear();
//
//        //Enter Cellular Server (Remove)
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_cell_server")).clear();
//
//        //driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"CELLULAR SETTINGS\").instance(0))").click();
//
//        //Enter Cellular MCC(Remove)
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_cell_mcc")).clear();
//
//        //Enter Cellular MNC (Remove)
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_cell_mnc")).clear();
//
//        //Click Cellular Settings to save
//        //driver.findElement(By.id("com.accutime.atsmgmtdemo:id/btn_set_cellular_settings")).click();
//
//
//        //*****************************************************************************************
//
//
//        ///****************************HOST Settings***************************************
//
//        Thread.sleep(2000);
//        //Enter serial number or password
//        //driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_var_password")).sendKeys("2019061");
//
//
//
//        //Set HOST Settings
//        //---------------------------
//        driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Host URL\").instance(0))").click();
//        //Set Host Settings/ Enter host URL Information
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_host_url")).sendKeys("http://www.accu-time.com");
//
//        //Enter host User information
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_host_username")).sendKeys("Accu-Admin");
//
//        //Enter host password information
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_host_password")).sendKeys("abc123");
//        driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"SET HOST\").instance(0))").isDisplayed();
//        //{"Action":"Modify Parameters","Success":true,"Message":"Host URL - Success; Host Username - Success; Host Password - Success; "}
//        //Click Set Host Settings
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/btn_set_host_settings")).click();
//
//        //Remove HOST Settings
//        //---------------------------
//
//        //****************************HOST Remove ***************************************
//        Thread.sleep(2000);
//        //Enter serial number or password
//        //driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_var_password")).sendKeys("2019061");
//
//
//
//        //Set Host Settings/ Enter host URL Information
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_host_url")).clear();
//
//        //Enter host User information
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_host_username")).clear();
//
//        //Enter host password information
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_host_password")).clear();
//
//        //Click Set Host Settings
//        //driver.findElement(By.id("com.accutime.atsmgmtdemo:id/btn_set_host_settings")).click();
//
//        //*****************************************************************************************
//
//
//
//
//        //****************************Daemons Settings ***************************************
//        Thread.sleep(2000);
//        //Enter serial number or password
//        //driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_var_password")).sendKeys("2019061");
//        driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Time Region\").instance(0))").click();
//        //Set Daemons Settings
//        //---------------------------
//        //Check Daemons ABD Enable
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/cb_adb_enable")).click();
//
//        //Click to Set Daemon settings
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/btn_set_daemons_settings")).click();
//
//       // {"Action":"Modify Parameters","Success":true,"Message":"ADB - Success; "}
//
//
//        Thread.sleep(2000);
//        //Enter serial number or password
//        //driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_var_password")).sendKeys("2019061");
//
//        //Remove Daemons Settings
//        //---------------------------
//        //Uncheck Daemons ABD Enable
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/cb_adb_enable")).click();
//
//        //Click to Set Daemon settings
//        //driver.findElement(By.id("com.accutime.atsmgmtdemo:id/btn_set_daemons_settings")).click();
//
//
//        //************************************Time Settings******************************************
//
//
//
//        Thread.sleep(2000);
//        //Enter serial number or password
//        //driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_var_password")).sendKeys("2019061");
//
//        //Set Time Settings
//        //---------------------------
//        //Enter time Region
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_time_region")).sendKeys("Eastern");
//
//        //Enter time Location
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_time_location")).sendKeys("Boston");
//
//
//        //Click to Set NTP Enable
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/cb_ntp_enable")).click();
//
//        //Enter NTP Server information
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_ntp_server")).sendKeys("data");
//
//        driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"TIME SETTINGS\").instance(0))").isDisplayed();
//
//        //Click to Set Time settings
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/btn_set_time_settings")).click();
//
//
//
//
//        Thread.sleep(2000);
//        //Enter serial number or password
//        //driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_var_password")).sendKeys("2019061");
//
//        //Remove Time Settings
//        //---------------------------
//        driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"SET DAEMONS\").instance(0))").isDisplayed();
//
//        //Enter time Region
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_time_region")).clear();
//
//        //Enter time Location
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_time_location")).clear();
//
//
//        //Click to Set NTP Enable
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/cb_ntp_enable")).click();
//
//        //Enter NTP Server information
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_ntp_server")).clear();
//
//        //Click to Set Time settings
//        //driver.findElement(By.id("com.accutime.atsmgmtdemo:id/btn_set_time_settings")).click();
//
//
//        //******************************************************************************
//
//
//
//
//
//        //************************************User Experience******************************************
//
//        Thread.sleep(5000);
//        //Enter serial number or password
//        //driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_var_password")).sendKeys("2019061");
//
//        driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"EXPERIENCE SETTINGS\").instance(0))").isDisplayed();
//
//        //Enter User Experience
//        //---------------------------
//
//        //Enter User Experience information
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_startup_application")).sendKeys("testing");
//
//
//        //Click to Set User Experience
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/btn_set_user_experience_settings")).click();
//
//
//
//
//        Thread.sleep(5000);
//        //Enter serial number or password
//        //driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_var_password")).sendKeys("2019061");
//
//
//        //Remove User Experience
//        //---------------------------
//
//        //Enter User Experience information
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_startup_application")).clear();
//
//
//        //Click to Set User Experience
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/btn_set_user_experience_settings")).click();
//
//
//        //********************************************************************************************
//
//
//
//
//
//
//        //****************************************Terminal settings**********************************
//
//
//        Thread.sleep(5000);
//        //Enter serial number or password
//        //driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_var_password")).sendKeys("2019061");
//
//        //Enter Terminal settings
//        //---------------------------
//        driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"TERMINAL SETTINGS\").instance(0))").isDisplayed();
//
//        //Enter Terminal Name
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_terminal_name")).sendKeys("abc123");
//
//
//        //Click to Set Terminal settings
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/btn_set_terminal_name")).click();
//
//
//
//        Thread.sleep(5000);
//        //Enter serial number or password
//        //driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_var_password")).sendKeys("2019061");
//
//        //Remove Terminal settings
//        //---------------------------
//
//        //Remove Terminal Name
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_terminal_name")).clear();
//
//
//        //Click to Set Terminal settings
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/btn_set_terminal_name")).click();
//
//        //********************************************************************************************
//
//
//
//
//
//
//        //****************************************Log settings****************************************
//
//        Thread.sleep(5000);
//        //Enter serial number or password
//        //driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_var_password")).sendKeys("2019061");
//        driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Max File\").instance(0))").isDisplayed();
//
//        //Enter Log settings
//        //---------------------------
//
//        //Enter log Enable Type
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_log_enable_type")).sendKeys("abc123");
//
//        //Enter Max File Size
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_max_file_size")).sendKeys("12 MB");
//
//        Thread.sleep(2000);
//        driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"LOGGING SETTINGS\").instance(0))").click();
//
//        //Enter Time Interval
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_time_interval")).sendKeys("12PM");
//
//
//        //Click to Set Log settings
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/btn_set_logging_settings")).click();
//
//
//
//        Thread.sleep(5000);
//        //Enter serial number or password
//        // driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_var_password")).sendKeys("2019061");
//
//        //Remove Log settings
//        //---------------------------
//        driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"TERMINAL SETTINGS\").instance(0))").isDisplayed();
//        //Enter log Enable Type(Remove)
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_log_enable_type")).clear();
//
//        //Enter Max File Size(Remove)
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_max_file_size")).clear();
//        driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"LOGGING SETTINGS\").instance(0))").click();
//
//        //Enter Time Interval(Remove)
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_time_interval")).clear();
//
//
//        //Click to Set Log settings (Remove)
//        //driver.findElement(By.id("com.accutime.atsmgmtdemo:id/btn_set_logging_settings")).click();
//
//        //********************************************************************************************
//
//
//
//
//
//
//        //*********************************Peripherals Settings***************************************
//
//
//        //Enter serial number or password
//        //driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_var_password")).sendKeys("2019061");
//        driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Keypad\").instance(0))").isDisplayed();
//        Thread.sleep(3000);
//        //Set Peripherals Settings
//        //---------------------------
//
//        //Click to Set Keypad Enable
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/cb_keypad_enable")).click();
//
//        //Click to Set Peripherals Settings
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/cb_dido_enable")).click();
//
//
//        //Click to Set Peripherals Settings
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/btn_set_peripherals_settings")).click();
//
//
//
//
//        Thread.sleep(5000);
//        //Enter serial number or password
//        //driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_var_password")).sendKeys("2019061");
//
//        //Remove Peripherals Settings
//        //---------------------------
//
//        //Click to Set Keypad disable(Remove)
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/cb_keypad_enable")).click();
//
//        //Click to Set dido disable (Remove)
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/cb_dido_enable")).click();
//
//
//        //Click to Set Peripherals Settings
//        //driver.findElement(By.id("com.accutime.atsmgmtdemo:id/btn_set_peripherals_settings")).click();
//        //********************************************************************************************
//
//
//
//
//
//
//        //***************************************Reader Settings**************************************
//
//
//        Thread.sleep(5000);
//        //Enter serial number or password
//        //driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_var_password")).sendKeys("2019061");
//        driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Finger\").instance(0))").isDisplayed();
//
//        //Set Reader Settings
//        //---------------------------
//
//        //Enter Reader value 0
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_fingerprint_compatibility_mode")).sendKeys("0");
//
//        //Click to Set Reader settings
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/btn_set_readers_settings")).click();
//
//
//        //Thread.sleep(5000);
//        //Enter serial number or password
//        //driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_var_password")).sendKeys("2019061");
//
//        //Enter Reader value 1
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_fingerprint_compatibility_mode")).sendKeys("1");
//
//        //Click to Set Reader settings
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/btn_set_readers_settings")).click();
//
//        // Thread.sleep(5000);
//        //Enter serial number or password
//        //driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_var_password")).sendKeys("2019061");
//
//        //Enter Reader value 1
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_fingerprint_compatibility_mode")).sendKeys("2");
//
//        //Click to Set Reader settings
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/btn_set_readers_settings")).click();
//
//        //Enter serial number or password
//        driver.findElement(By.id("com.accutime.atsmgmtdemo:id/et_var_password")).clear();
//

        //********************************************************************************************

