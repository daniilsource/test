package AlfaBank;

import WebDriverProvider.WebDriverProvider;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


/**
 * Класс базовой страницы.
 * Задает основные методы и конструктор
 * @author DAN
 * @version 1.3
 */
public class BasePage {

    /**
     * Базовый конструктор для страниц.
     * Создаёт новую страницу, инициализирую работу драйвера на этой странице
     */
    public BasePage() {
        PageFactory.initElements(WebDriverProvider.getDriver(),this);
    }
    /**
     * Метод делает клик по переданному в качестве параметра элементу страницы
     * @param element - элемент страницы
     */
    @Step("Кликает по элементу")
    public void click(WebElement element) {
        element.click();
    }
    /** Метод удаляет автозаполнение в Инпутах.
     * Принимает как параметр - Элемент input */
    @Step("Удаляем изначально введенные данные")
    public void backspace(WebElement element) {
        for (int i = 0; i < 7; i++) {
            element.sendKeys(Keys.BACK_SPACE);
        }
    }
    /**
     * Вводит указанные текст в поле элемента.
     * @param element - input, который принимает переданный текст
     * @param text - передает текст, взятый из данных в input
     */
    @Step("Вводим переданный текст в переданный инпут")
    public void inputText(WebElement element, String text) {
        element.sendKeys(text);
    }



}
