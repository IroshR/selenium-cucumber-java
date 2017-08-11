package com.iroshnk.cucumberselenium.pages.widgets;

import com.iroshnk.cucumberselenium.pages.UiComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by HP on 8/10/2017.
 */
public class HOneTag extends UiComponent {
    public HOneTag(final WebDriver driver, final By locator) {
        super(driver, locator);
    }

    public String getText(){
        return find().getText();
    }
}
