package FirstDNS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarSoundCategory extends BasePage {

    //Конструктор
    public CarSoundCategory(WebDriver driver) {
        super(driver);
    }
    //Находим элемент
    @FindBy(xpath = "//span[text()='Автомагнитолы']")
    public static WebElement autoBarCatLink;



}



