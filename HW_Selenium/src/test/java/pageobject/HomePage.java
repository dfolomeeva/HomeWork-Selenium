package pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private By errorMessageLocator = By.cssSelector(".notice.errors");
    private By successMessageLocator = By.cssSelector(".notice.success");

    private WebDriver driver;

    public HomePage () {
        this.driver = driver;
    }

    public static void validateErrorMessage(String expectedErrorMessageText, String lightPink) {
    }

    public String getErrorMessageText() {
        return driver.findElement(errorMessageLocator).getText();

    }
    public String getErrorMessageBgColor() {
        return driver.findElement(errorMessageLocator).getCssValue("background-color");
    }
    public Boolean errorMessageIsVisible() {
        return driver.findElement(errorMessageLocator).isDisplayed();

    }
    public String getSuccessMessageText() {
        return driver.findElement(successMessageLocator).getText();

    }
    public String getSuccessMessageBgColor() {
        return driver.findElement(successMessageLocator).getCssValue("background-color");
    }
    public Boolean successMessageIsVisible() {
        return driver.findElement(successMessageLocator).isDisplayed();

    }

}