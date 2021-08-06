package FirstTestDNS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    //Конструктор
    public MainPage(WebDriver driver) {
        super(driver);
    }
    //Находим элемент
    @FindBy(xpath = "//*[contains(text(),'Автотовары')]")
    WebElement autoCatLink;


}

