package com.springTutorial.FilterChainDemo.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

    }
	@Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("HelloFilter!");
        filterChain.doFilter(servletRequest, servletResponse);
    }
	@Override
    public void destroy() {

    }

	
}
