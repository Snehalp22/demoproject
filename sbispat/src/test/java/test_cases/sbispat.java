
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


public class sbispat {

    private WebDriver driver;


    @BeforeMethod
    public void setUp() throws MalformedURLException, InterruptedException {
        File app = new File("/Users/tailoredtech/Desktop/sbispat.app");

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

        driver.findElement(By.id("Allow")).click();
        driver.findElement(By.id("Phone Number")).click();
        driver.findElement(By.id("Phone Number")).sendKeys("9028249524");
        driver.findElement(By.id("LOGIN")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("OTP")).click();

        driver.findElement(By.id("OTP")).getText();
        Thread.sleep(40000);
       // driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //driver.findElement(By.id("iPhone 6 – iOS 10.2 (14C89)")).click();
        driver.findElement(By.id("VERIFY OTP")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("More")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("Logout")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("Cancel")).click();
        driver.findElement(By.id("Logout")).click();
        driver.findElement(By.id("Yes")).click();
        Thread.sleep(5000);

    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }
}
