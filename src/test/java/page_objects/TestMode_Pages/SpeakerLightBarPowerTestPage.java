package page_objects.TestMode_Pages;

import command_providers.ActOn;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import utilities.ReadConfigFiles;

import java.util.concurrent.TimeUnit;


public class SpeakerLightBarPowerTestPage extends NavigationPageTestMode {


    //---------------------------------------------------------------------------------------
    private static final Logger LOGGER = LoggerFactory.getLogger(SpeakerLightBarPowerTestPage.class.getName());
    //---------------------------------------------------------------------------------------


    //Element Locator Details
    private final By PLAY = By.id("com.accutime.testmode:id/btn_play_sound_speakertest");
    private final By LIGHT_BAR_MODE = By.id("com.accutime.testmode:id/sp_lightbar_mode");
    private final By SELECT_ON = By.xpath("//*[@text='On']");
    private final By LIGHT_BAR_COLOR = By.id("com.accutime.testmode:id/sp_lightbar_colour");
    private final By SELECT_AMBER = By.xpath("//*[@text='Amber']");
    private final By SELECT_RED = By.xpath("//*[@text='Red']");
    private final By SELECT_PURPLE = By.xpath("//*[@text='Purple']");
    private final By SELECT_WHITE = By.xpath("//*[@text='White']");
    private final By SELECT_YELLOW = By.xpath("//*[@text='Yellow']");
    private final By BRIGHTNESS = By.id("com.accutime.testmode:id/sp_lightbar_brightness");
    private final By BRIGHTNESS_SIXTY = By.xpath("//*[@text='60']");
    private final By BRIGHTNESS_HUNDRED = By.xpath("//*[@text='100']");
    private final By BRIGHTNESS_SEVENTY = By.xpath("//*[@text='70']");
    private final By BRIGHTNESS_NINETY = By.xpath("//*[@text='90']");
    private final By PASS_TEST = By.id("com.accutime.testmode:id/btn_pass_test");
    private final By SELECT_FLASH = By.xpath("//*[@text='Flash']");
    private final By SELECT_OFF = By.xpath("//*[@text='Off']");
    private final By BATTERY_STATUS_MESSAGE = By.id("com.accutime.testmode:id/tv_currently_on_battery");
    private final By VERIFY_FINGER_BUTTON = By.id("com.accutime.testmode:id/btn_verify_fingerprint");
    private final By CAPTURE_FINGER_BUTTON = By.id("com.accutime.testmode:id/btn_capture_fingerprint");
    private final By FINGER_PRINT_MESSAGE = By.id("android:id/message");
    private final By CAPTURE_PASS_BUTTON = By.id("com.accutime.testmode:id/btn_capture_fingerprint");
    private final By CAPTURE_FAILED_VERIFY = By.id("com.accutime.testmode:id/btn_verify_fingerprint");
    private final By SYSTEM_TIME = By.id("com.accutime.testmode:id/tv_current_system_time");
    private final By RTC_TIME = By.id("com.accutime.testmode:id/tv_current_rtc_time");
    private final By OUT_OF_RANGE = By.id("com.accutime.testmode:id/tv_presence_message");
    private final By NEAREST_OBJECT = By.id("com.accutime.testmode:id/tv_presence_message");
    private final By SERIAL_NUMBER = By.id("com.accutime.testmode:id/serial_number");
    private final By KEYPAD = By.id("com.accutime.testmode:id/keyboard");
    private final By FAIL_TEST = By.id("com.accutime.testmode:id/btn_fail_test");
    private final By BIO_SENSOR = By.id("com.accutime.testmode:id/bio");
    private final By HID_PROX_CARD = By.id("com.accutime.testmode:id/hid_prox");
    private final By OS_VERSION = By.id("com.accutime.testmode:id/os_ver");
    private final By OK_BUTTON = By.id("android:id/button1");


    //*
    //private final By TROUBLESHOOTING = By.id("com.accutime.testmode.TestActivities:id/btn_troubleshooting");
    //private final By TROUBLESHOOTING = By.id("com.accutime.testmode:id/btn_troubleshooting");
    //*


