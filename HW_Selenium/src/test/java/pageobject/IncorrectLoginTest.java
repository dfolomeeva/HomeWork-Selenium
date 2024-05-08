package pageobject;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class IncorrectLoginTest extends TestBase {
    public static final String LIGHT_PINK = "rgba(255, 204, 204, 1)";

    @Test
    public void incorrectLoginTest() {
        String expectedErrorMessageText = "Wrong password or the account is disabled, or does not exist";
        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();

        loginPage.attemptLogin("d.folomeeva1987@gmail.com", "12345");

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(homePage.getErrorMessageText(), expectedErrorMessageText);
        softAssert.assertEquals(homePage.getErrorMessageBgColor(), LIGHT_PINK);
        softAssert.assertTrue(homePage.errorMessageIsVisible(), "Error message is not visible");

        softAssert.assertAll();
    }
}