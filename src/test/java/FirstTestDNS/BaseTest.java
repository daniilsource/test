package FirstTestDNS;

import FirstDNS.WebDriverProvider;
import org.junit.AfterClass;
import org.junit.BeforeClass;


public class BaseTest extends WebDriverProvider {

    @BeforeClass
    public static void setup() {
        WebDriverProvider.driverStart();
    }
    @AfterClass
    public static void close() {
        WebDriverProvider.driver.quit();
    }
}
