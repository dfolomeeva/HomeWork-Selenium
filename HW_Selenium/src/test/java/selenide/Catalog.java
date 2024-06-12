package selenide;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
public class Catalog {
    public static By greenDuckLocator = By.cssSelector("#box-most-popular [alt='Green Duck']");
    public static By yellowDuckLocator = By.cssSelector("#box-similar-products [alt='Yellow Duck']");
    public static By redDuckLocator = By.cssSelector("#box-similar-products [alt='Red Duck']");
    public static By blueDuckLocator = By.cssSelector("#box-similar-products [alt='Blue Duck']");
    public static By purpleDuckLocator = By.cssSelector("#box-similar-products [alt='Purple Duck']");

    public static void addGreenDuck() {
        $(greenDuckLocator).click();
    }
    public static void checkOtherDucks () {
        $(yellowDuckLocator).shouldBe(visible);
        $(redDuckLocator).shouldBe(visible);
        $(blueDuckLocator).shouldBe(visible);
        $(purpleDuckLocator).shouldBe(visible);
    }
}
