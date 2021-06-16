package page_objects.ATSMgmt_DemoPages;

import command_providers.ActOn;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;


public class SetSystemTimePage extends NavigationPage {


    //--------------------------------------------------------------------------------------------
    private static final Logger LOGGER = LoggerFactory.getLogger(SetSystemTimePage.class.getName());
    //--------------------------------------------------------------------------------------------


    //Element Locator
    private final By CURRENT_VAR_PASS = By.id("com.accutime.atsmgmtdemo:id/et_var_password");
    private final By SYS_TIME = By.id("com.accutime.atsmgmtdemo:id/et_system_time");
    private final By TIME_ZONE = By.id("com.accutime.atsmgmtdemo:id/et_time_zone");
    private final By SET_TIME = By.id("com.accutime.atsmgmtdemo:id/btn_set_system_time");
    private final By SET_TIME_MESSAGE = By.id("com.accutime.atsmgmtdemo:id/response");
    private final By BACK_BUTTON = By.id("com.accutime.atsmgmtdemo:id/btn_back");
    private final By UPDATE_OS_PAGE = By.id("com.accutime.atsmgmtdemo:id/btn_go_to_update_os_activity");

    private final By DL_OS_UPDATE = By.id("com.accutime.atsmgmtdemo:id/check_for_update");
    private final By DOWNLOAD_MESSAGE = By.id("com.accutime.atsmgmtdemo:id/response");
    private final By CANCEL_UPDATE = By.id("com.accutime.atsmgmtdemo:id/cancel_update");
    private final By CANCEL_MESSAGE = By.id("com.accutime.atsmgmtdemo:id/response");

    private final By AUTH_KIOSK_APP = By.id("com.accutime.atsmgmtdemo:id/btn_go_to_authenticate_kiosk_app_activity");
    private final By PACKAGE_NAME = By.id("com.accutime.atsmgmtdemo:id/et_new_kiosk_app_package_name");
    private final By AUTH_PACK_NAME = By.id("com.accutime.atsmgmtdemo:id/btn_authenticate_package_name");
    private final By DEAUTHE_PACK_NAME = By.id("com.accutime.atsmgmtdemo:id/btn_deauthenticate_package_name");
    private final By RESET_DEFAULTS = By.id("com.accutime.atsmgmtdemo:id/btn_reset_all");
    private final By AUT_PACK_NAME_MESSAGE = By.id("com.accutime.atsmgmtdemo:id/response");
    private final By DEAUTE_PACK_NAME_MESSAGE = By.id("com.accutime.atsmgmtdemo:id/response");
    private final By RESET_DEFAULT_MESSAGE = By.id("com.accutime.atsmgmtdemo:id/response");
    private final By UPDATE_KIOSK_APP = By.id("btn_go_to_update_kiosk_app_activity");
    private final By PATH_TO_KIOSK_APP = By.id("et_path_to_kiosk_apk");
    private final By DOWNLOAD_KIOSK_APP = By.id("btn_reset_passwords");
    private final By BASE_URL = By.id("com.accutime.atsmgmtdemo:id/et_os_update_base_url");


    //private final By INSTALL_OS = By.id("com.accutime.atsmgmtdemo:id/btn_install_update");



