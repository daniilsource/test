package FirstDNS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    //Конструктор
    public MainPage() {
        super();
    }
    //Находим элемент
    @FindBy(xpath = "//*[contains(text(),'Автотовары')]")
    public static WebElement autoCatLink;


}

