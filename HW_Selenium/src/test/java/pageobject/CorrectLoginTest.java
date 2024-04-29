package pageobject;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CorrectLoginTest extends TestBase {
    public static final String LIGHT_GREEN = "rgba(214, 236, 166, 1)";
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
    }
}