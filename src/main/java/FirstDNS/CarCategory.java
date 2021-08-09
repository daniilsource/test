package FirstDNS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarCategory extends BasePage {

    //Конструктор.
    public CarCategory() {
        super();
    }
    //Находим элемент.
    @FindBy(xpath = "//span[text()='Автозвук']")
    public static WebElement autoSoundCatLink;


}
