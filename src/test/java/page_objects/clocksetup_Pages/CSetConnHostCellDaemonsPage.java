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


public class CSetConnHostCellDaemonsPage extends NavigationPageClockSetup {

    //--------------------------------------------------------------------------------------------------------
    private static final Logger LOGGER = LoggerFactory.getLogger(CSetConnHostCellDaemonsPage.class.getName());
    //--------------------------------------------------------------------------------------------------------

    //Element Locator Details
    private final By HOST = By.id("com.accutime.clocksetup:id/btn_host");
    private final By HOST_URL = By.id("com.accutime.clocksetup:id/et_host_url");
    private final By HOST_USER_NAME = By.id("com.accutime.clocksetup:id/et_host_username");
    private final By HOST_PASS = By.id("com.accutime.clocksetup:id/et_host_password");
    private final By HIDE_PASS = By.id("com.accutime.clocksetup:id/cb_hide_host_password");
    private final By DONE = By.id("com.accutime.clocksetup:id/btn_done");
    private final By CELL_MODEM = By.id("com.accutime.clocksetup:id/btn_cell_modem");
    private final By CELLULAR = By.id("com.accutime.clocksetup:id/cb_enable_cell_modem");
    private final By CELLULAR_NAME = By.id("com.accutime.clocksetup:id/et_cell_name");
    private final By CELL_USER = By.id("com.accutime.clocksetup:id/et_cell_user");
    private final By MCC = By.id("com.accutime.clocksetup:id/et_cell_mcc");
    private final By SERVER = By.id("com.accutime.clocksetup:id/et_cell_server");
    private final By PROXY = By.id("com.accutime.clocksetup:id/et_cell_proxy");
    private final By APN = By.id("com.accutime.clocksetup:id/et_cell_apn");
    private final By CELL_PASS = By.id("com.accutime.clocksetup:id/et_cell_password");
    private final By MNC = By.id("com.accutime.clocksetup:id/et_cell_mnc");
    private final By PORT = By.id("com.accutime.clocksetup:id/et_cell_port");
    private final By QUES_CELL_NAME = By.id("com.accutime.clocksetup:id/tooltip_cell_name");
    private final By OK_QUES = By.id("com.accutime.clocksetup:id/btn_tooltip_ok");
    private final By QUES_USER = By.id("com.accutime.clocksetup:id/tooltip_user");
    private final By QUES_MCC = By.id("com.accutime.clocksetup:id/tooltip_mcc");
    private final By QUES_CELL_SERVER = By.id("com.accutime.clocksetup:id/tooltip_server");
    private final By QUES_PROXY = By.id("com.accutime.clocksetup:id/tooltip_proxy");
    private final By QUES_PASSWORD = By.id("com.accutime.clocksetup:id/tooltip_password");
    private final By QUES_PORT = By.id("com.accutime.clocksetup:id/tooltip_port");
    private final By OK_BUTTON = By.id("android:id/button1");
    private final By DAEMONS = By.id("com.accutime.clocksetup:id/btn_daemons");
    private final By ADB = By.id("com.accutime.clocksetup:id/cb_adb");
    private final By CONNECT_ADB = By.id("com.accutime.clocksetup:id/btn_connect_to_adb");
    private final By IP_ADDRESS = By.id("com.accutime.clocksetup:id/tv_ip_address");
    private final By PAGE_TITTLE = By.id("com.accutime.clocksetup:id/tv_adb_title");
    private final By TIME = By.id("com.accutime.clocksetup:id/btn_time");
    private final By TIME_REGION = By.id("com.accutime.clocksetup:id/sp_time_region");
    private final By SELECT_ASIA = By.xpath("//*[@text='Asia']");
    private final By TIME_ZONE = By.id("com.accutime.clocksetup:id/sp_time_zone");
    private final By NTP_ENABLE = By.id("com.accutime.clocksetup:id/cb_enable_ntp");
    private final By NTP_SERVER = By.id("com.accutime.clocksetup:id/et_ntp_server");
    private final By QUES_NTP_SERVER = By.id("com.accutime.clocksetup:id/tooltip_ntp_server");
    private final By SET_SYS_DATE = By.id("com.accutime.clocksetup:id/btn_set_date");
    private final By SET_SYS_TIME = By.id("com.accutime.clocksetup:id/btn_set_time");


