package page_objects.ATSMgmt_DemoPages;

import command_providers.ActOn;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;


public class SetSetupParameterPage extends NavigationPage {

    private static final Logger LOGGER = LoggerFactory.getLogger(SetSetupParameterPage.class.getName());
    private final By VarPassword = By.id("com.accutime.atsmgmtdemo:id/et_var_password");
    //Ethernet Settings
    private final By DHCP = By.id("com.accutime.atsmgmtdemo:id/cb_dhcp");
    private final By FIXED_IP = By.id("com.accutime.atsmgmtdemo:id/et_fixed_ip");
    private final By SUBNET_MASK = By.id("com.accutime.atsmgmtdemo:id/et_subnet_mask");
    private final By DNS_SERVER = By.id("com.accutime.atsmgmtdemo:id/et_dns_server");
    private final By GATEWAY = By.id("com.accutime.atsmgmtdemo:id/et_gateway");
    private final By ETHERNET_SETTINGS = By.id("com.accutime.atsmgmtdemo:id/btn_set_ethernet_settings");
    private final By ETHERNET_SETTINGS_MESSAGE = By.id("com.accutime.atsmgmtdemo:id/response");
    //Wifi Settings
    private final By WIFI = By.id("com.accutime.atsmgmtdemo:id/cb_wifi_enable");
    private final By SSID = By.id("com.accutime.atsmgmtdemo:id/et_ssid");
    private final By WIFI_PASSWORD = By.id("com.accutime.atsmgmtdemo:id/et_encryption_key");
    private final By WIFI_SETTINGS = By.id("com.accutime.atsmgmtdemo:id/btn_set_wifi_settings");
    private final By WIFI_SETTINGS_MESSAGE = By.id("com.accutime.atsmgmtdemo:id/response");
    //Cellular Settings
    private final By CELLULAR_ENABLE = By.id("com.accutime.atsmgmtdemo:id/cb_cellular_enable");
    private final By CELLULAR_NAME = By.id("com.accutime.atsmgmtdemo:id/et_cell_name");
    private final By CELLULAR_APN = By.id("com.accutime.atsmgmtdemo:id/et_cell_apn");
    private final By CELLULAR_PROXY = By.id("com.accutime.atsmgmtdemo:id/et_cell_proxy");
    private final By CELLULAR_PORT = By.id("com.accutime.atsmgmtdemo:id/et_cell_port");
    private final By CELLULAR_USER_NAME = By.id("com.accutime.atsmgmtdemo:id/et_cell_user");
    private final By CELLULAR_PASSWORD = By.id("com.accutime.atsmgmtdemo:id/et_cell_password");
    private final By CELL_SERVER = By.id("com.accutime.atsmgmtdemo:id/et_cell_server");
    private final By CELL_MMC = By.id("com.accutime.atsmgmtdemo:id/et_cell_mcc");
    private final By CELL_MNC = By.id("com.accutime.atsmgmtdemo:id/et_cell_mnc");
    //Host Settings
    private final By HOST_URL = By.id("com.accutime.atsmgmtdemo:id/et_host_url");
    private final By HOST_USER_NAME = By.id("com.accutime.atsmgmtdemo:id/et_host_username");
    private final By HOST_PASSWORD = By.id("com.accutime.atsmgmtdemo:id/et_host_password");
    private final By HOST_SETTINGS = By.id("com.accutime.atsmgmtdemo:id/btn_set_host_settings");
    private final By HOST_SETTINGS_MESSAGE = By.id("com.accutime.atsmgmtdemo:id/response");
    //Daemons Settings
    private final By DAEMONS_CHECK_BOX = By.id("com.accutime.atsmgmtdemo:id/cb_adb_enable");
    private final By DAEMONS_SETTINGS = By.id("com.accutime.atsmgmtdemo:id/btn_set_daemons_settings");
    private final By DAEMONS_SETTINGS_MESSAGE = By.id("com.accutime.atsmgmtdemo:id/response");
    //Time Settings
    private final By REGION = By.id("com.accutime.atsmgmtdemo:id/et_time_region");
    private final By LOCATION = By.id("com.accutime.atsmgmtdemo:id/et_time_location");
    private final By NTP_CHECK_BOX = By.id("com.accutime.atsmgmtdemo:id/cb_ntp_enable");
    private final By NTP_SERVER = By.id("com.accutime.atsmgmtdemo:id/et_ntp_server");
    private final By TIME_SETTINGS = By.id("com.accutime.atsmgmtdemo:id/btn_set_time_settings");
    private final By TIME_SETTINGS_MESSAGE = By.id("com.accutime.atsmgmtdemo:id/response");
    //User Experience Settings
    private final By USER_EXP_INFO = By.id("com.accutime.atsmgmtdemo:id/et_startup_application");
    private final By USER_EXP_SETTINGS = By.id("com.accutime.atsmgmtdemo:id/btn_set_user_experience_settings");
    private final By USER_EXP_SETTINGS_MESSAGE = By.id("com.accutime.atsmgmtdemo:id/response");
    //Terminal Settings
    private final By TERMINAL_NAME = By.id("com.accutime.atsmgmtdemo:id/et_terminal_name");
    private final By TERMINAL_SETTINGS = By.id("com.accutime.atsmgmtdemo:id/btn_set_terminal_name");
    private final By TERMINAL_SETTINGS_MESSAGE = By.id("com.accutime.atsmgmtdemo:id/response");
    //Logging Settings
    private final By LOG_ENABLE_TYPE = By.id("com.accutime.atsmgmtdemo:id/et_log_enable_type");
    private final By MAX_FILE_SIZE = By.id("com.accutime.atsmgmtdemo:id/et_max_file_size");
    private final By TIME_INTERVAL = By.id("com.accutime.atsmgmtdemo:id/et_time_interval");
    private final By LOG_SETTINGS = By.id("com.accutime.atsmgmtdemo:id/btn_set_logging_settings");
    private final By LOG_SETTINGS_MESSAGE = By.id("com.accutime.atsmgmtdemo:id/response");
    //Peripherals Settings
    private final By KEYPAD_CHECKBOX = By.id("com.accutime.atsmgmtdemo:id/cb_keypad_enable");
    // private static final By DIDO_CHECK_BOX
    private final By DIDO_CHECKBOX = By.id("com.accutime.atsmgmtdemo:id/cb_dido_enable");
    private final By PERI_SETTINGS = By.id("com.accutime.atsmgmtdemo:id/btn_set_peripherals_settings");
    private final By PERI_SETTINGS_MESSAGE = By.id("com.accutime.atsmgmtdemo:id/response");
    //Reader Settings
    private final By FINGER_COMPATIBLE = By.id("com.accutime.atsmgmtdemo:id/et_fingerprint_compatibility_mode");
    private final By READER_SETTING_MESSAGE = By.id("com.accutime.atsmgmtdemo:id/response");
    private final By READER_SETTINGS = By.id("com.accutime.atsmgmtdemo:id/btn_set_readers_settings");

