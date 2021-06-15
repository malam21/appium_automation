package page_objects.TestMode_Pages;

import command_providers.ActOn;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.concurrent.TimeUnit;

public class DiDoCameraTestPage extends NavigationPageTestMode {

    private static final Logger LOGGER = LoggerFactory.getLogger(DiDoCameraTestPage.class.getName());

    //Element Locator Details
    private final By CHANNEL_ONE = By.id("com.accutime.testmode:id/cb_relay_1");
    private final By CHANNEL_TWO = By.id("com.accutime.testmode:id/cb_relay_2");
    private final By SET_OUTPUT = By.id("com.accutime.testmode:id/btn_dido_command_out");
    private final By READ_OUTPUT = By.id("com.accutime.testmode:id/btn_dido_read_out");
    private final By READ_INPUT = By.id("com.accutime.testmode:id/btn_dido_read_in");
    private final By PASS_TEST = By.id("com.accutime.testmode:id/btn_pass_test");

    private final By CAPTURE_BUTTON = By.id("com.accutime.testmode:id/btn_capture");
    private final By CAM_TEST_SCR_MSG = By.id("tv_camera_message");
    private final By DIDO = By.id("com.accutime.testmode:id/btn_dido_fragment");
    private final By FAIL_TEST = By.id("com.accutime.testmode:id/btn_fail_test");

    //*
    //private final By SOUND_MESSAGE = By.xpath("//*[@class=\"android.widget.TextView\" and @index='2']");;
    //private final By KEYPAD_SCREEN_MESSAGE = By.xpath("//*[@class='android.widget.TextView' and (@index=\"5\")]");
    //private final By KEYPAD_SCREEN_MESSAGE = By.id("//*[@class=\"android.widget.TextView\" and (@text=\"If keypad is available\")]");
    //private final By CAMERA_TEST = By.id("com.accutime.testmode:id/btn_camera_test");
    //private final By KEY_PAD_MESSAGE = By.id("android:id/message");
    //*


    //---------------------------------------------------------------------------------------
    public DiDoCameraTestPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }
    //---------------------------------------------------------------------------------------


    public DiDoCameraTestPage clickToChannelOneChkBox() {
        ActOn.element(driver, CHANNEL_ONE).click();
        LOGGER.debug("Clicked To channel one checkbox");
        return this;
    }

    public DiDoCameraTestPage ClickToSetOutput() {
        ActOn.element(driver, SET_OUTPUT).click();
        LOGGER.debug("Clicked on Set Outputs");
        LOGGER.info("Set Output has been clicked");
        return this;
    }

    public DiDoCameraTestPage ClickToReadInputs() {
        ActOn.element(driver, READ_INPUT).click();
        LOGGER.debug("Clicked on Set Read Input");
        LOGGER.info("Read Input has been clicked");
        return this;
    }

    public DiDoCameraTestPage ClickToReadOutputs() {
        ActOn.element(driver, READ_OUTPUT).click();
        LOGGER.debug("Clicked on Set Read Output");
        LOGGER.info("Read Output has been clicked");
        return this;
    }

    public DiDoCameraTestPage clickToChannelTwoChkBox() {
        ActOn.element(driver, CHANNEL_TWO).click();
        LOGGER.debug("Clicked To channel two checkbox");
        return this;
    }

    public DiDoCameraTestPage clickToPassTest() {
        ActOn.element(driver, PASS_TEST).click();
        LOGGER.debug("Clicked To Pass Test");
        return this;
    }

    public DiDoCameraTestPage clickToFailTest() {
        ActOn.element(driver, FAIL_TEST).click();
        LOGGER.debug("Clicked To Fail Test");
        return this;
    }

    public DiDoCameraTestPage navigateToDiDoPage() {
        ActOn.element(driver, DIDO).click();
        LOGGER.info("User navigated to DIDO page.");
        LOGGER.debug("User navigating to DIDO page");
        return this;
    }

    public DiDoCameraTestPage validateCamPageMessage(String expectedValue) throws InterruptedException {
        LOGGER.info("******Validating camera screen message.");
        //ActOn.wait(driver, NEAREST_OBJECT).waitForToBeVisible(5);
        String actualResponse = ActOn.element(driver, CAM_TEST_SCR_MSG).getTextValue();
        if (actualResponse.equals(expectedValue)) {
            LOGGER.debug("Verified camera hardware attached : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
            LOGGER.info("Verified camera hardware attached and camera test is possible for this device");
            TimeUnit.SECONDS.sleep(5);
            clickToCapture();
            TimeUnit.SECONDS.sleep(5);
            clickToPassTest();

        } else {
            LOGGER.info("Verified that camera hardware not attached : " + actualResponse + " Expected Response :" + expectedValue);
            LOGGER.info("Verified that camera hardware not attached and camera test is not possible for this device");
            clickToFailTest();

        }
        return this;
    }


    public DiDoCameraTestPage clickToCapture() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        ActOn.element(driver, CAPTURE_BUTTON).click();
        LOGGER.debug("Clicked To Capture Button");
        LOGGER.info("User able to take the picture");
        LOGGER.info("Tester verified picture has been taken and capture button get disabled");
        TimeUnit.SECONDS.sleep(3);
        return this;
    }


}


//-------------------------------------------------------------------------------------------------
//public DiDoCameraTestPage clickToCameraTest() {
//    ActOn.element(driver, CAMERA_TEST).click();
//    LOGGER.debug("Clicked To Camera Test Button");
//    LOGGER.info("User navigated to Camera test page");
//    return this;
//}


//    public DiDoCameraTestPage verifyCaptureButtonEnabled() throws InterruptedException {
//        TimeUnit.SECONDS.sleep(3);
//        ActOn.element(driver, CAPTURE_BUTTON).isEnabled();
//        TimeUnit.SECONDS.sleep(3);
//        LOGGER.debug("Capture button is enabled");
//        LOGGER.info("Capture button is enabled and further image capture is possible");
//        return this;
//    }

//    public DiDoCameraTestPage verifyCaptureButtonDisabled() throws InterruptedException {
//        TimeUnit.SECONDS.sleep(3);
//        ActOn.element(driver, CAPTURE_BUTTON).isEnabled();
//        TimeUnit.SECONDS.sleep(3);
//        LOGGER.debug("Capture button is disabled");
//        LOGGER.info("Capture button is disabled and further image capture is not possible");
//        return this;
//    }


//    public DiDoCameraTestPage validateKeypadMessage(String expectedValue) {
//        String actualResponse = ActOn.element(driver, KEY_PAD_MESSAGE).getTextValue();
//        Assert.assertEquals(actualResponse, expectedValue);
//        LOGGER.debug("validate physical Keypad Message : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
//        return this;
//    }
