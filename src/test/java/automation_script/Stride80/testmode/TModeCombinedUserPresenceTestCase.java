package automation_script.Stride80.testmode;

import data_provider.testmode.DataProviderClassTestMode;
import org.testng.annotations.Test;
import page_objects.TestMode_Pages.NavigationPageTestMode;

import java.io.IOException;

public class TModeCombinedUserPresenceTestCase extends TestMode_BaseClass {

    @Test(dataProvider = "CombinedPresenceTestCaseData", dataProviderClass = DataProviderClassTestMode.class)
    public void validateCombinedPresenceTestCase(String KeypadMess, String keyPadScr, String finPriMesg, String failedMessage, String firScaPass, String stayClose,
                                                   String scrMessage) throws InterruptedException, IOException {

        new NavigationPageTestMode(driver)
                //ValidateKeypadDisplayTouch
                .navigateToKeypadTestPage()
                .validateKeypadMessage(KeypadMess)
                .ClickToNoPhysicalKeypad()
                .navigateToKeypadTestPage()
                .ClickToYesPhysicalKeypad()
                .verifyKeypadPageMessage(keyPadScr)
                .ClickPassTest()
                //ValidateSpeakerLightBarPowerTest
                .navigateToBiometricPage()
                .verifyFingerButtonStatus()
                .selectCaptureFingerButton()
                .verifyFingerPrintMessage(finPriMesg)
                .verifyCaptureFailed(failedMessage)
                .verifyFingerButtonStatus()
                .scanFingerForFirstTime()
                .verifyFirstCapturePassed(firScaPass)

                .navigateToPresenceSensorTestPage()
                .verifyNearestObject(stayClose)
                //ValidateDiDoCamera
                .navigateToCameraTestPage()
                .validateCamPageMessage(scrMessage);

    }
}

