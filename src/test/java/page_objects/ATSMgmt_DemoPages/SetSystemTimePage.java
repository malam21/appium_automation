package page_objects.ATSMgmt_DemoPages;

import command_providers.ActOn;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

public class SetSystemTimePage extends NavigationPage {

    private static final Logger LOGGER = LoggerFactory.getLogger(SetSystemTimePage.class.getName());
    private final By CURRENT_VAR_PASS = By.id("com.accutime.atsmgmtdemo:id/et_var_password");
    private final By SYS_TIME = By.id("com.accutime.atsmgmtdemo:id/et_system_time");
    private final By TIME_ZONE = By.id("com.accutime.atsmgmtdemo:id/et_time_zone");
    private final By SET_TIME = By.id("com.accutime.atsmgmtdemo:id/btn_set_system_time");
    private final By SET_TIME_ERROR_MESSAGE = By.id("com.accutime.atsmgmtdemo:id/response");
    private final By BACK_BUTTON = By.id("com.accutime.atsmgmtdemo:id/btn_back");


    //------------------------------------------------------------------------
    public SetSystemTimePage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }
    //------------------------------------------------------------------------

    public SetSystemTimePage enterVARPassword(String value) {
        ActOn.element(driver, CURRENT_VAR_PASS).setValue(value);
        LOGGER.debug("Entered Current VAR Password successfully");
        return this;
    }

    public SetSystemTimePage enterSystemTime(String value) {
        ActOn.element(driver, SYS_TIME).setValue(value);
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

    public SetSystemTimePage validateSetTimeErrorMessage(String expectedValue) throws InterruptedException {
        ActOn.wait(driver, SET_TIME_ERROR_MESSAGE);
        Thread.sleep(7000);
        String actualResponse = ActOn.element(driver, SET_TIME_ERROR_MESSAGE).getTextValue();
        Assert.assertEquals(actualResponse, expectedValue);
        LOGGER.debug("validate Set Time Error Message Message : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
        return this;
    }

    public SetSystemTimePage clickBackButton() {
        ActOn.element(driver, BACK_BUTTON).click();
        LOGGER.debug("Clicked on Back Button");
        return this;
    }

}













//--------------------------------------------------
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//private static final Logger LOGGER = LogManager.getLogger(NavigationPage.class);

