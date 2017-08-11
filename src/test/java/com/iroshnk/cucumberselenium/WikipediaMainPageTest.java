package com.iroshnk.cucumberselenium;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by HP on 8/11/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumberHtmlReport"},
        //pretty:target/cucumber-json-report.json
        features = "features"
)
public class WikipediaMainPageTest {
}
