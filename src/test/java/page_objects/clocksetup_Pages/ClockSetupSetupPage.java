package page_objects.clocksetup_Pages;

import command_providers.ActOn;
import command_providers.ElementActions;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;


import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class ClockSetupSetupPage extends NavigationPageClockSetup {

    //-----------------------------------------------------------------------------------------------
    private static final Logger LOGGER = LoggerFactory.getLogger(ClockSetupSetupPage.class.getName());
    //-----------------------------------------------------------------------------------------------


    //Element Locator Details
    private final By LOGIN = By.id("com.accutime.clocksetup:id/btn_login");
    private final By ATS_MANU = By.id("com.accutime.clocksetup:id/radio_manufacturing");
    private final By VAR_PASSWORD = By.id("com.accutime.clocksetup:id/et_password");
    private final By PASS_ERROR = By.id("android:id/message");
    private final By OK_ERROR = By.id("android:id/button1");
    private final By VERSION_NUMBER = By.id("com.accutime.clocksetup:id/tv_version_number");
    private final By DONE_BUTTON = By.id("com.accutime.clocksetup:id/btn_done");
    private final By ORDER_NUM = By.id("com.accutime.clocksetup:id/et_order_number");
    private final By MAC_NUM = By.id("com.accutime.clocksetup:id/et_mac_number");
    private final By SERIAL_NUM = By.id("com.accutime.clocksetup:id/et_serial_number");
    private final By LINE_NUM = By.id("com.accutime.clocksetup:id/et_line_number");
    private final By ORDER_QUES = By.id("com.accutime.clocksetup:id/tooltip_order_number");
    private final By OK_QUES = By.id("com.accutime.clocksetup:id/btn_tooltip_ok");
    private final By MAC_QUES = By.id("com.accutime.clocksetup:id/tooltip_mac_number");
    private final By SERIAL_QUES = By.id("com.accutime.clocksetup:id/tooltip_serial_number");
    private final By LINE_QUES = By.id("com.accutime.clocksetup:id/tooltip_line_number");
    //private final By REBOOT = By.id("com.accutime.clocksetup:id/btn_reboot");
    //private final By NO = By.id("android:id/button2");
    //private final By YES = By.id("android:id/button1");
    private final By SETUP_SERVER = By.id("com.accutime.clocksetup:id/btn_setup_server");
    private final By SERVER_URL = By.id("com.accutime.clocksetup:id/et_setup_server_url");
    private final By SERVER_USER_NAME = By.id("com.accutime.clocksetup:id/et_setup_server_username");
    private final By SERVER_PASSWORD = By.id("com.accutime.clocksetup:id/et_setup_server_password");
    private final By PULL_SETUP_PARA = By.id("com.accutime.clocksetup:id/btn_setup_server");


    //---------------------------------------------------------------------------------------
    public ClockSetupSetupPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }
    //---------------------------------------------------------------------------------------


    public ClockSetupSetupPage clickToLogin() throws InterruptedException {
        ActOn.element(driver, LOGIN).click();
        TimeUnit.SECONDS.sleep(6);
        LOGGER.debug("Clicked to Login Button");
        return this;
    }

    public ClockSetupSetupPage enterPassword(String value) {
        ActOn.element(driver, ATS_MANU).click();
        ActOn.element(driver, VAR_PASSWORD).setValue(value);
        LOGGER.debug("Entered Password successfully");
        return this;
    }

    public ClockSetupSetupPage validatePassErrorMessage(String expectedValue) {
        String actualResponse = ActOn.element(driver, PASS_ERROR).getTextValue();
        Assert.assertEquals(actualResponse, expectedValue);
        LOGGER.debug("validate password error : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
        return this;
    }

    public ClockSetupSetupPage clickToOK() {
        ActOn.element(driver, OK_ERROR).click();
        LOGGER.debug("Clicked to OK on login button");
        return this;
    }

    public ClockSetupSetupPage verifyVersionNumber(String expectedValue) {
        String actualResponse = ActOn.element(driver, VERSION_NUMBER).getTextValue();
        Assert.assertEquals(actualResponse, expectedValue);
        LOGGER.debug("validate version number : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
        return this;
    }

    public ClockSetupSetupPage scrollDownAndUp() {
        driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollForward()");
        driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollBackward()");
        LOGGER.debug("Help page scrolled as expected");
        return this;
    }

    public ClockSetupSetupPage clickToDone() {
        ActOn.wait(driver, DONE_BUTTON).waitForToBeVisible(3);
        ActOn.element(driver, DONE_BUTTON).click();
        LOGGER.debug("Clicked to Done Button");
        return this;
    }

    public ClockSetupSetupPage enterOrderNumber(String value) {
        ActOn.element(driver, ORDER_NUM).clear();
        ActOn.element(driver, ORDER_NUM).setValue(value);
        LOGGER.debug("Order Number Entered  successfully");
        return this;
    }

    public ClockSetupSetupPage enterMacNumber(String value) {
        ActOn.element(driver, MAC_NUM).click();
        ActOn.element(driver, MAC_NUM).clear();
        ActOn.element(driver, MAC_NUM).click();
        ActOn.element(driver, MAC_NUM).setValue(value);
        LOGGER.debug("Mac Number Entered successfully");
        return this;
    }

    public ClockSetupSetupPage enterSerialNumber(String value) {
        ActOn.element(driver, SERIAL_NUM).click();
        ActOn.element(driver, SERIAL_NUM).clear();
        ActOn.element(driver, SERIAL_NUM).click();
        ActOn.element(driver, SERIAL_NUM).setValue(value);
        driver.hideKeyboard();
        LOGGER.debug("Serial Number Entered successfully");
        return this;
    }

    public ClockSetupSetupPage enterLineNumber(String value) {
        ActOn.wait(driver, LINE_NUM).waitForToBeVisible(6);
        ActOn.element(driver, LINE_NUM).clear();
        ActOn.element(driver, LINE_NUM).setValue(value);
        LOGGER.debug("Line Number Entered successfully");
        driver.hideKeyboard();
        return this;
    }

    public ClockSetupSetupPage clickQusOrderNum() {
        ActOn.element(driver, ORDER_QUES).click();
        driver.hideKeyboard();
        LOGGER.debug("Clicked to order number question mark");
        return this;
    }

    public ClockSetupSetupPage clickToOKToQues() {
        ActOn.element(driver, OK_QUES).click();
        LOGGER.debug("Clicked to OK on question details");
        return this;
    }

    public ClockSetupSetupPage clickToQusMacNum() {
        ActOn.element(driver, MAC_QUES).click();
        LOGGER.debug("Clicked to MAC number question mark");
        return this;
    }

    public ClockSetupSetupPage clickToQuesSerialNum() {
        ActOn.element(driver, SERIAL_QUES).click();
        LOGGER.debug("Clicked to Serial number question mark");
        return this;
    }


    public ClockSetupSetupPage clickToQuesLineNum() {
        ActOn.element(driver, LINE_QUES).click();
        LOGGER.debug("Clicked to Line number question mark");
        return this;
    }


    public ClockSetupSetupPage clickSetUpServer() {
        ActOn.element(driver, SETUP_SERVER).click();
        LOGGER.debug("Clicked to setup server");
        return this;
    }

    public ClockSetupSetupPage enterServerURL(String value) {
        ActOn.element(driver, SERVER_URL).click();
        ActOn.element(driver, SERVER_URL).clear();
        //ActOn.element(driver, SERVER_URL).click();
        ActOn.element(driver, SERVER_URL).setValue(value);
        LOGGER.debug("ServerURL entered successfully");

        return this;
    }

    public ClockSetupSetupPage enterServerUserName(String value) {
        ActOn.element(driver, SERVER_USER_NAME).click();
        ActOn.element(driver, SERVER_USER_NAME).clear();
        //ActOn.element(driver, SERVER_USER_NAME).click();
        ActOn.element(driver, SERVER_USER_NAME).setValue(value);
        LOGGER.debug("Server user name entered successfully");
        driver.hideKeyboard();
        return this;
    }


    public ClockSetupSetupPage enterServerPassword(String value) {
        ActOn.element(driver, SERVER_PASSWORD).click();
        ActOn.element(driver, SERVER_PASSWORD).clear();
        //ActOn.element(driver, SERVER_PASSWORD).click();
        ActOn.element(driver, SERVER_PASSWORD).setValue(value);
        LOGGER.debug("Server password entered successfully");
        driver.hideKeyboard();
        return this;
    }


    public ClockSetupSetupPage clickToPullSetUpParameter() throws IOException, InterruptedException {
        ActOn.element(driver, PULL_SETUP_PARA).click();
        Thread.sleep(3000);
        ElementActions.takeScreenShot();
        LOGGER.debug("Clicked to setup server");
        return this;
    }


}

//-------------------------------------------------------------------------------

//    public ClockSetupSetupPage enterPassWordVarAdmin(String value) {
//        ActOn.element(driver, ATS_MANU).click();
//        ActOn.element(driver, VAR_PASSWORD).setValue(value);
//        LOGGER.debug("Entered Password successfully");
//        return this;
//    }


//public ClockSetupSetupPage clickToAccept() {
//    ActOn.element(driver, YES).click();
//    LOGGER.debug("Clicked to cancel reboot");
//    return this;
//}

//    public ClockSetupSetupPage clickToReboot() {
//        ActOn.element(driver, REBOOT).click();
//        LOGGER.debug("Clicked to Reboot to restart the device");
//        return this;
//    }

//    public ClockSetupSetupPage clickToCancel() {
//        ActOn.element(driver, NO).click();
//        LOGGER.debug("Clicked to cancel reboot");
//        return this;
//    }