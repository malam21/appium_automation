package automation_script.Stride80.atsmgmt_demo;

import data_provider.ATSMgmt_Demo.DataProviderClass;
import listeners.BaseClass;
import org.testng.annotations.Test;
import page_objects.ATSMgmt_DemoPages.NavigationPage;
import utilities.ReadConfigFiles;

public class ValidateSystemTime extends ATSMgmt_BaseClass {

    @Test(dataProvider = "setSystemTime", dataProviderClass = DataProviderClass.class)
    public void ValidateSystemTime(String sysTime, String timeZone, String timeSetErrorMess) throws InterruptedException {

        new NavigationPage(driver)
                .navigateToSetSystemTimePage()
                .enterVARPassword(ReadConfigFiles.getPropertyValue("Password"))
                .enterSystemTime(sysTime)
                .enterTimeZone(timeZone)
                .clickSetTime()
                //.validateSetTimeErrorMessage(timeSetErrorMess)
                .clickBackButton();
    }
}