package AlfaBankTest;

import AlfaBank.*;
import WebDriverProvider.ConfProperties;

public class TestAlfa extends BaseTest {


    @org.junit.Test
    public void mainTest() {
        var mainPage = new MainPage();
        var calculator = new ToCalculatorLink();
        var calculatorPage = new CalculatorPage();
        mainPage.click(mainPage.ipotekaLink);
        calculator.click(calculator.calcButton);
        calculatorPage.backspace(calculatorPage.costinput);
        calculatorPage.inputText(calculatorPage.costinput, ConfProperties.getProperty("fullprice"));
        calculatorPage.backspace(calculatorPage.firstPayInput);
        calculatorPage.inputText(calculatorPage.firstPayInput, ConfProperties.getProperty("firstpay"));
        calculatorPage.backspace(calculatorPage.termInput);
        calculatorPage.inputText(calculatorPage.termInput, ConfProperties.getProperty("term"));
        calculatorPage.checkValues(ConfProperties.getProperty("taxfree"), calculatorPage.taxFree);
        calculatorPage.checkValues(ConfProperties.getProperty("monthlypay"), calculatorPage.monthlyPay);



    }
}
