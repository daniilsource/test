package FirstDNS;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class BasePage {


    public BasePage() {
        PageFactory.initElements(WebDriverProvider.getDriver(),this);
    }


    public static void click(WebElement element) {
        element.click();
    }

}
