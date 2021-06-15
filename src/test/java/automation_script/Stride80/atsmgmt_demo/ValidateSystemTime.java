package automation_script.Stride80.atsmgmt_demo;

import data_provider.ATSMgmt_Demo.DataProviderClass;
import org.testng.annotations.Test;
import page_objects.ATSMgmt_DemoPages.NavigationPage;
import utilities.ReadConfigFiles;

public class ValidateSystemTime extends ATSMgmt_BaseClass {

    @Test(dataProvider = "setSystemTime", dataProviderClass = DataProviderClass.class)
    public void ValidateSystemTime(String wrongSysTime, String zoneChicago, String sysTimeMessage, String zoneNewyork, String correctSysTime, String corrForSysTime, String baseUrl, String downLoading,
                                   String dlCancelMess, String pacName, String authPackNameMessage, String deauthPackNameMessage, String resetDefMess) throws InterruptedException {

        new NavigationPage(driver)
                .navigateToSetSystemTimePage()
                .enterVARPassword(ReadConfigFiles.getPropertyValue("Password"))
                .enterSystemTime(wrongSysTime)
                .enterTimeZone(zoneChicago)
                .clickSetTime()
                .validateTimeFormatMessage(sysTimeMessage)
                .enterSystemTime(correctSysTime)
                .clickSetTime()
                .enterTimeZone(zoneNewyork)
 //               .validateCorrectTimeFormatMessage(corrForSysTime)
                .clickBackButton()
                .navigateToUpdateOSPage()
                .enterVARPassword(ReadConfigFiles.getPropertyValue("Password"))
                .enterBaseURL(baseUrl)
                .clickToDownloadOS()
                .validateDownloadingMessage(downLoading)
                .clickToCancelUpdate()
                .validateDownloadCancel(dlCancelMess)
                .clickBackButton()

                .clickToAuthKioskApp()
                .enterVARPassword(ReadConfigFiles.getPropertyValue("Password"))
                .enterPackageName(pacName)
                .clickToAuthPacName()
                .validateAuthPacNameMessage(authPackNameMessage)
                .clickToDeAuthPacName()
                .validateDeAuthPacNameMessage(deauthPackNameMessage)
                .clickToResetDefaults()
                .validateResetDefaultMessage(resetDefMess)
                .clickBackButton();

    }
}