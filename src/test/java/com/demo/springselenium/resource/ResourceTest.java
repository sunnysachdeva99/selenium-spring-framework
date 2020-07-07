package com.demo.springselenium.resource;

import java.io.IOException;
import java.nio.file.Files;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.testng.annotations.Test;

public class ResourceTest {
	
	@Value("classpath:data/testdata.csv")
	private Resource resource;
	
	@Test
	public void resourceTest() throws IOException {
		Files.readAllLines(resource.getFile().toPath()).forEach(System.out::println);
	}

}