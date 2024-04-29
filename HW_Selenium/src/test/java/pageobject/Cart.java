package pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart {

    private By quantityInBasketLocator = By.cssSelector("span.quantity");
    private By noItemsTextLocator = By.xpath("//div[@id='checkout-cart-wrapper']");
    private final WebDriver driver;
    public Cart (WebDriver driver) {
        this.driver = driver;
    }
    public String getQuantityInBasket(){return driver.findElement(quantityInBasketLocator).getText();
    }
    public String getNoItemsText(){return driver.findElement(noItemsTextLocator).getText();
    }

}
