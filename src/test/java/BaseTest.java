import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import helpers.WebDriverClass;
import com.google.common.io.Files;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;


import static helpers.WebDriverClass.getDriver;

public abstract class BaseTest {
    @BeforeClass
    @Parameters("browser")
    public void startRemoteServer(String browser){
        WebDriverClass.startDriverSession(browser);
    }
    @BeforeMethod
    public void startDriver() {
        getDriver().get("https://www.flightclub.com");
    }
    @AfterMethod
    public void quitDriver() {
        WebDriverClass.getDriver().quit();
    }
    @AfterMethod
    public void recordFailure(ITestResult result){
        if(ITestResult.FAILURE == result.getStatus())
        {
            TakesScreenshot camera = (TakesScreenshot)getDriver();
            File screenshot = ((TakesScreenshot) camera).getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File("src/resources/screenshots" + result.getName() + ".png"));
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        getDriver().quit();
    }



}
