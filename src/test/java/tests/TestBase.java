package tests;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utilityhelper.Helper;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase extends AbstractTestNGCucumberTests {
public  static WebDriver driver;
@BeforeSuite
@Parameters({"browser"})
public void startdriver(@Optional("edge") String browsername)
{
    if(browsername.equalsIgnoreCase("edge")){
    driver=new EdgeDriver();}
    else if(browsername.equalsIgnoreCase("firefox")){
        driver=new FirefoxDriver();}

    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    driver.navigate().to("https://demo.nopcommerce.com/");
}
@AfterSuite
public void stopdriver()
{
   driver.quit();
}
//Take screenshot after testcasefail
@AfterMethod
public  void screenshotOnFailure(ITestResult result) throws IOException {
     if(result.getStatus()==ITestResult.FAILURE)
     {
         System.out.println("failed --taking screenshot");
         Helper.takeScreenShot(driver,result.getName());
     }
}
}
