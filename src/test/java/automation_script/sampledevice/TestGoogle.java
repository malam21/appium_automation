package automation_script.sampledevice;

import command_providers.ActOn;
import listeners.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGoogle extends BaseClass {
    @Test
    public void testGoggleWebSite() {
        String title = ActOn.browser(driver).captureTitle();
        Assert.assertEquals(title, "Google");
    }
}
