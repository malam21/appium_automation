package page_objects.clocksetup_Pages;

import command_providers.ActOn;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;


public class CSetupWifiConnectivityPage extends NavigationPageClockSetup {

    private static final Logger LOGGER = LoggerFactory.getLogger(CSetupWifiConnectivityPage.class.getName());

    //Element Locator Details
    private final By SSID = By.id("com.accutime.clocksetup:id/et_ssid");
    private final By WIFI = By.id("com.accutime.clocksetup:id/btn_wifi");
    private final By WIFI_ENABLE = By.id("com.accutime.clocksetup:id/cb_enable_wifi");
    private final By WIFI_PASS = By.id("com.accutime.clocksetup:id/et_encryption_key");
    private final By HIDE_KEY = By.id("com.accutime.clocksetup:id/cb_hide_encryption_key");
    private final By DONE_BUTTON = By.id("com.accutime.clocksetup:id/btn_done");
    private final By OK_BUTTON = By.id("android:id/button1");
    private final By WiFI_MESSAGE = By.id("android:id/message");
    private final By DHCP_CHECK = By.id("com.accutime.clocksetup:id/cb_enable_wifi_dhcp");
    private final By FIXED_IP = By.id("com.accutime.clocksetup:id/et_wifi_fixed_ip");
    private final By SUBNET_MASK = By.id("com.accutime.clocksetup:id/et_wifi_subnet_mask");
    private final By DNS_ONE = By.id("com.accutime.clocksetup:id/et_wifi_dns_server");
    private final By GATEWAY = By.id("com.accutime.clocksetup:id/et_wifi_gateway");
    private final By QUES_IP = By.id("com.accutime.clocksetup:id/tooltip_wifi_fixed_ip");
    private final By QUES_SUBNET = By.id("com.accutime.clocksetup:id/tooltip_wifi_subnet_mask");
    private final By QUES_DNS_SERVER_TWO = By.id("com.accutime.clocksetup:id/tooltip_wifi_dns_server2");
    private final By OK_QUES = By.id("com.accutime.clocksetup:id/btn_tooltip_ok");


