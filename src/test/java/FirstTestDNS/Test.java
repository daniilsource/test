package FirstTestDNS;

import FirstDNS.*;

public class Test extends BaseTest {

    
    @org.junit.Test
    public void mainTest() {
        BasePage.nextPage(MainPage.autoCatLink);
        BasePage.nextPage(AutoCat.autoSoundCatLink);
        BasePage.nextPage(AutoSoundCat.autoBarCatLink);
        ItemsList.choseItem();
        BasePage.nextPage(ItemsList.basketBtn);
        BasketPage.checkBasket();

    }







}
