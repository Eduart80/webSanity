package WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class web {

    private static WebDriver driver;
    @Before
    public void inDriver(){
        System.setProperty("webdriver.chrome.driver","./chrome/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.firealarmandsecurity.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
   // @After
    public void quitDriver(){
        driver.quit();
    }
    public static WebDriver getDriver(){
        return driver;
    }

}