    //------------------------------------------------------------------------
    public SetSetupParameterPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    //------------------------------------------------------------------------
    //-----------------------------------------------------------------------
    public SetSetupParameterPage ReaderSettingsDisplayed() {
        ActOn.element(driver, READER_SETTINGS).displayed();
        return this;
    }


    //-----------------------------------------------------------------------
    //------------------------------------------------------------------------

    public SetSetupParameterPage enterPassword(String value) {
        ActOn.element(driver, VarPassword).setValue(value);
        LOGGER.debug("Entered Password successfully");
        return this;
    }

    public SetSetupParameterPage clickDHCP() {
        ActOn.element(driver, DHCP).click();
        LOGGER.debug("Clicked on DHCP Checkbox");
        return this;
    }


    public SetSetupParameterPage enterFixedIP(String value) {
        ActOn.element(driver, FIXED_IP).setValue(value);
        LOGGER.debug("Entered FixedIP successfully");
        return this;
    }

    public SetSetupParameterPage enterSubnetMask(String value) {
        ActOn.element(driver, SUBNET_MASK).setValue(value);
        LOGGER.debug("Entered Subnet Mask successfully");
        return this;
    }

    public SetSetupParameterPage enterDNSServer(String value) {
        ActOn.element(driver, DNS_SERVER).setValue(value);
        LOGGER.debug("Entered DNSServer successfully");
        return this;
    }

    public SetSetupParameterPage enterGateway(String value) {
        ActOn.element(driver, GATEWAY).setValue(value);
        LOGGER.debug("Entered Gateway successfully");
        return this;
    }

    public SetSetupParameterPage clickEthernetSettings() {
        ActOn.element(driver, ETHERNET_SETTINGS).click();
        LOGGER.debug("Clicked on EthernetSettings Link");
        return this;
    }


