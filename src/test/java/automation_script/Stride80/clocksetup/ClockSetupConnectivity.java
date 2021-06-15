package automation_script.Stride80.clocksetup;

import data_provider.clocksetup.DataProviderClockSetup;
import org.testng.annotations.Test;
import page_objects.clocksetup_Pages.NavigationPageClockSetup;
import utilities.ReadConfigFiles;

import java.io.IOException;

public class ClockSetupConnectivity extends ClockSetup_BaseClass {

    @Test(dataProvider = "clockSetupEthernet", dataProviderClass = DataProviderClockSetup.class)
    public void cSetupEthernetConnectivity(String fixedIP, String subnetMask, String dnsOne, String dnsTwo, String dnsThree, String gatWay,
                                       String restartMess) throws InterruptedException, IOException {

        new NavigationPageClockSetup(driver)

                .navigateToSetupPage()
                .enterPassword(ReadConfigFiles.getPropertyValue("atsManufacture"))
                .clickToLogin()
                .navigateToConnectivityPage()
                .clickToEthernet()
                .clickToDHCPCheckBox()
                .enterFixedIp(fixedIP)
                .enterSubnetMask(subnetMask)
                .enterDNSOne(dnsOne)
                .enterDNSTwo(dnsTwo)
                .enterDNSThree(dnsThree)
                .enterGateway(gatWay)
                .clickToIpQues()
                .clickToOKToQues()
                .clickToDnsTwoQues()
                .clickToOKToQues()
                .clickToSubnetQues()
                .clickToOKToQues()
                //.clickToDone()
                //.verifyRestartMessage(restartMess)
                //.clickToOK()
                //.clickToEthernet()
                .clickToDHCPCheckBox()
                .clickToDone()
                .verifyRestartMessage(restartMess)
                .clickToOK();

    }
}
