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


public class SetResetPasswordPage extends NavigationPage {


    //--------------------------------------------------------------------------------------------
    private static final Logger LOGGER = LoggerFactory.getLogger(GetSetUpParameterPage.class.getName());
    //--------------------------------------------------------------------------------------------

    //Element Locator
    private final By CURR_VAR_PASS = By.id("com.accutime.atsmgmtdemo:id/et_current_var_password");
    private final By NEW_VAR_PASS = By.id("com.accutime.atsmgmtdemo:id/et_new_var_password");
    private final By NEW_END_USER_PASS = By.id("com.accutime.atsmgmtdemo:id/et_new_end_user_password");
    private final By RESET_PASS = By.id("com.accutime.atsmgmtdemo:id/btn_reset_passwords");
    private final By PASS_RESET_ERROR_MESS = By.id("com.accutime.atsmgmtdemo:id/response");
    private final By BACK_BUTTON = By.id("com.accutime.atsmgmtdemo:id/btn_back");



    //------------------------------------------------------------------------
    public SetResetPasswordPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }
    //------------------------------------------------------------------------

    public SetResetPasswordPage enterCurrentVARPassword(String value) {
        ActOn.element(driver, CURR_VAR_PASS).setValue(value);
        LOGGER.debug("Entered Current VARP assword successfully");
        return this;
    }

    public SetResetPasswordPage enterNewVARPassword(String value) {
        ActOn.element(driver, NEW_VAR_PASS).setValue(value);
        LOGGER.debug("Entered New VAR Password successfully");
        return this;
    }

    public SetResetPasswordPage enterNewUserPassword(String value) {
        ActOn.element(driver, NEW_END_USER_PASS).setValue(value);
        LOGGER.debug("Entered New End User Password successfully");
        return this;
    }

    public SetResetPasswordPage clickResetPassword() {
        ActOn.element(driver, RESET_PASS).click();
        LOGGER.debug("Clicked on Reset Password Checkbox");
        return this;
    }
    public SetResetPasswordPage validatePassResetErrorMessage(String expectedValue) {
        ActOn.wait(driver, PASS_RESET_ERROR_MESS).waitForToBeVisible(5);
        //Thread.sleep(5000);
        String actualResponse = ActOn.element(driver, PASS_RESET_ERROR_MESS).getTextValue();
        Assert.assertEquals(actualResponse, expectedValue);
        LOGGER.debug("validate EthernetSettings Message : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
        return this;
    }

    public SetResetPasswordPage clearNewVARPassword() {
        ActOn.element(driver, NEW_VAR_PASS).clear();
        LOGGER.debug("NewVARPassword field cleared successfully");
        return this;
    }

    public SetResetPasswordPage clearNewUserPassword() {
        ActOn.element(driver, NEW_END_USER_PASS).clear();
        LOGGER.debug("NewUserPassword field cleared successfully");
        return this;
    }

    public SetResetPasswordPage validatePassResetSuccessfulMessage(String expectedValue) throws  IOException {
        ActOn.wait(driver, PASS_RESET_ERROR_MESS).waitForToBeVisible(5);
        //Thread.sleep(5000);
        String actualResponse = ActOn.element(driver, PASS_RESET_ERROR_MESS).getTextValue();
        Assert.assertEquals(actualResponse, expectedValue);
        ElementActions.takeScreenShot();
        LOGGER.debug("validate EthernetSettings Message : Actual Response :" + actualResponse + " Expected Response :" + expectedValue);
        return this;
    }
        public SetResetPasswordPage clickBackButton() throws InterruptedException {
            ActOn.element(driver, BACK_BUTTON).click();
            LOGGER.debug("Clicked on BackButton to return to main page");
            TimeUnit.SECONDS.sleep(5);

            return this;
        }

    }













