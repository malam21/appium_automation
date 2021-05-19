package listeners;

import command_providers.ActOn;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.ReadConfigFiles;

import java.net.URL;
import java.util.Locale;


public class BaseClass {


    public static AndroidDriver<MobileElement> driver;
    //    Logger LOGGER = LogManager.getLogger(this.getClass().getName());
    private static final Logger LOGGER = LoggerFactory.getLogger(BaseClass.class.getName());
    String testCaseName = String.format("-----Test: %s-------", this.getClass().getName());
    String endTestCase = String.format("-----Test End: %s-------", this.getClass().getName());

    DesiredCapabilities caps = new DesiredCapabilities();


    @BeforeMethod
    public void setup() {
        try {
            String url = ReadConfigFiles.getPropertyValue("Url");
            String appName = ReadConfigFiles.getPropertyValue("ApplicationName");
            //String appName = System.getProperty("appName") == null ? "atsmgmt_demo" : System.getProperty("appName");

            switch (appName) {
                case "atsmgmt_demo":
                    String buildPath = ReadConfigFiles.getPropertyValue("BuildUrl");
                    BasicDesiredCapabilities();
                    caps.setCapability(MobileCapabilityType.APP, buildPath);
                    driver = new AndroidDriver(new URL(url), caps);
                    LOGGER.info(testCaseName);
                    System.out.println("value of url in case 1: " + url);
                    break;
                case "testMode":
                    BasicDesiredCapabilities();
                    caps.setCapability("appPackage", "com.accutime.testmode");
                    caps.setCapability("appActivity", "com.accutime.testmode.MainActivity");
                    driver = new AndroidDriver(new URL(url), caps);
                    LOGGER.info(testCaseName);
                    System.out.println("value of url in case 2: " + url);
                    break;
                case "clockSetup":
                    //BasicDesiredCapabilities();
                    caps.setCapability("noReset", "true");
                    caps.setCapability("fullReset", "false");
                    BasicDesiredCapabilities();
                    //driver = new AndroidDriver(new URL(url), caps);
                    caps.setCapability("appPackage", "com.accutime.clocksetup");
                    caps.setCapability("appActivity", "com.accutime.clocksetup.activities.MainActivity");

                    driver = new AndroidDriver(new URL(url), caps);
                    LOGGER.info(testCaseName);
                    System.out.println("url");
                    System.out.println("value of url in case 3: " + url);
                    break;

                default:
                    LOGGER.error("You have a invalid app name " + appName );

            }


            //_____________________________________________________________________


        } catch (Exception exp) {
            LOGGER.error("Cause is : {}", exp.getCause());
            System.out.println("Message is : " + exp.getMessage());
            LOGGER.error("Message is : " + exp.getMessage());
            exp.printStackTrace();
        }

    }


    //---------------------------------------------------------------------------------------------
//        try {
//
//            String AppName = ReadConfigFiles.getPropertyValue("ApplicationName");
//            if (AppName.equalsIgnoreCase("atsmgmt_demo")) {
//                String buildPath = ReadConfigFiles.getPropertyValue("BuildUrl");
//                BasicDesiredCapabilities();
//                caps.setCapability(MobileCapabilityType.APP, buildPath);
//                driver = new AndroidDriver(new URL(url), caps);
//                LOGGER.info(testCaseName);
//            } else if (AppName.equalsIgnoreCase("testMode")) {
//
//                String url = ReadConfigFiles.getPropertyValue("Url");
//                BasicDesiredCapabilities();
//                caps.setCapability("appPackage", "com.accutime.testmode");
//                caps.setCapability("appActivity", "com.accutime.testmode.MainActivity");
//                driver = new AndroidDriver(new URL(url), caps);
//                LOGGER.info(testCaseName);
//
//                //--------------------------------------------------------------------------
//            } else if (AppName.equalsIgnoreCase("clockSetup")) ;
//            {
//
//                String url = ReadConfigFiles.getPropertyValue("Url");
//                //BasicDesiredCapabilities();
//                caps.setCapability("noReset", "true");
//                caps.setCapability("fullReset", "false");
//                BasicDesiredCapabilities();
//                //driver = new AndroidDriver(new URL(url), caps);
//
//                caps.setCapability("appPackage", "com.accutime.clocksetup");
//                caps.setCapability("appActivity", "com.accutime.clocksetup.activities.MainActivity");
//
//                driver = new AndroidDriver(new URL(url), caps);
//                LOGGER.info(testCaseName);
//                //_____________________________________________________________________
//            }
//
//        } catch (Exception exp) {
//            LOGGER.error("Cause is : {}", exp.getCause());
//            System.out.println("Message is : " + exp.getMessage());
//            LOGGER.error("Message is : " + exp.getMessage());
//            exp.printStackTrace();
//        }
//
//    }
//-----------------------------------------------------------------------------------------------------------

