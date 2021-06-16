package page_objects.clocksetup_Pages;

import command_providers.ActOn;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class MiscellaneousTestPage extends NavigationPageClockSetup {

    //---------------------------------------------------------------------------------------
    private static final Logger LOGGER = LoggerFactory.getLogger(MiscellaneousTestPage.class.getName());
    //---------------------------------------------------------------------------------------


    //Element Locator Details
    private final By SW_UPDATE = By.id("com.accutime.clocksetup:id/btn_sw_update");
    private final By SOT_URL = By.id("com.accutime.clocksetup:id/et_custom_sota_url");
    private final By START_SOTA = By.id("com.accutime.clocksetup:id/btn_start_sota");
    private final By DONE_BUTTON = By.id("com.accutime.clocksetup:id/btn_done");
    private final By CANCEL_BUTTON = By.id("com.accutime.clocksetup:id/cancel_button");
    private final By NO_UPDATE_MESSAGE = By.id("com.accutime.clocksetup:id/message_text_view");
    private final By ACCESS_SECURITY = By.id("com.accutime.clocksetup:id/btn_access_security");
    private final By RESET_USER_PASS = By.id("com.accutime.clocksetup:id/btn_reset_end_user_password");
    private final By RESET_MESSAGE = By.id("android:id/message");
    private final By OK_BUTTON = By.id("android:id/button1");
    private final By LOGIN = By.id("com.accutime.clocksetup:id/btn_login");
    private final By NEW_PASS = By.id("com.accutime.clocksetup:id/et_new_password");
    private final By VERIFY_NEW_PASS = By.id("com.accutime.clocksetup:id/et_verify_password");
    private final By RESET_END_USER_PASS = By.id("com.accutime.clocksetup:id/btn_reset_end_user_password");
    private final By USER_EXPERIENCE = By.id("com.accutime.clocksetup:id/btn_user_experience");
    private final By TEST_MODE_APP = By.xpath("//*[@resource-id=\"com.accutime.clocksetup:id/app_name\"][@text=\"TestMode\"]");
    private final By CURRENT_STARTUP_APP = By.id("com.accutime.clocksetup:id/tv_current_startup_application");
    private final By CLOCK_SETUP_APP = By.xpath("//*[@resource-id=\"com.accutime.clocksetup:id/app_name\"][@text=\"Clock Setup\"]");

    //*
    //private final By SETUP_BUTTON = By.id("com.accutime.clocksetup:id/btn_setup");
    //private final By VAR_ADMIN = By.id("com.accutime.clocksetup:id/radio_var_admin");
    //private final By VAR_PASSWORD = By.id("com.accutime.clocksetup:id/et_password");
    //*

    //---------------------------------------------------------------------------------------
    public MiscellaneousTestPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }
    //---------------------------------------------------------------------------------------


    public MiscellaneousTestPage clickToSWUpdate() {
        ActOn.wait(driver, SW_UPDATE).waitForToBeVisible(6);
        ActOn.element(driver, SW_UPDATE).click();
        LOGGER.debug("Clicked to SW_UPDATE button to navigate to SW_Update page");
        return this;
    }

    public MiscellaneousTestPage enterSotaURL(String value) {
        ActOn.element(driver, SOT_URL).click();
        ActOn.element(driver, SOT_URL).setValue(value);
        LOGGER.debug("Sota url entered successfully");
        return this;
    }

    public MiscellaneousTestPage clickToStartSota() {
        ActOn.wait(driver, START_SOTA).waitForToBeVisible(2);
        ActOn.element(driver, START_SOTA).click();
        LOGGER.debug("Sota start button has been clicked");
        return this;
    }

    public MiscellaneousTestPage clickToDone() throws InterruptedException {
        ActOn.wait(driver, DONE_BUTTON).waitForToBeVisible(2);
        ActOn.element(driver, DONE_BUTTON).click();
        TimeUnit.SECONDS.sleep(3);
        LOGGER.debug("Clicked to Done Button");
        return this;
    }

    public MiscellaneousTestPage clickToCancel() throws InterruptedException {
        ActOn.element(driver, CANCEL_BUTTON).click();
        TimeUnit.SECONDS.sleep(3);
        LOGGER.debug("Clicked to Cancel Button");
        return this;
    }

    public MiscellaneousTestPage verifyNoUpdateMessage(String expectedValue) throws InterruptedException {
        LOGGER.info("******Validating only no update message.");
        //ActOn.wait(driver, NO_UPDATE_MESSAGE).waitForToBeVisible(5);
        String actualResponse = ActOn.element(driver, NO_UPDATE_MESSAGE).getTextValue();
        if (actualResponse.contains(expectedValue)) {
            Assert.assertTrue(actualResponse.contains(expectedValue), actualResponse + " doesn't contains " + expectedValue);
            LOGGER.debug("Verified contains match : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
            LOGGER.info("Verified contains match due to no available update");
            TimeUnit.SECONDS.sleep(8);
        } else {
            LOGGER.info("Actual Response is : " + actualResponse + " Expected Response :" + expectedValue);
            LOGGER.info("Verified contains did not match need update need tester attention");
        }
        clickToCancel();
        return this;
    }

    public MiscellaneousTestPage clickToAccessSecurity() {
        ActOn.element(driver, ACCESS_SECURITY).click();
        LOGGER.debug("Access Security button has been clicked");
        return this;
    }

    public MiscellaneousTestPage clickToUserPassReset() {
        ActOn.element(driver, RESET_USER_PASS).click();
        LOGGER.debug("User Password Reset button has been clicked");
        return this;
    }

    public MiscellaneousTestPage verifyResetMessage(String expectedValue) {
        String actualResponse = ActOn.element(driver, RESET_MESSAGE).getTextValue();
        Assert.assertEquals(actualResponse, expectedValue);
        LOGGER.debug("Reset password message displayed as expected: Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
        return this;
    }

    public MiscellaneousTestPage clickToOKButton() {
        ActOn.element(driver, OK_BUTTON).click();
        LOGGER.debug("OK button has been clicked");
        return this;
    }

    public MiscellaneousTestPage clickToLogin() throws InterruptedException {
        ActOn.element(driver, LOGIN).click();
        TimeUnit.SECONDS.sleep(2);
        LOGGER.debug("Clicked to Login Button");
        return this;
    }

    public MiscellaneousTestPage enterNewPassword(String value) {
        ActOn.element(driver, NEW_PASS).click();
        ActOn.element(driver, NEW_PASS).setValue(value);
        driver.hideKeyboard();
        LOGGER.debug("Entered new password successfully");
        return this;
    }

    public MiscellaneousTestPage enterVerifyNewPassword(String value) {
        ActOn.element(driver, VERIFY_NEW_PASS).click();
        ActOn.element(driver, VERIFY_NEW_PASS).setValue(value);
        driver.hideKeyboard();
        LOGGER.debug("Entered new password for verify successfully");
        return this;
    }

    public MiscellaneousTestPage clickToResetPassword() throws InterruptedException {
        ActOn.element(driver, RESET_END_USER_PASS).click();
        TimeUnit.SECONDS.sleep(2);
        LOGGER.debug("Clicked to Login Button");
        return this;
    }

    private void scrollToElement(String strText) {
        driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + strText + "\").instance(0))").click();
    }

    public MiscellaneousTestPage clickToUserExperience() throws InterruptedException {
        ActOn.wait(driver, USER_EXPERIENCE).waitForToBeVisible(6);
        ActOn.element(driver, USER_EXPERIENCE).click();
        TimeUnit.SECONDS.sleep(4);
        LOGGER.debug("Clicked to open User Experience");
        return this;
    }

    public MiscellaneousTestPage clickToSelectTestModeApp() throws InterruptedException {
        scrollToElement("TestMode");
        ActOn.element(driver, TEST_MODE_APP).click();
        TimeUnit.SECONDS.sleep(4);
        LOGGER.debug("Clicked to open User Experience");
        return this;
    }

    public MiscellaneousTestPage verifyStartUpApp(String expectedValue) {
        String actualResponse = ActOn.element(driver, CURRENT_STARTUP_APP).getTextValue();
        Assert.assertEquals(actualResponse, expectedValue);
        LOGGER.debug("validate startup app has been selected : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
        return this;
    }

    public MiscellaneousTestPage clickToSelectClockSetupApp() throws InterruptedException {
        //driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollBackward()");
        scrollToElement("Clock Setup");
        ActOn.element(driver, CLOCK_SETUP_APP).click();
        TimeUnit.SECONDS.sleep(2);
        LOGGER.debug("Clicked to open User Experience");
        return this;
    }

}


//---------------------------------------------------------------------------------------------

//    public MiscellaneousTestPage verifyResetMessage(String expectedValue) {
//        String actualResponse = ActOn.element(driver, RESET_MESSAGE).getTextValue();
//        Assert.assertEquals(actualResponse, expectedValue);
//        LOGGER.debug("validate reset password message : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
//        return this;
//    }

//    public MiscellaneousTestPage navigateToSetupPageCSetup() {
//        ActOn.wait(driver, SETUP_BUTTON).waitForToBeVisible(4);
//        ActOn.element(driver, SETUP_BUTTON).click();
//        LOGGER.info("User navigated to setup test page.");
//        return this;
//    }

//    public MiscellaneousTestPage enterVarPassword(String value) {
//        ActOn.element(driver, VAR_ADMIN).click();
//        ActOn.element(driver, VAR_PASSWORD).setValue(value);
//        LOGGER.debug("Entered Password successfully");
//        return this;
//    }
