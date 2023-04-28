package scene.additional;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Description;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.MainPageScooter;
import pages.PageOrder;
import pages.PageTrack;
import scene.BaseTest;

import static com.codeborne.selenide.Selenide.open;


public class TestLogoErrorNoOrder extends BaseTest {

    private PageOrder pageOrder;
    private MainPageScooter mainPageScooter;
    private PageTrack pageTrack;
    final String urlScooter = "https://qa-scooter.praktikum-services.ru/";
    final String urlYandex = "https://dzen.ru/?yredirect=true";

    @Before
    public void setUp()
    {
        open("/");
        //Неуверенна в это части
        WebDriverRunner.getWebDriver().manage().window().maximize();
        pageOrder = new PageOrder();
        mainPageScooter = new MainPageScooter();
        pageTrack = new PageTrack();
    }


    @Test
    @Description("Если нажать на логотип «Самоката», попадёшь на главную страницу «Самоката»")
    public void checkLogoScooterGetMainPage()
    {
        mainPageScooter.getLogoScooter();
        mainPageScooter.getTrueUrlScooter(urlScooter);
    }

    @Test
    @Description("Если нажать на логотип Яндекса, в новом окне откроется главная страница Яндекса.")
    public void checkLogoYandexGetMainPageYandex()
    {
        mainPageScooter.getLogoYandex();
        mainPageScooter.getTrueUrlYandex(urlYandex);
    }

    @Test
    @Description("Проверить ошибки для всех полей формы заказа.")
    public void checkFormOneErrorGetMessageError() {
        pageOrder.getMessageErrorFormOne();}

    @Test
    @Description("Проверить ошибки для всех полей формы заказа.")
    public void checkFormTwoErrorGetMessageError()
    {
        pageOrder.getOrder();
        pageOrder.setName("Виолетта");
        pageOrder.setSurname("Вашина");
        pageOrder.setAddress("Кабяка");
        pageOrder.setMetro();
        pageOrder.setPhoneNumber("+375295873656");
        pageOrder.setNextButton();
        pageOrder.getMessageErrorFormTwo();
    }

    @Test
    @Description("Если ввести неправильный номер заказа, попадёшь на страницу статуса заказа. На ней должно быть написано, что такого заказа нет")
    public void checkStatusOrderGetNoOrder()
    {
        mainPageScooter.clickOrderStatus();
        mainPageScooter.setNumberOrder();
        mainPageScooter.clickGo();
        pageTrack.getNoOrder();
    }

    @After
    public void tearDown()
    {
        Selenide.closeWebDriver();
    }
}
