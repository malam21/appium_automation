package automation_script.Stride80.testmode;


import data_provider.testmode.DataProviderClassTestMode;
import org.testng.annotations.Test;
import page_objects.TestMode_Pages.NavigationPageTestMode;


public class ValidateKeypadDisplayTouch extends TestMode_BaseClass {

    @Test(dataProvider = "keypadDisplayTouchTest", dataProviderClass = DataProviderClassTestMode.class)
    public void validKeypadDisplayTouch(String KeypadMess, String disPlayMess, String soundMess, String keyPadScr) throws InterruptedException {

        new NavigationPageTestMode(driver)
                .navigateToKeypadTestPage()
                .validateKeypadMessage(KeypadMess)
                .ClickToNoPhysicalKeypad()
                .navigateToKeypadTestPage()
                .ClickToYesPhysicalKeypad()
                .verifyKeypadPageMessage(keyPadScr)
                .ClickPassTest()
                .navigateToDisplayTestPage()
                .ClickDisplayImage()
                .ClickDisplayImage()
                .ClickDisplayImage()
                .ClickDisplayImage()
                .validateDisplayMessage(disPlayMess)
                .ClickPassTest()
                .navigateToTouchTestPage()
                .ClickLeftCorner()
                .ClickRightCorner()
                .ClickBottomLeftCorner()
                .ClickBottomRightCorner()
                .navigateToSoundTestPage()
                .ClickToRecord()
                .ClickToStopRecord()
                .ClickToPlay()
                .ClickToStopPlay()
                .SoundTestMessageDisplayed()
                .validateSoundMessage(soundMess)
                .ClickToPass();

    }
}