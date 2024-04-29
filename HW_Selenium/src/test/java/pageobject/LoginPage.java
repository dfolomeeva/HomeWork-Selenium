package pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    public By emailInputLocator = By.name("email");
    private By passwordInputLocator = By.name("password");
    private By loginButtonLocator = By.name("login");

    private WebDriver driver;
    public LoginPage (WebDriver driver) {
        this.driver = driver;
    }

    public void attemptLogin(String username, String password) {
        driver.findElement(emailInputLocator).sendKeys(username);
        driver.findElement(passwordInputLocator).sendKeys(password);
        driver.findElement(loginButtonLocator).click();
    }
}