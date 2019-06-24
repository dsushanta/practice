package Scenarios;

import Pages.ConnectPage;
import Pages.PickARegion;
import Pages.SelectLanguagePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AppiumTest extends AndroidSetup{

    @BeforeClass
    public void setUp() throws Exception {
        prepareAndroidForAppium();
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void selectLanguage() {
        new SelectLanguagePage(driver).selectLanguage();
        new ConnectPage(driver).skip();
        new PickARegion(driver).selectCIty();
    }
}
