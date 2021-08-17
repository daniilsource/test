package FirstDNS;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import java.util.concurrent.TimeUnit;


/**
 * Класс инициализирует работу WebDriver'a
 * Производит настройку
 * И предоставляет доступ к нему через метод.
 */
public class WebDriverProvider {

    /** Объявление полей Объекта страницы и WebDriver'a */
   private static WebDriverProvider INSTANCE;
   private static WebDriver driver;

    /**
     * Приватный конструктор WebDriver
     * Производит инициализацию драйвера, его настройку
     * Берет необходимые данные из пропети файла.
     */
    private WebDriverProvider() {
        System.setProperty("webdriver.opera.driver",ConfProperties.getProperty("operadriver"));
        driver = new OperaDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("page"));
    }

    /** Метод создающий экземпляр класса при необходимости. Возвращает этот экземпляр */
    @Step("Создаём объект драйвера")
    public static WebDriverProvider getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new WebDriverProvider();
        }
        return INSTANCE;
    }
    /** Метод Геттер для драйвера. Возвращает драйвер. */
    @Step("Получаем драйвер")
    public static WebDriver getDriver() {
        return WebDriverProvider.driver;
    }

}
