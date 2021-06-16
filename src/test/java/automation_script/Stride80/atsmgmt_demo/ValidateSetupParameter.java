package automation_script.Stride80.atsmgmt_demo;

import data_provider.ATSMgmt_Demo.DataProviderClass;
import org.testng.annotations.Test;
import page_objects.ATSMgmt_DemoPages.NavigationPage;
import utilities.ReadConfigFiles;

import java.io.IOException;


public class ValidateSetupParameter extends ATSMgmt_BaseClass {

    @Test(dataProvider = "setEthernetParameter", dataProviderClass = DataProviderClass.class)
    public void validSetupParameter(String strSumask, String strDNS, String strGetWay, String ethernetSetupSuccessfulMessage, String strSSID, String wifiPass, String StpMessage,
                                    String celluProviName, String cellAPN, String cellProxy, String cellPort, String cellUser,
                                    String cellUserPassword, String cellServer, String cellMCC, String cellMNC, String hostURL, String hostUserName, String hostPassword,
                                    String hostSetupSuccessfulMessage, String dayemonsSetupSuccessfulMessage, String region, String location, String ntpServer, String timeSetupSuccessfulMessage,
                                    String userExpInfo, String UserExpSetupSuccessfulMessage, String terminalName, String terminalSetupSuccessfulMessage, String logEnaType, String maxFileSize,
                                    String timeInter, String logSuccessfulMessage, String PeriSuccessfulMessage, String valueZero, String valueOne, String valueTwo, String ReaderSettingsMessage) throws InterruptedException, IOException {

        new NavigationPage(driver)
                .navigateToSetSetUpParameterPage()
                .enterPassword(ReadConfigFiles.getPropertyValue("Password"))
                .clickDHCP()
                .clickEthernetSettings()
                .clickDHCP()
                //.clickDHCP()
                .enterFixedIP()// clock setupApp crashed while same repeated IP address used.
                .enterSubnetMask(strSumask)
                .enterDNSServer(strDNS)
                .enterGateway(strGetWay)
                .clickDHCP()
                .clickEthernetSettings()
                .validateEthernetSettingsMessage(ethernetSetupSuccessfulMessage)//validation failing MR.KUNAL looking into it.
                //.clickDHCP()
                .clearFixedIP()
                .clearSubnetMask()
                .clearDNSServer()
                .clearGateway()
                .clickEthernetSettings()
                .clickWifi()
                .enterSSID(strSSID)
                .enterWifiPassword(wifiPass)
                .clickWifiSettings()
                .validateWifiSettingsMessage(StpMessage)
                //.clickWifi()
                .clickWifitoUncheck()
                .clearSSID()
                .clearWifiPassword()
                .clickCellularEnable()
                .enterCellularName(celluProviName)
                .enterCelluAPN(cellAPN)
                .enterCelluProxy(cellProxy)
                .enterCelluPort(cellPort)
                .enterCellUserName(cellUser)
                .enterCellUserPassword(cellUserPassword)
                .enterCellServer(cellServer)
                .enterCellMCC(cellMCC)
                .enterCellMNC(cellMNC)
                //.clickCellularEnable()
                .clearToUncheckCellularEnable()
                .clearCellularName()
                .clearCelluAPN()

                .clearCelluProxy()
                .clearCelluPort()
                .clearCellUserName()
                .clearCellUserPassword()
                .clearCellServer()
                .clearCellMCC()
                .clearCellMNC()
                .enterHostURL(hostURL)
                .enterHostUserName(hostUserName)
                .enterHostPassword(hostPassword)
                .clickHostSettings()
                .validateHostSettingsMessage(hostSetupSuccessfulMessage)
                .clickDaymonsCheckbox()
                .clickDaymonsSettings()
                .validateDaymonsSettingsMessage(dayemonsSetupSuccessfulMessage)
                .enterRegion(region)
                .enterLocation(location)
                .clickNTPCheckbox()
                .enterNTPServer(ntpServer)
                .clickTimeSettings()
                .validateTimeSettingsMessage(timeSetupSuccessfulMessage)
                .enterUserExpInfo(userExpInfo)
                .clickUserEspSettings()
                .validateUserEspSettingsMessage(UserExpSetupSuccessfulMessage)
                .enterTerminalName(terminalName)
                .clickTerminalSettings()
                .validateTerminalSettingsMessage(terminalSetupSuccessfulMessage)
                .enterLogEnableType(logEnaType)
                .enterMaxFileSize(maxFileSize)
                .enterTimeInterval(timeInter)
                .clickLogSettings()
                .validateLogSettingsMessage(logSuccessfulMessage)
                .clickKeypadCheckbox()
                .clickDidoCheckbox()
                .clickPeripheralsSettings()
                .validatePeripheralsSettingsMessage(PeriSuccessfulMessage)
                .enterFingerCompatible(valueTwo)
                .clickReaderSettings()
                .enterFingerCompatible(valueZero)
                .clickReaderSettings()
                .enterFingerCompatible(valueOne)
                .clickReaderSettings()
                .validateReaderSettingsMessage(ReaderSettingsMessage)

                .clickBackButton();

    }
}





