package page_objects.clocksetup_Pages;

import command_providers.ActOn;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;


public class CSetupTerminalPage extends NavigationPageClockSetup {


    //----------------------------------------------------------------------------------------------
    private static final Logger LOGGER = LoggerFactory.getLogger(CSetupTerminalPage.class.getName());
    //----------------------------------------------------------------------------------------------


    //Element Locator Details
    private final By DONE_BUTTON = By.id("com.accutime.clocksetup:id/btn_done");
    private final By TERMINAL_NAME = By.id("com.accutime.clocksetup:id/et_terminal_name");
    private final By TERMINAL_TYPE = By.id("com.accutime.clocksetup:id/sp_terminal_type");
    private final By TERMINAL_MAME_QUES = By.id("com.accutime.clocksetup:id/tooltip_terminal_name");
    private final By OK_QUES = By.id("com.accutime.clocksetup:id/btn_tooltip_ok");
    private final By GEMAN_LANGUAGE = By.id("com.accutime.clocksetup:id/radio_language_french");
    private final By FRENCH_LANGUAGE = By.id("com.accutime.clocksetup:id/radio_language_german");
    private final By ENGLISH_LANGUAGE = By.id("com.accutime.clocksetup:id/radio_language_english");
    private final By READERS = By.id("com.accutime.clocksetup:id/btn_readers");
    private final By FINGER_READER = By.id("com.accutime.clocksetup:id/sp_fingerprint_reader");
    private final By MAX_FINGER_PRINT = By.id("com.accutime.clocksetup:id/sp_fingerprint_max_enroll");
    private final By GLOBAL_SERIES = By.id("com.accutime.clocksetup:id/sp_fpr_compatibility_mode");
    private final By INTERNAL_READER = By.id("com.accutime.clocksetup:id/sp_prox_reader_internal");
    private final By BAR_SCANNER = By.id("com.accutime.clocksetup:id/sp_barcode_scanner");
    private final By EXTERNAL_READER = By.id("com.accutime.clocksetup:id/cb_prox_reader_external");
    private final By MAGNE_READER = By.id("com.accutime.clocksetup:id/cb_mag_reader");
    private final By PERIPHERALS = By.id("com.accutime.clocksetup:id/btn_peripherals");
    private final By KEYPAD_ENABLE = By.id("com.accutime.clocksetup:id/cb_enable_keypad");
    private final By DIDO_ENABLE = By.id("com.accutime.clocksetup:id/cb_enable_dido");
    private final By KEYPAD_QUES = By.id("com.accutime.clocksetup:id/tooltip_keypad");
    private final By DIDO_QUES = By.id("com.accutime.clocksetup:id/tooltip_dido");
    private final By LOGGING_BUTTON = By.id("com.accutime.clocksetup:id/btn_logging");
    private final By LOG_TO_HOST = By.id("com.accutime.clocksetup:id/radio_log_server");
    private final By FILE_SIZE = By.id("com.accutime.clocksetup:id/et_file_size");
    private final By TIME_INTERVAL = By.id("com.accutime.clocksetup:id/et_time_interval");
    private final By FILE_SIZE_QUES = By.id("com.accutime.clocksetup:id/tooltip_file_size");
    private final By TIME_INTERVAL_QUES = By.id("com.accutime.clocksetup:id/tooltip_time_interval");
    private final By LOGGING_DISABLE = By.id("com.accutime.clocksetup:id/radio_disable_logging");
    private final By LOG_TO_DEVICE = By.id("com.accutime.clocksetup:id/radio_log_to_device");
    private final By SCREEN_SIZE = By.id("com.accutime.clocksetup:id/btn_screen_settings");
    private final By TRIGGER_DISTANCE = By.id("com.accutime.clocksetup:id/et_tof_trigger_distance");
    private final By TIMEOUT = By.id("com.accutime.clocksetup:id/et_tof_timeout");
    private final By TRIG_DIS_QUES = By.id("com.accutime.clocksetup:id/tooltip_tof_trigger_distance");
    private final By TIMEOUT_QUES = By.id("com.accutime.clocksetup:id/tooltip_tof_timeout");
    private final By OK_BUTTON = By.id("android:id/button1");
    //private final By CANCEL_BUTTON = By.id("com.accutime.clocksetup:id/cancel_button");


