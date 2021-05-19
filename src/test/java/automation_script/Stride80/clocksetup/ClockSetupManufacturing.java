package automation_script.Stride80.clocksetup;

import data_provider.clocksetup.DataProviderClockSetup;
import listeners.BaseClass;
import org.testng.annotations.Test;
import page_objects.clocksetup_Pages.NavigationPageClockSetup;
import utilities.ReadConfigFiles;


public class ClockSetupManufacturing extends ClockSetup_BaseClass {

    @Test(dataProvider = "clockSetupData", dataProviderClass = DataProviderClockSetup.class)
    public void clockSetupManufacturing(String pasError, String osVersion, String orderNum, String macNum, String serialNum, String lineNum,
                                        String servUrl, String servUser, String servPass) throws InterruptedException {

              new NavigationPageClockSetup(driver)
                      .navigateToHelpPage()
                      .verifyVersionNumber(osVersion)
                      .scrollDownAndUp()
                      .clickToDone()
                      .navigateToSetupPage()
                      .clickToLogin()
                      .validatePassErrorMessage(pasError)
                      .clickToOK()
                      .enterPassword(ReadConfigFiles.getPropertyValue("atsManufacture"))
                      .clickToLogin()
                      .navigateToManufacturingPage()
                      .enterOrderNumber(orderNum)
                      .enterMacNumber(macNum)
                      .enterSerialNumber(serialNum)
                      .enterLineNumber(lineNum)
                      .clickQusOrderNum()
                      .clickToOKToQues()
                      .clickToQusMacNum()
                      .clickToOKToQues()
                      .clickToQuesSerialNum()
                      .clickToOKToQues()
                      .clickToQuesLineNum()
                      .clickToOKToQues()
                      .clickSetUpServer()
                      .enterServerURL(servUrl)
                      .enterServerUserName(servUser)
                      .enterServerPassword(servPass)
                      .clickToDone()
                      .clickToDone()
                      .clickToDone()
                      .clickToOK();
                      //.clickToReboot()
                      //.clickToCancel();
                      //.clickToReboot();
                      //.clickToAccept();












                      //.clickToLogin();


    }

}
