package pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class AddToCartTest extends TestBase {

    @Test
    public void addToCartTest() {
        Cart cart = new Cart(driver);
        driver.findElement(By.cssSelector("#box-most-popular [alt='Green Duck']")).click();
        driver.findElement(By.name("add_cart_product")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.textToBe(By.cssSelector("span.quantity"),"1"));

        Assert.assertEquals(cart.getQuantityInBasket(), "1");

    }
}