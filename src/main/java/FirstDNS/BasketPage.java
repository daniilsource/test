package FirstDNS;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import io.qameta.allure.Step;

/**
 * Класс описывающий элементы страницы Корзины.
 */
public class BasketPage extends BasePage {

    /**
     * Инициализация товара в корзине в качестве веб элемента через XPATH
     */
    @FindBy(xpath = "//div[@class=\"cart-items__product-code\"]")
    public WebElement itemResult;

    /**
     * Финальная проверка на соответствие.
     * Проверяет, совпадает ли уникальный код товара в корзине
     * С товаром, который мы добавляли
     * В качестве параметров принимает Ожидаемый ID и Гетает ID у элемента в корзине.
     */
    @Step("Проверка наличия товара в корзине")
    public void checkBasket(int id) {Assert.assertEquals("1159492",itemResult.getText());}



}