    public SetSetupParameterPage validateEthernetSettingsMessage(String expectedValue) throws InterruptedException {
        ActOn.wait(driver, ETHERNET_SETTINGS_MESSAGE);
        Thread.sleep(5000);
        String actualResponse = ActOn.element(driver, ETHERNET_SETTINGS_MESSAGE).getTextValue();
        Assert.assertEquals(actualResponse, expectedValue);
        LOGGER.debug("validate EthernetSettings Message : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
        return this;
    }
    //------------------------------------------------------------------------

    public SetSetupParameterPage clearFixedIP() {
        ActOn.element(driver, FIXED_IP).clear();
        LOGGER.debug("FixedIP field cleared successfully");
        return this;
    }

    public SetSetupParameterPage clearSubnetMask() {
        ActOn.element(driver, SUBNET_MASK).clear();
        LOGGER.debug("SubnetMask field cleared successfully");
        return this;
    }

    public SetSetupParameterPage clearDNSServer() {
        ActOn.element(driver, DNS_SERVER).clear();
        LOGGER.debug("DNSServer field cleared successfully");
        return this;
    }

    public SetSetupParameterPage clearGateway() {
        ActOn.element(driver, GATEWAY).clear();
        LOGGER.debug("Gateway field cleared successfully");
        return this;
    }

    public SetSetupParameterPage clickWifi() throws InterruptedException {
        //scrollToElement("WIFI");
        driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollForward()");
        Thread.sleep(2000);
        ActOn.element(driver, WIFI).click();
        LOGGER.debug("Clicked on Wifi check box");
        return this;
    }

    private void scrollToElement(String strText) {
        driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + strText + "\").instance(0))").click();
    }

    public SetSetupParameterPage enterSSID(String value) {
        //driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollForward()");
        ActOn.element(driver, SSID).setValue(value);
        LOGGER.debug("Entered SSID successfully");
        return this;
    }

    public SetSetupParameterPage enterWifiPassword(String value) {
        ActOn.element(driver, WIFI_PASSWORD).setValue(value);
        LOGGER.debug("Entered SWifiPassword successfully");
        return this;
    }


    public SetSetupParameterPage clickWifiSettings() {
        ActOn.element(driver, WIFI_SETTINGS).click();
        LOGGER.debug("Clicked on WifiSettings Checkbox");
        return this;
    }

