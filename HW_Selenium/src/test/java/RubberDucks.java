import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.*;

public class RubberDucks {

    @Test
    public void rubberDucks() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        driver.get("https://litecart.stqa.ru/en/");

        driver.findElement(By.xpath("//div[@id='site-menu-wrapper']//a" +
                "[@href='https://litecart.stqa.ru/en/rubber-ducks-c-1/']")).click();

        String expectedTitle = "Rubber Ducks";

        WebElement titleRubberDucks = driver.findElement(By.cssSelector("h1.title"));

        String titleRubberDucksText = titleRubberDucks.getText();
        Assert.assertEquals(titleRubberDucksText, expectedTitle);
        titleRubberDucks.isDisplayed();


        driver.quit();
    }
}