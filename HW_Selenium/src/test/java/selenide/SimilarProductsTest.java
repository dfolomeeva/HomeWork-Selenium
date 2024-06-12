package selenide;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class SimilarProductsTest extends TestBase {
    @Description("All other ducks are in category Similar products when choose one duck")
    @Story("Similar products")
    @Test
    public void similarProductsTest() {
        Catalog.addGreenDuck();
        Catalog.checkOtherDucks();
    }
}