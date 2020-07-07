package com.demo.springselenium.googleTests;

import java.io.IOException;

import com.demo.springselenium.SpringBaseTestNGTest;
import com.demo.springselenium.annotations.LazyAutowired;
import com.demo.springselenium.page.google.GooglePage;
import com.demo.springselenium.util.ScreenShotUtil;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest2 extends SpringBaseTestNGTest {

	@LazyAutowired
    private GooglePage googlePage;

    @LazyAutowired
    private ScreenShotUtil screenShotUtil;

    @Test
    public void TC_001() throws IOException, InterruptedException {
        this.googlePage.goTo();
        Assert.assertTrue(this.googlePage.isAt());

        this.googlePage.getSearchComponent().searchFor("selenium");
        Assert.assertTrue(this.googlePage.getSearchResult().isAt());
        Assert.assertTrue(this.googlePage.getSearchResult().getCount() > 2);
        this.screenShotUtil.takeScreenShot(Thread.currentThread() + "_GoogleTest2.png");
        Thread.sleep(5000);
        this.googlePage.close();
    }

}