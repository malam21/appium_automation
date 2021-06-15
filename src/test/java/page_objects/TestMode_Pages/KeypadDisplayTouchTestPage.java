package page_objects.TestMode_Pages;

import command_providers.ActOn;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;


public class KeypadDisplayTouchTestPage extends NavigationPageTestMode {


    //------------------------------------------------------------------------------------------------------
    private static final Logger LOGGER = LoggerFactory.getLogger(KeypadDisplayTouchTestPage.class.getName());
    //------------------------------------------------------------------------------------------------------

    //Element Locator Details
    private final By KEY_PAD_MESSAGE = By.id("android:id/message");
    private final By NO_PHYSICAL_DEVICE = By.id("android:id/button2");
    private final By DISPLAY_IMAGE = By.id("com.accutime.testmode:id/btn_display_images");
    private final By DISPLAY_MESSAGE = By.id("com.accutime.testmode:id/btn_display_images");
    private final By PASS_TEST = By.id("com.accutime.testmode:id/btn_pass_test");
    private final By LEFT_CORNER = By.id("com.accutime.testmode:id/btn_tl");
    private final By RIGHT_CORNER = By.id("com.accutime.testmode:id/btn_tr");
    private final By BOTTOM_LEFT_CORNER = By.id("com.accutime.testmode:id/btn_bl");
    private final By BOTTOM_RIGHT_CORNER = By.id("com.accutime.testmode:id/btn_br");
    private final By RECORD_BUTTON = By.id("com.accutime.testmode:id/btn_record_sound");
    private final By PLAY_BUTTON = By.id("com.accutime.testmode:id/btn_play_sound");
    private final By SOUND_MESSAGE = By.xpath("//*[@class=\"android.widget.TextView\" and @index='2']");
    private final By PASS_BUTTON = By.id("com.accutime.testmode:id/btn_pass_test");
    private final By YES_PHYSICAL_DEVICE = By.id("android:id/button1");
    private final By KEYPAD_SCREEN_MESSAGE = By.xpath("//*[@class='android.widget.TextView' and (@index=\"5\")]");


    //private final By KEYPAD_SCREEN_MESSAGE = By.id("//*[@class=\"android.widget.TextView\" and (@text=\"If keypad is available\")]");
    //private final By SOUND_MESSAGE = By.xpath("//*[@class="android.widget.TextView" and @text="If keypad is available"]");
    //private final By PASS_BUTTON = By.id("com.accutime.testmode:id/btn_pass_test");

