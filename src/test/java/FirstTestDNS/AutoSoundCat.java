package FirstTestDNS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutoSoundCat extends BasePage {

    //Конструктор
    public AutoSoundCat(WebDriver driver) {
        super(driver);
    }
    //Находим элемент
    @FindBy(xpath = "//span[text()='Автомагнитолы']")
    WebElement autoBarCatLink;



}



