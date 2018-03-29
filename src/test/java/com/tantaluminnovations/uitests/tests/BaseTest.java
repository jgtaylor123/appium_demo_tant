package com.tantaluminnovations.uitests.tests;

import com.tantaluminnovations.uitests.driver.DriverFactory;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;

public abstract class BaseTest {
    protected AppiumDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws MalformedURLException {
        driver = new DriverFactory().createInstance();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
