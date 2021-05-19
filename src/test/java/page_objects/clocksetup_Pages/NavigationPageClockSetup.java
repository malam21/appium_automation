package page_objects.clocksetup_Pages;

import command_providers.ActOn;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class NavigationPageClockSetup {

    public AndroidDriver<MobileElement> driver;

    private static final Logger LOGGER = LoggerFactory.getLogger(NavigationPageClockSetup.class.getName());
    //Element Locator
    private final By SETUP_BUTTON = By.id("com.accutime.clocksetup:id/btn_setup");
    private final By HELP_BUTTON = By.id("com.accutime.clocksetup:id/btn_help");
    private final By MANUFACTURING = By.id("com.accutime.clocksetup:id/btn_manufacturing");
    private final By CONNECTIVITY = By.id("com.accutime.clocksetup:id/btn_connectivity");
    private final By TIME = By.id("com.accutime.clocksetup:id/btn_time");
    private final By MISCELLANEOUS = By.id("com.accutime.clocksetup:id/btn_miscellaneous");
    private final By VAR_ADMIN = By.id("com.accutime.clocksetup:id/radio_var_admin");
    private final By VAR_PASSWORD = By.id("com.accutime.clocksetup:id/et_password");
    private final By TERMINAL = By.id("com.accutime.clocksetup:id/btn_terminal");


    public NavigationPageClockSetup(AndroidDriver driver) {
        this.driver = driver;
    }

    //Navigate to Keypad test page
    public ClockSetupSetupPage navigateToSetupPage() {
        ActOn.wait(driver, SETUP_BUTTON).waitForToBeVisible(4);
        ActOn.element(driver, SETUP_BUTTON).click();
        LOGGER.info("User navigated to setup test page.");
        return new ClockSetupSetupPage(driver);
    }

    //Navigate to clock setup test page
    public ClockSetupSetupPage navigateToHelpPage() {
        ActOn.element(driver, HELP_BUTTON).click();
        LOGGER.info("User navigated to help page.");
        return new ClockSetupSetupPage(driver);
    }

    //Navigate to manufacturing page
    public ClockSetupSetupPage navigateToManufacturingPage() {
        ActOn.element(driver, MANUFACTURING).click();
        LOGGER.info("User navigated to manufacturing page.");
        return new ClockSetupSetupPage(driver);
    }

    //Navigate to connectivity Ethernet page
    public CSetupConnectivityEthernetPage navigateToConnectivityPage() {
        ActOn.wait(driver, CONNECTIVITY).waitForToBeVisible(4);
        ActOn.element(driver, CONNECTIVITY).click();
        LOGGER.info("User navigated to connectivity page.");
        return new CSetupConnectivityEthernetPage(driver);
    }

    //Navigate to connectivity page
    public CSetupWifiConnectivityPage navigateToWifiConnectivityPage() {
        //ActOn.wait(driver, CONNECTIVITY);
        ActOn.wait(driver, CONNECTIVITY).waitForToBeVisible(4);
        ActOn.element(driver, CONNECTIVITY).click();
        LOGGER.info("User navigated to connectivity page.");
        return new CSetupWifiConnectivityPage(driver);
    }

    //Navigate to connectivity page
    public CSetConnHostCellDaemonsPage navigateToHostConHostPage() {
        ActOn.wait(driver, CONNECTIVITY).waitForToBeVisible(4);
        ActOn.element(driver, CONNECTIVITY).click();
        LOGGER.info("User navigated to connectivity page.");
        return new CSetConnHostCellDaemonsPage(driver);
    }

    //Navigate to time page
    public CSetConnHostCellDaemonsPage navigateToTimePage() {
        ActOn.wait(driver, TIME).waitForToBeVisible(4);
        ActOn.element(driver, TIME).click();
        LOGGER.info("User navigated to connectivity page.");
        return new CSetConnHostCellDaemonsPage(driver);
    }

    //Navigate to Miscellaneous page
    public MiscellaneousTestPage navigateToMiscellaneousPage() {
        ActOn.wait(driver, MISCELLANEOUS).waitForToBeVisible(4);
        ActOn.element(driver, MISCELLANEOUS).click();
        LOGGER.info("User navigated to Miscellaneous page.");
        return new MiscellaneousTestPage(driver);
    }

    public MiscellaneousTestPage enterVarPassword(String value) {
        ActOn.element(driver, VAR_ADMIN).click();
        ActOn.element(driver, VAR_PASSWORD).setValue(value);
        LOGGER.debug("Entered Password successfully");
        return new MiscellaneousTestPage(driver);
    }

    //Navigate to Miscellaneous page
    public CSetupTerminalPage navigateToTerminalPage() {
        ActOn.wait(driver, TERMINAL).waitForToBeVisible(4);
        ActOn.element(driver, TERMINAL).click();
        LOGGER.info("User navigated to Terminal page.");
        return new CSetupTerminalPage(driver);
    }

}
