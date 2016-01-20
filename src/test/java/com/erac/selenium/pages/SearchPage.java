package com.erac.selenium.pages;

import com.erac.config.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.NoSuchElementException;

@PageObject
public class SearchPage {

    @Autowired
    private WebDriver driver;


    @FindBy(how= How.ID, using="lst-ib")
    private WebElement searchBox;

    @FindBy(how= How.ID, using="search")
    private WebElement searchResults;


    public void gotoSearchPage() {
        driver.get("http://www.google.com");
    }


    public void search(String searchString) {
        searchBox.sendKeys(searchString);
    }

    public boolean isSearchResultsDisplayed() {
            return searchResults.isDisplayed();

    }
}