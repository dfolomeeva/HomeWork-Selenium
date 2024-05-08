package pageobject;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SimilarProductsTest extends TestBase {

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
    }
}