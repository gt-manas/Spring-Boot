package com.SpringTutorial.FilterChainDemo.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@ComponentScan("com.SpringTutorial.FilterChainDemo")
@RestController
public class GreetingController {
	
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String greeting(@RequestParam(value="name", defaultValue="World") String name)  throws Exception {
       /* return new Greeting(counter.incrementAndGet(),
                String.format(template, name));*/
    	System.out.println("Starting **************************");  
    	
			//throw new Exception("hi");
    	   	return "Manas";
    }
    
    @RequestMapping(value = "/error", method = RequestMethod.GET)
    public String error()  {
    	 	return "Test Error ";
    }
}