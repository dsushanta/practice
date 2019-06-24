package steps;

import cucumber.api.java.en.Given;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StartingSteps extends DriverFactory {

    @Given("^the user is on login page$")
    public void setup() {
        driver.get("http://executeautomation.com/demosite/Login.html");
        driver.manage().window().maximize();
    }
}
