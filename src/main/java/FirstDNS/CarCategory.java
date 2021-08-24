package FirstDNS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Класс описывающий веб элементы страницы
 * Категория Автотовары
 */
public class CarCategory extends BasePage {
    /**
     * Инициализация элемента страницы через XPATH
     * Ссылка для перехода в следующую подкатегорию
     */
    @FindBy(xpath = "//span[text()='Автозвук']")
    public WebElement autoSoundCatLink;


}
