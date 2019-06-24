package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ConnectPage extends BasePage{

    By skip = By.id("launcher_tv_for_skip");

    public ConnectPage(WebDriver driver) {
        super(driver);
    }

    public BasePage skip() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(skip));
        driver.findElement(skip).click();

        return this;
    }
}