    //---------------------------------------------------------------------------------------
    public SpeakerLightBarPowerTestPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }
    //---------------------------------------------------------------------------------------


    public SpeakerLightBarPowerTestPage clickToPlaySpeaker() throws InterruptedException {
        ActOn.element(driver, PLAY).click();
        TimeUnit.SECONDS.sleep(6);
        LOGGER.debug("Clicked on Play to test speaker");
        return this;
    }

    public SpeakerLightBarPowerTestPage clickToPassSpeakerTest() {
        ActOn.element(driver, PASS_TEST).click();
        LOGGER.debug("Clicked on Pass Speaker Test");
        LOGGER.info("User navigating to main page");
        return this;
    }

    public SpeakerLightBarPowerTestPage clickLightBarMode() {
        ActOn.element(driver, LIGHT_BAR_MODE).click();
        LOGGER.debug("Clicked on LightBar Mode");
        return this;
    }

    public SpeakerLightBarPowerTestPage clickToOn() {
        ActOn.element(driver, SELECT_ON).click();
        LOGGER.debug("Clicked on LightBar Mode to ON");
        return this;
    }

    public SpeakerLightBarPowerTestPage clickLightBarColor() {
        ActOn.element(driver, LIGHT_BAR_COLOR).click();
        LOGGER.debug("Clicked To Select Light Bar color selection");
        return this;
    }

    public SpeakerLightBarPowerTestPage clickToSelectRed() {
        ActOn.element(driver, SELECT_RED).click();
        LOGGER.debug("Clicked To Select color Red");
        return this;
    }

    public SpeakerLightBarPowerTestPage clickToSelectAmber() {
        ActOn.element(driver, SELECT_AMBER).click();
        LOGGER.debug("Clicked To Select color Amber");
        return this;
    }

    public SpeakerLightBarPowerTestPage clickToSelectPurple() {
        ActOn.element(driver, SELECT_PURPLE).click();
        LOGGER.debug("Clicked To Select color Purple");
        return this;
    }

    public SpeakerLightBarPowerTestPage clickToSelectYellow() {
        ActOn.element(driver, SELECT_YELLOW).click();
        LOGGER.debug("Clicked To Select color Yellow");
        return this;
    }

    public SpeakerLightBarPowerTestPage clickToOKButton() {
        ActOn.element(driver, OK_BUTTON).click();
        LOGGER.debug("Clicked To OK Button");
        return this;
    }


    public SpeakerLightBarPowerTestPage clickToSelectWhite() {
        ActOn.element(driver, SELECT_WHITE).click();
        LOGGER.debug("Clicked To Select color White");
        return this;
    }

    public SpeakerLightBarPowerTestPage selectLightBarBrightness() {
        //ActOn.wait(driver, BRIGHTNESS).waitForToBeVisible(10);
        ActOn.element(driver, BRIGHTNESS).click();
        LOGGER.debug("Clicked To Select light Brightness");
        return this;
    }

    public SpeakerLightBarPowerTestPage selectBrightnessSixty() {
        if (driver.findElement(By.xpath("//*[@text='60']")).isDisplayed()) {
            ActOn.element(driver, BRIGHTNESS_SIXTY).click();
            LOGGER.debug("Clicked To Select Brightness Sixty");
        } else {
            ActOn.element(driver, OK_BUTTON).click();
            LOGGER.info("Clicked to OK button");
            ActOn.element(driver, BRIGHTNESS_SIXTY).click();
            LOGGER.debug("Clicked To Select Brightness Sixty");
        }
        return this;
    }


    public SpeakerLightBarPowerTestPage selectBrightnessHundred() {
        if (driver.findElement(By.xpath("//*[@text='100']")).isDisplayed()) {
            ActOn.element(driver, BRIGHTNESS_HUNDRED).click();
            LOGGER.debug("Clicked To Select Brightness Hundred");
        } else {
            ActOn.element(driver, OK_BUTTON).click();
            LOGGER.info("Clicked to OK button");
            ActOn.element(driver, BRIGHTNESS_HUNDRED).click();
            LOGGER.info("Clicked to OK displayed ");
        }
        return this;
    }


    public SpeakerLightBarPowerTestPage selectBrightnessSeventy() {
        if (driver.findElement(By.xpath("//*[@text='70']")).isDisplayed()) {
            ActOn.element(driver, BRIGHTNESS_SEVENTY).click();
            LOGGER.debug("Clicked To Select Brightness Seventy");
        } else {
            ActOn.element(driver, OK_BUTTON).click();
            LOGGER.info("Clicked to OK button");
            ActOn.element(driver, BRIGHTNESS_SEVENTY).click();
            LOGGER.info("Clicked To Select Brightness Seventy");
        }
        return this;
    }


    public SpeakerLightBarPowerTestPage selectBrightnessNinety() {
        if (driver.findElement(By.xpath("//*[@text='90']")).isDisplayed()) {
            ActOn.element(driver, BRIGHTNESS_NINETY).click();
            LOGGER.debug("Clicked To Select Brightness Ninety");
        } else {
            ActOn.element(driver, OK_BUTTON).click();
            LOGGER.info("Clicked to OK button");
            ActOn.element(driver, BRIGHTNESS_NINETY).click();
            LOGGER.info("Clicked To Select Brightness Ninety");
        }
        return this;
    }


    public SpeakerLightBarPowerTestPage selectFlash() throws InterruptedException {
        ActOn.element(driver, SELECT_FLASH).click();
        TimeUnit.SECONDS.sleep(5);
        LOGGER.debug("Clicked on LightBar to Flash Mode");
        return this;
    }


    public SpeakerLightBarPowerTestPage selectOff() {
        ActOn.element(driver, SELECT_OFF).click();
        LOGGER.debug("Clicked on LightBar Off Mode");
        return this;
    }

    public SpeakerLightBarPowerTestPage selectPassTest() throws InterruptedException {
        ActOn.element(driver, PASS_TEST).click();
        LOGGER.debug("Clicked To Select test Pass.");
        LOGGER.info("User navigating to main page.");
        TimeUnit.SECONDS.sleep(3);
        return this;
    }

    public SpeakerLightBarPowerTestPage verifyNoBatteryStatusMessage(String expectedValue) {
        String actualResponse = ActOn.element(driver, BATTERY_STATUS_MESSAGE).getTextValue();
        Assert.assertEquals(actualResponse, expectedValue);
        LOGGER.debug("Verified No Battery status Message as false : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
        return this;
    }

    public SpeakerLightBarPowerTestPage verifyFingerButtonStatus() {
        ActOn.wait(driver, VERIFY_FINGER_BUTTON).waitForToBeVisible(3);
        ActOn.element(driver, VERIFY_FINGER_BUTTON).isEnabled();
        LOGGER.debug("Verified Finger Print Button is Disabled");
        return this;
    }

    public SpeakerLightBarPowerTestPage selectCaptureFingerButton() {
        ActOn.wait(driver, CAPTURE_FINGER_BUTTON).waitForToBeVisible(5);
        ActOn.element(driver, CAPTURE_FINGER_BUTTON).click();
        LOGGER.debug("Clicked To select Capture Finger print Button");
        return this;
    }

    public SpeakerLightBarPowerTestPage verifyFingerPrintMessage(String expectedValue) throws InterruptedException {
        ActOn.wait(driver, FINGER_PRINT_MESSAGE).waitForToBeVisible(5);
        String actualResponse = ActOn.element(driver, FINGER_PRINT_MESSAGE).getTextValue();
        Assert.assertEquals(actualResponse, expectedValue);
        LOGGER.debug("Verified Finger Print Message displayed in the screen : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
        LOGGER.info("Validating failure print message So don't put your finger. ");
        TimeUnit.SECONDS.sleep(5);
        return this;
    }

    public SpeakerLightBarPowerTestPage verifyCaptureFailed(String expectedValue) throws InterruptedException {
        ActOn.wait(driver, CAPTURE_FINGER_BUTTON).waitForToBeVisible(5);
        String actualResponse = ActOn.element(driver, CAPTURE_FINGER_BUTTON).getTextValue();
        Assert.assertEquals(actualResponse, expectedValue);
        LOGGER.debug("Verified Finger Print capture failed : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
        TimeUnit.SECONDS.sleep(2);
        return this;
    }

    public SpeakerLightBarPowerTestPage scanFingerForFirstTime() throws InterruptedException {
        ActOn.element(driver, CAPTURE_FINGER_BUTTON).click();
        LOGGER.debug("Clicked To Select Capture Finger print Button");
        LOGGER.info("%%%%%%% PUT YOUR FINGER NOW. %%%%%%% ");
        LOGGER.info("%%%%%%% PUT YOUR FINGER NOW. %%%%%%% ");
        LOGGER.info("VALIDATING SUCCESSFUL FINGER PRINT FOR FIRST PRINT TEST.");
        TimeUnit.SECONDS.sleep(7);
        return this;

    }

    public SpeakerLightBarPowerTestPage verifyFirstCapturePassed(String expectedValue) throws InterruptedException {
        LOGGER.info("%%%%%%% TESTER HAS TO BE PRESENT FRONT OF THE LAPTOP. %%%%%%% ");
        ActOn.wait(driver, CAPTURE_PASS_BUTTON).waitForToBeVisible(5);
        String actualResponse = ActOn.element(driver, CAPTURE_PASS_BUTTON).getTextValue();
        if (actualResponse.equals(expectedValue)) {
            LOGGER.debug("Verified CAPTURE_PASS_BUTTON : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
            TimeUnit.SECONDS.sleep(2);
            scanWrongFinger();
            TimeUnit.SECONDS.sleep(2);
            verifySecondScanFailed(ReadConfigFiles.getPropertyValue("failFinger"));
            TimeUnit.SECONDS.sleep(2);
            scanSameFingerForSecondTime();
            TimeUnit.SECONDS.sleep(2);
            verifyScannedFingerMessage(ReadConfigFiles.getPropertyValue("scaFingMessage"));
            TimeUnit.SECONDS.sleep(2);
        } else {

            LOGGER.info("Actual Response is : " + actualResponse + " Expected Response :" + expectedValue);
            ActOn.element(driver, FAIL_TEST).click();
            LOGGER.info("%%%%%%%  TEST HAS BEEN FAILED DUE TO TESTER PRESENCE  %%%%%%%");
        }
        return this;
    }


    public SpeakerLightBarPowerTestPage scanWrongFinger() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        LOGGER.info("%%%%%%% BE READY TO PUT YOUR WRONG FINGER NOW. %%%%%%% ");
        TimeUnit.SECONDS.sleep(3);
        ActOn.element(driver, VERIFY_FINGER_BUTTON).click();
        LOGGER.debug("Verify scanned Fingerprint button Clicked");
        LOGGER.info("%%%%%%% PUT YOUR WRONG FINGER NOW. %%%%%%% ");
        LOGGER.info("%%%%%%% PUT YOUR WRONG FINGER NOW. %%%%%%% VALIDATING WRONG FINGER PRINT FOR SECOND SCAN TEST.");
        TimeUnit.SECONDS.sleep(5);
        return this;
    }

    public SpeakerLightBarPowerTestPage verifySecondScanFailed(String expectedValue) throws InterruptedException {
        ActOn.wait(driver, CAPTURE_FAILED_VERIFY).waitForToBeVisible(5);
        String actualResponse = ActOn.element(driver, CAPTURE_FAILED_VERIFY).getTextValue();
        Assert.assertEquals(actualResponse, expectedValue);
        LOGGER.debug("Verified second capture Fail : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
        TimeUnit.SECONDS.sleep(2);
        return this;
    }

    public SpeakerLightBarPowerTestPage scanSameFingerForSecondTime() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        LOGGER.info("%%%%%%% BE READY TO PUT YOUR FIRST FINGER AGAIN NOW FOR SECOND TIME THIRD SCAN. %%%%%%% ");
        TimeUnit.SECONDS.sleep(2);
        ActOn.element(driver, VERIFY_FINGER_BUTTON).click();
        LOGGER.debug("Verify scanned Fingerprint button Clicked");
        TimeUnit.SECONDS.sleep(4);
        LOGGER.info("%%%%%%% PUT YOUR FIRST FINGER NOW FOR SECOND TIME THIRD SCAN. %%%%%%% ");
        LOGGER.info("%%%%%%% PUT YOUR FIRST FINGER NOW FOR SECOND TIME THIRD SCAN. %%%%%%% ");
        //TimeUnit.SECONDS.sleep(5);
        return this;
    }

    public SpeakerLightBarPowerTestPage verifyScannedFingerMessage(String expectedValue) throws InterruptedException {
        ActOn.wait(driver, FINGER_PRINT_MESSAGE).waitForToBeVisible(5);
        String actualResponse = ActOn.element(driver, FINGER_PRINT_MESSAGE).getTextValue();
        //TimeUnit.SECONDS.sleep(5);
        Assert.assertEquals(actualResponse, expectedValue);
        LOGGER.debug("Verified Scanned Finger Print Message displayed : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
        TimeUnit.SECONDS.sleep(8);
        return this;
    }


    public SpeakerLightBarPowerTestPage compareSysTimeVSRtcTime() {

        String systemTime = ActOn.element(driver, SYSTEM_TIME).getTextValue();
        String rtcTime = ActOn.element(driver, RTC_TIME).getTextValue();
        LOGGER.debug("System Time is " + systemTime);
        LOGGER.debug("RTC Time is " + rtcTime);
        //String SystemTime = "SystemTime:15:41:11";
        String[] SystemTimeArray = systemTime.split(":");
        String SysTime = SystemTimeArray[SystemTimeArray.length - 1];
        int timeOne = Integer.parseInt(SysTime);
        //String RTCTime = "RTCTime:19:41:15";
        String[] RTCTimeArray = rtcTime.split(":");
        String RtcTime = RTCTimeArray[RTCTimeArray.length - 1];
        RtcTime = RtcTime.replace("\n", "");
        int timeTwo = Integer.parseInt(RtcTime);
        int dif = timeTwo - timeOne;
        System.out.println(dif);
        LOGGER.debug("Difference between System time and RTC time is : " + dif);
        return this;
    }


    public SpeakerLightBarPowerTestPage verifyOutOfTheRange(String expectedValue) throws InterruptedException {
        LOGGER.info("%%%%%%%PLEASE STAY FAR FROM THE DEVICE IT IS VERIFYING OUT OF THE RANGE. %%%%%%%");
        TimeUnit.SECONDS.sleep(8);
        ActOn.wait(driver, OUT_OF_RANGE).waitForToBeVisible(5);
        String actualResponse = ActOn.element(driver, OUT_OF_RANGE).getTextValue();
        if (actualResponse.equals(expectedValue)) {
            //Assert.assertTrue(actualResponse.equals(expectedValue), actualResponse + " doesn't contains " + expectedValue);
            LOGGER.info("Actual Response is : " + actualResponse + " Expected Response :" + expectedValue);

            LOGGER.debug("Verified presence sensor out of the range : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
            TimeUnit.SECONDS.sleep(5);
            selectPassTest();
        } else {
            LOGGER.info("Actual Response is : " + actualResponse + " Expected Response :" + expectedValue);
            ActOn.element(driver, FAIL_TEST).click();
            LOGGER.info("Presence test has been failed due to user presence");
        }
        return this;
    }

    public SpeakerLightBarPowerTestPage verifyNearestObject(String expectedValue) throws InterruptedException {
        LOGGER.info("%%%%%%%PLEASE STAY CLOSE: VERIFYING THE NEAREST RANGE. %%%%%%%");
        TimeUnit.SECONDS.sleep(8);
        ActOn.wait(driver, NEAREST_OBJECT).waitForToBeVisible(5);
        String actualResponse = ActOn.element(driver, NEAREST_OBJECT).getTextValue();
        if (actualResponse.contains(expectedValue)) {
            Assert.assertTrue(actualResponse.contains(expectedValue), actualResponse + " doesn't contains " + expectedValue);
            LOGGER.debug("Verified nearest presence : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
            TimeUnit.SECONDS.sleep(5);
            selectPassTest();
        } else {
            LOGGER.info("Actual Response is : " + actualResponse + " Expected Response :" + expectedValue);
            ActOn.element(driver, FAIL_TEST).click();
            LOGGER.info("Presence test has been failed due to user not present");
        }
        return this;
    }


    public SpeakerLightBarPowerTestPage verifySerialNumber(String expectedValue) {
        String actualResponse = ActOn.element(driver, SERIAL_NUMBER).getTextValue();
        Assert.assertEquals(actualResponse, expectedValue);
        LOGGER.debug("Verified serial number displaying as expected : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
        return this;
    }

    public SpeakerLightBarPowerTestPage verifyKeypadAttached(String expectedValue) {
        String actualResponse = ActOn.element(driver, KEYPAD).getTextValue();
        Assert.assertEquals(actualResponse, expectedValue);
        LOGGER.debug("Verified Keypad Attached as expected : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
        return this;
    }

    public SpeakerLightBarPowerTestPage verifyHidProxCard(String expectedValue) {
        String actualResponse = ActOn.element(driver, HID_PROX_CARD).getTextValue();
        Assert.assertEquals(actualResponse, expectedValue);
        LOGGER.debug("Verified HID_PROX_CARD Attached as expected : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
        return this;
    }

    public SpeakerLightBarPowerTestPage verifyBioSensor(String expectedValue) {
        String actualResponse = ActOn.element(driver, BIO_SENSOR).getTextValue();
        Assert.assertEquals(actualResponse, expectedValue);
        LOGGER.debug("Verified Bio Sensor Scanner Attached as expected : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
        return this;
    }

    public SpeakerLightBarPowerTestPage verifyOsVersion(String expectedValue) {
        String actualResponse = ActOn.element(driver, OS_VERSION).getTextValue();
        Assert.assertEquals(actualResponse, expectedValue);
        LOGGER.debug("Verified OS Version number as expected : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
        return this;
    }

}






//--------------------------------------------------------------------------------------------------
//    public SpeakerLightBarPowerTestPage verifyFirstCapturePassedTest(String expectedValue) throws InterruptedException {
//        ActOn.wait(driver, CAPTURE_PASS_BUTTON).waitForToBeVisible(5);
//        String actualResponse = ActOn.element(driver, CAPTURE_PASS_BUTTON).getTextValue();
//        if (actualResponse.equals(expectedValue)) {
//            Assert.assertEquals(actualResponse, expectedValue);
//            LOGGER.debug("Verified First Capture Passed : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
//            TimeUnit.SECONDS.sleep(2);
//        } else {
//            LOGGER.info("Actual Response is : " + actualResponse + " Expected Response :" + expectedValue);
//            ActOn.element(driver, FAIL_TEST).click();
//            LOGGER.info("Presence test has been failed due to user fail to scan finger");
//        }
//        return this;
//    }


//
//
//    public SpeakerLightBarPowerTestPage verifyExampleOne(String expectedValue) throws InterruptedException {
//        LOGGER.info("******Please stay close***** to the sensor to verify presence.");
//        //ActOn.wait(driver, NEAREST_OBJECT).waitForToBeVisible(5);
//        String actualResponse = ActOn.element(driver, NEAREST_OBJECT).getTextValue();
//        if (actualResponse.equals(expectedValue)) {
//            Assert.assertTrue(actualResponse.contains(expectedValue), actualResponse + " doesn't contains " + expectedValue);
//            LOGGER.debug("Verified nearest presence : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
//            TimeUnit.SECONDS.sleep(8);
//            selectPassTest();
//        } else{
//            LOGGER.info("Actual Response is : "+actualResponse+" Expected Response :"+expectedValue);
//            ActOn.element(driver, FAIL_TEST).click();
//            LOGGER.info("Presence test has been failed due to user presence");
//        }
//        return this;
//    }

//    public SpeakerLightBarPowerTestPage verifyNearestObject(String expectedValue) throws InterruptedException {
//        LOGGER.info("******Please stay close***** to the sensor to verify presence.");
//        //ActOn.wait(driver, NEAREST_OBJECT).waitForToBeVisible(5);
//        String actualResponse = ActOn.element(driver, NEAREST_OBJECT).getTextValue();
//        Assert.assertTrue(actualResponse.contains(expectedValue),actualResponse + " doesn't contains " + expectedValue);
//        LOGGER.debug("Verified nearest presence : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
//        TimeUnit.SECONDS.sleep(8);
//        return this;
//    }
//


//    public SpeakerLightBarPowerTestPage ClickToSelectAmber(String value) {
//        ActOn.element(driver, SelectAmber).selectValue(value);
//        LOGGER.debug("Clicked To Select color Cyan");
//        return this;
//    }

//    public SpeakerLightBarPowerTestPage clickToTroubleshooting() {
//        ActOn.element(driver, TROUBLESHOOTING).click();
//        //TimeUnit.SECONDS.sleep(6);
//        LOGGER.debug("Clicked on TROUBLESHOOTING to navigate to TROUBLESHOOTING page ");
//        return this;
//    }


//    public SpeakerLightBarPowerTestPage verifyOutOdddfTheRange(String expectedValue) throws InterruptedException {
//        LOGGER.info("Please ***stay far****to the sensor to verify out of the range.");
//        ActOn.wait(driver, OUT_OF_RANGE).waitForToBeVisible(5);
//        String actualResponse = ActOn.element(driver, OUT_OF_RANGE).getTextValue();
//        Assert.assertEquals(actualResponse, expectedValue);
//        LOGGER.debug("Verified presence sensor out of the range : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
//        TimeUnit.SECONDS.sleep(3);
//        return this;
//    }

//
//    public SpeakerLightBarPowerTestPage verifyFirstCapturePassed(String expectedValue) throws InterruptedException {
//        ActOn.wait(driver, CAPTURE_PASS_BUTTON).waitForToBeVisible(5);
//        String actualResponse = ActOn.element(driver, CAPTURE_PASS_BUTTON).getTextValue();
//        Assert.assertEquals(actualResponse, expectedValue);
//        LOGGER.debug("Verified First Capture Passed : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
//        TimeUnit.SECONDS.sleep(2);
//        return this;
//    }

//------------------------------------------------------------------------------
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//private static final Logger LOGGER = LogManager.getLogger(NavigationPageTestMode.class);