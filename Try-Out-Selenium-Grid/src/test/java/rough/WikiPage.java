package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class WikiPage {

    WebDriver driver = null;

    public WikiPage launchBrowser(String browser) throws MalformedURLException {

        DesiredCapabilities capabilities = null;
        String hubURL = "http://192.168.99.100:4444/wd/hub";

        if(browser.equalsIgnoreCase("firefox")) {
            capabilities = DesiredCapabilities.firefox();
            capabilities.setCapability("browserName", "firefox");
        }else if(browser.equalsIgnoreCase("chrome")) {
            capabilities = DesiredCapabilities.chrome();
            capabilities.setCapability("browserName", "chrome");
        }
        driver = new RemoteWebDriver(new URL(hubURL), capabilities);

        return this;
    }

    public WikiPage searchAWordInWiki(String browser) {
        String text_to_search = "";
        if(browser.equalsIgnoreCase("firefox"))
            text_to_search = "firefox browser";
        else if(browser.equalsIgnoreCase("chrome"))
            text_to_search = "chrome browser";
        driver.get("https://www.wikipedia.org/");
        driver.findElement(By.id("searchInput")).sendKeys(text_to_search);
        driver.findElement(By.xpath("//button[@class='pure-button pure-button-primary-progressive']")).click();
        System.out.println(driver.getTitle());

        return this;
    }

    public void cleanUp() {
        driver.quit();
    }
}
