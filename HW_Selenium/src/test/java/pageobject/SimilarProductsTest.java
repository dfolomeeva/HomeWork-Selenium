package pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class SimilarProductsTest {
    private WebDriver driver;

    @BeforeMethod
    public void setup() {
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

    @Test
    public void similarProductsTest() {
        Catalog catalog = new Catalog(driver);
        driver.findElement(By.cssSelector("#box-most-popular [alt='Green Duck']")).click();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(catalog.yellowDuckIsVisible(), "Yellow duck is not visible");
        softAssert.assertTrue(catalog.redDuckIsVisible(), "Red duck is not visible");
        softAssert.assertTrue(catalog.blueDuckIsVisible(), "Blue duck is not visible");
        softAssert.assertTrue(catalog.purpleDuckIsVisible(), "Purple duck is not visible");

        softAssert.assertAll();

        driver.quit();

    }
}