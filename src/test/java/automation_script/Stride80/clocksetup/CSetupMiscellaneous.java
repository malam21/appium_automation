package automation_script.Stride80.clocksetup;

import data_provider.clocksetup.DataProviderClockSetup;
import org.testng.annotations.Test;
import page_objects.clocksetup_Pages.NavigationPageClockSetup;
import utilities.ReadConfigFiles;

public class CSetupMiscellaneous extends ClockSetup_BaseClass {

    @Test(dataProvider = "clockSetupMiscellaneousSettings", dataProviderClass = DataProviderClockSetup.class)
    public void clockSetupMiscellaneous(String sotaUrl, String noAvaUpdate, String resetMessage, String newPassword, String verifyNewPass,
                                        String startAppTestMode, String startAppCSetup
                                           ) throws InterruptedException {

        new NavigationPageClockSetup(driver)

                .navigateToSetupPage()
                .enterPassword(ReadConfigFiles.getPropertyValue("atsManufacture"))
                .clickToLogin()
                .navigateToMiscellaneousPage()
                .clickToSWUpdate()
                .enterSotaURL(sotaUrl)
                .clickToStartSota()
                .verifyNoUpdateMessage(noAvaUpdate)
                .clickToAccessSecurity()
                .clickToUserPassReset()
                .verifyResetMessage(resetMessage)
                .clickToOKButton()
                .clickToDone()
                .clickToDone()
                .clickToOKButton()
                .navigateToSetupPage()
                .enterVarPassword(ReadConfigFiles.getPropertyValue("Password"))
                .clickToLogin()
                .navigateToMiscellaneousPage()
                .clickToAccessSecurity()
                .enterNewPassword(newPassword)
                .enterVerifyNewPassword(verifyNewPass)
                .clickToResetPassword()
                .verifyResetMessage(resetMessage)
                .clickToOKButton()
                .clickToUserExperience()
                .clickToSelectTestModeApp()
                .verifyStartUpApp(startAppTestMode)
                .clickToSelectClockSetupApp()
                .verifyStartUpApp(startAppCSetup)
                .clickToDone()
                .clickToDone()
                .clickToDone();

    }

}