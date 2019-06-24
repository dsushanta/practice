package Scenarios;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AndroidSetup {

    protected AndroidDriver driver;

    protected void prepareAndroidForAppium() throws MalformedURLException {
        File appDir = new File("/Users/admin/Inteliij_Workspaces/practice/Try-Out-Appium/Apps");
//        File app = new File(appDir, "Flipkart_6_15.apk");
        File app = new File(appDir, "bms_5.5.0.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("device","Android");

        //mandatory capabilities
        capabilities.setCapability("deviceName","Pixel_3_XL_API_28");
        capabilities.setCapability("platformName","Android");

        //other caps
        capabilities.setCapability("platformVersion", "9");
        capabilities.setCapability("app", app.getAbsolutePath());
        driver =  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
}
