package selenium_grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import utilities.TestEnvironment;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGrid_Chrome1 {

    WebDriver driver;


    @Test
    public void executeInAwsDocker() throws MalformedURLException {
        driver = TestEnvironment.selectTestExecutiveEnvironment();
        driver.get("https://www.mortgagecalculator.org/");
        System.out.println("Mortgage Calculator Title: " + driver.getTitle());
        driver.quit();
    }
}