    //private final By QUES_GATEWAY = By.id("com.accutime.clocksetup:id/tooltip_wifi_gateway");
    //private final By RESTART_MESSAGE = By.id("android:id/message");
    //private final By CANCEL = By.id("com.accutime.clocksetup:id/btn_cancel");
    //private final By DNS_TWO = By.id("com.accutime.clocksetup:id/et_wifi_dns_server2");
    //private final By DNS_THREE = By.id("com.accutime.clocksetup:id/et_wifi_dns_server3");
    //private final By QUES_DNS_SERVER_ONE = By.id("com.accutime.clocksetup:id/tooltip_wifi_dns_server");
    //private final By QUES_DNS_SERVER_THREE = By.id("com.accutime.clocksetup:id/tooltip_wifi_dns_server3");
    //---------------------------------------------------------------------------------------
    public CSetupWifiConnectivityPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }
    //---------------------------------------------------------------------------------------


    public CSetupWifiConnectivityPage clickToWifi() {
        ActOn.wait(driver, WIFI).waitForToBeVisible(10);
        ActOn.element(driver, WIFI).click();
        LOGGER.debug("Clicked to WIFI button");
        return this;
    }

    public CSetupWifiConnectivityPage clickToWifiEnable() {
        WebElement checkbox = driver.findElement(By.id("com.accutime.clocksetup:id/cb_enable_wifi"));
        if ((checkbox.getAttribute("checked").equals("true"))) {
            LOGGER.info("WIFI enabled, checkbox already selected");
        } else {
            LOGGER.info("WIFI not enabled checkbox now selected");
            ActOn.element(driver, WIFI_ENABLE).click();
        }
        return this;
    }

    public CSetupWifiConnectivityPage enterSSID(String value) {
        ActOn.wait(driver, SSID).waitForToBeVisible(7);
        ActOn.element(driver, SSID).clear();
        ActOn.element(driver, SSID).setValue(value);
        LOGGER.debug("SSID information entered successfully");
        return this;
    }

    public CSetupWifiConnectivityPage enterWIFIPassword(String value) {
        ActOn.element(driver, WIFI_PASS).clear();
        ActOn.element(driver, WIFI_PASS).setValue(value);
        //driver.hideKeyboard();
        LOGGER.debug("WIFI password entered successfully");
        return this;
    }

    public CSetupWifiConnectivityPage clickToHidePass() {
        ActOn.wait(driver, HIDE_KEY).waitForToBeVisible(4);
        ActOn.element(driver, HIDE_KEY).click();
        LOGGER.debug("Clicked to Hide key button");
        return this;
    }

    public CSetupWifiConnectivityPage clickToDone() throws InterruptedException {
        ActOn.wait(driver, DONE_BUTTON).waitForToBeVisible(4);
        ActOn.element(driver, DONE_BUTTON).click();
        LOGGER.debug("Clicked to Done Button");
        TimeUnit.SECONDS.sleep(3);
        return this;
    }

    public CSetupWifiConnectivityPage clickToOK() {
        if (driver.findElement(By.id("android:id/button1")).isDisplayed()){
            ActOn.element(driver, OK_BUTTON).click();
            LOGGER.info("Ok button not displayed");
        } else {
            LOGGER.info("Clicked on Ok button");
        }
        return this;
    }

    public CSetupWifiConnectivityPage verifyNearestObject(String expectedValue) throws InterruptedException {
        LOGGER.info("******Validating if device is network connected wifi connection not working ");
        //ActOn.wait(driver, NEAREST_OBJECT).waitForToBeVisible(5);
        ActOn.wait(driver, WiFI_MESSAGE).waitForToBeVisible(50);
        String actualResponse = ActOn.element(driver, WiFI_MESSAGE).getTextValue();
        if (actualResponse.equals(expectedValue)) {
            Assert.assertTrue(true, actualResponse + " contains match" + expectedValue);
            //Assert.assertTrue(actualResponse.contains(expectedValue), actualResponse + " contains match" + expectedValue);
            LOGGER.debug("Verified that device is not configured for wifi settings : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
            TimeUnit.SECONDS.sleep(2);
        } else {
            LOGGER.info("Actual Response is : " + actualResponse + " Expected Response :" + expectedValue);
            LOGGER.info("Verified wifi connection setup is not working");
            TimeUnit.SECONDS.sleep(3);
        }
        clickToOK();
        return this;
    }

    public CSetupWifiConnectivityPage clickToDHCPCheckBox() {
        ActOn.element(driver, DHCP_CHECK).click();
        LOGGER.debug("Clicked to Login Button");
        return this;
    }

    public CSetupWifiConnectivityPage enterFixedIp(String value) {
        ActOn.element(driver, FIXED_IP).clear();
        ActOn.element(driver, FIXED_IP).setValue(value);
        driver.hideKeyboard();
        LOGGER.debug("FIXED_IP number entered successfully");
        return this;
    }

    public CSetupWifiConnectivityPage enterSubnetMask(String value) {
        ActOn.element(driver, SUBNET_MASK).clear();
        ActOn.element(driver, SUBNET_MASK).setValue(value);
        driver.hideKeyboard();
        LOGGER.debug("Subnet Mask number entered successfully");
        return this;
    }

    public CSetupWifiConnectivityPage enterDNSOne(String value) {
        driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollBackward()");
        ActOn.element(driver, DNS_ONE).clear();
        ActOn.element(driver, DNS_ONE).setValue(value);
        driver.hideKeyboard();
        LOGGER.debug("DNS_ONE number entered successfully");
        return this;
    }

    public CSetupWifiConnectivityPage enterGateway(String value) {
        driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollForward()");
        ActOn.element(driver, GATEWAY).clear();
        //wait(2000);
        ActOn.element(driver, GATEWAY).setValue(value);
        driver.hideKeyboard();
        LOGGER.debug("Gateway number entered successfully");
        return this;
    }

    public CSetupWifiConnectivityPage clickToIpQues() {
        ActOn.element(driver, QUES_IP).click();
        LOGGER.debug("Clicked to open IP question details");
        return this;
    }

    public CSetupWifiConnectivityPage clickToSubnetQues() {
        ActOn.element(driver, QUES_SUBNET).click();
        LOGGER.debug("Clicked to open subnet question details");
        return this;
    }

    public CSetupWifiConnectivityPage clickToDnsTwoQues() {
        ActOn.element(driver, QUES_DNS_SERVER_TWO).click();
        LOGGER.debug("Clicked to open subnet question details");
        return this;
    }

    public CSetupWifiConnectivityPage clickToOKToQues() {
        ActOn.element(driver, OK_QUES).click();
        LOGGER.debug("Clicked to OK on question details");
        return this;
    }

}



