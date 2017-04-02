package com.SpringTutorial.FilterChainDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import com.springTutorial.FilterChainDemo.filter.WebConfig;

@Import(WebConfig.class)
@SpringBootApplication(scanBasePackages={"com.SpringTutorial.FilterChainDemo"})
public class FilterChainSpringBootApplication {

	public static void main(String[] args) {
		 ApplicationContext ctx = SpringApplication.run(FilterChainSpringBootApplication.class, args);
	}
}
