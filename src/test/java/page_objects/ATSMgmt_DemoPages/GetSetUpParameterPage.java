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


public class GetSetUpParameterPage extends NavigationPage {



    //--------------------------------------------------------------------------------------------
    private static final Logger LOGGER = LoggerFactory.getLogger(GetSetUpParameterPage.class.getName());
    //--------------------------------------------------------------------------------------------

    //Element Locator
    private final By VAR_PASSWORD = By.id("com.accutime.atsmgmtdemo:id/et_var_password");
    private final By GET_SERIAL_NUM = By.id("com.accutime.atsmgmtdemo:id/btn_get_serial_number");
    private final By SERIAL_NUM_RESPONSE = By.id("com.accutime.atsmgmtdemo:id/response");
    private final By GET_TIME_REGION = By.id("com.accutime.atsmgmtdemo:id/btn_get_time_region");
    private final By TIME_REGION_RESPONSE = By.id("com.accutime.atsmgmtdemo:id/response");
    private final By GET_TIME_LOCATION = By.id("com.accutime.atsmgmtdemo:id/btn_get_time_location");
    private final By TIME_LOCATION_RESPONSE = By.id("com.accutime.atsmgmtdemo:id/response");
    private final By GET_TERMINAL_NAME = By.id("com.accutime.atsmgmtdemo:id/btn_get_terminal_name");
    private final By TERMINAL_NAME_RESPONSE = By.id("com.accutime.atsmgmtdemo:id/response");
    private final By BACK_BUTTON = By.id("com.accutime.atsmgmtdemo:id/btn_back");


    //-------------------------------------------------------------------------------------
    public GetSetUpParameterPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }
    //-------------------------------------------------------------------------------------

    public GetSetUpParameterPage enterPassword(String value) {
        ActOn.element(driver, VAR_PASSWORD).setValue(value);
        LOGGER.debug("Entered Password successfully");
        return this;
    }

    public GetSetUpParameterPage clickGetSerialNumber() {
        ActOn.element(driver, GET_SERIAL_NUM).click();
        LOGGER.debug("Clicked on GetSerialNumber link");
        return this;
    }

    public GetSetUpParameterPage validateSerialNumber(String expectedValue) throws IOException {
        ActOn.wait(driver, SERIAL_NUM_RESPONSE).waitForToBeVisible(5);
        String actualResponse = ActOn.element(driver, SERIAL_NUM_RESPONSE).getTextValue();
        if (actualResponse.equals(expectedValue)) {
            LOGGER.debug("Verified serial number displayed as expected : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
            LOGGER.info("Settings displayed current serial number as expected");
        } else {
            LOGGER.info("Actual Response is not same as expected : " + actualResponse + " Expected Response :" + expectedValue);
            LOGGER.info("Tester need to verify and debug");
            ElementActions.takeScreenShot();
        }
        return this;
    }

    public GetSetUpParameterPage ClickGetTimeRegion() {
        ActOn.element(driver, GET_TIME_REGION).click();
        LOGGER.debug("Clicked on GetTimeRegion Link");
        return this;
    }

    public GetSetUpParameterPage validateRegionalInformation(String expectedValue) {
        String actualResponse = ActOn.element(driver, TIME_REGION_RESPONSE).getTextValue();
        Assert.assertEquals(actualResponse, expectedValue);
        LOGGER.debug("validate Regional Information : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
        return this;
    }

    public GetSetUpParameterPage ClickGetTimeLocation() {
        ActOn.element(driver, GET_TIME_LOCATION).click();
        LOGGER.debug("Clicked on ClickGetTimeLocation Link");
        return this;
    }

    public GetSetUpParameterPage validateTimeLocation(String expectedValue) {
        ActOn.wait(driver, TIME_LOCATION_RESPONSE).waitForToBeVisible(5);
        String actualResponse = ActOn.element(driver, TIME_LOCATION_RESPONSE).getTextValue();
        if (actualResponse.contains(expectedValue)) {
            Assert.assertTrue(actualResponse.contains(expectedValue), actualResponse + " Contains " + expectedValue);
            LOGGER.debug("Verified Time Location settings displayed : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
            LOGGER.info("Settings displayed current time Location settings");
        } else {
            LOGGER.info("Actual Response is : " + actualResponse + " Expected Response :" + expectedValue);
            LOGGER.info("Time Location settings not displayed");
        }
        return this;
    }

    public GetSetUpParameterPage ClickGetTerminalName() {
        ActOn.element(driver, GET_TERMINAL_NAME).click();
        LOGGER.debug("Clicked on ClickGetTerminalName Link");
        return this;
    }

    public GetSetUpParameterPage validateTerminalName(String expectedValue) {
        String actualResponse = ActOn.element(driver, TERMINAL_NAME_RESPONSE).getTextValue();
        Assert.assertEquals(actualResponse, expectedValue);
        LOGGER.debug("validate Terminal Name : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
        return this;
    }

    public GetSetUpParameterPage clickToBackButton() throws InterruptedException {
        ActOn.element(driver, BACK_BUTTON).click();
        LOGGER.debug("Clicked on Back Button");
        TimeUnit.SECONDS.sleep(5);

        return this;
    }


}



//private static final Logger LOGGER = LogManager.getLogger(NavigationPage.class);








