package automation_script.Stride80.clocksetup;

import data_provider.clocksetup.DataProviderClockSetup;
import org.testng.annotations.Test;
import page_objects.clocksetup_Pages.NavigationPageClockSetup;
import utilities.ReadConfigFiles;

public class ClockSetupWifiConnectivity extends ClockSetup_BaseClass {

    @Test(dataProvider = "clockSetupWifiSettings", dataProviderClass = DataProviderClockSetup.class)
    public void clockSetupWifiConnectivity(String ssid, String wifiPass, String wifiConnMess, String fixedIP, String subnetMask, String dnsOne,
                                           String gatWay) throws InterruptedException {

        new NavigationPageClockSetup(driver)

                .navigateToSetupPage()
                .enterPassword(ReadConfigFiles.getPropertyValue("atsManufacture"))
                .clickToLogin()
                .navigateToWifiConnectivityPage()
                .clickToWifi()
                .clickToWifiEnable()
                .enterSSID(ssid)
                .enterWIFIPassword(wifiPass)
                .clickToHidePass()
                .clickToHidePass()
                .clickToDone()
                .verifyNearestObject(wifiConnMess)
                .clickToWifi()
                .clickToDHCPCheckBox()
                .enterFixedIp(fixedIP)
                .enterSubnetMask(subnetMask)
                .enterDNSOne(dnsOne)
                .enterGateway(gatWay)
                .clickToIpQues()
                .clickToOKToQues()
                .clickToDnsTwoQues()
                .clickToOKToQues()
                .clickToSubnetQues()
                .clickToOKToQues()
                .clickToDone()
                .clickToOK()
                .clickToWifi()
                .clickToDHCPCheckBox()
                .clickToWifiEnable()
                .clickToDone()
                .clickToOK()
                .clickToDone()
                .clickToDone()
                .clickToOK();
    }
}


//------------------------------------------------------
//.verifyRestartMessage(restartMess)
//.enterDNSTwo(dnsTwo)
//.enterDNSThree(dnsThree)
