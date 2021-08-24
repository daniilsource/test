package AlfaBank;


import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Класс описывает страницу калькулятора.
 * Объявляет необходимые поля ввода
 * И параметры для сравнения.
 *
 */
public class CalculatorPage extends BasePage {

    /** Поле ввода полной стоимости квартиры */
    @FindBy(xpath = "//*[@id=\"estateCost\"]")
    public WebElement costinput;
    /** Поле вводы первоначального взноса */
    @FindBy(xpath = "//*[@id=\"initialFee\"]")
    public WebElement firstPayInput;
    /** Поле ввода срока ипотеки */
    @FindBy(xpath = "//*[@id=\"creditTerm\"]")
    public WebElement termInput;
    /** Поле с результатом ежемесячного платежа для сравнения */
    @FindBy(xpath = "//*[@id=\"calc\"]/div/div/div[2]/div[2]/div/div[2]/div[2]/div/div/div[1]/div[2]/div/p")
    public WebElement monthlyPay;
    /** Поле с результатом налогового вычета для сравнения */
    @FindBy(xpath = "//*[@id=\"tax-deduction-block\"]/div[2]/p")
    public WebElement taxFree;
    /** Метод сравнивающий переданные параметры
     * @param text = Ожидаемый результат.
     * @param element = Элемент, у которого считывается полученное значение для сравнения
     */
    @Step("Сравниваем полученные данные с ожидаемыми")
    public void checkValues(String text, WebElement element) {
        Assert.assertEquals(text, element.getText());
    }





}
