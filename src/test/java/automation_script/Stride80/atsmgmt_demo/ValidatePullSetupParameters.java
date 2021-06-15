package automation_script.Stride80.atsmgmt_demo;

import data_provider.ATSMgmt_Demo.DataProviderClass;
import org.testng.annotations.Test;
import page_objects.ATSMgmt_DemoPages.NavigationPage;
import utilities.ReadConfigFiles;

import java.io.IOException;

public class ValidatePullSetupParameters extends ATSMgmt_BaseClass {

    @Test(dataProvider = "PullSetupParameters", dataProviderClass = DataProviderClass.class)
    public void ValidateSystemTime(String varOrderNum, String serverPath, String serUserName, String serverPass, String reqParaMess,
                                  String diskSpcMess) throws InterruptedException, IOException {

        new NavigationPage(driver)
                .navigateToPullSetupPara()
                .enterVARPassword(ReadConfigFiles.getPropertyValue("Password"))
                .enterVAROrderNum(varOrderNum)
                .enterServerPath(serverPath)
                .enterServerUserName(serUserName)
                .enterServerPass(serverPass)
                //.clickToRequestParameters()
                //.verifyReqParaMessage(reqParaMess)//TODO ADB disconnecting,I have sent an email to Kunal and David
                .clickToBackButton()
                .clickToGetFreeDiskSpace()
                .enterVARPassword(ReadConfigFiles.getPropertyValue("Password"))
                .clickToDiskSpace()
                .validateDiskSpaceMessage(diskSpcMess)
                .clickToBackButton();

    }

}