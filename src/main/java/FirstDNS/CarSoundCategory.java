package FirstDNS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarSoundCategory extends BasePage {

    //Конструктор
    public CarSoundCategory() {
        super();
    }
    //Находим элемент

    @FindBy(xpath = "//span[text()='Автомагнитолы']")
    public static WebElement autoBarCatLink;



}