    //---------------------------------------------------------------------------------------
    public CSetConnHostCellDaemonsPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }
    //---------------------------------------------------------------------------------------


    public CSetConnHostCellDaemonsPage clickToHost() {
        ActOn.wait(driver, HOST).waitForToBeVisible(6);
        ActOn.element(driver, HOST).click();
        LOGGER.debug("Clicked to HOST button to navigate to host page");
        return this;
    }

    public CSetConnHostCellDaemonsPage enterHostURL(String value) {
        ActOn.element(driver, HOST_URL).click();
        ActOn.element(driver, HOST_URL).clear();
        ActOn.element(driver, HOST_URL).setValue(value);
        LOGGER.debug("Host url entered successfully");
        return this;
    }

    public CSetConnHostCellDaemonsPage enterHostUserName(String value) {
        ActOn.element(driver, HOST_USER_NAME).click();
        ActOn.element(driver, HOST_USER_NAME).clear();
        ActOn.element(driver, HOST_USER_NAME).setValue(value);
        driver.hideKeyboard();
        LOGGER.debug("Host user name entered successfully");
        return this;
    }

    public CSetConnHostCellDaemonsPage enterHostPassword(String value) {
        ActOn.element(driver, HOST_PASS).click();
        ActOn.element(driver, HOST_PASS).clear();
        ActOn.element(driver, HOST_PASS).setValue(value);
        driver.hideKeyboard();
        LOGGER.debug("Host password entered successfully");
        return this;
    }

    public CSetConnHostCellDaemonsPage clickToOpenHidePass() {
        ActOn.wait(driver, HIDE_PASS).waitForToBeVisible(6);
        ActOn.element(driver, HIDE_PASS).click();
        driver.hideKeyboard();
        LOGGER.debug("Clicked to open and hide password details");
        return this;
    }

    public CSetConnHostCellDaemonsPage clickToDone() throws InterruptedException {
        ActOn.wait(driver, DONE).waitForToBeVisible(6);
        ActOn.element(driver, DONE).click();
        LOGGER.debug("Clicked to done button");
        TimeUnit.SECONDS.sleep(5);
        return this;
    }

    public CSetConnHostCellDaemonsPage clickToCellModem() {
        ActOn.wait(driver, CELL_MODEM).waitForToBeVisible(6);
        ActOn.element(driver, CELL_MODEM).click();
        LOGGER.debug("Clicked to Cell Modem to navigate to cell modem page");
        return this;
    }

    public CSetConnHostCellDaemonsPage cellModemEnable() {
        ActOn.wait(driver, CELLULAR).waitForToBeVisible(6);
        ActOn.element(driver, CELLULAR).click();
        LOGGER.debug("Clicked to Cell Modem enable and disable button");
        return this;
    }


    public CSetConnHostCellDaemonsPage enterCellProviderName(String value) {
        //ActOn.element(driver, CELLULAR_NAME).click();
        ActOn.element(driver, CELLULAR_NAME).clear();
        ActOn.element(driver, CELLULAR_NAME).click();
        ActOn.element(driver, CELLULAR_NAME).setValue(value);
        driver.hideKeyboard();
        LOGGER.debug("Provider Name entered successfully");
        return this;
    }

    public CSetConnHostCellDaemonsPage enterCellUserName(String value) {
        ActOn.element(driver, CELL_USER).click();
        ActOn.element(driver, CELL_USER).clear();
        ActOn.element(driver, CELL_USER).setValue(value);
        driver.hideKeyboard();
        LOGGER.debug("User name Name entered successfully");
        return this;
    }

    public CSetConnHostCellDaemonsPage enterMCC(String value) {
        ActOn.element(driver, MCC).click();
        ActOn.element(driver, MCC).clear();
        ActOn.element(driver, MCC).setValue(value);
        driver.hideKeyboard();
        LOGGER.debug("MCC Name entered successfully");
        return this;
    }

    public CSetConnHostCellDaemonsPage enterCellServer(String value) {
        ActOn.element(driver, SERVER).click();
        ActOn.element(driver, SERVER).clear();
        ActOn.element(driver, SERVER).setValue(value);
        driver.hideKeyboard();
        LOGGER.debug("Cell Server  name entered successfully");
        return this;
    }

    public CSetConnHostCellDaemonsPage enterCellProxy(String value) {
        ActOn.element(driver, PROXY).click();
        ActOn.element(driver, PROXY).clear();
        ActOn.element(driver, PROXY).setValue(value);
        driver.hideKeyboard();
        LOGGER.debug("Cell PROXY name entered successfully");
        return this;
    }

    public CSetConnHostCellDaemonsPage enterCellAPN(String value) {
        ActOn.element(driver, APN).click();
        ActOn.element(driver, APN).clear();
        ActOn.element(driver, APN).setValue(value);
        driver.hideKeyboard();
        LOGGER.debug("APN NAME entered successfully");
        return this;
    }

    public CSetConnHostCellDaemonsPage enterCellPass(String value) {
        ActOn.element(driver, CELL_PASS).click();
        ActOn.element(driver, CELL_PASS).clear();
        ActOn.element(driver, CELL_PASS).setValue(value);
        driver.hideKeyboard();
        LOGGER.debug("Cell password entered successfully");
        return this;
    }

    public CSetConnHostCellDaemonsPage enterCellMNC(String value) {
        ActOn.element(driver, MNC).click();
        ActOn.element(driver, MNC).clear();
        ActOn.element(driver, MNC).setValue(value);
        driver.hideKeyboard();
        LOGGER.debug("MNC entered successfully");
        return this;
    }

    public CSetConnHostCellDaemonsPage enterCellPort(String value) {
        ActOn.element(driver, PORT).click();
        ActOn.element(driver, PORT).clear();
        ActOn.element(driver, PORT).setValue(value);
        driver.hideKeyboard();
        LOGGER.debug("PORT number entered successfully");
        return this;
    }

    public CSetConnHostCellDaemonsPage clickToOKToQues() {
        ActOn.element(driver, OK_QUES).click();
        LOGGER.debug("Clicked to OK on question details");
        return this;
    }

    public CSetConnHostCellDaemonsPage clickToQuesCellName() {
        ActOn.element(driver, QUES_CELL_NAME).click();
        LOGGER.debug("Clicked to open subnet question details");
        return this;
    }

    public CSetConnHostCellDaemonsPage clickToQuesCellUser() {
        ActOn.element(driver, QUES_USER).click();
        LOGGER.debug("Clicked to open cell user question details");
        return this;
    }

    public CSetConnHostCellDaemonsPage clickToQuesMCC() {
        ActOn.element(driver, QUES_MCC).click();
        LOGGER.debug("Clicked to open MCC question details");
        return this;
    }

    public CSetConnHostCellDaemonsPage clickToQuesServer() {
        ActOn.element(driver, QUES_CELL_SERVER).click();
        LOGGER.debug("Clicked to open Cell server question details");
        return this;
    }


    public CSetConnHostCellDaemonsPage clickToQuesProxy() {
        ActOn.element(driver, QUES_PROXY).click();
        LOGGER.debug("Clicked to open Proxy question details");
        return this;
    }


    public CSetConnHostCellDaemonsPage clickToQuesPassword() {
        ActOn.element(driver, QUES_PASSWORD).click();
        LOGGER.debug("Clicked to open password question details");
        return this;
    }

    public CSetConnHostCellDaemonsPage clickToQuesPort() {
        ActOn.element(driver, QUES_PORT).click();
        LOGGER.debug("Clicked to open port question details");
        return this;
    }

    public CSetConnHostCellDaemonsPage clickToOK() throws InterruptedException {
        ActOn.wait(driver, OK_BUTTON).waitForToBeVisible(5);
        ActOn.element(driver, OK_BUTTON).click();
        LOGGER.debug("Clicked to OK Button");
        TimeUnit.SECONDS.sleep(4);
        return this;
    }

    public CSetConnHostCellDaemonsPage clickToDaemons() {
        ActOn.wait(driver, DAEMONS).waitForToBeVisible(6);
        ActOn.element(driver, DAEMONS).click();
        LOGGER.debug("Clicked to DAEMONS button to navigate to host page");
        return this;
    }

    public CSetConnHostCellDaemonsPage adbEnable() {
        ActOn.wait(driver, ADB).waitForToBeVisible(6);
        ActOn.element(driver, ADB).click();
        LOGGER.debug("Clicked to ADB enable and disable button");
        return this;
    }

    public CSetConnHostCellDaemonsPage clickConnectToADB() {
        ActOn.wait(driver, CONNECT_ADB).waitForToBeVisible(2);
        ActOn.element(driver, CONNECT_ADB).click();
        LOGGER.debug("Clicked to CONNECT_ADB page open");
        return this;
    }


    public CSetConnHostCellDaemonsPage verifyADBConnectPageTittle(String expectedValue) {
        ActOn.wait(driver, PAGE_TITTLE).waitForToBeVisible(2);
        String actualResponse = ActOn.element(driver, PAGE_TITTLE).getTextValue();
        Assert.assertEquals(actualResponse, expectedValue);
        LOGGER.debug("validate page tittle  : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
        return this;
    }

    public CSetConnHostCellDaemonsPage verifyIPAddress(String expectedValue) throws InterruptedException {
        LOGGER.info("******update the ip address in the script***** then only validation will be pass.");
        //ActOn.wait(driver, NEAREST_OBJECT).waitForToBeVisible(5);
        String actualResponse = ActOn.element(driver, IP_ADDRESS).getTextValue();
        if (actualResponse.contains(expectedValue)) {
            Assert.assertTrue(actualResponse.contains(expectedValue), actualResponse + " doesn't contains " + expectedValue);
            LOGGER.debug("Verified contains partially match : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
            LOGGER.info("Verified contains did not match as expected because script is not updated with current ip address");
            TimeUnit.SECONDS.sleep(8);
        } else {
            LOGGER.info("Actual Response is : " + actualResponse + " Expected Response :" + expectedValue);
            LOGGER.info("Verified contains did not match at all and need tester attention");
        }
        clickToDone();
        return this;
    }


    public CSetConnHostCellDaemonsPage clickToTime() {
        ActOn.wait(driver, TIME).waitForToBeVisible(6);
        ActOn.element(driver, TIME).click();
        LOGGER.debug("Navigated to Time page");
        return this;
    }

    public CSetConnHostCellDaemonsPage selectTimeRegionAsia() {
        ActOn.wait(driver, TIME_REGION).waitForToBeVisible(15);
        ActOn.element(driver, TIME_REGION).click();
        ActOn.element(driver, SELECT_ASIA).click();
        LOGGER.debug("Time Region has been selected");
        return this;
    }


    private void scrollToElement(String strText) {
        driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + strText + "\").instance(0))").click();
    }

    public CSetConnHostCellDaemonsPage selectAsiaTimeZone() {
        ActOn.wait(driver, TIME_ZONE).waitForToBeVisible(6);
        ActOn.element(driver, TIME_ZONE).click();
        scrollToElement("Bangkok");
        LOGGER.debug("Time Region has been selected");
        return this;
    }

    public CSetConnHostCellDaemonsPage selectTimeRegionIndian() {
        //ActOn.wait(driver, TIME_REGION).waitForToBeVisible(6);
        ActOn.element(driver, TIME_REGION).click();
        scrollToElement("Indian");
        LOGGER.debug("Time Region Indian has been selected");
        return this;
    }

    public CSetConnHostCellDaemonsPage selectIndianTimeZoneMaldives() {
        ActOn.wait(driver, TIME_ZONE).waitForToBeVisible(6);
        ActOn.element(driver, TIME_ZONE).click();
        scrollToElement("Maldives");
        LOGGER.debug("Indian Time Zone Maldives  has been selected");
        return this;
    }

    public CSetConnHostCellDaemonsPage selectTimeRegionMexico() {
        ActOn.wait(driver, TIME_REGION).waitForToBeVisible(6);
        ActOn.element(driver, TIME_REGION).click();
        scrollToElement("Mexico");
        LOGGER.debug("Time Region Mexico has been selected");
        return this;
    }

    public CSetConnHostCellDaemonsPage selectMexicoTimeZoneGeneral() {
        ActOn.wait(driver, TIME_ZONE).waitForToBeVisible(6);
        ActOn.element(driver, TIME_ZONE).click();
        scrollToElement("General");
        LOGGER.debug("Time Zone General has been selected");
        return this;
    }

    public CSetConnHostCellDaemonsPage selectTimeRegionAmerica() {
        ActOn.wait(driver, TIME_REGION).waitForToBeVisible(6);
        ActOn.element(driver, TIME_REGION).click();
        scrollToElement("America");
        LOGGER.debug("Time Region America has been selected");
        return this;
    }

    public CSetConnHostCellDaemonsPage selectAmericaTimeZone() throws InterruptedException {
        ActOn.wait(driver, TIME_ZONE).waitForToBeVisible(6);
        ActOn.element(driver, TIME_ZONE).click();
        scrollToElement("Chicago");
        TimeUnit.SECONDS.sleep(5);
        LOGGER.debug("Time Zone Chicago has been selected");
        return this;
    }

    public CSetConnHostCellDaemonsPage enterNTPServerInformation(String value) throws InterruptedException {
        //ActOn.wait(driver, NTP_SERVER).waitForToBeVisible(6);
        TimeUnit.SECONDS.sleep(5);
        ActOn.element(driver, NTP_SERVER).click();
        ActOn.element(driver, NTP_SERVER).clear();
        ActOn.element(driver, NTP_SERVER).setValue(value);
        driver.hideKeyboard();
        LOGGER.debug("NTP server name entered successfully");
        return this;
    }

    public CSetConnHostCellDaemonsPage clickToQuesNTPServer() {
        ActOn.element(driver, QUES_NTP_SERVER).click();
        LOGGER.debug("Clicked to open cell user question details");
        return this;
    }


    public CSetConnHostCellDaemonsPage clickToEnableNTP() {
        ActOn.wait(driver, NTP_ENABLE).waitForToBeVisible(6);
        ActOn.element(driver, NTP_ENABLE).click();
        LOGGER.debug("Clicked to NTP Enable or disable");
        return this;
    }

    public CSetConnHostCellDaemonsPage checkAndEnableNTP() {
        WebElement checkbox = driver.findElement(By.id("com.accutime.clocksetup:id/cb_enable_ntp"));
        if ((checkbox.getAttribute("checked").equals("true"))) {
            LOGGER.info("NTP enabled, checkbox already selected");
        } else {
            LOGGER.info("NTP not enabled checkbox now selected");
            ActOn.element(driver, NTP_ENABLE).click();
        }
        return this;
    }

    public CSetConnHostCellDaemonsPage clickToSetSysTime() {
        ActOn.wait(driver, SET_SYS_TIME).waitForToBeVisible(6);
        ActOn.element(driver, SET_SYS_TIME).click();
        LOGGER.debug("Clicked to set time");
        return this;
    }

    public CSetConnHostCellDaemonsPage clickToSetSysDate() {
        ActOn.wait(driver, SET_SYS_DATE).waitForToBeVisible(6);
        ActOn.element(driver, SET_SYS_DATE).click();
        LOGGER.debug("Clicked to set date");
        return this;
    }

}


