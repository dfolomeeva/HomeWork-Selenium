package selenide;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class SimilarProductsTest extends TestBase {

    @Test
    public void similarProductsTest() {
        $(By.cssSelector("#box-most-popular [alt='Green Duck']")).click();

        $(By.cssSelector("#box-similar-products [alt='Yellow Duck']")).shouldBe(visible);
        $(By.cssSelector("#box-similar-products [alt='Red Duck']")).shouldBe(visible);
        $(By.cssSelector("#box-similar-products [alt='Blue Duck']")).shouldBe(visible);
        $(By.cssSelector("#box-similar-products [alt='Purple Duck']")).shouldBe(visible);

    }
}