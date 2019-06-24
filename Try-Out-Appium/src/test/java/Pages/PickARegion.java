package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PickARegion extends BasePage{

    By search = By.id("et_search");
    By imageView = By.id("location_popular_image");

    public PickARegion(WebDriver driver) {
        super(driver);
    }

    public PickARegion selectCIty() {

        String city = "Bengaluru";

        wait.until(ExpectedConditions.visibilityOfElementLocated(search));
        driver.findElement(search).sendKeys(city);
        driver.findElement(imageView).click();

        return this;
    }
}
