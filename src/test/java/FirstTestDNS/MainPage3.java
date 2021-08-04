package FirstTestDNS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage3 {

    public WebDriver driver;
    public MainPage3(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "/html/body/div[1]/div[1]/a[1]/div[1]/span")
    private WebElement autoCategory3;

    public void goNext3() {
        autoCategory3.click();
    }

}