    //---------------------------------------------------------------------------------------
    public CSetupTerminalPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }
    //---------------------------------------------------------------------------------------

    public CSetupTerminalPage enterTerminalName(String value) {
        ActOn.element(driver, TERMINAL_NAME).click();
        ActOn.element(driver, TERMINAL_NAME).clear();
        ActOn.element(driver, TERMINAL_NAME).setValue(value);
        LOGGER.debug("Terminal name entered successfully");
        return this;
    }

    private void scrollToElement(String strText) {
        driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + strText + "\").instance(0))").click();
    }

    public CSetupTerminalPage enterTerminalType() {
        ActOn.wait(driver, TERMINAL_TYPE).waitForToBeVisible(8);
        ActOn.element(driver, TERMINAL_TYPE).click();
        scrollToElement("stride");
        //TimeUnit.SECONDS.wait(3000);
        LOGGER.debug("Terminal type has been selected");
        return this;
    }

    public CSetupTerminalPage clickToTerminalNameQues() {
        ActOn.wait(driver, TERMINAL_MAME_QUES).waitForToBeVisible(2);
        ActOn.element(driver, TERMINAL_MAME_QUES).click();
        LOGGER.debug("Clicked to TERMINAL_MAME_QUES");
        return this;
    }

    public CSetupTerminalPage clickToOKQues() {
        ActOn.wait(driver, OK_QUES).waitForToBeVisible(2);
        ActOn.element(driver, OK_QUES).click();
        LOGGER.debug("Clicked to OK Button");
        return this;
    }

    public CSetupTerminalPage selectGermanLanguage() {
        ActOn.wait(driver, GEMAN_LANGUAGE).waitForToBeVisible(2);
        ActOn.element(driver, GEMAN_LANGUAGE).click();
        LOGGER.debug("German language has been selected");
        return this;
    }

    public CSetupTerminalPage selectFrenchLanguage() {
        ActOn.wait(driver, FRENCH_LANGUAGE).waitForToBeVisible(2);
        ActOn.element(driver, FRENCH_LANGUAGE).click();
        LOGGER.debug("French language has been selected");
        return this;
    }

    public CSetupTerminalPage selectEnglishLanguage() {
        ActOn.wait(driver, ENGLISH_LANGUAGE).waitForToBeVisible(2);
        ActOn.element(driver, ENGLISH_LANGUAGE).click();
        LOGGER.debug("English language has been selected");
        return this;
    }

    public CSetupTerminalPage clickToReadersButton() {
        ActOn.wait(driver, READERS).waitForToBeVisible(2);
        ActOn.element(driver, READERS).click();
        LOGGER.debug("Clicked to Readers button to navigate to readers page");
        return this;
    }

    public CSetupTerminalPage clickToDone() throws InterruptedException {
        ActOn.wait(driver, DONE_BUTTON).waitForToBeVisible(2);
        ActOn.element(driver, DONE_BUTTON).click();
        TimeUnit.SECONDS.sleep(3);
        LOGGER.debug("Clicked to Done Button");
        return this;
    }

    public CSetupTerminalPage selectFingerReader() {
        ActOn.wait(driver, FINGER_READER).waitForToBeVisible(6);
        ActOn.element(driver, FINGER_READER).click();
        scrollToElement("Lumidigm");
        LOGGER.debug("Finger print reader has been selected");
        return this;
    }

    public CSetupTerminalPage selectMaxFingerEnroll() {
        ActOn.wait(driver, MAX_FINGER_PRINT).waitForToBeVisible(6);
        ActOn.element(driver, MAX_FINGER_PRINT).click();
        scrollToElement("1");
        LOGGER.debug("Max fingerprint enroll has been selected");
        return this;
    }


    public CSetupTerminalPage selectGlobalSeries() {
        ActOn.wait(driver, GLOBAL_SERIES).waitForToBeVisible(6);
        ActOn.element(driver, GLOBAL_SERIES).click();
        scrollToElement("Global Series UCS Format");
        LOGGER.debug("Global series has been selected");
        return this;
    }

    public CSetupTerminalPage selectProximityReader() {
        ActOn.wait(driver, INTERNAL_READER).waitForToBeVisible(6);
        ActOn.element(driver, INTERNAL_READER).click();
        scrollToElement("HID Prox");
        LOGGER.debug("Proximity reader has been selected");
        return this;
    }

    public CSetupTerminalPage selectBarcodeScanner() {
        ActOn.wait(driver, BAR_SCANNER).waitForToBeVisible(6);
        ActOn.element(driver, BAR_SCANNER).click();
        scrollToElement("None");
        LOGGER.debug("Barcode scanner has been selected");
        return this;
    }


    public CSetupTerminalPage clickToExternalProximity() {
        ActOn.wait(driver, EXTERNAL_READER).waitForToBeVisible(4);
        ActOn.element(driver, EXTERNAL_READER).click();
        LOGGER.debug("External proximity reader checkbox has been clicked");
        return this;
    }

    public CSetupTerminalPage clickToMagneticReader() {
        ActOn.wait(driver, MAGNE_READER).waitForToBeVisible(4);
        ActOn.element(driver, MAGNE_READER).click();
        LOGGER.debug("Magnetic reader checkbox has been clicked");
        return this;
    }

    public CSetupTerminalPage clickToPeripherals() {
        ActOn.wait(driver, PERIPHERALS).waitForToBeVisible(17);
        ActOn.element(driver, PERIPHERALS).click();
        LOGGER.debug("Peripherals button has been clicked");
        return this;
    }


    public CSetupTerminalPage clickToEnableKeypad() {
        ActOn.wait(driver, KEYPAD_ENABLE).waitForToBeVisible(5);
        ActOn.element(driver, KEYPAD_ENABLE).click();
        LOGGER.debug("Enable Keypad checkbox has been clicked");
        return this;
    }

    public CSetupTerminalPage clickToEnableDido() {
        ActOn.wait(driver, DIDO_ENABLE).waitForToBeVisible(5);
        ActOn.element(driver, DIDO_ENABLE).click();
        LOGGER.debug("Enable Dido checkbox has been clicked");
        return this;
    }


    public CSetupTerminalPage clickToKeypadQues() {
        ActOn.wait(driver, KEYPAD_QUES).waitForToBeVisible(5);
        ActOn.element(driver, KEYPAD_QUES).click();
        LOGGER.debug("Keypad Question Mark has been clicked");
        return this;
    }

    public CSetupTerminalPage clickToDidoQues() {
        ActOn.wait(driver, DIDO_QUES).waitForToBeVisible(5);
        ActOn.element(driver, DIDO_QUES).click();
        LOGGER.debug("Dido Question Mark has been clicked");
        return this;
    }

    public CSetupTerminalPage clickToLoggingButton() {
        ActOn.wait(driver, LOGGING_BUTTON).waitForToBeVisible(5);
        ActOn.element(driver, LOGGING_BUTTON).click();
        LOGGER.debug("Logging button has been clicked");
        return this;
    }

    public CSetupTerminalPage selectLogToHost() {
        ActOn.wait(driver, LOG_TO_HOST).waitForToBeVisible(5);
        ActOn.element(driver, LOG_TO_HOST).click();
        LOGGER.debug("Log to host button has been clicked");
        return this;
    }

    public CSetupTerminalPage enterFileSize(String value) {
        ActOn.element(driver, FILE_SIZE).click();
        ActOn.element(driver, FILE_SIZE).clear();
        ActOn.element(driver, FILE_SIZE).setValue(value);
        LOGGER.debug("File size entered successfully");
        return this;
    }

    public CSetupTerminalPage enterTimeInterval(String value) {
        ActOn.element(driver, TIME_INTERVAL).click();
        ActOn.element(driver, TIME_INTERVAL).clear();
        ActOn.element(driver, TIME_INTERVAL).setValue(value);
        LOGGER.debug("Time interval minutes entered successfully");
        return this;
    }

    public CSetupTerminalPage clickToFileSizeQues() {
        ActOn.wait(driver, FILE_SIZE_QUES).waitForToBeVisible(5);
        ActOn.element(driver, FILE_SIZE_QUES).click();
        LOGGER.debug("File size Question Mark has been clicked");
        return this;
    }

    public CSetupTerminalPage clickToTimeIntQues() {
        ActOn.wait(driver, TIME_INTERVAL_QUES).waitForToBeVisible(5);
        ActOn.element(driver, TIME_INTERVAL_QUES).click();
        LOGGER.debug("Time interval Question Mark has been clicked");
        return this;
    }

    public CSetupTerminalPage selectDisable() {
        ActOn.wait(driver, LOGGING_DISABLE).waitForToBeVisible(5);
        ActOn.element(driver, LOGGING_DISABLE).click();
        LOGGER.debug("Log to Disable button has been clicked");
        return this;
    }

    public CSetupTerminalPage selectLogToDevice() {
        ActOn.wait(driver, LOG_TO_DEVICE).waitForToBeVisible(5);
        ActOn.element(driver, LOG_TO_DEVICE).click();
        LOGGER.debug("Log to host button has been clicked");
        return this;
    }

    public CSetupTerminalPage clickToScreenSize() {
        ActOn.wait(driver, SCREEN_SIZE).waitForToBeVisible(5);
        ActOn.element(driver, SCREEN_SIZE).click();
        LOGGER.debug("Screen size button has been clicked");
        return this;
    }

    public CSetupTerminalPage enterTriggerDistance(String value) {
        ActOn.element(driver, TRIGGER_DISTANCE).click();
        ActOn.element(driver, TRIGGER_DISTANCE).clear();
        ActOn.element(driver, TRIGGER_DISTANCE).setValue(value);
        LOGGER.debug("Trigger distance mm has been entered successfully");
        return this;
    }

    public CSetupTerminalPage enterTimeOut(String value) {
        ActOn.element(driver, TIMEOUT).click();
        ActOn.element(driver, TIMEOUT).clear();
        ActOn.element(driver, TIMEOUT).setValue(value);
        LOGGER.debug("Timeout ss has been entered successfully");
        return this;
    }

    public CSetupTerminalPage clickToTriggerQues() {
        ActOn.wait(driver, TRIG_DIS_QUES).waitForToBeVisible(5);
        ActOn.element(driver, TRIG_DIS_QUES).click();
        LOGGER.debug("Time interval Question Mark has been clicked");
        return this;
    }

    public CSetupTerminalPage clickToTimeoutQues() {
        ActOn.wait(driver, TIMEOUT_QUES).waitForToBeVisible(5);
        ActOn.element(driver, TIMEOUT_QUES).click();
        LOGGER.debug("TimeOUT Question Mark has been clicked");
        return this;
    }

    public CSetupTerminalPage clickToButton() throws InterruptedException {
        ActOn.element(driver, OK_BUTTON).click();
        LOGGER.debug("Clicked on OK Button");
        TimeUnit.SECONDS.sleep(4);
        return this;
    }


}

