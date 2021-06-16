package automation_script.Stride80.clocksetup;

import data_provider.clocksetup.DataProviderClockSetup;
import org.testng.annotations.Test;
import page_objects.clocksetup_Pages.NavigationPageClockSetup;
import utilities.ReadConfigFiles;

public class ClockSetupTerminal extends ClockSetup_BaseClass {

    @Test(dataProvider = "clockSetupTerminalSettings", dataProviderClass = DataProviderClockSetup.class)
    public void clockSetupMiscellaneous(String terminalName, String fileSize, String timeInterval, String triggerDis, String timeOut) throws InterruptedException {

        new NavigationPageClockSetup(driver)

                .navigateToSetupPage()
                .enterPassword(ReadConfigFiles.getPropertyValue("atsManufacture"))
                .clickToLogin()
                .navigateToMiscellaneousPage()
                .navigateToTerminalPage()
                .enterTerminalName(terminalName)
                .enterTerminalType()
                .clickToTerminalNameQues()
                .clickToOKQues()
                .selectGermanLanguage()
                .selectFrenchLanguage()
                .selectEnglishLanguage()
                .clickToReadersButton()
                .selectFingerReader()
                .selectMaxFingerEnroll()
                .selectGlobalSeries()
                .selectProximityReader()
                .selectBarcodeScanner()
                .clickToExternalProximity()
                .clickToExternalProximity()
                .clickToMagneticReader()
                .clickToMagneticReader()
                .clickToDone()
                .clickToPeripherals()
                .clickToEnableKeypad()
                .clickToEnableKeypad()
                .clickToEnableDido()
                .clickToEnableDido()
                .clickToKeypadQues()
                .clickToOKQues()
                .clickToDidoQues()
                .clickToOKQues()
                .clickToDone()
                .clickToLoggingButton()
                .selectLogToHost()
                .enterFileSize(fileSize)
                .enterTimeInterval(timeInterval)
                .clickToFileSizeQues()
                .clickToOKQues()
                .clickToTimeIntQues()
                .clickToOKQues()
                .clickToDone()
                .clickToLoggingButton()
                .selectLogToDevice()
                .clickToDone()
                .clickToLoggingButton()
                .selectDisable()
                .clickToDone()
                .clickToScreenSize()
                .enterTriggerDistance(triggerDis)
                .enterTimeOut(timeOut)
                .clickToTimeoutQues()
                .clickToOKQues()
                .clickToTriggerQues()
                .clickToOKQues()
                .clickToDone()
                .clickToDone()
                .clickToDone()
                .clickToDone()
                .clickToOKButton();

    }
}