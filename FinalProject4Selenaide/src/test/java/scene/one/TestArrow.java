package scene.one;

import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.MainPageScooter;
import scene.BaseTest;
import io.qameta.allure.Description;

import static com.codeborne.selenide.Selenide.open;

public class TestArrow extends BaseTest {
    MainPageScooter mainPageScooter;

    @Before
    public void setUp()
    {
        open("/");
        mainPageScooter = new MainPageScooter();
    }

    @Test
    @Description("При нажатии на кнопку появляется соотвествующий текст")
    public void testClickArrow()
    {
        mainPageScooter.acceptCookies();
        for(int i =0;i<8;i++)
        {
          mainPageScooter.getArrow(i);
          mainPageScooter.getTextElement(i);
        }
    }
    @After
    public void tearDown()
    {
        Selenide.closeWebDriver();
    }
}
