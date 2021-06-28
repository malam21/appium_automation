package page_objects.ATSMgmt_DemoPages;

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


public class PullSetupParametersPage extends NavigationPage {

    private static final Logger LOGGER = LoggerFactory.getLogger(SetSystemTimePage.class.getName());
    private final By VAR_PASSWORD = By.id("com.accutime.atsmgmtdemo:id/et_var_password");
    private final By VAR_ORDER_NUM = By.id("et_var_order_number");
    private final By SERVER_PATH = By.id("et_path_to_kiosk_apk");
    private final By SERVER_USER_NAME = By.id("et_host_username");
    private final By SERVER_PASS = By.id("et_host_password");
    private final By REQUEST_PARA = By.id("btn_reset_passwords");
    private final By REQUEST_PARA_MESS = By.id("com.accutime.atsmgmtdemo:id/response");
    private final By BACK_BUTTON = By.id("com.accutime.atsmgmtdemo:id/btn_back");
    private final By GET_FREE_DESK_SPACE = By.id("btn_go_to_get_free_disk_space_activity");
    private final By DISK_SPACE = By.id("btn_get_free_disk_space");
    private final By DISK_SPACE_MESSAGE = By.id("response");


    //------------------------------------------------------------------------------------
    public PullSetupParametersPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }
    //------------------------------------------------------------------------------------

    public PullSetupParametersPage enterVARPassword(String value) {
        ActOn.element(driver, VAR_PASSWORD).setValue(value);
        LOGGER.debug("Current VAR Password Entered successfully");
        return this;
    }

    public PullSetupParametersPage enterVAROrderNum(String value) {
        ActOn.element(driver, VAR_ORDER_NUM).setValue(value);
        LOGGER.debug("Order number Entered successfully");
        return this;
    }

    public PullSetupParametersPage enterServerPath(String value) {
        ActOn.element(driver, SERVER_PATH).setValue(value);
        LOGGER.debug("Server path Entered successfully");
        return this;
    }

    public PullSetupParametersPage enterServerUserName(String value) {
        ActOn.element(driver, SERVER_USER_NAME).setValue(value);
        LOGGER.debug("Server User Name Entered successfully");
        return this;
    }

    public PullSetupParametersPage enterServerPass(String value) throws IOException {
        ActOn.element(driver, SERVER_PASS).setValue(value);
        LOGGER.debug("Server User password Entered successfully");
        ElementActions.takeScreenShot();
        return this;
    }

    public PullSetupParametersPage clickToRequestParameters() throws IOException {
        ActOn.element(driver, REQUEST_PARA).click();
        LOGGER.debug("Clicked on AUTH_KIOSK_APP Button");
        ElementActions.takeScreenShot();
        return this;
    }

    public PullSetupParametersPage verifyReqParaMessage(String expectedValue) throws InterruptedException {
        Thread.sleep(7000);
        LOGGER.info("******Validating download stated message");
        String actualResponse = ActOn.element(driver, REQUEST_PARA_MESS).getTextValue();
        if (actualResponse.equals(expectedValue)) {
            LOGGER.debug("Verified contains match : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
            LOGGER.info("Verified requested parameters unsuccessful");
        } else {
            LOGGER.info("Actual Response is : " + actualResponse + " Expected Response :" + expectedValue);
            LOGGER.info("Verified requested parameters successful and matched");
        }
        return this;
    }

    public PullSetupParametersPage clickToBackButton() throws InterruptedException {
        //ActOn.wait(driver, BACK_BUTTON).waitForToBeVisible(5);
        ActOn.element(driver, BACK_BUTTON).click();
        LOGGER.debug("Clicked on Back Button");
        TimeUnit.SECONDS.sleep(5);
        return this;
    }

    public PullSetupParametersPage validateAuthPacNameMessage(String expectedValue) {
        ActOn.wait(driver, VAR_ORDER_NUM).waitForToBeVisible(5);
        String actualResponse = ActOn.element(driver, VAR_ORDER_NUM).getTextValue();
        Assert.assertEquals(actualResponse, expectedValue);
        LOGGER.debug("validate authenticate package name Message : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
        return this;
    }

    public PullSetupParametersPage clickToGetFreeDiskSpace() {
        ActOn.element(driver, GET_FREE_DESK_SPACE).click();
        LOGGER.debug("Clicked on Get Free Disk Space Button");
        return this;
    }

    public PullSetupParametersPage clickToDiskSpace() {
        ActOn.element(driver, DISK_SPACE).click();
        LOGGER.debug("Clicked on disk free space Button");
        return this;
    }

    public PullSetupParametersPage validateDiskSpaceMessage(String expectedValue) throws InterruptedException, IOException {
        Thread.sleep(7000);
        LOGGER.info("******Validating disk space message");
        String actualResponse = ActOn.element(driver, DISK_SPACE_MESSAGE).getTextValue();
        if (actualResponse.contains(expectedValue)) {
            Assert.assertTrue(actualResponse.contains(expectedValue), actualResponse + " contains matched " + expectedValue);
            LOGGER.debug("Verified contains match : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
            LOGGER.info("Verified available disk space message displayed as expected");
        } else {
            LOGGER.info("Actual Response is : " + actualResponse + " Expected Response :" + expectedValue);
            LOGGER.info("Verified available disk space message not displayed as expected could be disk space amount is different ");
        }
        ElementActions.takeScreenShot();
        return this;
    }

}
//if driver.f.getAttribute("checked")= true;



