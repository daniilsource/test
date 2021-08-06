package FirstTestDNS;

import FirstDNS.*;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import java.util.concurrent.TimeUnit;

public class Test {

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.opera.driver",ConfProperties.getProperty("operadriver"));
        WebDriver driver = new OperaDriver();
        MainPage mainPage = new MainPage(driver);
        AutoCat autoCat = new AutoCat(driver);
        AutoSoundCat autoSoundCat = new AutoSoundCat(driver);
        ItemsList itemsList = new ItemsList(driver);
        BasketPage basketPage = new BasketPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("page"));
    }
    
    @org.junit.Test
    public void mainTest() {
        BasePage.nextPage(MainPage.autoCatLink);
        BasePage.nextPage(AutoCat.autoSoundCatLink);
        BasePage.nextPage(AutoSoundCat.autoBarCatLink);
        ItemsList.choseItem();
        BasePage.nextPage(ItemsList.basketBtn);
        BasketPage.checkBasket();


    }







}
