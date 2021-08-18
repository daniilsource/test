package FirstTestDNS;

import WebDriverProvider.WebDriverProvider;
import org.junit.AfterClass;
import org.junit.BeforeClass;

/**
 * Базовый тестовый класс
 * Производит запуск, настройку, и завершение работы драйвера.
 */
public class BaseTest {

    /**
     * Метод выполняющийся перед основным классом.
     * Производит настройку драйвера, создавая экземпляр класса.
     */
    @BeforeClass
    public static void setup() {
        WebDriverProvider.getInstance();
    }

    /**
     * Метод, вступает в работу после основного теста.
     * Закрывает вебдрайвер и браузер.
     */
    @AfterClass
    public static void close() {
        WebDriverProvider.getDriver().quit();

    }
}
