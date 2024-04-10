import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.*;

public class SeleniumTest {
    @Test
    public void listOfWebElements() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        for (WebElement link: links) {
            System.out.println(link.getText());
        }
        driver.findElement(By.linkText("Drag and Drop")).click();
    }
}