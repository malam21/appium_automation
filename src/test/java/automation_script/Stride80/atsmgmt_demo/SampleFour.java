package automation_script.Stride80.atsmgmt_demo;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class SampleFour {

    private final By HomePrice = By.name("HomeValue");
    private final By Refinance = By.linkText("Refinance");
    private final By RefinanceCalculator =By.linkText("Refi Calculator");
    private final By DownPayment = By.name("Down");
    private final By OriginalLoanAmount = By.id("Amount");
    private final By LoanTerm = By.name("Length");
    private final By InterestRate =By.name("Interest3");
    private final By MonthAlreadyPaid = By.name("PaidPeriods");
    private final By RefiLoanTerm = By.name("Length3");
    private final By RefiInterestRate = By.name("Interest2");
    private final By RefiYearsBeforeSell = By.name("YearsBeforeSell");
    private final By FeesDiscountPoints = By.name("Points");
    private final By FeesOriginationFees = By.name("Origination");
    private final By FeesOtherClosing = By.name("Closing");
    private final By FederalIncomeTax = By.name("Taxes");
    private final By StateTax = By.name("StateTax");
    private final By CalculateButton = By.name("calculate");
    private final By TotalRefinancingBenefit = By.xpath("//*[contains(text(),'Total Refinancing')]/../../td/h3");

    WebDriver driver;

    @BeforeMethod
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.mortgagecalculator.org/");
        driver.manage().window().maximize();
    }
    public void navigateToRefinancePage(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Refinance)).perform();
        driver.findElement(RefinanceCalculator).click();

    }

    private void enterRefinanceDate() {
        //Enter Original Price pf home
        driver.findElement(HomePrice).clear();
        driver.findElement(HomePrice).sendKeys("300000");

        // Enter Original Down Payment
        driver.findElement(DownPayment).clear();
        driver.findElement(DownPayment).sendKeys("60000");

        // Enter Original Loan Amount
        driver.findElement(OriginalLoanAmount).clear();
        driver.findElement(OriginalLoanAmount).sendKeys("240000");

        // Enter Loan Term
        driver.findElement(LoanTerm).clear();
        driver.findElement(LoanTerm).sendKeys("30");

        // Enter Interest Rate
        driver.findElement(InterestRate).clear();
        driver.findElement(InterestRate).sendKeys("3");

        // Enter Months already paid
        driver.findElement(MonthAlreadyPaid).clear();
        driver.findElement(MonthAlreadyPaid).sendKeys("36");

        // Enter Refinance Loan Term
        driver.findElement(RefiLoanTerm).clear();
        driver.findElement(RefiLoanTerm).sendKeys("15");

        // Enter Refinance Interest Rate
        driver.findElement(RefiInterestRate).clear();
        driver.findElement(RefiInterestRate).sendKeys("2.625");

        // Enter Years before sale
        driver.findElement(RefiYearsBeforeSell).clear();
        driver.findElement(RefiYearsBeforeSell).sendKeys("7");

        // Enter F&P Discount point
        driver.findElement(FeesDiscountPoints).clear();
        driver.findElement(FeesDiscountPoints).sendKeys("1.000");

        // Enter F&P origination Fees
        driver.findElement(FeesOriginationFees).clear();
        driver.findElement(FeesOriginationFees).sendKeys("0.00");

        // Enter F&P other Closing Costs
        driver.findElement(FeesOtherClosing).clear();
        driver.findElement(FeesOtherClosing).sendKeys("1200.00");

        // Enter F&P other Closing Costs
        driver.findElement(FederalIncomeTax).clear();
        driver.findElement(FederalIncomeTax).sendKeys("25.000");

        // Enter F&P other Closing Costs
        driver.findElement(StateTax).clear();
        driver.findElement(StateTax).sendKeys("5.000");


    }
    @Test
    public void calculateTotalRefi(){

        //giving wait time to below all iteration
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);


        //Calling navigate method from above
        navigateToRefinancePage();
        enterRefinanceDate();
        driver.findElement(CalculateButton).click();


        //Expected actualRefinancingBenefit
        String actualRefinancingBenefit = driver.findElement(TotalRefinancingBenefit).getText();
        //Assert.assertEquals(actualRefinancingBenefit,"$3,513.91");

//-----------------------------------------------------------------------------
        if (driver.findElement(TotalRefinancingBenefit).isDisplayed()) {
            Assert.assertEquals(actualRefinancingBenefit,"$3,513.91");
            System.out.println("Total Refinancing Benefit displaying as expected ");

        }else{
//DO SOMETHING ELSE AS SUBMIT BUTTON IS NOT THERE
            System.out.println("Total Refinancing Benefit did not matched");
        }


    }


    @AfterMethod
    public void closeBrowser(){

        //closing only automated manage browser
        driver.quit();
    }
}









