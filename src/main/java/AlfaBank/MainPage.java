package AlfaBank;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Класс описывает главную страницу тестируемого сайта
 */
public class MainPage extends BasePage {

    /**
     * Инициализация веб элемента через XPATH.
     * Заходим в раздел ИПОТЕКА
     */
    @FindBy(xpath = "//*[@title='Ипотека']")
    public WebElement ipotekaLink;
}
