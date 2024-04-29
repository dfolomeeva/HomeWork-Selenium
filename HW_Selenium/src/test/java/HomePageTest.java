import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.*;

public class HomePageTest {

    @Test
    public void homePage() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        driver.get("https://litecart.stqa.ru/en/");

        driver.findElement(By.cssSelector(".fa.fa-home")).click();

        WebElement bigPicture = driver.findElement(By.cssSelector("#rslides1_s0"));
        Assert.assertTrue(bigPicture.isDisplayed());

        driver.quit();
    }
}