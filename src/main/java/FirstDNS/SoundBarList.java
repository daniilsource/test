package FirstDNS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SoundBarList extends BasePage {

    public static int id;

    @FindBy(xpath = "//button[text()='Купить']")
    public static WebElement AddToBasketBtn;
    @FindBy(xpath = "//div[@data-code='1159493']")
    public static WebElement finalItemLabel;
    @FindBy(xpath = "//span[@class=\"cart-link__lbl\"]")
    public static WebElement basketBtn;


    public static void choseItem() {
        AddToBasketBtn.click();
        id = 1159493;
    }






}


// код магнитолы 1159493
