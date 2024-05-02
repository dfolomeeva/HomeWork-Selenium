package selenide;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class AddToCartTest extends TestBase {

    @Test
    public void addToCartTest() {
        $(By.cssSelector("#box-most-popular [alt='Green Duck']")).click();
        $(By.name("add_cart_product")).click();
        $(By.cssSelector("span.quantity")).shouldHave(text("1"));
    }
}