package FirstDNS;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Класс описывает веб элементы страницы
 * Со списком товаров категории Автомагнитолы
 */
public class SoundBarList extends BasePage {

    /** Поле уникальный ID */
    public static int id;
    /**
     * Инициализация элементов страницы
     * Кнопка "Добавить в корзину"
     * Кнопка Корзины
     */
    @FindBy(xpath = "//button[text()='Купить']")
    public static WebElement AddToBasketBtn;
    @FindBy(xpath = "//div[@data-code='1159493']")
    public static WebElement finalItemLabel;
    @FindBy(xpath = "//span[@class=\"cart-link__lbl\"]")
    public static WebElement basketBtn;


    /** Метод, выполняет клик по кнопке и присваивает уникальный ID элемента. */
    @Step("Добавляем элемент из списка в корзину")
    public static void choseItem() {
        AddToBasketBtn.click();
        id = 1159493;
    }






}
