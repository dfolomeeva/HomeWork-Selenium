import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.time.*;

public class HomePage {

    @Test
    public void homePage() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        driver.get("https://litecart.stqa.ru/en/");

        driver.findElement(By.cssSelector(".fa.fa-home")).click();
        driver.findElement(By.cssSelector("#rslides1_s0"));
        driver.quit();
    }
}