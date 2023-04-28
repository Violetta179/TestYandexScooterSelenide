package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

public class PageTrack  extends LocatorsPageTrack{
    @Step("Проверить есть ли изображения, где написано что заказа нет")
    public void getNoOrder()
    {
        noOrder.shouldHave(Condition.enabled);
    }
}
