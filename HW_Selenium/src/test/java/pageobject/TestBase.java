package pageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.time.Duration;

public class TestBase {
    public WebDriver driver;

    @org.testng.annotations.BeforeMethod
    public void setup() {
        WebDriver driver;
        Browser browser = Browser.valueOf(System.getProperty("browser", "chrome"));
        driver = switch (browser) {
            case chrome -> new ChromeDriver();
            case edge -> new EdgeDriver();
        };
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.get("https://litecart.stqa.ru/en/");
    }
}
