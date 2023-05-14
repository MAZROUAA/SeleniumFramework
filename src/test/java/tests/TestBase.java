package tests;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utilityhelper.Helper;

import java.io.IOException;
import java.lang.ref.PhantomReference;
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
    else if(browsername.equalsIgnoreCase("headless"))
    {
        //downlaod el driver
        DesiredCapabilities caps=new DesiredCapabilities();
        caps.setJavascriptEnabled(true);

       String[] phantomjsArg={"--web-security=no","--ignore-ssl-errors=yes"};
       caps.setCapability(PhantomJSDriverService.PHANTOMJS_CLI_ARGS,phantomjsArg);

        driver=new PhantomJSDriver();
    }
    else if(browsername.equalsIgnoreCase("chrome-headless"))
    {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--window-size=1920,1080");
        driver=new ChromeDriver(options);

    }

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
