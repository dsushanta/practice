package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    static {
        System.setProperty("webdriver.gecko.driver","cucumber-jvm-test-framework/drivers/geckodriver");
    }

    static protected WebDriver driver = new FirefoxDriver();

}
