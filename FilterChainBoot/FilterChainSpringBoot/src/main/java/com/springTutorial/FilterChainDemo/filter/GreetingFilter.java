package com.springTutorial.FilterChainDemo.filter;

import java.io.IOException;


import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;

public class GreetingFilter implements  Filter {

	@Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }
	@Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Greetings from filter!");
       /* if(true) {  
        	((HttpServletResponse) servletResponse).sendError(HttpServletResponse.SC_SERVICE_UNAVAILABLE, "The service is booting.");
        } else {
        	
        }*/
        filterChain.doFilter(servletRequest, servletResponse);
    }
	@Override
    public void destroy() {

    }
}