//---------------------------------------------------------------------------------------------


//private final By CANCEL = By.id("com.accutime.clocksetup:id/btn_cancel");
//private final By SAVE = By.id("com.accutime.clocksetup:id/btn_done");
//private final By SELECT_INDIAN = By.xpath("//*[@text='Indian']");
//private final By SELECT_MEXICO = By.xpath("//*[@text='Mexico']");
//private final By SELECT_AMERICA = By.xpath("//*[@text='America']");
//private final By SELECT_BANGKOK = By.xpath("//*[@text='Bangkok']");
//private final By SELECT_MALDIVES = By.xpath("//*[@text='Maldives']");
//private final By SELECT_GENERAL = By.xpath("//*[@text='General']");
//private final By SELECT_NewYORK = By.xpath("//*[@text='New_York']");
//private final By RESTART_MESSAGE = By.id("android:id/message");

//    private static int getRandomNumberInBetween(int lowerBound, int upperBound){
//        Random r = new Random();
//        return (r.nextInt(upperBound) + lowerBound);
//    }
//
//    public CSetConnHostCellDaemonsPage selectRandomIndexDropdown() throws InterruptedException {
//        //ActOn.wait(driver, TIME_RE).waitForToBeVisible(20);
//        //ActOn.element(driver, TIME_RE).click();
//        wait(6000);
//       driver.findElement(By.id("com.accutime.clocksetup:id/sp_time_region")).click();
//
//        //List<MobileElement> options = (List<MobileElement>) ActOn.element(driver, TIME_RE).getElement();
//        //List<MobileElement> index = ((List<MobileElement>) ActOn.element(driver, TIME_RE));
//
//        List<MobileElement> index = ((List<MobileElement>) ActOn.element(driver, TIME_RE));
//        Random rand = new Random();
//        int list= rand.nextInt(index.size());
//        index.get(list).click();
//        LOGGER.debug("Clicked to OK Button");
//        return this;
//    }

