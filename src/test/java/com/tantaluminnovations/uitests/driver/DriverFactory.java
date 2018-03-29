package com.tantaluminnovations.uitests.driver;

import com.tantaluminnovations.uitests.utilities.LoadProperties;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {
    public AppiumDriver createInstance() throws MalformedURLException {
        LoadProperties properties = new LoadProperties();
        String platform = properties.getPropertyValue("config.properties", "platform");

        switch (platform.toLowerCase()) {
            case "android":
                return android();
            case "ios":
                return ios();
            default:
                return android();
        }
    }

    private AppiumDriver android() throws MalformedURLException {
        File app = new File(System.getProperty("user.dir") + "/src/test/resources/app/android/app-debug.apk");
        URL url = new URL("http://localhost:4723/wd/hub");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.APP, app);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");

        return new AppiumDriver(url, capabilities);
    }

    private AppiumDriver ios() throws MalformedURLException {
        File app = new File(System.getProperty("user.dir") + "/src/test/resources/app/ios/Phoenix.app");
        URL url = new URL("http://localhost:4723/wd/hub");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.APP, app);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");

        return new AppiumDriver(url, capabilities);
    }
}
