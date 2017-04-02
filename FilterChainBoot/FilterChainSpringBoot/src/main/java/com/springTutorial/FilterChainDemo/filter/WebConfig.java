package com.springTutorial.FilterChainDemo.filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.SpringTutorial.FilterChainDemo.error.AppErrorController;

@Configuration
@ComponentScan
public class WebConfig {
	/*@Autowired
	private ErrorAttributes errorAttributes;

	@Bean
	public AppErrorController appErrorController() {
		return new AppErrorController(errorAttributes);
	}*/

	@Bean
	public FilterRegistrationBean greetingFilterRegistrationBean() {
		System.out.println("*****************************greetingFilterRegistrationBean");
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		registrationBean.setName("greeting");
		GreetingFilter greetingFilter = new GreetingFilter();
		registrationBean.setFilter(greetingFilter);
		registrationBean.addUrlPatterns("/greeting");
		registrationBean.setOrder(1);
		return registrationBean;
	}

	@Bean
	public FilterRegistrationBean helloFilterRegistrationBean() {
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		registrationBean.setName("hello");
		HelloFilter helloFilter = new HelloFilter();
		registrationBean.setFilter(helloFilter);
		registrationBean.addUrlPatterns("/greeting");
		registrationBean.setOrder(2);
		return registrationBean;
	}

}