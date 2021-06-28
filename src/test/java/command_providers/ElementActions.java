package command_providers;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ElementActions {

    private By locator;
    private static WebDriver driver;

    private static final Logger LOGGER = LoggerFactory.getLogger(ElementActions.class.getName());


    public ElementActions(WebDriver driver, By locator) {
        this.driver = driver;
        this.locator = locator;
    }

    public WebElement getElement() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement element = null;
        try {
            element = driver.findElement(locator);
        } catch (Exception e) {
            System.out.println("Element Exception for the locator " + locator + "And exception is " + e);
            LOGGER.debug("Element exception for the locator: " + locator + "and exception is: " + e);

        }
        return element;
    }

    public ElementActions click() {
        getElement().click();
        return this;
    }

    public ElementActions setValue(String value) {
        getElement().clear();
        getElement().sendKeys(value);
        return this;
    }

    public ElementActions clear() {
        getElement().clear();
        return this;
    }

    public ElementActions displayed() {
        getElement().isDisplayed();
        if (getElement().isDisplayed() == true) {
            LOGGER.debug(getElement().getText() + " Element displayed");
        } else {
            LOGGER.debug(getElement().getText() + " Element Not displayed");
        }
        return this;
    }

    public ElementActions isEnabled() {
        getElement().isEnabled();
        if (getElement().isEnabled() == true) {
            LOGGER.debug(getElement().getText() + " Element is Enabled");
        } else {
            LOGGER.debug(getElement().getText() + " Element Not Enabled");
        }
        return this;
    }


    public ElementActions isDisabled() {
        getElement().isEnabled();
        if (getElement().isEnabled() == false) {
            LOGGER.debug(getElement().getText() + " Element is Disabled");
        } else {
            LOGGER.debug(getElement().getText() + " Element is Enabled");
        }
        return this;
    }


    public ElementActions isChecked() {
        getElement().isSelected();
        if (getElement().isSelected() == true) {

            LOGGER.debug(getElement().getText() + " Element is Selected as checked");
        } else {
            LOGGER.debug(getElement().getText() + " Element is not selected as checked");
        }
        return this;
    }


    public ElementActions scrollBy() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //This will scroll the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", getElement());
        return this;
    }

    public ElementActions selectValue(String value) {
        Select select = new Select(getElement());
        select.selectByVisibleText(value);
        return this;
    }

    public ElementActions mouseHover() {
        Actions actions = new Actions(driver);
        actions.moveToElement(getElement()).perform();
        return this;
    }

    public String getTextValue() {

        return getElement().getText();
    }

    public static void takeScreenShot() throws IOException {
        Date currentdate = new Date();
        String screenshotfilename = currentdate.toString().replace(" ", "-").replace(":", "-");
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File(".//screenshot//" + screenshotfilename + ".png"));
        LOGGER.info("Screenshot " + screenshotfilename + " has been taken for validation");
        //command_providers.ElementActions.takeScreenShot();
    }

}




//----------------------------------------------------------------------------------------
//*
//private static final Logger LOGGER = LogManager.getLogger(ElementActions.class);
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//*