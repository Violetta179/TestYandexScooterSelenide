package scene.two;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Description;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import pages.PageOrder;
import scene.BaseTest;

import java.util.Arrays;
import java.util.Collection;

import static com.codeborne.selenide.Selenide.open;


@RunWith(Parameterized.class)
public class TestOrder extends BaseTest {
    public final String name;
    public final String surname;
    public final String address;
    public final String numberPhone;
    public final String arrival;
    public final String comment;
    private PageOrder pageOrder;
    public TestOrder(String name, String surname, String address, String numberPhone, String arrival, String comment) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.numberPhone = numberPhone;
        this.arrival = arrival;
        this.comment = comment;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
                {"Виолетта","Вашина","Кабяка", "+375295873656","21.07.2024","Хорошего дня"},
                {"Иван","Иванов","Иваныч", "+375292222222","23.07.2025","Хорошего вечера"}
        };
        return Arrays.asList(data);
    }
    @Before
    public void setUp()
    {
        open("/");
        pageOrder = new PageOrder();
    }

    @Test
    @Description("Заказать самокат, необходимо заполнить форму для заказа, и получить сообщения об успешно созданном заказе")
    public void testShowMessageError()
    {

        WebDriverRunner.getWebDriver().manage().window().maximize();
        pageOrder.getOrder();
        pageOrder.setName(name);
        pageOrder.setSurname(surname);
        pageOrder.setAddress(address);
        pageOrder.setMetro();
        pageOrder.setPhoneNumber(numberPhone);
        pageOrder.setNextButton();
        pageOrder.setArrivalDate(arrival);
        pageOrder.setRentalPeriod();
        pageOrder.setScooterColor();
        pageOrder.setCommentCourier(comment);
        pageOrder.setFinalOrder();
        pageOrder.clickYesButton();
        pageOrder.orderVerification();
    }
    @After
    public void tearDown()
    {
        Selenide.closeWebDriver();
    }

}
