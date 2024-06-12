package selenide;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.testng.SoftAsserts;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Selenide.open;

@Listeners({ SoftAsserts.class})
public class TestBase {
    @BeforeMethod
    protected void setup() {
        Configuration.browser = CHROME;
        Configuration.pageLoadTimeout = 5000;
        Configuration.browserSize = "1366x768";
        Configuration.baseUrl = "https://litecart.stqa.ru/en/";

        open(Configuration.baseUrl);
    }
}