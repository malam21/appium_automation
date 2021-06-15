package automation_script.Stride80.clocksetup;

import data_provider.clocksetup.DataProviderClockSetup;
import org.testng.annotations.Test;
import page_objects.clocksetup_Pages.NavigationPageClockSetup;
import utilities.ReadConfigFiles;

public class CSetConnHostCellDaemons extends ClockSetup_BaseClass {

    @Test(dataProvider = "clockSetupHostCellDaeSettings", dataProviderClass = DataProviderClockSetup.class)
    public void clockSetupWifiConnectivity(String hostUrl, String hostName, String hostPass, String cellProvi, String cellUser,
                                           String cellMCC, String mobileServer, String cellProxy, String cellAPN, String cellPass, String cellMNC, String cellPort,
                                           String restartMessage, String adbTittle, String ipMessage, String ntpServer) throws InterruptedException {

        new NavigationPageClockSetup(driver)

                .navigateToSetupPage()
                .enterPassword(ReadConfigFiles.getPropertyValue("atsManufacture"))
                .clickToLogin()
                .navigateToHostConHostPage()
                .clickToHost()
                .enterHostURL(hostUrl)
                .enterHostUserName(hostName)
                .enterHostPassword(hostPass)
                .clickToOpenHidePass()
                .clickToOpenHidePass()
                .clickToDone()
                .clickToCellModem()
                .cellModemEnable()
                .enterCellProviderName(cellProvi)
                .enterCellUserName(cellUser)
                .enterMCC(cellMCC)
                .enterCellServer(mobileServer)
                .enterCellProxy(cellProxy)
                .enterCellAPN(cellAPN)
                .enterCellPass(cellPass)
                .enterCellMNC(cellMNC)
                .enterCellPort(cellPort)
                .clickToQuesCellName()
                .clickToOKToQues()
                .clickToQuesCellUser()
                .clickToOKToQues()
                .clickToQuesCellUser()
                .clickToOKToQues()
                .clickToQuesMCC()
                .clickToOKToQues()
                .clickToQuesServer()
                .clickToOKToQues()
                .clickToQuesProxy()
                .clickToOKToQues()
                .clickToQuesPassword()
                .clickToOKToQues()
                .clickToQuesPort()
                .clickToOKToQues()
                .clickToDone()
                .clickToOK()
                .clickToCellModem()
                .cellModemEnable()
                .clickToDone()
                .clickToOK()
                .clickToDaemons()
                .adbEnable()
                .adbEnable()
                .clickConnectToADB()
                .verifyADBConnectPageTittle(adbTittle)
                .verifyIPAddress(ipMessage)
                .clickToDone()
                .clickToDone()
                .clickToTime()
                .selectTimeRegionAsia()
                .selectAsiaTimeZone()
                .selectTimeRegionIndian()
                .selectIndianTimeZoneMaldives()
                .selectTimeRegionMexico()
                .selectMexicoTimeZoneGeneral()
                .selectTimeRegionAmerica()
                .selectAmericaTimeZone()
                .checkAndEnableNTP()
                .enterNTPServerInformation(ntpServer)
                .clickToQuesNTPServer()
                .clickToOKToQues()
                .clickToEnableNTP()
                .clickToSetSysTime()
                .clickToOK()
                .clickToSetSysDate()
                .clickToOK()
                .clickToDone()
                .clickToTime()
                .clickToEnableNTP()
                .clickToDone()
                .clickToDone();

    }

}

//-----------------------------------------------------
//.verifyRestartMessage(restartMessage)