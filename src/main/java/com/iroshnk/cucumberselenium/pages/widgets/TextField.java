package com.iroshnk.cucumberselenium.pages.widgets;

import com.iroshnk.cucumberselenium.pages.UiComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by HP on 8/10/2017.
 */
public class TextField extends UiComponent {
    public TextField(final WebDriver driver, final By locator) {
        super(driver, locator);
    }

    public void enter(String value) {
        find().sendKeys(value);
    }

    public void click() {
        find().click();
    }

    public String getValue() {
        return find().getText();
    }
}
