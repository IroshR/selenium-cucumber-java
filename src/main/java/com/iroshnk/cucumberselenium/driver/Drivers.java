package com.iroshnk.cucumberselenium.driver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Optional;

/**
 * Created by HP on 8/10/2017.
 */
public class Drivers {
    private Drivers() {

    }

    public enum DriverType {
        Chrome,
        Firefox
    }

    public static WebDriver make(final String webDriverType){
        DriverType driverType = Optional
                .ofNullable(webDriverType)
                .flatMap(v -> Optional.of(DriverType.valueOf(v)))
                .orElse(DriverType.Firefox);

        switch (driverType) {
            case Chrome:
                ChromeDriverManager.getInstance().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--start-maximized");
                return new ChromeDriver(options);
            default:
                FirefoxDriverManager.getInstance().setup();
                return new FirefoxDriver();
        }
    }
}
