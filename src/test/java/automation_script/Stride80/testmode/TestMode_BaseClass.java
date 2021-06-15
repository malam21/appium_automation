package automation_script.Stride80.testmode;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.MobileAppConfiguration;
import utilities.ReadConfigFiles;

import java.net.URL;


public class TestMode_BaseClass {

    public static AndroidDriver<MobileElement> driver;
    private static final Logger LOGGER = LoggerFactory.getLogger(TestMode_BaseClass.class.getName());
    String testCaseName = String.format("-----Test: %s-------", this.getClass().getName());
    String endTestCase = String.format("-----Test End: %s-------", this.getClass().getName());
    MobileAppConfiguration app = new MobileAppConfiguration();
    DesiredCapabilities caps = new DesiredCapabilities();

    @BeforeMethod
    public void setup() {
        try {
            String url = ReadConfigFiles.getPropertyValue("Url");
            app.BasicDesiredCapabilities();
            caps.setCapability("appPackage", "com.accutime.testmode");
            caps.setCapability("appActivity", "com.accutime.testmode.MainActivity");
            driver = new AndroidDriver(new URL(url), caps);
            LOGGER.info(testCaseName);
            System.out.println("value of url in case 2: " + url);
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