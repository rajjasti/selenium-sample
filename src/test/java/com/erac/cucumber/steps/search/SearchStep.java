package com.erac.cucumber.steps.search;

import com.erac.cucumber.steps.base.Step;
import com.erac.selenium.site.Site;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

public class SearchStep extends Step {

    @Autowired
    private Site site;

    @Given("^navigate to google home page$")
    public void navigate() {
        site.getSearchPage().gotoSearchPage();
    }

    @When("^user searched for \"(.*)\"$")
    public void search(String searchString) {
        site.getSearchPage().search(searchString);
    }

    @Then("^search results should be displayed$")
    public void verifySuccessfulResults() {
        Assert.assertTrue(site.getSearchPage().isSearchResultsDisplayed());
    }
}