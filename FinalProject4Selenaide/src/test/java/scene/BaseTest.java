package scene;

import com.codeborne.selenide.Configuration;
import org.junit.BeforeClass;


public class BaseTest {

    @BeforeClass
    public static void configBrowser()
    {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://qa-scooter.praktikum-services.ru";
    }
}
