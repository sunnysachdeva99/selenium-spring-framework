package com.demo.springselenium.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.demo.springselenium.annotations.LazyConfiguration;

@LazyConfiguration
public class WebDriverWaitConfig {

    @Value("${timeOut:30}")
    private int timeOut;

    @Bean
    @Scope("prototype")
    public WebDriverWait wait(WebDriver driver) {
        return new WebDriverWait(driver, this.timeOut);
    }

}