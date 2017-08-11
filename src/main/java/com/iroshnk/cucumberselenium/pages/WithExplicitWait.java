package com.iroshnk.cucumberselenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Created by HP on 8/10/2017.
 */
public interface WithExplicitWait {
    default <T> T waitUntil(WebDriver webDriver, ExpectedCondition<T> condition, Duration timeout) {
        return new WebDriverWait(webDriver, timeout.getSeconds()).until(condition);
    }
}
