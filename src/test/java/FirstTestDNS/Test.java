package FirstTestDNS;


import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import java.util.concurrent.TimeUnit;

public class Test {

    public static MainPage mainPage;
    public static AutoCat autoCat;
    public static AutoSoundCat autoSoundCat;
    public static ItemsList itemsList;
    public static BasketPage basketPage;
    public static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.opera.driver",ConfProperties.getProperty("operadriver"));
        WebDriver driver = new OperaDriver();
        mainPage = new MainPage(driver);
        autoCat = new AutoCat(driver);
        autoSoundCat = new AutoSoundCat(driver);
        itemsList = new ItemsList(driver);
        basketPage = new BasketPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("page"));
    }
    
    @org.junit.Test
    public void mainTest() {
        BasePage.nextPage(mainPage.autoCatLink);
        BasePage.nextPage(autoCat.autoSoundCatLink);
        BasePage.nextPage(autoSoundCat.autoBarCatLink);
        itemsList.choseItem();
        BasePage.nextPage(itemsList.basketBtn);
        basketPage.checkBasket();


    }







}
