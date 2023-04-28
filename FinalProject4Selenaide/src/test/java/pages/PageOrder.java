package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import static com.codeborne.selenide.Condition.exactText;

public class PageOrder extends LocatorsPageOrder {
    @Step("Нажать на кнопку заказа")
    public void getOrder()
    {
        buttonOrder.click();
    }
    @Step("Ввести имя заказа")
    public void setName(String name)
    {
        inputName.setValue(name);
    }
    @Step("Ввести фамилию заказа")
    public void setSurname(String surname)
    {
        inputSurname.setValue(surname);
    }
    @Step("Ввести адрес заказа")
    public void setAddress(String address)
    {
        inputAddress.setValue(address);
    }
    @Step("Выбрать станцию метро")
    public  void setMetro()
    {
        inputMetro.sendKeys(Keys.DOWN,Keys.ENTER);
    }
    @Step("Ввести номер телефона")
    public void setPhoneNumber(String numberPhone)
    {
        inputNumberPhone.setValue(numberPhone);
    }
    @Step("Нажать на кнопку Дальше")
    public void setNextButton()
    {
        buttonNext.click();
    }
    @Step("Выбрать дату, когда привезти самокат")
    public void setArrivalDate(String arrival)
    {
        inputArrival.sendKeys(arrival+Keys.ENTER);
    }
    @Step("Выбрать срок аренды")
    public void setRentalPeriod()
    {
        inputFieldPeriod.click();
        inputChoosePeriod.click();
    }
    @Step("Выбрать цвет аренда")
    public void setScooterColor()
    {
        chooseColor.click();
    }
    @Step("Оставить комментарий для Курьера")
    public void setCommentCourier(String comment)
    {
        commentCourier.setValue(comment);
    }
    @Step("Нажать на конпку Заказать, после заполения полей заказа")
    public void setFinalOrder()
    {
        finalOrder.click();
    }
    @Step("Нажать кнопку заказать")
    public void clickYesButton()
    {
        buttonYes.click();
    }
    @Step("Получить сообщения о том, что заказ оформлен")
    public void orderVerification(){
             setMessage.shouldHave(exactText("Заказ оформлен"));
    }
    @Step("Проверить ошибки для первого поля формы заказа")
    public void getMessageErrorFormOne()
    {
        buttonOrder.click();
        buttonNext.click();
        errorName.shouldHave(exactText("Введите корректное имя"));
        errorSurname.shouldHave(exactText("Введите корректную фамилию"));
        errorAddress.shouldHave(exactText("Введите корректный адрес"));
        errorMetro.shouldHave(exactText("Выберите станцию"));
        errorPhone.shouldHave(exactText("Введите корректный номер"));
    }
    @Step("Проверить ошибки для второго поля заказа")
    public void getMessageErrorFormTwo()
    {
        finalOrder.click();
        errorArrival.shouldHave(exactText("Введите корректную дату"));
        errorPeriod.shouldHave(exactText("Введите корректный срок"));
        errorColor.shouldHave(exactText("Выберите цвет"));

    }
}
