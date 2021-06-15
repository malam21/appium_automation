package automation_script.Stride80.testmode;

import data_provider.testmode.DataProviderClassTestMode;
import org.testng.annotations.Test;
import page_objects.TestMode_Pages.NavigationPageTestMode;

public class ValidateDiDoCamera extends TestMode_BaseClass {

    @Test(dataProvider = "didoCameraTestPageData", dataProviderClass = DataProviderClassTestMode.class)
    public void validateDiDoCamera(String scrMessage) throws InterruptedException {

        new NavigationPageTestMode(driver)
                .navigateToCameraTestPage()
                .validateCamPageMessage(scrMessage)
                .navigateToDiDoPage()
                .clickToChannelOneChkBox()
                .ClickToSetOutput()
                .ClickToReadOutputs()
                .ClickToReadInputs()
                .clickToChannelTwoChkBox()
                .ClickToSetOutput()
                .ClickToReadInputs()
                .clickToPassTest()
                .navigateToDiDoPage()
                .clickToChannelOneChkBox()
                .clickToChannelTwoChkBox()
                .ClickToSetOutput()
                .ClickToReadOutputs()
                .ClickToReadInputs()
                .clickToPassTest();

    }
}