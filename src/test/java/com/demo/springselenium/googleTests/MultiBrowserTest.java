package com.demo.springselenium.googleTests;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.testng.annotations.Test;

import com.demo.springselenium.SpringBaseTestNGTest;

public class MultiBrowserTest extends SpringBaseTestNGTest {

	@Autowired
	private ApplicationContext ctx;
	
	@Test
	public void crossBrowser() {
		ctx.getBean("chrome",WebDriver.class).get("http://www.google.com");
		ctx.getBean("firefox",WebDriver.class).get("http://www.google.com");
	}
	
}