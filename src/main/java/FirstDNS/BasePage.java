package FirstDNS;

import WebDriverProvider.WebDriverProvider;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * Класс базовой страницы.
 * Задает основные методы и конструктор
 * @author DAN
 * @version 1.3
 */

public class BasePage {

    /**
     * Базовый конструктор для страниц.
     * Создаёт новую страницу, инициализирую работу драйвера на этой странице
     */
    public BasePage() {
        PageFactory.initElements(WebDriverProvider.getDriver(),this);
    }
    /**
     * Метод делает клик по переданному в качестве параметра элементу страницы
     * @param element - элемент страницы
     */
    @Step("Метод клик по"  )
    public static void click(WebElement element) {
        element.click();
    }

}
