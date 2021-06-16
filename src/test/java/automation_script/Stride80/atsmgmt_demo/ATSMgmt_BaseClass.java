package automation_script.Stride80.atsmgmt_demo;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.MobileAppConfiguration;
import utilities.ReadConfigFiles;

import java.net.URL;


public class ATSMgmt_BaseClass {

    public static AndroidDriver<MobileElement> driver;
    private static final Logger LOGGER = LoggerFactory.getLogger(ATSMgmt_BaseClass.class.getName());
    String testCaseName = String.format("-----Test: %s-------", this.getClass().getName());
    String endTestCase = String.format("-----Test End: %s-------", this.getClass().getName());
    MobileAppConfiguration app = new MobileAppConfiguration();
    DesiredCapabilities caps = new DesiredCapabilities();

    @BeforeMethod
    public void setup() {
        try {
            String url = ReadConfigFiles.getPropertyValue("Url");
            String buildPath = ReadConfigFiles.getPropertyValue("BuildUrl");
            app.BasicDesiredCapabilities();
            caps.setCapability(MobileCapabilityType.APP, buildPath);
            driver = new AndroidDriver(new URL(url), caps);
            LOGGER.info(testCaseName);
            System.out.println("value of url in case 1: " + url);
        } catch (Exception exp) {
            LOGGER.error("Cause is : {}", exp.getCause());
            System.out.println("Message is : " + exp.getMessage());
            LOGGER.error("Message is : " + exp.getMessage());
            exp.printStackTrace();
        }

    }

    @AfterMethod
    public void closeBrowser() {
        // driver.manage().deleteAllCookies();
        //ActOn.browser(driver).closeBrowser();
        driver.quit();
        LOGGER.info(endTestCase);
    }
}
