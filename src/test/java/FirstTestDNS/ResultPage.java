package FirstTestDNS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage {


    public static int id;
    public WebDriver driver;
    public ResultPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }


    @FindBy(xpath = "//button[text()='Купить']")
    private WebElement finalItemGet;

    @FindBy(xpath = "//div[@data-code='1159493']")
    private WebElement finalItemLabel;

    @FindBy(xpath = "//span[@class=\"cart-link__lbl\"]")
    private WebElement basketBtn;


    public void choseItem() {
        finalItemGet.click();

        id = 1159493;
    }

    public void toBasket() {
        basketBtn.click();
    }




}


// код магнитолы 1159493
