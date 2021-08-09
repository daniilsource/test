package FirstDNS;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Класс описывающий элементы страницы Корзины.
 */
public class BasketPage extends BasePage {

    /**
     * Инициализация товара в корзине в качестве веб элемента через XPATH
     */
    @FindBy(xpath = "//div[@class=\"cart-items__product-code\"]")
    public static WebElement itemResult;

    /**
     * Финальная проверка на соответствие.
     * Проверяет, совпадает ли уникальный код товара в корзине
     * С товаром, который мы добавляли
     * В качестве параметров принимает Ожидаемый ID и Гетает ID у элемента в корзине.
     */
    public static void checkBasket() {Assert.assertEquals("1159492",itemResult.getText());}



}
