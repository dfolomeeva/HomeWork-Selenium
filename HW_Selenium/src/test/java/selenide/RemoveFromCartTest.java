package selenide;
import com.codeborne.selenide.testng.SoftAsserts;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

@Listeners({ SoftAsserts.class})
public class RemoveFromCartTest extends TestBase {

    @Test
    public void removeFromCartTest() {
        String expectedNoItemText = "There are no items in your cart.";
        $(By.cssSelector("#box-most-popular [alt='Green Duck']")).click();
        $(By.name("add_cart_product")).click();
        $(By.cssSelector("span.quantity")).shouldHave(text("1"));

        $(By.cssSelector("div#cart")).click();
        $(By.name("remove_cart_item")).click();

        Cart.validateNoItemText(expectedNoItemText);

        $(By.linkText("<< Back")).click();
        $(By.cssSelector("span.quantity")).shouldHave(text("0"));

    }
}