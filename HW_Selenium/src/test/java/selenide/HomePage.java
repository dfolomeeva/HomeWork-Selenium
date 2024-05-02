package selenide;
import com.codeborne.selenide.AssertionMode;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    private static final By errorMessageLocator = By.cssSelector(".notice.errors");
    private static final By successMessageLocator = By.cssSelector(".notice.success");

 //   public String getErrorMessageText() {
 //       return $(errorMessageLocator).getText();
 //   }
 //   public String getErrorMessageBgColor() {
//        return $(errorMessageLocator).getCssValue("background-color");
 //   }
 //   public Boolean errorMessageIsVisible() {
 //       return $(errorMessageLocator).isDisplayed();
 //   }
  //  public String getSuccessMessageText() {
  //      return $(successMessageLocator).getText();
  //  }
  //  public String getSuccessMessageBgColor() {
  //      return $(successMessageLocator).getCssValue("background-color");
 //   }
  //  public Boolean successMessageIsVisible() {
 //       return $(successMessageLocator).isDisplayed();
 //   }
    public static void validateErrorMessage(String expectedErrorMessageText, String bgColor) {
        Configuration.assertionMode = AssertionMode.SOFT;
        $(errorMessageLocator).shouldHave(text(expectedErrorMessageText));
        $(errorMessageLocator).shouldHave(cssValue("background-color", bgColor));
        $(errorMessageLocator).shouldBe(visible);
    }

    public static void validateSuccessMessage(String expectedSuccessMessageText, String bgColor) {
        Configuration.assertionMode = AssertionMode.SOFT;
        $(successMessageLocator).shouldHave(text(expectedSuccessMessageText));
        $(successMessageLocator).shouldHave(cssValue("background-color", bgColor));
        $(successMessageLocator).shouldBe(visible);
    }
}