package FirstTestDNS;

import FirstDNS.*;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.opera.driver",ConfProperties.getProperty("operadriver"));
        WebDriver driver = new OperaDriver();
        MainPage mainPage = new MainPage(driver);
        CarCategory carCategory = new CarCategory(driver);
        CarSoundCategory carSoundCategory = new CarSoundCategory(driver);
        SoundBarList soundBarList = new SoundBarList(driver);
        BasketPage basketPage = new BasketPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("page"));
    }
}
