package page_objects.ATSMgmt_DemoPages;

import command_providers.ActOn;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NavigationPage {

    public AndroidDriver<MobileElement> driver;

    //---------------------------------------------------------------------------------
    private static final Logger LOGGER = LoggerFactory.getLogger(NavigationPage.class.getName());
    //---------------------------------------------------------------------------------


    private final By GET_SETUP_PARA = By.id("com.accutime.atsmgmtdemo:id/btn_go_to_get_setup_params_activity");
    private final By SET_SETUP_PARA = By.id("com.accutime.atsmgmtdemo:id/btn_go_to_set_setup_params_activity");
    private final By RESET_PASS = By.id("com.accutime.atsmgmtdemo:id/btn_go_to_reset_passwords_activity");
    private final By SET_SYS_TIME = By.id("com.accutime.atsmgmtdemo:id/btn_go_to_set_system_time_activity");
    //private final By setSystemTime = By.id("com.accutime.atsmgmtdemo:id/btn_go_to_get_free_disk_space_activity");


    public NavigationPage(AndroidDriver driver) {
        this.driver = driver;
    }

    //Get setup parameter
    public GetSetUpParameterPage navigateToGetSetUpParameterPage() {
        ActOn.element(driver, GET_SETUP_PARA).click();
        LOGGER.info("User navigated to Get setup parameter page");
        return new GetSetUpParameterPage(driver);
    }

    //Set setup parameter
    public SetSetupParameterPage navigateToSetSetUpParameterPage() {
        ActOn.element(driver, SET_SETUP_PARA).click();
        LOGGER.info("User navigated to Set setup parameter page");
        return new SetSetupParameterPage(driver);
    }

    //Reset Setup Passwords
    public SetResetPasswordPage navigateToResetSetupPasswordPage() {
        ActOn.element(driver, RESET_PASS).click();
        LOGGER.info("User navigated to Set resetSetupPasswords page");
        return new SetResetPasswordPage(driver);
    }

    //Set System Time
    public SetSystemTimePage navigateToSetSystemTimePage() {
        ActOn.element(driver, SET_SYS_TIME).click();
        LOGGER.info("User navigated to Set SystemTime page");
        return new SetSystemTimePage(driver);
    }

}












  /*  //Navigate to the home
    public Home navigateToHome(){
        ActOn.element(driver, MortgageCalculatorLogo).click();
        LOGGER.info("User navigate to the Home page");
        return new Home(driver);
    }

    public NavigationPage mouseHoverToRates() {
        ActOn.element(driver, Rates).mouseHover();
        ActOn.element(driver, RealApr).click();
        LOGGER.info("Mouse Hover on rates");
        return this;
    } */

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//private static Logger LOGGER = LogManager.getLogger(NavigationPage.class);