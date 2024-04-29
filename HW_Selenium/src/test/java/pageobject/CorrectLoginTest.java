package pageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class CorrectLoginTest {
    public static final String LIGHT_GREEN = "rgba(214, 236, 166, 1)";
        private WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.get("https://litecart.stqa.ru/en/");
    }
    @Test
    public void correctLoginTest() {
        String expectedSuccessMessageText = "You are now logged in as Daria Folomeeva.";
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        loginPage.attemptLogin("d.folomeeva1987@gmail.com", "QWERTY");

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(homePage.getSuccessMessageText(), expectedSuccessMessageText);
        softAssert.assertEquals(homePage.getSuccessMessageBgColor(), LIGHT_GREEN);
        softAssert.assertTrue(homePage.successMessageIsVisible(), "Success message is not visible");

        softAssert.assertAll();

        driver.quit();
    }
}