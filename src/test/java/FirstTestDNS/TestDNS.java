package FirstTestDNS;

import FirstDNS.*;

/**
 * Основной тестовый класс.
 */
public class TestDNS extends BaseTest {

    /**
     * Главный тест.
     * Инициализирует страницы.
     * Производит требуемые действия, использую методы страниц.
     */
    @org.junit.Test
    public void mainTest() {
        var mainPage = new MainPage();
        var carCategory = new CarCategory();
        var carSoundCategory = new CarSoundCategory();
        var soundBarList = new SoundBarList();
        var basketPage = new BasketPage();

        mainPage.click(mainPage.autoCatLink);
        carCategory.click(carCategory.autoSoundCatLink);
        carSoundCategory.click(carSoundCategory.autoBarCatLink);
        soundBarList.choseItem();
        soundBarList.click(soundBarList.basketBtn);
        basketPage.checkBasket(1159492);

    }







}
