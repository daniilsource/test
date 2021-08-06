package FirstTestDNS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutoCat extends BasePage {

    //Конструктор.
    public AutoCat(WebDriver driver) {
        super(driver);
    }
    //Находим элемент.
    @FindBy(xpath = "//span[text()='Автозвук']")
    WebElement autoSoundCatLink;


}
