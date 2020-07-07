package com.demo.springselenium.googleTests;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.demo.springselenium.SpringBaseTestNGTest;
import com.demo.springselenium.properties.MyProperties;

public class PropertyTest extends SpringBaseTestNGTest {
	
	@Autowired
	private MyProperties myProperties;
	
	@Test
	public void TC_001() {
		System.out.println(myProperties.getAppURL());
		System.out.println(myProperties.getUserName());
		System.out.println(myProperties.getPassWord());
	}

}