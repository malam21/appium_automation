package data_provider.testmode;

import org.testng.annotations.DataProvider;

public class DataProviderClassTestMode {

    //Validate Keypad Display and Touch Test
    @DataProvider(name = "keypadDisplayTouchTest")
    public Object[][] storeKeypadDisplayTestParameter() {
        return new Object[][]{
                {"Does this clock have a physical keypad?", "Display Test - Done", "Sound should record and play back audible and clear."
                        , "If keypad is available, press corresponding keys to highlight boxes."}
        };
    }

    @DataProvider(name = "speakerLightBarPowerTest")
    public Object[][] storeSpeakerLightBarPowerTest() {
        return new Object[][]{
                {"Currently on Battery : False","Place a finger on fingerprint scanner. Remove finger when capture is complete.", "Capture : Failed"
                ,"Place the same finger on fingerprint scanner for verification.", "Capture : Passed", "Verify : Failed",
                "Object out of range.", "Nearest object", "Serial Number : 2019061", "Keypad : Yes","Hid Prox card : Yes", "Bio Sensor : Lumidigm EM300",
                "OS Ver : A3-03.15-31be9a9"}
        };
    }

    //Validate DiDo Camera Test
    @DataProvider(name = "didoCameraTestPageData")
    public Object[][] storeDidoCameraPageData() {
        return new Object[][]{
                {"Camera preview should show and white light at the top of the screen should be on."}
        };
    }

}
