package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

import java.util.ArrayList;
import java.util.List;



public class LocatorsMainPage {
    //button "yes, everyone is used to it"-accepting cookies
    public SelenideElement cookies = $(byId("rcc-confirm-button"));
    //logo "Scooter"
    protected SelenideElement logoScooter = $(byXpath("//a[contains(@class, 'Header_LogoScooter')]"));
    //logo "Yandex"
    protected SelenideElement logoYandex = $(byXpath("//a[contains(@class, 'Header_LogoYandex')]"));
    //button "Order status"
    protected SelenideElement orderStatus = $(byXpath("//div[contains(@class, 'Header')]//button[text() = 'Статус заказа']"));
    //text field for entering the order number
    protected SelenideElement numberOrder = $(byXpath("//input[@placeholder='Введите номер заказа']"));
    //button "Go!"
    protected SelenideElement buttonGo = $(byXpath("//div[contains(@class, 'Header')]//button[text() = 'Go!']"));
    //buttons arrows
    protected List<SelenideElement> arrows = new ArrayList<>();
    //the text that appears after clicking the arrows
    protected List<SelenideElement> arrowsText = new ArrayList<>();
    protected void findArrows()
    {
        for(int i = 0;i<8;i++)
        {
            arrows.add($(byXpath("//div[@id=\"accordion__heading-"+i+"\"]")));
        }
    }
    protected void findTextArrows()
    {
        for(int i = 0;i<8;i++)
        {
            arrowsText.add($(byXpath("//div[@id=\"accordion__panel-"+i+"\"]")));
        }

    }
}
