import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import java.time.*;

public class DoubleClick {

    @Test
    public void doubleClick() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        driver.get("https://demo.guru99.com/test/simple_context_menu.html");

        WebElement dblClickButton = driver.findElement(By.cssSelector
                ("[ondblclick='myFunction()']"));

        Actions builder = new Actions(driver);

        builder.doubleClick(dblClickButton).perform();

        driver.quit();
    }
}