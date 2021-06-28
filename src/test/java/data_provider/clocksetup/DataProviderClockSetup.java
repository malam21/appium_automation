package data_provider.clocksetup;

import org.testng.annotations.DataProvider;

public class DataProviderClockSetup {

    //Validate clockSetup Manufacturing
    @DataProvider(name = "clockSetupData")
    public Object[][] storeClockSetupData() {
        return new Object[][]{
                {"Invalid password.", "A3-03.15-31be9a9", "323232", "52:04:1B:82:38:AB", "2019061", "1", "https://ats-setup-server.accu-time.com/SetupServer/",
                        "Admin", "1234"}
        };
    }

    //Validate clockSetup ethernet setup
    @DataProvider(name = "clockSetupEthernet")
    public Object[][] storeEthernetSetupData() {
        return new Object[][]{
                {"192.168.129.1", "255.255.252.0", "192.168.128.10", "192.168.128.10", "192.168.128.10", "192.168.128.254", "Restart the clock for new IP settings to take effect."}
        };
    }

    //Validate clockSetup WIFI setup
    @DataProvider(name = "clockSetupWifiSettings")
    public Object[][] storeWifiSetupData() {
        return new Object[][]{
                {"ATS", "1a2B3c4D+++", "Ethernet connected - cannot connect to Wi-Fi. Disconnect the Ethernet Cable and try again.", "192.168.128.86", "255.255.252.0", "192.168.128.10", "192.168.128.254"}
                //{"ATS", "1a2B3c4D+++", "Invalid Wifi DNS Server", "192.168.128.86", "255.255.252.0", "192.168.128.10", "192.168.128.10", "192.168.128.10", "192.168.128.254"}
        };
    }

    //Validate clockSetup ethernet setup
    @DataProvider(name = "clockSetupHostCellDaeSettings")
    public Object[][] storeHostCellDaeSetupData() {
        return new Object[][]{
                {"https://ats-sota.accu-time.com", "Admin", "abc123", "T-Mobile", "Tester", "323", "T-MobileServer", " Proxy server", "cellAPN", "1234", "231", "3121"
                        , "Settings may require a reboot to take effect.", "ADB Instructions", "IP Address: 192.168.1.237", "pool.ntp.org"}
        };
    }


    //Validate Miscellaneous setup
    @DataProvider(name = "clockSetupMiscellaneousSettings")
    public Object[][] storeMiscellaneousSetupData() {
        return new Object[][]{
                {"https://ats-sota.accu-time.com/", "no update available", "This password will be reset to manufacturing defaults.", "1234", "1234", "Current Startup Application: com.accutime.testmode"
                        , "Current Startup Application: com.accutime.clocksetup"}
        };
    }

    //Validate Terminal setup
    @DataProvider(name = "clockSetupTerminalSettings")
    public Object[][] storeTerminalSetupData() {
        return new Object[][]{
                {"ATS001", "100", "100", "750", "2"}
        };
    }

    //Validate clockSetup Combination
    @DataProvider(name = "clockSetupCombinationData")
    public Object[][] storeClockSetupCombinationData() {
        return new Object[][]{
                {"Invalid password.", "A3-03.16-351ffd2", "323232", "52:04:1B:82:38:AB", "2019061", "1", "https://ats-setup-server.accu-time.com/SetupServer/",
                        "Admin", "1234", "192.168.129.1", "255.255.252.0", "192.168.128.10", "192.168.128.10", "192.168.128.10", "192.168.128.254", "Restart the clock for new IP settings to take effect.",
                        "ATS", "1a2B3c4D+++", "Ethernet connected - cannot connect to Wi-Fi. Disconnect the Ethernet Cable and try again.", "192.168.128.86", "255.255.252.0", "192.168.128.10", "192.168.128.254",
                        "https://ats-sota.accu-time.com", "Admin", "abc123", "T-Mobile", "Tester", "323", "T-MobileServer", " Proxy server", "cellAPN", "1234", "231", "3121", "Settings may require a reboot to take effect.",
                        "ADB Instructions", "IP Address: 192.168.1.237", "pool.ntp.org", "https://ats-sota.accu-time.com/", "no update available", "This password will be reset to manufacturing defaults.", "1234", "1234",
                        "Current Startup Application: com.accutime.testmode", "Current Startup Application: com.accutime.clocksetup", "ATS001", "100", "100", "750", "2"}
        };
    }

}
