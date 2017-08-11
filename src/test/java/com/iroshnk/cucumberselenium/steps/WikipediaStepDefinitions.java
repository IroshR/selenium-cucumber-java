package com.iroshnk.cucumberselenium.steps;

import com.iroshnk.cucumberselenium.BaseTest;
import com.iroshnk.cucumberselenium.pages.WikipediaMainPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by HP on 8/11/2017.
 */
public class WikipediaStepDefinitions implements BaseTest {
    WikipediaMainPage wikipediaMainPage ;

    @Given("^I navigate to \"([^\"]*)\"$")
    public void navigate_to(String link) {
        wikipediaMainPage = new WikipediaMainPage(WEB_DRIVER,"https://en.wikipedia.org/wiki/Main_Page");
    }

    @When("^Enter the text to \"([^\"]*)\"$")
    public void enter_search_text(String searchText) {
        wikipediaMainPage.searchText(searchText);
    }

    @When("^I click the Search Button$")
    public void click_search_button() {
        wikipediaMainPage.clickSearchButton();
    }

    @Then("^I get result page$")
    public void showResults(){
        wikipediaMainPage.checkResult();
    }
}
