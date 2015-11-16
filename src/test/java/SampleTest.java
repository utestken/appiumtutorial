import io.appium.java_client.ios.IOSDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Ken Ho on 2015-11-16.
 */
public class SampleTest {
    RemoteWebDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "iPhone 6");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "9.1");
        capabilities.setCapability("browserName", "safari");

        this.driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),
                capabilities);
    }

    @Test
    public void firstTest() {
        this.driver.get("http://google.com");
        Assert.assertEquals("Title should be Google", "Google", driver.getTitle());
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
