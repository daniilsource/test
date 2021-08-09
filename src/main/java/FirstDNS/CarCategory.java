package FirstDNS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarCategory extends BasePage {

    @FindBy(xpath = "//span[text()='Автозвук']")
    public static WebElement autoSoundCatLink;


}
