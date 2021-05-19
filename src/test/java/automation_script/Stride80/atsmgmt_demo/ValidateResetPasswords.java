package automation_script.Stride80.atsmgmt_demo;

import data_provider.ATSMgmt_Demo.DataProviderClass;
import listeners.BaseClass;
import org.testng.annotations.Test;
import page_objects.ATSMgmt_DemoPages.NavigationPage;
import utilities.ReadConfigFiles;

public class ValidateResetPasswords extends ATSMgmt_BaseClass {



        @Test(dataProvider = "setResetPassword", dataProviderClass = DataProviderClass.class)
        public void validResetSetupPassword (String newVarPass, String newEndUserPass, String PassReErrorMess, String newVarCorrectPass, String newEndUserCorrectPass,
        String PassResetSuccessfulMessage)  throws InterruptedException {

            new NavigationPage(driver)
                    .navigateToResetSetupPasswordPage()
                    .enterCurrentVARPassword(ReadConfigFiles.getPropertyValue("Password"))
                    .enterNewVARPassword(newVarPass)
                    .enterNewUserPassword(newEndUserPass)
                    .clickResetPassword()
                    .validatePassResetErrorMessage(PassReErrorMess)
                    .clearNewVARPassword()
                    .clearNewUserPassword()
                    .enterNewVARPassword(newVarCorrectPass)
                    .enterNewUserPassword(newEndUserCorrectPass)
                    .clickResetPassword()
                    .validatePassResetSuccessfulMessage(PassResetSuccessfulMessage)
                    .clickBackButton();

        }
    }
