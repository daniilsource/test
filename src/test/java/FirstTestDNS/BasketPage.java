package FirstTestDNS;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasketPage {


    public WebDriver driver;
    public BasketPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    @FindBy(xpath = "//div[@class=\"cart-items__product-code\"]")
    WebElement itemResult;

    public void isHas() {Assert.assertEquals("1159493",itemResult.getText());}



}
