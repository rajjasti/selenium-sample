package com.erac.selenium.site;

import com.erac.config.PageObject;
import com.erac.selenium.pages.SearchPage;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.concurrent.TimeUnit;

@PageObject
@Component //Duplicate Annotation -- Added to prevent intellij from showing autowiring error.
public class Site {

    @Autowired
    private WebDriver driver;

    @Autowired
    private SearchPage searchPage;

    @PostConstruct
    public void setUp() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public SearchPage getSearchPage() {
        return searchPage;
    }


}