package FirstDNS;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Класс описывает веб элементы страницы
 * Со списком товаров категории Автомагнитолы
 */
public class SoundBarList extends BasePage {
    /**
     * Инициализация элементов страницы
     * Кнопка "Добавить в корзину"
     * Кнопка Корзины
     */
    @FindBy(xpath = "//button[text()='Купить']")
    public WebElement AddToBasketBtn;
    @FindBy(xpath = "//div[@data-code='1159493']")
    public WebElement finalItemLabel;
    @FindBy(xpath = "//span[@class=\"cart-link__lbl\"]")
    public WebElement basketBtn;


    /** Метод, выполняет клик по кнопке и присваивает уникальный ID элемента. */
    @Step("Добавляем элемент из списка в корзину")
    public void choseItem() {
        AddToBasketBtn.click();
    }






}
