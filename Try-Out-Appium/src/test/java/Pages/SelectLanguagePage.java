package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SelectLanguagePage extends BasePage {

    By letsGetStartedButton = By.id("language_text_view_label");
    By radioButtonEnglish = By.id("language_english");

    public SelectLanguagePage(WebDriver driver) {
        super(driver);
    }

    public BasePage selectLanguage() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(letsGetStartedButton));
        driver.findElement(radioButtonEnglish).click();
        driver.findElement(letsGetStartedButton).click();

        return this;
    }
}
