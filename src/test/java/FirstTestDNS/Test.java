package FirstTestDNS;

import FirstDNS.*;

public class Test extends BaseTest {

    
    @org.junit.Test
    public void mainTest() {
        new MainPage(getDriver());
        new CarCategory(getDriver());
        new CarSoundCategory(getDriver());
        new SoundBarList(getDriver());
        new BasketPage(getDriver());
        MainPage.click(MainPage.autoCatLink);
        CarCategory.click(CarCategory.autoSoundCatLink);
        CarSoundCategory.click(CarSoundCategory.autoBarCatLink);
        SoundBarList.choseItem();
        SoundBarList.click(SoundBarList.basketBtn);
        BasketPage.checkBasket();

    }







}
