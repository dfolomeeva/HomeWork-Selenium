import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import java.time.*;

public class Subcategory {

    @Test
    public void subcategory() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        driver.get("https://litecart.stqa.ru/en/");

        WebElement rubberDucks = driver.findElement(By.xpath("//div" +
                "[@id='site-menu-wrapper']//a[@href='https://litecart.stqa.ru/en/" +
                "rubber-ducks-c-1/']"));

        Actions builder = new Actions(driver);

        builder.moveToElement(rubberDucks).perform();

        driver.findElement(By.xpath(
                "//li[@class='category-2']/" +
                        "a[@href='https://litecart.stqa.ru/en/rubber-ducks-c-1/" +
                        "subcategory-c-2/']")).click();

        driver.findElement(By.xpath("//h1[@class='title']"));
        driver.quit();
    }
}