//-----------------------------------------------------------------
//public CSetupTerminalPage clickToOkButton() {
//    if (driver.findElement(By.id("android:id/button1")).isDisplayed()) {
//        ActOn.element(driver, OK_BUTTON).click();
//        //clickToOK();
//    } else {
//        LOGGER.info("Verified ok button not displayed ");
//    }
//    return this;
//}
//
//    public CSetupTerminalPage clickToCancel() {
//        ActOn.element(driver, CANCEL_BUTTON).click();
//        LOGGER.debug("Clicked to Cancel Button");
//        return this;
//    }


//    public CSetupTerminalPage clickToOK() {
//        ActOn.wait(driver, OK_BUTTON).waitForToBeVisible(10);
//        ActOn.element(driver, OK_BUTTON).click();
//        LOGGER.debug("Clicked to OK Button");
//        return this;
//    }
//private final By FILE_SIZE_QUES = By.id("com.accutime.clocksetup:id/tooltip_file_size");
//private final By TIME_INTERVAL_QUES = By.id("com.accutime.clocksetup:id/tooltip_time_interval");
//private final By TEST_MODE_APP = By.xpath("//*[@resource-id=\"com.accutime.clocksetup:id/app_name\"][@text=\"TestMode\"]");
//private final By CURRENT_STARTUP_APP = By.id("com.accutime.clocksetup:id/tv_current_startup_application");
