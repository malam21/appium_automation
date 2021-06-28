package automation_script.Stride80.atsmgmt_demo;

import data_provider.ATSMgmt_Demo.DataProviderClass;
import org.testng.annotations.Test;
import page_objects.ATSMgmt_DemoPages.NavigationPage;
import utilities.ReadConfigFiles;

import java.io.IOException;

public class ValidateResetPasswords extends ATSMgmt_BaseClass {



        @Test(dataProvider = "setResetPassword", dataProviderClass = DataProviderClass.class)
        public void validResetSetupPassword (String newEUPass, String newEndUserPass, String PassReErrorMess, String newVarCorrectPass, String newEndUserCorrectPass,
        String PassResetSuccessfulMessage) throws IOException, InterruptedException {

            new NavigationPage(driver)
                    .navigateToResetSetupPasswordPage()
                    .enterCurrentVARPassword(ReadConfigFiles.getPropertyValue("Password"))
                    .enterNewVARPassword(newEUPass)
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
