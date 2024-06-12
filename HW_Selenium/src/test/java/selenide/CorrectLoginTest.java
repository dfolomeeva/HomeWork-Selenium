package selenide;
import com.codeborne.selenide.testng.SoftAsserts;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ SoftAsserts.class})
public class CorrectLoginTest extends TestBase {
    public static final String LIGHT_GREEN = "rgba(214, 236, 166, 1)";
    @Test
    public void correctLoginTest() {
        String expectedSuccessMessageText = "You are now logged in as Daria Folomeeva.";

        LoginPage.attemptLogin("d.folomeeva1987@gmail.com", "QWERTY");
        HomePage.validateSuccessMessage(expectedSuccessMessageText, LIGHT_GREEN);
    }
}
