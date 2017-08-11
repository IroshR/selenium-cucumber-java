package com.iroshnk.cucumberselenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by HP on 8/10/2017.
 */
public class UiComponent {
    protected final WebDriver driver;
    private final By locator;

    protected UiComponent(final WebDriver driver, final By locator) {
        this.driver = driver;
        this.locator = locator;
        Logger.getLogger(ExpectedConditions.class.getName()).setLevel(Level.SEVERE);
    }

    protected WebElement find() {
        return driver.findElement(locator);
    }
}
