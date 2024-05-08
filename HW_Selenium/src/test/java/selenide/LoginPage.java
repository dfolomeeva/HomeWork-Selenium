package selenide;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public static By emailInputLocator = By.name("email");
    private static final By passwordInputLocator = By.name("password");
    private static final By loginButtonLocator = By.name("login");

        public static void attemptLogin(String username, String password) {
        $(emailInputLocator).sendKeys(username);
        $(passwordInputLocator).sendKeys(password);
        $(loginButtonLocator).click();
    }
}