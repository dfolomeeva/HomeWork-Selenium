package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.time.Duration;


public class IncorrectLoginTest {
    public static final String LIGHT_PINK = "rgba(255, 204, 204, 1)";
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
    public void incorrectLoginTest() {
        String expectedErrorMessageText = "Wrong password or the account is disabled, or does not exist";
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        loginPage.attemptLogin("d.folomeeva1987@gmail.com", "12345");

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(homePage.getErrorMessageText(), expectedErrorMessageText);
        softAssert.assertEquals(homePage.getErrorMessageBgColor(), LIGHT_PINK);
        softAssert.assertTrue(homePage.errorMessageIsVisible(), "Error message is not visible");

        softAssert.assertAll();

        driver.quit();
    }
}