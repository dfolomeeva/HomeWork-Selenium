package selenide;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class RemoveFromCartTest extends TestBase {
    String expectedNoItemText = "There are no items in your cart.";

    @Description("Quantity of ducks in cart changes when duck is removed from cart")
    @Story("Remove from cart")
    @Test

        public void removeFromCartTest() {
            Cart.addToCart();
            Cart.validateQuantityInBasket(1);
            Cart.removeFromCart();
            Cart.validateNoItemText(expectedNoItemText);
            Cart.returnBack();
            Cart.validateQuantityInBasket(0);
      }
}