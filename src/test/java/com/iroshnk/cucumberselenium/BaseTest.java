package com.iroshnk.cucumberselenium;

import com.iroshnk.cucumberselenium.driver.Drivers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by HP on 8/11/2017.
 */
public interface BaseTest {
    public static WebDriver WEB_DRIVER = Drivers.make(System.getProperty("webdriver.type"));
    public static WebDriverWait WEB_DRIVER_WAIT = new WebDriverWait(WEB_DRIVER, 30);
}
