package FirstDNS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.PageFactory;


public class BasePage {


    public BasePage() {
        PageFactory.initElements(DriverStart.getDriver(),this);
    }


    public static void click(WebElement element) {
        element.click();
    }

}
