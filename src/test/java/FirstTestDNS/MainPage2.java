package FirstTestDNS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage2 {

    public WebDriver driver;
    public MainPage2(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "/html/body/div[1]/div[1]/a[2]/div[1]/span")
    private WebElement autoCategory2;

    public void goNext2() {
        autoCategory2.click();
    }
}
