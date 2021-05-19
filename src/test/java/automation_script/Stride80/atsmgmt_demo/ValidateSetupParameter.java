package automation_script.Stride80.atsmgmt_demo;

import data_provider.ATSMgmt_Demo.DataProviderClass;
import org.testng.annotations.Test;
import page_objects.ATSMgmt_DemoPages.NavigationPage;
import utilities.ReadConfigFiles;


public class ValidateSetupParameter extends ATSMgmt_BaseClass {

    @Test(dataProvider = "setEthernetParameter", dataProviderClass = DataProviderClass.class)
    public void validSetupParameter(String strIP, String strSumask, String strDNS, String strGetWay, String ethernetSetupSuccessfulMessage, String strSSID, String wifiPass, String StpMessage,
                                    String celluProviName, String cellAPN, String cellProxy, String cellPort, String cellUser,
                                    String cellUserPassword, String cellServer, String cellMCC, String cellMNC, String hostURL, String hostUserName, String hostPassword,
                                    String hostSetupSuccessfulMessage, String dayemonsSetupSuccessfulMessage, String region, String location, String ntpServer, String timeSetupSuccessfulMessage,
                                    String userExpInfo, String UserExpSetupSuccessfulMessage, String terminalName, String terminalSetupSuccessfulMessage, String logEnaType, String maxFileSize,
                                    String timeInter, String logSuccessfulMessage, String PeriSuccessfulMessage, String valueZero, String valueOne, String valueTwo, String ReaderSettingsMessage) throws InterruptedException {

        new NavigationPage(driver)
                .navigateToSetSetUpParameterPage()
                .enterPassword(ReadConfigFiles.getPropertyValue("Password"))
                .clickDHCP()
                .clickDHCP()
                .clickDHCP()
                .enterFixedIP(strIP)
                .enterSubnetMask(strSumask)
                .enterDNSServer(strDNS)
                .enterGateway(strGetWay)
                .clickEthernetSettings()
                .validateEthernetSettingsMessage(ethernetSetupSuccessfulMessage)
                .clickDHCP()
                .clearFixedIP()
                .clearSubnetMask()
                .clearDNSServer()
                .clearGateway()
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
                .clearCellularName(celluProviName)
                .clearCelluAPN(cellAPN)
                .clearCelluProxy(cellProxy)
                .clearCelluPort(cellPort)
                .clearCellUserName(cellUser)
                .clearCellUserPassword(cellUserPassword)
                .clearCellServer(cellServer)
                .clearCellMCC(cellMCC)
                .clearCellMNC(cellMNC)
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
                .validateReaderSettingsMessage(ReaderSettingsMessage);
    }
}





