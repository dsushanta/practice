package rough;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class SeleniumTests {

    @Test
    @Parameters("browser")
    public void search(String browser) throws MalformedURLException {
        new WikiPage()
                .launchBrowser(browser)
                .searchAWordInWiki(browser)
                .cleanUp();
    }
}
