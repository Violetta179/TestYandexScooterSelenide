package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.element;

public class LocatorsPageOrder {
    protected SelenideElement buttonOrder = element(byXpath("//div[contains(@class, 'Header')]//button[text() = 'Заказать']"));
    protected SelenideElement inputName = element(byXpath("//input[@placeholder='* Имя']"));
    protected SelenideElement errorName = element(byXpath("//div[text()='Введите корректное имя']"));
    protected SelenideElement inputSurname = element(byXpath("//input[@placeholder='* Фамилия']"));
    protected SelenideElement errorSurname = element(byXpath("//div[text()='Введите корректную фамилию']"));
    protected SelenideElement inputAddress = element(byXpath("//input[@placeholder='* Адрес: куда привезти заказ']"));
    protected SelenideElement errorAddress = element(byXpath("//div[text()='Введите корректный адрес']"));
    protected SelenideElement inputMetro =  element(byXpath("//input[@placeholder='* Станция метро']"));
    protected SelenideElement errorMetro = element(byXpath("//div[text()='Выберите станцию']"));
    protected SelenideElement inputNumberPhone = element(byXpath("//input[@placeholder='* Телефон: на него позвонит курьер']"));
    protected SelenideElement errorPhone = element(byXpath("//div[text()='Введите корректный номер']"));
    protected SelenideElement buttonNext = element(byXpath("//div[contains(@class, 'Order')]//button[text() = 'Далее']"));
    protected SelenideElement inputArrival = element(byXpath("//input[@placeholder='* Когда привезти самокат']"));
    protected SelenideElement errorArrival = element(byXpath("//div[text()='Введите корректную дату']"));
    protected SelenideElement inputFieldPeriod = element(byXpath("//div[text() = '* Срок аренды']"));
    protected SelenideElement inputChoosePeriod = element(byXpath("//div[text() = 'сутки']"));
    protected SelenideElement errorPeriod = element(byXpath("//div[text()='Введите корректный срок']"));
    protected SelenideElement chooseColor = element(byId("black"));
    protected SelenideElement errorColor = element(byXpath("//div[text()='Выберите цвет']"));
    protected SelenideElement commentCourier = element(byXpath("//input[@placeholder='Комментарий для курьера']"));
    protected SelenideElement finalOrder = element(byXpath("//div[contains(@class, 'Order')]//button[text() = 'Заказать']"));
    protected SelenideElement buttonYes = element(byXpath("//div[contains(@class, 'Order')]//button[text() = 'Да']"));
    protected SelenideElement setMessage = element(byXpath("//div[text()='Заказ оформлен']"));
}
