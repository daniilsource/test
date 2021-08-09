package FirstDNS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    @FindBy(xpath = "//*[contains(text(),'Автотовары')]")
    public static WebElement autoCatLink;


}

