package selenide;
import com.codeborne.selenide.testng.SoftAsserts;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ SoftAsserts.class})
public class IncorrectLoginTest extends TestBase {
    public static final String LIGHT_PINK = "rgba(255, 204, 204, 1)";

    @Test
    public void incorrectLoginTest() {
        String expectedErrorMessageText = "Wrong password or the account is disabled, or does not exist";

        LoginPage.attemptLogin("d.folomeeva1987@gmail.com", "12345");

        selenide.HomePage.validateErrorMessage(expectedErrorMessageText, LIGHT_PINK);
    }
}