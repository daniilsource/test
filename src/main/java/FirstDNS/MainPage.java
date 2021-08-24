package FirstDNS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Класс описывает главную страницу тестируемого сайта
 */
public class MainPage extends BasePage {

    /**
     * Инициализация веб элемента через XPATH
     * Ссылка на категорию АВТОТОВАРЫ
     */
    @FindBy(xpath = "//*[contains(text(),'Автотовары')]")
    public WebElement autoCatLink;


}

