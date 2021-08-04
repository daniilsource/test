package FirstTestDNS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage {

    public WebDriver driver;
    public ResultPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[2]/div[1]/div/div[2]/div[1]/div[4]/button[2]")
    private WebElement finalItemGet;

    @FindBy(xpath = "//*[@id=\"header-search\"]/div/div[1]/div[2]/a[3]/span[3]")
    private WebElement basketBtn;

    public void choseItem() {
        finalItemGet.click();
    }

    public void toBasket() {
        basketBtn.click();
    }
}
