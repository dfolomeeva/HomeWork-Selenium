package selenide;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

//@Epic("Selenium add")
//@Feature("AddToCart")
public class AddToCartTest extends TestBase {

 //   @Description("Quantity of ducks in cart changes when duck is added to cart")
  //  @Story("Add to cart")
    @Test

    public void addToCartTest() {

        Cart.addToCart();
        Cart.validateQuantityInBasket(1);
    }
}