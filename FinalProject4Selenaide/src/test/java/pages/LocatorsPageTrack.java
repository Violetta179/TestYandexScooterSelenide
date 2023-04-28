package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.element;

public class LocatorsPageTrack {
    protected SelenideElement noOrder = element(byXpath("//img[@alt='Not found']"));
}
