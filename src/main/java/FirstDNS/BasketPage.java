package FirstDNS;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPage extends BasePage {

    @FindBy(xpath = "//div[@class=\"cart-items__product-code\"]")
    public static WebElement itemResult;

    public static void checkBasket() {Assert.assertEquals("1159493",itemResult.getText());}



}
