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

    @FindBy(xpath = "//span[text()='Автомагнитолы']")
    private WebElement autoCategory3;

    public void goNext3() {
        autoCategory3.click();
    }

}



