package FirstDNS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Класс описывающий страницу
 * Категория Автозвук
 */
public class CarSoundCategory extends BasePage {
    /**
     * Инициализация вебэлемента через XPATH
     * Ссылка на категорию Автомагнитолы
     */
    @FindBy(xpath = "//span[text()='Автомагнитолы']")
    public static WebElement autoBarCatLink;



}