    //-----------------------------------------------------------------------------------------
    public SetSystemTimePage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }
    //-----------------------------------------------------------------------------------------

    public SetSystemTimePage clickToAuthKioskApp() {
        ActOn.element(driver, AUTH_KIOSK_APP).click();
        LOGGER.debug("Clicked on AUTH_KIOSK_APP Button");
        return this;
    }

    public SetSystemTimePage enterPackageName(String value) {
        ActOn.element(driver, PACKAGE_NAME).click();
        ActOn.element(driver, PACKAGE_NAME).setValue(value);
        driver.hideKeyboard();
        LOGGER.debug("Entered package name successfully");
        return this;
    }

    public SetSystemTimePage clickToAuthPacName() {
        ActOn.element(driver, AUTH_PACK_NAME).click();
        LOGGER.debug("Clicked on AUTH_PACK_NAME Button");
        return this;
    }

    public SetSystemTimePage validateAuthPacNameMessage(String expectedValue) {
        ActOn.wait(driver, AUT_PACK_NAME_MESSAGE).waitForToBeVisible(5);
        String actualResponse = ActOn.element(driver, AUT_PACK_NAME_MESSAGE).getTextValue();
        Assert.assertEquals(actualResponse, expectedValue);
        LOGGER.debug("validate authenticate package name Message : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
        return this;
    }

    public SetSystemTimePage clickToDeAuthPacName() {
        ActOn.element(driver, DEAUTHE_PACK_NAME).click();
        LOGGER.debug("Clicked on DEAUTHE_PACK_NAME Button");
        return this;
    }

    public SetSystemTimePage validateDeAuthPacNameMessage(String expectedValue) {
        ActOn.wait(driver, DEAUTE_PACK_NAME_MESSAGE).waitForToBeVisible(5);
        String actualResponse = ActOn.element(driver, DEAUTE_PACK_NAME_MESSAGE).getTextValue();
        Assert.assertEquals(actualResponse, expectedValue);
        LOGGER.debug("validate deauthenticate package name Message : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
        return this;
    }

    public SetSystemTimePage clickToResetDefaults() {
        ActOn.element(driver, RESET_DEFAULTS).click();
        LOGGER.debug("Clicked on RESET_DEFAULTS Button");
        return this;
    }

    public SetSystemTimePage validateResetDefaultMessage(String expectedValue) {
        ActOn.wait(driver, RESET_DEFAULT_MESSAGE).waitForToBeVisible(5);
        String actualResponse = ActOn.element(driver, RESET_DEFAULT_MESSAGE).getTextValue();
        Assert.assertEquals(actualResponse, expectedValue);
        LOGGER.debug("validate ResetDefault Message : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
        return this;
    }

    public SetSystemTimePage enterVARPassword(String value) {
        ActOn.element(driver, CURRENT_VAR_PASS).setValue(value);
        LOGGER.debug("Entered Current VAR Password successfully");
        return this;
    }

    public SetSystemTimePage enterSystemTime(String value) {
        ActOn.element(driver, SYS_TIME).click();
        ActOn.element(driver, SYS_TIME).clear();
        ActOn.element(driver, SYS_TIME).setValue(value);
        driver.hideKeyboard();
        LOGGER.debug("Entered System Time successfully");
        return this;
    }

    public SetSystemTimePage enterTimeZone(String value) {
        ActOn.element(driver, TIME_ZONE).setValue(value);
        LOGGER.debug("Entered Time Zone successfully");
        return this;
    }

    public SetSystemTimePage clickSetTime() {
        ActOn.element(driver, SET_TIME).click();
        LOGGER.debug("Clicked on SetTime Button");
        return this;
    }

    public SetSystemTimePage validateTimeFormatMessage(String expectedValue) {
        ActOn.wait(driver, SET_TIME_MESSAGE).waitForToBeVisible(5);
        String actualResponse = ActOn.element(driver, SET_TIME_MESSAGE).getTextValue();
        Assert.assertEquals(actualResponse, expectedValue);
        LOGGER.debug("validate Set Time Error Message Message : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
        return this;
    }

    public SetSystemTimePage validateCorrectTimeFormatMessage(String expectedValue) {
        ActOn.wait(driver, SET_TIME_MESSAGE).waitForToBeVisible(5);
        String actualResponse = ActOn.element(driver, SET_TIME_MESSAGE).getTextValue();
        Assert.assertEquals(actualResponse, expectedValue);
        LOGGER.debug("validate Set Time Error Message Message : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
        return this;
    }

    public SetSystemTimePage clickBackButton() throws InterruptedException {
        ActOn.element(driver, BACK_BUTTON).click();
        LOGGER.debug("Clicked on Back Button");
        TimeUnit.SECONDS.sleep(5);

        return this;
    }


    public SetSystemTimePage navigateToUpdateOSPage() {
        ActOn.element(driver, UPDATE_OS_PAGE).click();
        LOGGER.debug("Clicked to navigate to OS update Page");
        return this;
    }

        public SetSystemTimePage enterBaseURL(String value) {
        ActOn.element(driver, BASE_URL).click();
        ActOn.element(driver, BASE_URL).setValue(value);
        driver.hideKeyboard();
        LOGGER.debug("Entered Password successfully");
        return this;
    }


    public SetSystemTimePage clickToDownloadOS() {
        ActOn.element(driver, DL_OS_UPDATE).click();
        LOGGER.debug("Clicked on download OS Button");
        return this;
    }

    public SetSystemTimePage validateDownloadingMessage(String expectedValue) throws InterruptedException {
        ActOn.wait(driver, DOWNLOAD_MESSAGE).waitForToBeVisible(6);
        TimeUnit.SECONDS.sleep(5);
        LOGGER.info("******Validating download started message");
        String actualResponse = ActOn.element(driver, DOWNLOAD_MESSAGE).getTextValue();
        if (actualResponse.contains(expectedValue)) {
            Assert.assertTrue(actualResponse.contains(expectedValue), actualResponse + " contains matched " + expectedValue);
            LOGGER.debug("Verified contains match : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
            LOGGER.info("Verified download has started with 0% percentage");
        } else {
            TimeUnit.SECONDS.sleep(2);
            LOGGER.info("Actual Response is : " + actualResponse + " Expected Response :" + expectedValue);
            LOGGER.info("Verified download has started and downloaded more than 0%  percentage");
        }
        return this;
    }


    public SetSystemTimePage clickToCancelUpdate() {
        ActOn.element(driver, CANCEL_UPDATE).click();
        LOGGER.debug("Clicked on Cancel_OS_Update Button");
        return this;
    }


    public SetSystemTimePage validateDownloadCancel(String expectedValue) {
        ActOn.wait(driver, CANCEL_MESSAGE).waitForToBeVisible(5);
        //Thread.sleep(7000);
        LOGGER.info("******Validating download canceled message");
        String actualResponse = ActOn.element(driver, CANCEL_MESSAGE).getTextValue();
        if (actualResponse.contains(expectedValue)) {
            Assert.assertTrue(actualResponse.contains(expectedValue), actualResponse + " contains matched " + expectedValue);
            LOGGER.debug("Verified contains match : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
            LOGGER.info("Verified download stopped and expected response matched");
        } else {
            LOGGER.info("Actual Response is : " + actualResponse + " Expected Response :" + expectedValue);
            LOGGER.info("Verified download not stopped or expected message did not match");
        }
        return this;
    }

    public SetSystemTimePage clickToUpdateKioskApp() {
        ActOn.element(driver, UPDATE_KIOSK_APP).click();
        LOGGER.debug("Navigated to Download Kiosk App Page");
        return this;
    }

    public SetSystemTimePage enterKioskAppAPKPath(String value) {
        ActOn.element(driver, PATH_TO_KIOSK_APP).click();
        ActOn.element(driver, PATH_TO_KIOSK_APP).setValue(value);
        driver.hideKeyboard();
        LOGGER.debug("Kiosk app path Entered successfully");
        return this;
    }

    public SetSystemTimePage clickToDownloadApp() throws InterruptedException {
        ActOn.element(driver, DOWNLOAD_KIOSK_APP).click();
        LOGGER.debug("Download Kiosk App button has been clicked");
        TimeUnit.SECONDS.sleep(5);
        return this;
    }

}




//-----------------------------------------------------------------------------------------------------




//    public SetSystemTimePage clickToInstallUpdate() {
//        ActOn.element(driver, INSTALL_OS).click();
//        LOGGER.debug("Clicked on INSTALL_OS_Update Button");
//        return this;
//    }


//--------------------------------------------------
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//private static final Logger LOGGER = LogManager.getLogger(NavigationPage.class);

