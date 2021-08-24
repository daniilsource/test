package AlfaBank;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Класс описывает страницу на которой
 * осуществляется переход к калькулятору.
 */
public class ToCalculatorLink extends BasePage {

    /**
     * Находим элемент - Кнопка Калькулятора.
     */
    @FindBy(xpath = "//*[@id=\"Benefit-Button-3\"]")
    public WebElement calcButton;


}
