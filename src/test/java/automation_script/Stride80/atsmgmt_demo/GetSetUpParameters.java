package automation_script.Stride80.atsmgmt_demo;

import data_provider.ATSMgmt_Demo.DataProviderClass;
import listeners.BaseClass;
import org.testng.annotations.Test;
import page_objects.ATSMgmt_DemoPages.NavigationPage;
import utilities.ReadConfigFiles;


public class GetSetUpParameters extends ATSMgmt_BaseClass {

    @Test (dataProvider = "setUpParameter", dataProviderClass = DataProviderClass.class)
    public void validSetupParameter(String SerialNumber, String RegionalInformation, String TimeLocation, String TerminalName)  {

        new NavigationPage(driver)
                .navigateToGetSetUpParameterPage()
                .enterPassword(ReadConfigFiles.getPropertyValue("Password"))
                .clickGetSerialNumber()
                .validateSerialNumber(SerialNumber)
                .ClickGetTimeRegion()
                .validateRegionalInformation(RegionalInformation)
                .ClickGetTimeLocation()
                .validateTimeLocation(TimeLocation)
                .ClickGetTerminalName()
                .validateTerminalName(TerminalName);
    }
}




