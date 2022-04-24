package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class WebDriverClass {
    public static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void startDriverSession(String browserProperty) {
        try {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setBrowserName(browserProperty);
            driver = new RemoteWebDriver(new URL("http://localhost:4444/"), desiredCapabilities);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

