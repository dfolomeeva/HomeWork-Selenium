package pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class RemoveFromCartTest {
    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.get("https://litecart.stqa.ru/en/");
    }

    @Test
    public void removeFromCartTest() {
        String expectedNoItemText = "There are no items in your cart.";
        Cart cart = new Cart(driver);
        driver.findElement(By.cssSelector("#box-most-popular [alt='Green Duck']")).click();
        driver.findElement(By.name("add_cart_product")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.textToBe(By.cssSelector("span.quantity"),"1"));

        Assert.assertEquals(cart.getQuantityInBasket(),"1");
        driver.findElement(By.cssSelector("div#cart")).click();
        driver.findElement(By.name("remove_cart_item")).click();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(cart.getNoItemsText(), expectedNoItemText);

        driver.findElement(By.linkText("<< Back")).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.textToBe(By.cssSelector("span.quantity"),"0"));
        softAssert.assertEquals(cart.getQuantityInBasket(),"0");


        driver.quit();
    }
}