    private void BasicDesiredCapabilities() {
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "hcm");
        //caps.setCapability(MobileCapabilityType.UDID, "c2c3a0db");
        //caps.setCapability(MobileCapabilityType.UDID, "192.168.128.120:3121");
        caps.setCapability(MobileCapabilityType.UDID, "192.168.1.220:3121");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Uiautomator2");


    }


    @AfterMethod
    public void closeBrowser() {
        // driver.manage().deleteAllCookies();
        //ActOn.browser(driver).closeBrowser();
        //driver.quit();
        LOGGER.info(endTestCase);
    }


}







        /*try {

//            // MgmtDemo
            String url = ReadConfigFiles.getPropertyValue("Url");
            String buildPath = ReadConfigFiles.getPropertyValue("BuildUrl");

            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "hcm");
            caps.setCapability(MobileCapabilityType.UDID, "c2c3a0db");
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Uiautomator2");
            //----------------------------------------------------------------------------
            //caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\malam\\Desktop\\Build\\ATSMgmtDemo-3-17-21.apk");
            caps.setCapability(MobileCapabilityType.APP, buildPath);
            driver = new AndroidDriver(new URL(url), caps);
            LOGGER.info(testCaseName);

            //ManagementDemo
            //caps.setCapability("appPackage", "com.android.launcher3");
            //caps.setCapability("appActivity", "com.android.launcher3.Launcher");
            //-------------------------------------------------------------------
            //TestMode
            //caps.setCapability("appPackage", "com.accutime.testmode");
            //caps.setCapability("appActivity", "com.accutime.testmode.MainActivity")
            // MgmtDemo



//            // TestMode
//            String url = ReadConfigFiles.getPropertyValue("Url");
//            DesiredCapabilities caps = new DesiredCapabilities();
//            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
//            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
//            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "hcm");
//            caps.setCapability(MobileCapabilityType.UDID, "c2c3a0db");
//            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Uiautomator2");
//            //----------------------------------------------------------------------------
//            //----------------------------------------------------------------------------
//            //TestMode
//            caps.setCapability("appPackage", "com.accutime.testmode");
//            caps.setCapability("appActivity", "com.accutime.testmode.MainActivity");
//
//            driver = new AndroidDriver(new URL(url), caps);
//            LOGGER.info(testCaseName);
//            // TestMode



        } catch (Exception exp) {

            //System.out.println("Cause is : " + exp.getCause());
            LOGGER.error("Cause is : " + exp.getCause());
            System.out.println("Message is : " + exp.getMessage());
            LOGGER.error("Message is : " + exp.getMessage());
            exp.printStackTrace();
        }*/


//    @AfterMethod
//    public void closeBrowser() {
//        // driver.manage().deleteAllCookies();
//        //ActOn.browser(driver).closeBrowser();
//        driver.quit();
//        LOGGER.info(endTestCase);
//    }
//
//}


//public static WebDriver driver;
//public static WebDriver driver;

//    @BeforeMethod
//    public void browserOpen() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        ActOn.browser(driver).openBrowser("https://www.google.com/");
//        LOGGER.info(testCaseName);
//    }
//
//    @AfterMethod
//    public void closeBrowser() {
//        ActOn.browser(driver).closeBrowser();
//        LOGGER.info(endTestCase);
//    }









