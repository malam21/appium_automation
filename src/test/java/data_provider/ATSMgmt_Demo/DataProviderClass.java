package data_provider.ATSMgmt_Demo;

import org.testng.annotations.DataProvider;


public class DataProviderClass {

    //Get setup parameter page
    @DataProvider(name = "setUpParameter")
    public Object[][] storeSetUpParameter() {
        return new Object[][]{
                {"{\"Action\":\"clock_response_key\",\"Success\":true,\"Message\":\"com.accutime.clocksetup.action.get_serial_number : 2019061\"}",
                        "{\"Action\":\"clock_response_key\",\"Success\":true,\"Message\":\"com.accutime.clocksetup.action.get_time_region : America\"}",
                        "{\"Action\":\"clock_response_key\",\"Success\":true,\"Message\":\"com.accutime.clocksetup.action.get_time_location : Chicago\"}",
                        "{\"Action\":\"clock_response_key\",\"Success\":true,\"Message\":\"com.accutime.clocksetup.action.get_terminal_name : ATS001\"}"}
        };

    }

    //Set setup parameter page
    @DataProvider(name = "setEthernetParameter")
    public Object[][] storeEthernetParameter() {
        return new Object[][]{
                {"192.168.129.1", "255.255.252.0", "192.168.128.10","192.168.128.254", "{\"Action\":\"Modify Parameters\",\"Success\":true,\"Message\":\"DHCP - Success; Fixed IP - Success; Subnet Mask - Success; DNS Servers - Success; Gateway - Success; \"}",
                        "ATS", "1a2B3c4D+++", "{\"Action\":\"Modify Parameters\",\"Success\":true,\"Message\":\"Wifi Status - Success; Wifi SSID - Success; Wifi Encryption Key - Success; \"}", "TMobile",
                        "APNNumber", "198.168.122.231", "4567", "John", "ABC123", "Bingo22", "198168122231", "198168122231", "http://www.accu-time.com", "Accu-Admin", "abc123",
                        "{\"Action\":\"Modify Parameters\",\"Success\":true,\"Message\":\"Host URL - Success; Host Username - Success; Host Password - Success; \"}",
                        "{\"Action\":\"Modify Parameters\",\"Success\":true,\"Message\":\"ADB - Success; \"}", "America", "Chicago", "data",
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
                {"12:23:20:20", "Chicago", "{\"Action\":\"Set System Time\",\"Success\":false,\"Message\":\"Error : This time location does not exist in this region.\\nError : Failed to set system time.\\n\"}"}};
    }
}



//    @DataProvider
//    public Object[][] keypadDisplayTouchTest() {
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

