package FirstTestDNS;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import java.util.concurrent.TimeUnit;

public class Test {

    public static MainPage mainPage;
    public static MainPage2 mainPage2;
    public static MainPage3 mainPage3;
    public static ResultPage resultPage;
    public static BasketPage basketPage;
    public static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.opera.driver",ConfProperties.getProperty("operadriver"));
        WebDriver driver = new OperaDriver();
        mainPage = new MainPage(driver);
        mainPage2 = new MainPage2(driver);
        mainPage3 = new MainPage3(driver);
        resultPage = new ResultPage(driver);
        basketPage = new BasketPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("page"));
    }
    
    @org.junit.Test
    public void mainTest() {
        mainPage.goNext();
        mainPage2.goNext2();
        mainPage3.goNext3();
        resultPage.choseItem();
        resultPage.toBasket();
        basketPage.isHas();


    }







}