    public SetSetupParameterPage validateWifiSettingsMessage(String expectedValue) throws InterruptedException {
        ActOn.wait(driver, WIFI_SETTINGS_MESSAGE);
        Thread.sleep(5000);
        String actualResponse = ActOn.element(driver, WIFI_SETTINGS_MESSAGE).getTextValue();
        Assert.assertEquals(actualResponse, expectedValue);
        LOGGER.debug("validate WifiSettingsMessage Message : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
        return this;
    }

    public SetSetupParameterPage clearSSID() {
        ActOn.element(driver, SSID).clear();
        LOGGER.debug("SSID field cleared successfully");
        return this;
    }

    public SetSetupParameterPage clearWifiPassword() {
        ActOn.element(driver, WIFI_PASSWORD).clear();
        LOGGER.debug("WifiPassword field cleared successfully");
        return this;
    }

    public SetSetupParameterPage clickWifitoUncheck() {
        //scrollToElement("WIFI");
        //driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollForward()");
        //Thread.sleep(2000);
        ActOn.element(driver, WIFI).click();
        LOGGER.debug("Clicked on Wifi to Uncheck box");
        return this;
    }

    public SetSetupParameterPage clickCellularEnable() {
        //scrollToElement("cellular Enable");
        driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollForward()");
        ActOn.element(driver, CELLULAR_ENABLE).click();
        LOGGER.debug("Clicked on CellularEnable check box");
        return this;
    }

    public SetSetupParameterPage enterCellularName(String value) {
        ActOn.element(driver, CELLULAR_NAME).setValue(value);
        LOGGER.debug("Entered CellularName successfully");
        return this;
    }

    public SetSetupParameterPage enterCelluAPN(String value) {
        ActOn.element(driver, CELLULAR_APN).setValue(value);
        LOGGER.debug("Entered CellularAPN successfully");
        return this;
    }

    public SetSetupParameterPage enterCelluProxy(String value) {
        ActOn.element(driver, CELLULAR_PROXY).setValue(value);
        LOGGER.debug("Entered CellularPROXY successfully");
        return this;
    }

    public SetSetupParameterPage enterCelluPort(String value) {
        ActOn.element(driver, CELLULAR_PORT).setValue(value);
        LOGGER.debug("Entered CellularPort successfully");
        return this;
    }

    public SetSetupParameterPage enterCellUserName(String value) {
        //scrollToElement("MCC");
        driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollForward()");
        ActOn.element(driver, CELLULAR_USER_NAME).setValue(value);
        LOGGER.debug("Entered CellUserName successfully");
        return this;
    }

    public SetSetupParameterPage enterCellUserPassword(String value) {
        ActOn.element(driver, CELLULAR_PASSWORD).setValue(value);
        LOGGER.debug("Entered CellUserPassword successfully");
        return this;
    }

    public SetSetupParameterPage enterCellServer(String value) {
        ActOn.element(driver, CELL_SERVER).setValue(value);
        LOGGER.debug("Entered CellServer successfully");
        return this;
    }

    public SetSetupParameterPage enterCellMCC(String value) {
        ActOn.element(driver, CELL_MMC).setValue(value);
        LOGGER.debug("Entered CellMCC successfully");
        return this;
    }

    public SetSetupParameterPage enterCellMNC(String value) {
        //scrollToElement("Host");
        ActOn.element(driver, CELL_MNC).setValue(value);
        LOGGER.debug("Entered CellMNC successfully");
        return this;
    }


    //__________Remove entered data
    public SetSetupParameterPage clearToUncheckCellularEnable() throws InterruptedException {
        //scrollToElement("cellular Enable");
        driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollBackward()");
        //Thread.sleep(2000);

        //ActOn.wait(driver,CELLULAR_ENABLE);
        ActOn.element(driver, CELLULAR_ENABLE).click();
        LOGGER.debug("Clicked on CellularEnable check box");
        return this;
    }

    public SetSetupParameterPage clearCellularName(String value) throws InterruptedException {
        ActOn.element(driver, CELLULAR_NAME).clear();
        LOGGER.debug("Entered CellularName cleared successfully");
        return this;
    }

    public SetSetupParameterPage clearCelluAPN(String value) {
        ActOn.element(driver, CELLULAR_APN).clear();
        LOGGER.debug("Entered CellularAPN successfully");
        return this;
    }

    public SetSetupParameterPage clearCelluProxy(String value) {
        ActOn.element(driver, CELLULAR_PROXY).clear();
        LOGGER.debug("Entered CellularPROXY successfully");
        return this;
    }

    public SetSetupParameterPage clearCelluPort(String value) {

        ActOn.element(driver, CELLULAR_PORT).clear();
        driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollForward()");
        LOGGER.debug("Entered CellularPort successfully");
        return this;
    }

    public SetSetupParameterPage clearCellUserName(String value) {
        ActOn.element(driver, CELLULAR_USER_NAME).clear();
        LOGGER.debug("Entered CellUserName successfully");
        return this;
    }


    public SetSetupParameterPage clearCellUserPassword(String value) {
        ActOn.element(driver, CELLULAR_PASSWORD).clear();
        LOGGER.debug("Entered CellUserPassword successfully");
        return this;
    }

    public SetSetupParameterPage clearCellServer(String value) {
        ActOn.element(driver, CELL_SERVER).clear();
        LOGGER.debug("Entered CellServer successfully");
        return this;
    }

    public SetSetupParameterPage clearCellMCC(String value) {
        ActOn.element(driver, CELL_MMC).clear();
        LOGGER.debug("Entered CellMCC successfully");
        return this;
    }

    public SetSetupParameterPage clearCellMNC(String value) {
        //scrollToElement("Host");
        driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollForward()");
        ActOn.element(driver, CELL_MNC).clear();
        LOGGER.debug("Entered CellMNC successfully");
        return this;
    }

    public SetSetupParameterPage enterHostURL(String value) {
        ActOn.element(driver, HOST_URL).setValue(value);
        LOGGER.debug("Entered HostURL successfully");
        return this;
    }

    public SetSetupParameterPage enterHostUserName(String value) {
        ActOn.element(driver, HOST_USER_NAME).setValue(value);
        LOGGER.debug("Entered HostUserName successfully");
        return this;
    }

    public SetSetupParameterPage enterHostPassword(String value) {
        ActOn.element(driver, HOST_PASSWORD).setValue(value);
        LOGGER.debug("Entered HostPassword successfully");
        return this;
    }

    public SetSetupParameterPage clickHostSettings() {
        //scrollToElement("SET HOST");
        driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollForward()");
        ActOn.element(driver, HOST_SETTINGS).click();
        LOGGER.debug("Clicked on HostSettings");
        return this;
    }

    public SetSetupParameterPage validateHostSettingsMessage(String expectedValue) throws InterruptedException {
        ActOn.wait(driver, HOST_SETTINGS_MESSAGE);
        Thread.sleep(5000);
        String actualResponse = ActOn.element(driver, HOST_SETTINGS_MESSAGE).getTextValue();
        Assert.assertEquals(actualResponse, expectedValue);
        LOGGER.debug("validate HostSettingsMessage Message : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
        return this;
    }

    public SetSetupParameterPage clickDaymonsCheckbox() {
        scrollToElement("ADB Enable");
        ActOn.element(driver, DAEMONS_CHECK_BOX).click();
        LOGGER.debug("Clicked on Daemons Checkbox");
        return this;
    }

    public SetSetupParameterPage clickDaymonsSettings() {
        ActOn.element(driver, DAEMONS_SETTINGS).click();
        LOGGER.debug("Clicked on DaemonsSettings");
        return this;
    }

    public SetSetupParameterPage validateDaymonsSettingsMessage(String expectedValue) throws InterruptedException {
        ActOn.wait(driver, DAEMONS_SETTINGS_MESSAGE);
        Thread.sleep(5000);
        String actualResponse = ActOn.element(driver, DAEMONS_SETTINGS_MESSAGE).getTextValue();
        Assert.assertEquals(actualResponse, expectedValue);
        LOGGER.debug("validate EthernetSettings Message : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
        return this;

    }

    public SetSetupParameterPage enterRegion(String value) {
        ActOn.element(driver, REGION).setValue(value);
        LOGGER.debug("Entered Region successfully");
        return this;
    }

    public SetSetupParameterPage enterLocation(String value) {
        ActOn.element(driver, LOCATION).setValue(value);
        LOGGER.debug("Entered Gateway successfully");
        return this;
    }

    public SetSetupParameterPage clickNTPCheckbox() {
        ActOn.element(driver, NTP_CHECK_BOX).click();
        LOGGER.debug("Clicked on NTPCheckbox Checkbox");
        return this;
    }

    public SetSetupParameterPage enterNTPServer(String value) {
        ActOn.element(driver, NTP_SERVER).setValue(value);
        LOGGER.debug("Entered NTPServer successfully");
        return this;
    }

    public SetSetupParameterPage clickTimeSettings() {
        //scrollToElement("TIME SETTINGS");
        driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollForward()");
        ActOn.element(driver, TIME_SETTINGS).click();
        LOGGER.debug("Clicked on DHCP Checkbox");
        return this;
    }

    public SetSetupParameterPage validateTimeSettingsMessage(String expectedValue) throws InterruptedException {
        ActOn.wait(driver, TIME_SETTINGS_MESSAGE);
        Thread.sleep(5000);
        String actualResponse = ActOn.element(driver, TIME_SETTINGS_MESSAGE).getTextValue();
        Assert.assertEquals(actualResponse, expectedValue);
        LOGGER.debug("validate EthernetSettings Message : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
        return this;
    }

    public SetSetupParameterPage enterUserExpInfo(String value) {
        ActOn.element(driver, USER_EXP_INFO).setValue(value);
        LOGGER.debug("Entered Password successfully");
        return this;
    }

    public SetSetupParameterPage clickUserEspSettings() {
        ActOn.element(driver, USER_EXP_SETTINGS).click();
        LOGGER.debug("Clicked on UserEspSettings Checkbox");
        return this;
    }

    public SetSetupParameterPage validateUserEspSettingsMessage(String expectedValue) throws InterruptedException {
        ActOn.wait(driver, USER_EXP_SETTINGS_MESSAGE);
        Thread.sleep(5000);
        String actualResponse = ActOn.element(driver, USER_EXP_SETTINGS_MESSAGE).getTextValue();
        Assert.assertEquals(actualResponse, expectedValue);
        LOGGER.debug("validate EthernetSettings Message : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
        return this;
    }

    public SetSetupParameterPage enterTerminalName(String value) {
        driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollForward()");
        ActOn.element(driver, TERMINAL_NAME).setValue(value);
        LOGGER.debug("Entered Password successfully");
        return this;
    }

    public SetSetupParameterPage clickTerminalSettings() {
        ActOn.element(driver, TERMINAL_SETTINGS).click();
        LOGGER.debug("Clicked on UserEspSettings Checkbox");
        return this;
    }


    public SetSetupParameterPage validateTerminalSettingsMessage(String expectedValue) throws InterruptedException {
        ActOn.wait(driver, TERMINAL_SETTINGS_MESSAGE);
        Thread.sleep(5000);
        String actualResponse = ActOn.element(driver, TERMINAL_SETTINGS_MESSAGE).getTextValue();
        Assert.assertEquals(actualResponse, expectedValue);
        LOGGER.debug("validate EthernetSettings Message : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
        return this;
    }


    public SetSetupParameterPage enterLogEnableType(String value) {
        //driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollForward()");
        ActOn.element(driver, LOG_ENABLE_TYPE).setValue(value);
        LOGGER.debug("Entered EnableType successfully");
        return this;
    }

    public SetSetupParameterPage enterMaxFileSize(String value) {
        //driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollForward()");
        ActOn.element(driver, MAX_FILE_SIZE).setValue(value);
        LOGGER.debug("Entered MaxFileSize successfully");
        return this;
    }

    public SetSetupParameterPage enterTimeInterval(String value) {
        driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollForward()");
        ActOn.element(driver, TIME_INTERVAL).setValue(value);
        LOGGER.debug("Entered TimeInterval successfully");
        return this;
    }

    public SetSetupParameterPage clickLogSettings() {
        ActOn.element(driver, LOG_SETTINGS).click();
        LOGGER.debug("Clicked on LogSettings Checkbox");
        return this;
    }

    public SetSetupParameterPage validateLogSettingsMessage(String expectedValue) throws InterruptedException {
        ActOn.wait(driver, LOG_SETTINGS_MESSAGE);
        Thread.sleep(5000);
        String actualResponse = ActOn.element(driver, LOG_SETTINGS_MESSAGE).getTextValue();
        Assert.assertEquals(actualResponse, expectedValue);
        LOGGER.debug("validate EthernetSettings Message : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
        return this;
    }

    public SetSetupParameterPage clickKeypadCheckbox() {
        ActOn.element(driver, KEYPAD_CHECKBOX).click();
        LOGGER.debug("Clicked on Keypad Checkbox");
        return this;
    }

    public SetSetupParameterPage clickDidoCheckbox() {
        ActOn.element(driver, DIDO_CHECKBOX).click();
        LOGGER.debug("Clicked on Dido Checkbox");
        return this;
    }

    public SetSetupParameterPage clickPeripheralsSettings() {
        driver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instance(0)).scrollForward()");
        ActOn.element(driver, PERI_SETTINGS).click();
        LOGGER.debug("Clicked on Peripheral sSettings");
        return this;
    }

    public SetSetupParameterPage validatePeripheralsSettingsMessage(String expectedValue) throws InterruptedException {
        ActOn.wait(driver, PERI_SETTINGS_MESSAGE);
        Thread.sleep(5000);
        String actualResponse = ActOn.element(driver, PERI_SETTINGS_MESSAGE).getTextValue();
        Assert.assertEquals(actualResponse, expectedValue);
        LOGGER.debug("validate PeripheralsSettingsMessage Message : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
        return this;
    }

    public SetSetupParameterPage enterFingerCompatible(String value) {
        ActOn.element(driver, FINGER_COMPATIBLE).setValue(value);
        LOGGER.debug("Entered FingerCompatible value successfully");
        return this;
    }

    public SetSetupParameterPage clickReaderSettings() {
        ActOn.element(driver, READER_SETTINGS).click();
        LOGGER.debug("Clicked on Reader Settings");
        return this;
    }

    public SetSetupParameterPage validateReaderSettingsMessage(String expectedValue) throws InterruptedException {
        ActOn.wait(driver, READER_SETTING_MESSAGE);
        Thread.sleep(5000);
        String actualResponse = ActOn.element(driver, READER_SETTING_MESSAGE).getTextValue();
        Assert.assertEquals(actualResponse, expectedValue);
        LOGGER.debug("validate PeripheralsSettingsMessage Message : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
        return this;
    }
}













//----------------------------------------------------------------------------------------
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//private static final Logger LOGGER = LogManager.getLogger(NavigationPage.class);