package automation_script.Stride80.testmode;

import data_provider.testmode.DataProviderClassTestMode;
import org.testng.annotations.Test;
import page_objects.TestMode_Pages.NavigationPageTestMode;


public class ValidateSpeakerLightBarPowerTest extends TestMode_BaseClass {

    @Test(dataProvider = "speakerLightBarPowerTest", dataProviderClass = DataProviderClassTestMode.class)
    public void validateSpeakerLightBarPowerTest(String noBatStatMessage, String finPriMesg, String failedMessage, String scaFingMessage, String firScaPass,
                                                 String failFinger, String stayFar, String stayClose, String serialNumber, String keyPad, String proxyCard,
                                                 String bioSensor, String osVersion) throws InterruptedException {

        new NavigationPageTestMode(driver)
                .navigateToSpeakerTestPage()
                .clickToPlaySpeaker()
                .clickToPassSpeakerTest()
                .navigateToLightBarPage()
                .clickLightBarMode()
                .clickToOn()
                .clickLightBarColor()
                .clickToSelectAmber()
                .clickLightBarColor()
                .clickToSelectRed()
                .clickLightBarColor()
                .clickToSelectPurple()
                .clickLightBarColor()
                .clickToSelectWhite()
                .clickLightBarColor()
                .clickToSelectYellow()
                .selectLightBarBrightness()
                .selectBrightnessHundred()
                .selectLightBarBrightness()
                .selectBrightnessSixty()
                .selectLightBarBrightness()
                .selectBrightnessNinety()
                .selectLightBarBrightness()
                .selectBrightnessSeventy()
                .clickLightBarMode()
                .selectFlash()
                .clickLightBarMode()
                .selectOff()
                .selectPassTest()
                .navigateToPowerManagementPage()
                .verifyNoBatteryStatusMessage(noBatStatMessage)
                .selectPassTest()
                .navigateToBiometricPage()
                .verifyFingerButtonStatus()
                .selectCaptureFingerButton()
                .verifyFingerPrintMessage(finPriMesg)
                .verifyCaptureFailed(failedMessage)
                .verifyFingerButtonStatus()
                .scanFingerForFirstTime()
                .verifyFirstCapturePassed(firScaPass)
                .scanWrongFinger()
                .verifySecondScanFailed(failFinger)
                .scanSameFingerForSecondTime()
                .verifyScannedFingerMessage(scaFingMessage)
                .navigateToRTCTestPage()
                .compareSysTimeVSRtcTime()
                .selectPassTest()
                .navigateToPresenceSensorTestPage()
                .verifyOutOfTheRange(stayFar)
                .selectPassTest()
                .navigateToPresenceSensorTestPage()
                .verifyNearestObject(stayClose)
                .navigateToAboutClockPage()
                .verifySerialNumber(serialNumber)
                .verifyKeypadAttached(keyPad)
                .verifyHidProxCard(proxyCard)
                .verifyBioSensor(bioSensor)
                .verifyOsVersion(osVersion);

    }
}