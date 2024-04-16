import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import java.time.*;

public class DragAndDrop {

    @Test
    public void dragAndDrop() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        driver.get("https://learn.javascript.ru/article/mouse-drag-and-drop/ball4");

        WebElement ball = driver.findElement(By.id("ball"));
        WebElement goal = driver.findElement(By.id("gate"));

        Actions builder = new Actions(driver);

        builder.dragAndDrop(ball, goal).perform();

        driver.quit();
    }
}