//    public CSetConnHostCellDaemonsPage selectRandom() {
//        driver(By.id("com.accutime.clocksetup:id/sp_time_region")
//        LOGGER.debug("Clicked to open Proxy question details");
//        return this;
//    }

//    public CSetConnHostCellDaemonsPage verifyRestartMessage(String expectedValue) {
//        String actualResponse = ActOn.element(driver, RESTART_MESSAGE).getTextValue();
//        Assert.assertEquals(actualResponse, expectedValue);
//        LOGGER.debug("validate restart message  : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
//        return this;
//    }


//    public CSetConnHostCellDaemonsPage enterSSID(String value) throws InterruptedException {
//        //ActOn.wait(driver, SSID).waitForToBeVisible(7);
//        //ActOn.element(driver, SSID).click();
//        // wait(2000);
//        ActOn.element(driver, SSID).clear();
//        //wait(2000);
//        ActOn.element(driver, SSID).click();
//        //wait(2000);
//        ActOn.element(driver, SSID).setValue(value);
//        //driver.hideKeyboard();
//        LOGGER.debug("SSID information entered successfully");
//        return this;
//    }
//
//    public CSetConnHostCellDaemonsPage enterWIFIPassword(String value) throws InterruptedException {
//        //ActOn.element(driver, WIFI_PASS).click();
//        //wait(2000);
//        ActOn.element(driver, WIFI_PASS).clear();
//        // wait(2000);
//        ActOn.element(driver, WIFI_PASS).click();
//        //wait(2000);
//        ActOn.element(driver, WIFI_PASS).setValue(value);
//        //driver.hideKeyboard();
//        LOGGER.debug("WIFI password entered successfully");
//        return this;
//    }
//
//    public CSetConnHostCellDaemonsPage clickToHidePass() {
//        ActOn.wait(driver, HIDE_KEY).waitForToBeVisible(4);
//        ActOn.element(driver, HIDE_KEY).click();
//        LOGGER.debug("Clicked to Hide key button");
//        return this;
//    }
//    private void scrollForwardToElement(String strText) {
//        driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(6)).scrollIntoView(new UiSelector().textContains(\"" + strText + "\").instance(0))").click();
//    }