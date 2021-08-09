package FirstDNS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import java.util.concurrent.TimeUnit;

public class WebDriverProvider {

    public static WebDriver driver;

    public static void driverStart() {
        System.setProperty("webdriver.opera.driver",ConfProperties.getProperty("operadriver"));
        driver = new OperaDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("page"));

    }

    public static WebDriver getDriver() {
        return driver;
    }
}
