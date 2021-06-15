package data_provider.ATSMgmt_Demo;

import org.testng.annotations.DataProvider;


public class DataProviderClass {

    //Get setup parameter page
    @DataProvider(name = "setUpParameter")
    public Object[][] storeSetUpParameter() {
        return new Object[][]{
                {"{\"Action\":\"clock_response_key\",\"Success\":true,\"Message\":\"com.accutime.clocksetup.action.get_serial_number : 2019061\"}",
                        "{\"Action\":\"clock_response_key\",\"Success\":true,\"Message\":\"com.accutime.clocksetup.action.get_time_region : America\"}",
                        "{\"Action\":\"clock_response_key\",\"Success\":true,\"Message\":\"com.accutime.clocksetup.action.get_time_location : New_York\"}",
                        "{\"Action\":\"clock_response_key\",\"Success\":true,\"Message\":\"com.accutime.clocksetup.action.get_terminal_name : ATS001\"}"}
        };

    }

    //Set setup parameter page
    @DataProvider(name = "setEthernetParameter")
    public Object[][] storeEthernetParameter() {
        return new Object[][]{
                {"192.168.129.1", "255.255.252.0", "192.168.128.10", "192.168.128.254", "{\"Action\":\"Modify Parameters\",\"Success\":true,\"Message\":\"DHCP - Success; Fixed IP - Success; Subnet Mask - Success; DNS Servers - Success; Gateway - Success; \"}",
                        "ATS", "1a2B3c4D+++", "{\"Action\":\"Modify Parameters\",\"Success\":true,\"Message\":\"Wifi Status - Success; Wifi SSID - Success; Wifi Encryption Key - Success; \"}", "TMobile",
                        "APNNumber", "198.168.122.231", "4567", "John", "ABC123", "Bingo22", "198168122231", "198168122231", "http://www.accu-time.com", "Accu-Admin", "abc123",
                        "{\"Action\":\"Modify Parameters\",\"Success\":true,\"Message\":\"Host URL - Success; Host Username - Success; Host Password - Success; \"}",
                        "{\"Action\":\"Modify Parameters\",\"Success\":true,\"Message\":\"ADB - Success; \"}", "America", "New_York", "pool.ntp.org",
                        "{\"Action\":\"Modify Parameters\",\"Success\":true,\"Message\":\"Time Region\\/Location - Success; NTP Status - Success; NTP Server - Success; \"}",
                        "Clock Setup", "{\"Action\":\"Modify Parameters\",\"Success\":true,\"Message\":\"Startup Application - Success; \"}", "ATS001",
                        "{\"Action\":\"Modify Parameters\",\"Success\":true,\"Message\":\"Terminal Name - Success; \"}", "abc123", "12 MB", "12PM", "{\"Action\":\"Modify Parameters\",\"Success\":true,\"Message\":\"\"}",
                        "{\"Action\":\"Modify Parameters\",\"Success\":true,\"Message\":\"Keypad Status - Success; Dido Status - Success; \"}", "0", "1", "2", "{\"Action\":\"Modify Parameters\",\"Success\":true,\"Message\":\"Fingerprint Compatibility Mode - Success; Reader Config - Success; \"}"}};

    }

    @DataProvider(name = "setResetPassword")
    public Object[][] storeResetPassword() {
        return new Object[][]{
                {"1234", "1234", "{\"Action\":\"Reset Password\",\"Success\":false,\"Message\":\"Error: Invalid password length. Should be between 7 and 32 characters.\\nError: Invalid password length. Should be between 7 and 32 characters.\\n\"}",
                        "2019061", "2019061", "{\"Action\":\"Reset Password\",\"Success\":true,\"Message\":\"Success: Changed End User Admin password.\\nSuccess: Changed Var Admin password.\\n\"}"}};

    }

    @DataProvider(name = "setSystemTime")
    public Object[][] storeSystemTime() {
        return new Object[][]{
                {"12:23:20:20", "Chicago", "{\"Action\":\"Set System Time\",\"Success\":false,\"Message\":\"Error : NTP is on. Turn off NTP to manually set system time.\"}"
                        , "New_York", "1621616614924", "{\"Action\":\"Set System Time\",\"Success\":false,\"Message\":\"Error : NTP is on. Turn off NTP to manually set system time.\"}", "https://ats-sota-dev.accu-time.com",
                        "{\"Action\":\"Download OS Upgrade\",\"Success\":true,\"Message\":\"Downloading...0%\"}",
                        "{\"Action\":\"Download OS Upgrade\",\"Success\":true,\"Message\":\"Secure OTA Cancelled Successfully\"}", "com.accutime.timecollect",
                        "{\"Action\":\"Authenticate Kiosk Application\",\"Success\":true,\"Message\":\"Authenticate Kiosk Application : Success\"}",
                        "{\"Action\":\"Deauthenticate Kiosk Application\",\"Success\":true,\"Message\":\"Deauthenticate Kiosk Application : Success\"}",
                        "{\"Action\":\"Reset Kiosk Authentications\",\"Success\":true,\"Message\":\"Reset Kiosk Authentications : Success\"}"}};
    }

    @DataProvider(name = "PullSetupParameters")
    public Object[][] storePullSetupParametersData() {
        return new Object[][]{
                {"323232", "https://ats-setup-server-dev.accu-time.com/SetupServer", "Admin", "theadmin",
                        "{\"Action\":\"Request Settings From Server\",\"Success\":false,\"Message\":\"Unable to connect to server.\"}",
                        "{\"Action\":\"Get Free Disk Space\",\"Success\":true,\"Message\":\"Free disk space: 10790.184 MB\"}"}};
    }
}


//    @DataProvider
//    public Object[][] PullSetupParameters() {
//        return new Object[][]{};
//    }
//}


//    @DataProvider(name = "setWifiParameter")
//    public Object[][] storeWifiParameter() {
//        return new Object[][]{
//                {"ATS","1a2B3c4D+++", "{\"Action\":\"Modify Parameters\",\"Success\":true,\"Message\":\"Wifi Status - Success; Wifi SSID - Success; Wifi Encryption Key - Success; \"}"}
//        };


//    @DataProvider(name = "RealAprRates")
//    public Object[][] storeRealAprRates(){
//        return new Object[][]{
//
//                {"20000","15000", "3", "3.709%"}
//        };
//
//    }

