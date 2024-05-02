package selenide;
import com.codeborne.selenide.AssertionMode;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class Cart {

      private static final By noItemsTextLocator = By.xpath("//div[@id='checkout-cart-wrapper']");

    public static void validateNoItemText (String expectedNoItemText) {
        Configuration.assertionMode = AssertionMode.SOFT;
        $(noItemsTextLocator).shouldHave(text(expectedNoItemText));
        $(noItemsTextLocator).shouldBe(visible);
    }
}