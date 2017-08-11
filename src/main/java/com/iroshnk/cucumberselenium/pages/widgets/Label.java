package com.iroshnk.cucumberselenium.pages.widgets;

import com.iroshnk.cucumberselenium.pages.UiComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by HP on 8/10/2017.
 */
public class Label extends UiComponent {
    protected Label(final WebDriver driver, final By locator) {
        super(driver, locator);
    }

    public String text() {
        return find().getText();
    }
}
