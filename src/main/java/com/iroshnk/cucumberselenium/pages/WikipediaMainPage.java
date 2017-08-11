package com.iroshnk.cucumberselenium.pages;

import com.iroshnk.cucumberselenium.pages.widgets.HOneTag;
import com.iroshnk.cucumberselenium.pages.widgets.TextField;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static org.openqa.selenium.By.xpath;
import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElement;

/**
 * Created by HP on 8/10/2017.
 */
public class WikipediaMainPage extends UiComponent implements WithExplicitWait {
    private final Duration TEN_SECONDS = Duration.ofSeconds(10);

    public WikipediaMainPage(final WebDriver driver, final String wikipediaUrl) {
        super(driver, By.xpath("//*[@id=\"mp-topbanner\"]/div/div[1]"));
        driver.get(wikipediaUrl);
    }

    private TextField searchInput() {
        return new TextField(driver, xpath("//*[@id=\"searchInput\"]"));
    }

    private TextField searchButton() {
        return new TextField(driver, xpath("//*[@id=\"searchButton\"]"));
    }

    private HOneTag topic() {
        return new HOneTag(driver, xpath("//*[@id=\"firstHeading\"]"));
    }

    public void searchText(final String searchInput) {
        searchInput().enter(searchInput);
    }

    public void clickSearchButton() {
        searchButton().click();
    }

    public void checkResult() {
        waitUntil(driver, textToBePresentInElement(topic().find(), "Software"), TEN_SECONDS);
    }






}
