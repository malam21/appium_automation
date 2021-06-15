package page_objects.TestMode_Pages;

import command_providers.ActOn;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




public class NavigationPageTestMode {

    public AndroidDriver<MobileElement> driver;

    //----------------------------------------------------------------------------------------------
    private static final Logger LOGGER = LoggerFactory.getLogger(NavigationPageTestMode.class.getName());
    //----------------------------------------------------------------------------------------------


    //Element Locator Details
    private final By KEYPAD_TEST = By.id("com.accutime.testmode:id/btn_keypad_fragment");
    private final By DISPLAY_TEST = By.id("com.accutime.testmode:id/btn_display_fragment");
    private final By TOUCH_TEST = By.id("com.accutime.testmode:id/btn_touch_fragment");
    private final By SOUND_TEST = By.id("com.accutime.testmode:id/btn_sound_fragment");
    private final By SPEAKER_TEST = By.id("com.accutime.testmode:id/btn_speaker_fragment");
    private final By LIGHT_TEST = By.id("com.accutime.testmode:id/btn_lightbar_fragment");
    private final By POWER_TEST = By.id("com.accutime.testmode:id/btn_power_test_fragment");
    private final By BIOMETRIC_TEST = By.id("com.accutime.testmode:id/btn_biometric_fragment");
    private final By RTC_TEST = By.id("com.accutime.testmode:id/btn_rtc_fragment");
    private final By PRESENCE_SENSOR_TEST = By.id("com.accutime.testmode:id/btn_presence_fragment");
    private final By ABOUT_CLOCK = By.id("com.accutime.testmode:id/btn_about_fragment");
    private final By CAMERA_TEST = By.id("com.accutime.testmode:id/btn_camera_test");


    //*
    //private final By POWER_TEST = By.id("com.accutime.testmode:id/btn_dido_fragment");
    //private final By DIDO = By.id("com.accutime.testmode:id/btn_dido_fragment");
    //private final By CONNECTIVITY = By.id("com.accutime.testmode:id/btn_connectivity");
    //*

    //-------------------------------------------------------------------------------------------
    public NavigationPageTestMode(AndroidDriver driver) {
        this.driver = driver;
    }

    //Navigate to Keypad test page
    public KeypadDisplayTouchTestPage navigateToKeypadTestPage() {
        ActOn.element(driver, KEYPAD_TEST).click();
        LOGGER.info("User navigated to Test mode test page.");
        return new KeypadDisplayTouchTestPage(driver);
    }

    //Navigate to Display test page
    public KeypadDisplayTouchTestPage navigateToDisplayTestPage() {
        ActOn.element(driver, DISPLAY_TEST).click();
        LOGGER.info("User navigated to display test page.");
        return new KeypadDisplayTouchTestPage(driver);
    }

    //Navigate to Speaker test page
    public SpeakerLightBarPowerTestPage navigateToSpeakerTestPage() {
        ActOn.element(driver, SPEAKER_TEST).click();
        LOGGER.info("User navigated to Speaker test page.");
        return new SpeakerLightBarPowerTestPage(driver);
    }

    //Navigate to Touch test page
    public KeypadDisplayTouchTestPage navigateToTouchTestPage() {
        ActOn.element(driver, TOUCH_TEST).click();
        LOGGER.info("User navigated to Touch test page.");
        return new KeypadDisplayTouchTestPage(driver);
    }

    //Navigate to Sound test page
    public KeypadDisplayTouchTestPage navigateToSoundTestPage() {
        ActOn.element(driver, SOUND_TEST).click();
        LOGGER.info("User navigated to Sound test page.");
        return new KeypadDisplayTouchTestPage(driver);
    }


    //Navigate to LightBar test page
    public SpeakerLightBarPowerTestPage navigateToLightBarPage() {
        ActOn.element(driver, LIGHT_TEST).click();
        LOGGER.info("User navigated to light bar test page.");
        return new SpeakerLightBarPowerTestPage(driver);
    }

    //Navigate to Power Management Test page
    public SpeakerLightBarPowerTestPage navigateToPowerManagementPage() {
        ActOn.element(driver, POWER_TEST).click();
        LOGGER.info("User navigated to Power Management test page.");
        return new SpeakerLightBarPowerTestPage(driver);
    }
    //Navigate to Biometric test page
    public SpeakerLightBarPowerTestPage navigateToBiometricPage() {
        ActOn.element(driver, BIOMETRIC_TEST).click();
        LOGGER.info("User navigated to Biometric test page.");
        return new SpeakerLightBarPowerTestPage(driver);
    }

    //Navigate to RTC test page
    public SpeakerLightBarPowerTestPage navigateToRTCTestPage() {
        ActOn.element(driver, RTC_TEST).click();
        LOGGER.info("User navigated to RTC test page.");
        return new SpeakerLightBarPowerTestPage(driver);
    }

    //Navigate to Presence Sensor Test Page
    public SpeakerLightBarPowerTestPage navigateToPresenceSensorTestPage() {
        ActOn.element(driver, PRESENCE_SENSOR_TEST).click();
        LOGGER.info("User navigated to Presence Sensor test page.");
        return new SpeakerLightBarPowerTestPage(driver);
    }

    //Navigate to About Clock Page
    public SpeakerLightBarPowerTestPage navigateToAboutClockPage() {
        ActOn.element(driver, ABOUT_CLOCK).click();
        LOGGER.info("User navigated to about clock page.");
        return new SpeakerLightBarPowerTestPage(driver);
    }

    //Navigate to Camera Test Page
    public DiDoCameraTestPage navigateToCameraTestPage() {
        ActOn.element(driver, CAMERA_TEST).click();
        LOGGER.info("User navigated to Camera Test Page");
        LOGGER.debug("User navigating to Camera page");
        return new DiDoCameraTestPage(driver);

    }

}







//-------------------------------------------------------------------------------------
//public SpeakerLightBarPowerTestPage navigateToConnectivityPage() {
//    ActOn.element(driver, CONNECTIVITY).click();
//    LOGGER.info("User navigated to connectivity page.");
//    //driver.runAppInBackground(Duration.ofMillis(15000));
//    return new SpeakerLightBarPowerTestPage(driver);
//}



//private static Logger LOGGER = LogManager.getLogger(NavigationPageTestMode.class);
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;