//-------------------------------------------------------------------------------
//public CSetupWifiConnectivityPage clickToCancel() {
//    ActOn.wait(driver, CANCEL).waitForToBeVisible(15);
//    ActOn.element(driver, CANCEL).click();
//    LOGGER.debug("Clicked to cancel Button");
//    return this;
//}


//    public CSetupWifiConnectivityPage verifyHardwareMessage(String expectedValue) {
//        String actualResponse = ActOn.element(driver, RESTART_MESSAGE).getTextValue();
//        Assert.assertEquals(actualResponse, expectedValue);
//        LOGGER.debug("validate version number : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
//        return this;
//    }

//    public CSetupWifiConnectivityPage enterDNSThree(String value) {
//        //wait(2000);
//        ActOn.element(driver, DNS_THREE).clear();
//        ActOn.element(driver, DNS_THREE).setValue(value);
//        driver.hideKeyboard();
//        LOGGER.debug("DNS_TWO number entered successfully");
//        return this;
//    }


//    public CSetupWifiConnectivityPage verifyRestartMessage(String expectedValue) {
//        String actualResponse = ActOn.element(driver, RESTART_MESSAGE).getTextValue();
//        Assert.assertEquals(actualResponse, expectedValue);
//        LOGGER.debug("validate version number : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
//        return this;
//    }


//    public CSetupWifiConnectivityPage verifyWifiConnection(String expectedValue) throws InterruptedException {
//        LOGGER.info("******Validating if available network is present or not ");
//        //ActOn.wait(driver, NEAREST_OBJECT).waitForToBeVisible(5);
//        ActOn.wait(driver, WiFI_MESSAGE).waitForToBeVisible(50);
//        String actualResponse = ActOn.element(driver, WiFI_MESSAGE).getTextValue();
//        if (actualResponse.equals(expectedValue)) {
//            Assert.assertTrue(actualResponse.contains(expectedValue), actualResponse + " contains matched " + expectedValue);
//            LOGGER.debug("Verified wifi connection not available : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
//            TimeUnit.SECONDS.sleep(4);
//            clickToOK();
//        } else {
//            Assert.assertTrue(actualResponse.contains(expectedValue), actualResponse + " doesn't contains " + expectedValue);
//            LOGGER.debug("Verified wifi connection available : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
//            TimeUnit.SECONDS.sleep(4);
//            clickToOK();
//            LOGGER.info("Verified wifi connection is available");
//        }
//        return this;
//    }

//    public CSetupWifiConnectivityPage clickToWifiEnable() {
//            WebElement checkbox = driver.findElement(By.id("com.accutime.clocksetup:id/cb_enable_wifi"));
//        if  (checkbox.isEnabled() == true){
//            LOGGER.info("Wifi enabled checkbox already selected");
//        } else{
//            LOGGER.info("Wifi not enabled, checkbox now selected");
//            ActOn.element(driver, WIFI_ENABLE).click();
//        }
//        return this;
//    }


//    public CSetupWifiConnectivityPage enterDNSTwo(String value) {
//        ActOn.element(driver, DNS_TWO).clear();
//        ActOn.element(driver, DNS_TWO).setValue(value);
//        driver.hideKeyboard();
//        LOGGER.debug("DNS_TWO number entered successfully");
//        return this;
//    }


//    public CSetupWifiConnectivityPage clickToWifiEnable() {
//        //ActOn.wait(driver, WIFI_ENABLE).waitForToBeVisible(5);
//        ActOn.element(driver, WIFI_ENABLE).click();
//        LOGGER.debug("Clicked to WIFI enable/disable button");
//        return this;
//    }