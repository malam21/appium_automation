package selenium_grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import utilities.TestEnvironment;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGrid_Firefox1 {

    WebDriver driver;

    @Test
    public void executeInAwsDocker() throws MalformedURLException {
        driver = TestEnvironment.selectTestExecutiveEnvironment();
        driver.get("https://www.facebook.com");
        System.out.println("Mortgage Facebook Title: " + driver.getTitle());
        driver.quit();
    }
}

