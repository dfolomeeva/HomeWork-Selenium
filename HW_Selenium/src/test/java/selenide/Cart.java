package selenide;
import com.codeborne.selenide.AssertionMode;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
public class Cart {

      private static final By noItemsTextLocator = By.xpath("//div[@id='checkout-cart-wrapper']");
      public static By greenDuckLocator = By.cssSelector("#box-most-popular [alt='Green Duck']");
      public static By addToCartLocator = By.name("add_cart_product");
      public static By quantityInCartLocator = By.cssSelector("span.quantity");
      public static By cartLocator = By.cssSelector("div#cart");
      public static By removeFromCartLocator = By.name("remove_cart_item");
      public static By returnBackLocator = By.linkText("<< Back");

    public static void validateNoItemText (String expectedNoItemText) {
        Configuration.assertionMode = AssertionMode.SOFT;
        $(noItemsTextLocator).shouldHave(text(expectedNoItemText));
        $(noItemsTextLocator).shouldBe(visible);
    }
    public static void addToCart () {
        $(greenDuckLocator).click();
        $(addToCartLocator).click();
    }
    public static void validateQuantityInBasket(int quantity) {
        $(quantityInCartLocator).shouldHave(text(String.valueOf(quantity)));
    }

    public static void removeFromCart() {
        $(cartLocator).click();
        $(removeFromCartLocator).click();
    }

    public static void returnBack() {
        $(returnBackLocator).click();
    }

}