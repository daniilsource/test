package FirstTestDNS;

import FirstDNS.DriverStart;
import org.junit.AfterClass;
import org.junit.BeforeClass;


public class BaseTest extends DriverStart {

    @BeforeClass
    public static void setup() {
        DriverStart.driverStart();
    }
    @AfterClass
    public static void close() {
        DriverStart.driver.quit();
    }
}
