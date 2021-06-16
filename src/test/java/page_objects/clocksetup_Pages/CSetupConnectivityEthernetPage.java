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

public class CSetupConnectivityEthernetPage extends NavigationPageClockSetup {


    //----------------------------------------------------------------------------------------------------------
    private static final Logger LOGGER = LoggerFactory.getLogger(CSetupConnectivityEthernetPage.class.getName());
    //----------------------------------------------------------------------------------------------------------

    //Element Locator Details
    private final By ETHERNET = By.id("com.accutime.clocksetup:id/btn_ethernet");
    private final By DHCP_CHECK = By.id("com.accutime.clocksetup:id/cb_dhcp");
    private final By FIXED_IP = By.id("com.accutime.clocksetup:id/et_fixed_ip");
    private final By SUBNET_MASK = By.id("com.accutime.clocksetup:id/et_subnet_mask");
    private final By DNS_ONE = By.id("com.accutime.clocksetup:id/et_dns_server");
    private final By DNS_TWO = By.id("com.accutime.clocksetup:id/et_dns_server2");
    private final By DNS_THREE = By.id("com.accutime.clocksetup:id/et_dns_server3");
    private final By GATEWAY = By.id("com.accutime.clocksetup:id/et_gateway");
    private final By QUES_IP = By.id("com.accutime.clocksetup:id/tooltip_fixed_ip");
    private final By QUES_SUBNET = By.id("com.accutime.clocksetup:id/tooltip_subnet_mask");
    //private final By QUES_DNS_SERVER_ONE = By.id("com.accutime.clocksetup:id/tooltip_dns_server");
    private final By QUES_DNS_SERVER_TWO = By.id("com.accutime.clocksetup:id/tooltip_dns_server2");
    //private final By QUES_DNS_SERVER_THREE = By.id("com.accutime.clocksetup:id/tooltip_dns_server3");
    private final By OK_QUES = By.id("com.accutime.clocksetup:id/btn_tooltip_ok");
    private final By DONE_BUTTON = By.id("com.accutime.clocksetup:id/btn_done");
    //private final By QUES_GATEWAY = By.id("com.accutime.clocksetup:id/tooltip_gateway");
    private final By RESTART_MESSAGE = By.id("android:id/message");
    private final By OK_BUTTON = By.id("android:id/button1");


    //---------------------------------------------------------------------------------------
    public CSetupConnectivityEthernetPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }
    //---------------------------------------------------------------------------------------


    public CSetupConnectivityEthernetPage clickToEthernet() {
        ActOn.element(driver, ETHERNET).click();
        LOGGER.debug("Clicked to Login Button");
        return this;
    }

    public CSetupConnectivityEthernetPage clickToDHCPCheckBox() {
        ActOn.element(driver, DHCP_CHECK).click();
        LOGGER.debug("Clicked to Login Button");
        return this;
    }

    public CSetupConnectivityEthernetPage enterFixedIp(String value) {
        ActOn.element(driver, FIXED_IP).clear();
        ActOn.element(driver, FIXED_IP).setValue(value);
        driver.hideKeyboard();
        LOGGER.debug("FIXED_IP address entered successfully");
        return this;
    }

    public CSetupConnectivityEthernetPage enterSubnetMask(String value) {
        ActOn.element(driver, SUBNET_MASK).clear();
        ActOn.element(driver, SUBNET_MASK).setValue(value);
        driver.hideKeyboard();
        LOGGER.debug("SUBNET_MASK address entered successfully");
        return this;
    }

    public CSetupConnectivityEthernetPage enterDNSOne(String value) {
        ActOn.element(driver, DNS_ONE).clear();
        ActOn.element(driver, DNS_ONE).setValue(value);
        driver.hideKeyboard();
        LOGGER.debug("DNS_ONE address entered successfully");
        return this;
    }

    public CSetupConnectivityEthernetPage enterDNSTwo(String value) {
        ActOn.element(driver, DNS_TWO).clear();
        ActOn.element(driver, DNS_TWO).setValue(value);
        driver.hideKeyboard();
        LOGGER.debug("DNS_TWO address entered successfully");
        return this;
    }

    public CSetupConnectivityEthernetPage enterDNSThree(String value) {
        ActOn.element(driver, DNS_THREE).clear();
        ActOn.element(driver, DNS_THREE).setValue(value);
        driver.hideKeyboard();
        LOGGER.debug("DNS_THREE address entered successfully");
        return this;
    }

    public CSetupConnectivityEthernetPage enterGateway(String value) {
        ActOn.element(driver, GATEWAY).clear();
        ActOn.element(driver, GATEWAY).click();
        ActOn.element(driver, GATEWAY).setValue(value);
        driver.hideKeyboard();
        LOGGER.debug("Gateway address entered successfully");
        return this;
    }

    public CSetupConnectivityEthernetPage clickToIpQues() {
        ActOn.element(driver, QUES_IP).click();
        LOGGER.debug("Clicked to open IP question details");
        return this;
    }

    public CSetupConnectivityEthernetPage clickToSubnetQues() {
        ActOn.element(driver, QUES_SUBNET).click();
        LOGGER.debug("Clicked to open subnet question details");
        return this;
    }

    public CSetupConnectivityEthernetPage clickToDnsTwoQues() {
        ActOn.element(driver, QUES_DNS_SERVER_TWO).click();
        LOGGER.debug("Clicked to open subnet question details");
        return this;
    }

    public CSetupConnectivityEthernetPage clickToOKToQues() {
        ActOn.element(driver, OK_QUES).click();
        LOGGER.debug("Clicked to OK on question details");
        return this;
    }

    public CSetupConnectivityEthernetPage clickToDone() throws InterruptedException {
        ActOn.element(driver, DONE_BUTTON).click();
        LOGGER.debug("Clicked to Done Button");
        TimeUnit.SECONDS.sleep(3);
        return this;
    }


    public CSetupConnectivityEthernetPage clickToOK() throws InterruptedException {
        ActOn.element(driver, OK_BUTTON).click();
        LOGGER.debug("Clicked to OK Button");
        TimeUnit.SECONDS.sleep(3);
        return this;
    }

        public CSetupConnectivityEthernetPage verifyRestartMessage(String expectedValue) throws IOException {
        String actualResponse = ActOn.element(driver, RESTART_MESSAGE).getTextValue();
        Assert.assertEquals(actualResponse, expectedValue);
        LOGGER.debug("validate restart message : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
        ElementActions.takeScreenShot();
        return this;
    }


}




//------------------------------------------------------------------------------------

//    public CSetupConnectivityEthernetPage verifyRestartMessage(String expectedValue) {
//        String actualResponse = ActOn.element(driver, RESTART_MESSAGE).getTextValue();
//        Assert.assertEquals(actualResponse, expectedValue);
//        LOGGER.debug("validate restart message : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
//        return this;
//    }

//    public CSetupConnectivityEthernetPage verifyRestartdjdjMessage(String expectedValue) {
//        String actualResponse = ActOn.element(driver, RESTART_MESSAGE).getTextValue();
//        Assert.assertEquals(actualResponse, expectedValue);
//        LOGGER.debug("validate version number : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
//        return this;
//    }

//}
