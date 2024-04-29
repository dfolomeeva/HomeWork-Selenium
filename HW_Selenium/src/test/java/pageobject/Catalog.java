package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Catalog {
    private final By yellowDuckLocator = By.cssSelector("#box-similar-products [alt='Yellow Duck']");
    private final By redDuckLocator = By.cssSelector("#box-similar-products [alt='Red Duck']");
    private final By blueDuckLocator = By.cssSelector("#box-similar-products [alt='Blue Duck']");
    private final By purpleDuckLocator = By.cssSelector("#box-similar-products [alt='Purple Duck']");
    private final WebDriver driver;

    public Catalog (WebDriver driver) {
        this.driver = driver;
    }
    public Boolean yellowDuckIsVisible() {
        return driver.findElement(yellowDuckLocator).isDisplayed();
    }
    public Boolean redDuckIsVisible() {
        return driver.findElement(redDuckLocator).isDisplayed();
    }
    public Boolean blueDuckIsVisible() {
        return driver.findElement(blueDuckLocator).isDisplayed();
    }
    public Boolean purpleDuckIsVisible() {
        return driver.findElement(purpleDuckLocator).isDisplayed();
    }
}