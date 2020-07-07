package com.demo.springselenium.config;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Profile;

import com.demo.springselenium.annotations.LazyConfiguration;
import com.demo.springselenium.annotations.ThreadScopeBean;

@LazyConfiguration
@Profile("remote")
public class RemoteWebDriverConfig {

    @Value("${hubURL}")
    private String hubURL;

    @ThreadScopeBean
    @ConditionalOnProperty(name = "browser", havingValue = "firefox")
    public WebDriver remoteFirefox() throws MalformedURLException {
        return new RemoteWebDriver(new URL(this.hubURL), DesiredCapabilities.firefox());
    }

    @ThreadScopeBean
    @ConditionalOnMissingBean
    public WebDriver remoteChrome() throws MalformedURLException {
        return new RemoteWebDriver(new URL(this.hubURL), DesiredCapabilities.chrome());
    }

}