package test_cases;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class sampletest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException, InterruptedException {
        File app = new File("/Users/tailoredtech/Desktop/IntegrationApp.app");

// set up appium
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "10.0.2");
        capabilities.setCapability("deviceName", "iPhone 6");
       // capabilities.setCapability("bundleId", "com.facebook.WebDriverAgentLib");
      //  capabilities.setCapability("browserName", "Safari");
       // capabilities.setCapability("automationName", "XCUITest");
       // capabilities.setCapability("networkConnectionEnabled", "true");
        //device id
       // capabilities.setCapability("udid", "5c4b4121a42e59c6c98a1d2b6747c8c62ff87935");
        //simulator id
       capabilities.setCapability("udid", "FADCA806-2578-47CE-B0F4-0BFBBBCCB1E1");
        //capabilities.setCapability("app","/Users/tailoredtech/desktop/IntegrationApp.app");

        capabilities.setCapability("app", app.getAbsolutePath());
      //  capabilities.setCapability("ipa", "/Users/tailoredtech/Desktop/IntegrationApp.ipa");
       // capabilities.setCapability("app", "Settings");
        driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

       driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

      //  WebDriverWait wait = new WebDriverWait(driver, 5);
       //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeButton[@name=\"Alerts\"]")));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("MainView")));
    }

    @Test
    public void test01() throws InterruptedException {
        //MobileElement el1 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Alerts\"]");el1.click();
     //driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Alerts\"]")).click();
        driver.findElement(By.id("Scrolling")).click();
        driver.findElement(By.id("TableView")).click();
        driver.findElement(By.id("99")).click();
        driver.findElement(By.id("ScrollView")).click();
      //  driver.scrollTo(4);
       driver.findElement(By.id("99")).click();
        Thread.sleep(5000);
        //driver.findElement(By.xpath("//window[1]/tableview[1]/cell[7]/text[1]")).click();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }
}
