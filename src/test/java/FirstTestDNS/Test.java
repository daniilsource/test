package FirstTestDNS;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class Test {

    public static void setup() {
        System.setProperty("webdriver.opera.driver",ConfProperties.getProperty("operadriver"));
        WebDriver driver = new OperaDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("page"));
    }
}
