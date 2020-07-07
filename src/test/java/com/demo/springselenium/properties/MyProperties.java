package com.demo.springselenium.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:config/config.properties")
public class MyProperties {

	@Value("${appURL}")
	private String appURL;

	@Value("${userName}")
	private String userName;

	@Value("${passWord}")
	private String passWord;

	public String getAppURL() {
		return appURL;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassWord() {
		return passWord;
	}

}