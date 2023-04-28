package pages;


import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.switchTo;

import static com.codeborne.selenide.WebDriverRunner.url;
import static org.junit.Assert.assertEquals;


public class MainPageScooter  extends LocatorsMainPage{

    @Step("Принятие куки-файлов")
    public void acceptCookies()
    {
        cookies.click();
    }
    @Step("Нажатие на стрелочку")
    public void getArrow(int i)
    {
        findArrows();
        arrows.get(i).click();
    }
    @Step("Получить соотвественный текст, после нажатие кнопки")
    public void getTextElement(int i )
    {
        findTextArrows();
        arrowsText.get(i).shouldHave();
    }
    @Step("Нажать на логотип Самоката")
    public void getLogoScooter()
    {
        logoScooter.click();
    }
    @Step("Нажатать на логотип яндекса")
    public void getLogoYandex()
    {
        logoYandex.click();
    }
    @Step("Проверить урл Самоката")
    public void getTrueUrlScooter(String trueUrl) {
        switchTo().window(0);
        assertEquals(trueUrl, url());
    }
    @Step("Проверить урл Янлекса")
    public void getTrueUrlYandex(String url) {
      switchTo().window(1);
      assertEquals(url, url());
    }
    @Step("Нажать на статус заказа")
    public void clickOrderStatus()
    {
        orderStatus.click();
    }
    @Step("Ввод неправильного номера заказа")
    public void setNumberOrder()
    {
        numberOrder.setValue("1111");
    }
    @Step("Нажать на копку Go!")
    public void clickGo()
    {
        buttonGo.click();
    }
}