    //---------------------------------------------------------------------------------------
    public KeypadDisplayTouchTestPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }
    //---------------------------------------------------------------------------------------


    public KeypadDisplayTouchTestPage validateKeypadMessage(String expectedValue) {
        String actualResponse = ActOn.element(driver, KEY_PAD_MESSAGE).getTextValue();
        Assert.assertEquals(actualResponse, expectedValue);
        LOGGER.debug("validate physical Keypad Message : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
        return this;

    }

    public KeypadDisplayTouchTestPage ClickToNoPhysicalKeypad() {
        ActOn.element(driver, NO_PHYSICAL_DEVICE).click();
        LOGGER.debug("Clicked on No Physical Keypad");
        return this;
    }

    public KeypadDisplayTouchTestPage ClickToYesPhysicalKeypad() {
        ActOn.element(driver, YES_PHYSICAL_DEVICE).click();
        LOGGER.debug("Clicked on Yes to Physical Keypad");
        LOGGER.info("User navigating to Keypad page");
        return this;
    }

    public KeypadDisplayTouchTestPage verifyKeypadPageMessage(String expectedValue) throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        ActOn.element(driver, KEYPAD_SCREEN_MESSAGE).click();
        TimeUnit.SECONDS.sleep(2);
        String actualResponse = ActOn.element(driver, KEYPAD_SCREEN_MESSAGE).getTextValue();
        Assert.assertEquals(actualResponse, expectedValue);
        LOGGER.debug("validate Display done Message : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
        LOGGER.info("Press some physical button in the keypad");
        TimeUnit.SECONDS.sleep(6);
        return this;
    }


    public KeypadDisplayTouchTestPage ClickDisplayImage() {
        ActOn.element(driver, DISPLAY_IMAGE).click();
        LOGGER.debug("Clicked to image in the corner of the screen");
        return this;
    }

    public KeypadDisplayTouchTestPage validateDisplayMessage(String expectedValue) {
        String actualResponse = ActOn.element(driver, DISPLAY_MESSAGE).getTextValue();
        Assert.assertEquals(actualResponse, expectedValue);
        LOGGER.debug("validate Display done Message : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
        return this;
    }


    public KeypadDisplayTouchTestPage ClickPassTest() {
        ActOn.element(driver, PASS_TEST).click();
        LOGGER.debug("Clicked on PassTest button");
        LOGGER.info("User navigating to main page");
        return this;
    }

    public KeypadDisplayTouchTestPage ClickLeftCorner() {
        ActOn.wait(driver, LEFT_CORNER).waitForToBeVisible(3);
        ActOn.element(driver, LEFT_CORNER).click();
        LOGGER.debug("Clicked on LeftCorner in the screen");
        return this;
    }

    public KeypadDisplayTouchTestPage ClickRightCorner() {
        ActOn.element(driver, RIGHT_CORNER).click();
        LOGGER.debug("Clicked on RightCorner in the screen");
        return this;
    }

    public KeypadDisplayTouchTestPage ClickBottomLeftCorner() {
        ActOn.element(driver, BOTTOM_LEFT_CORNER).click();
        LOGGER.debug("Clicked on BottomLeftCorner in the screen");
        return this;
    }

    public KeypadDisplayTouchTestPage ClickBottomRightCorner() {
        ActOn.element(driver, BOTTOM_RIGHT_CORNER).click();
        LOGGER.debug("Clicked on BottomRightCorner in the screen");
        return this;
    }

    public KeypadDisplayTouchTestPage validateSoundMessage(String expectedValue) {
        String actualResponse = ActOn.element(driver, SOUND_MESSAGE).getTextValue();
        Assert.assertEquals(actualResponse, expectedValue);
        LOGGER.debug("validate Display sound Message : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
        return this;
    }

    public KeypadDisplayTouchTestPage SoundTestMessageDisplayed() throws InterruptedException {
        TimeUnit.SECONDS.sleep(8);
        ActOn.element(driver, SOUND_MESSAGE).displayed();
        return this;
    }

    public KeypadDisplayTouchTestPage ClickToRecord() throws InterruptedException {
        ActOn.element(driver, RECORD_BUTTON).click();
        LOGGER.debug("Clicked on Record, Recording started please say some word for testing");
        TimeUnit.SECONDS.sleep(6);
        return this;
    }

    public void waitFor(int second) {
        driver.manage().timeouts().implicitlyWait(second, TimeUnit.SECONDS);
    }

    public KeypadDisplayTouchTestPage ClickToStopRecord() {
        ActOn.element(driver, RECORD_BUTTON).click();
        waitFor(5);
        LOGGER.debug("Clicked on Record button");
        return this;
    }

    public KeypadDisplayTouchTestPage ClickToPlay() throws InterruptedException {
        ActOn.element(driver, PLAY_BUTTON).click();
        LOGGER.debug("Clicked on play button, Please listen recorded message");
        TimeUnit.SECONDS.sleep(6);
        return this;
    }

    public KeypadDisplayTouchTestPage ClickToStopPlay() {
        ActOn.element(driver, PLAY_BUTTON).click();
        LOGGER.debug("Clicked on play button");
        return this;
    }

    public KeypadDisplayTouchTestPage ClickToPass() {
        ActOn.element(driver, PASS_BUTTON).click();
        LOGGER.debug("Clicked on PassTest button, Navigated to main page");
        return this;
    }
}


//---------------------------------------------------------------------------------------
//*
//private static final Logger LOGGER = LogManager.getLogger(NavigationPageTestMode.class);
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//*