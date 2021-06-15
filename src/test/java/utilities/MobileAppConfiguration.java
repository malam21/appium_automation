package utilities;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MobileAppConfiguration {
    DesiredCapabilities caps;

    public void BasicDesiredCapabilities() {
        caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "hcm");
        //caps.setCapability(MobileCapabilityType.UDID, "c2c3a0db");
        //caps.setCapability(MobileCapabilityType.UDID, "192.168.129.33:3121");
        //caps.setCapability(MobileCapabilityType.UDID, "192.168.129.66:3121");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Uiautomator2");
    }
}
