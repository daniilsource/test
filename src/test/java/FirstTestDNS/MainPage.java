package FirstTestDNS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MainPage {

    public WebDriver driver;
    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;


    }
    @FindBy(xpath = "//*[@id=\"homepage-desktop-menu-wrap\"]/div/div[10]/div[1]/a")
    WebElement autoCategory;



    public void goNext() {
        autoCategory.click();
    }

}
