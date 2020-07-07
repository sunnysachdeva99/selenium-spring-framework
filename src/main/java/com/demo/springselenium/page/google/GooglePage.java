package com.demo.springselenium.page.google;

import com.demo.springselenium.annotations.LazyService;
import com.demo.springselenium.page.Base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;

@LazyService
@Scope("prototype")
public class GooglePage extends Base {

    @Autowired
    private SearchComponent searchComponent;

    @Autowired
    private SearchResult searchResult;

    public SearchComponent getSearchComponent() {
        return searchComponent;
    }

    public SearchResult getSearchResult() {
        return searchResult;
    }

    @Value("${appURL}")
    private String appURL;

    public void goTo() {
        this.driver.get(appURL);
    }

    @Override
    public boolean isAt() {
        return this.searchComponent.isAt();
    }
    
    public void close() {
    	this.driver.quit();
    }

}