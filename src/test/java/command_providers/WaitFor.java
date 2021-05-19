package command_providers;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaitFor {

    private By locator;
    private WebDriver driver;

    public WaitFor(WebDriver driver,By locator){
        this.locator=locator;
        this.driver=driver;
    }
    public WaitFor waitForToBeVisible(int inSeconds){
        WebDriverWait wait = new WebDriverWait(driver,inSeconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return this;
    }

    //ActOn.wait(driver,PASS_TEST).waitForToBeVisible(5); How to call above method


//    public void waitFor(int second) {
//        driver.manage().timeouts().implicitlyWait(second, TimeUnit.SECONDS);
//    }
}