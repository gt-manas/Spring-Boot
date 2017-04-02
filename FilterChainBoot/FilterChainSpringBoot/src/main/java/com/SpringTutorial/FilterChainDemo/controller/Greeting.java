package com.SpringTutorial.FilterChainDemo.controller;

public class Greeting {

	long incrementAndGet;
	public long getIncrementAndGet() {
		return incrementAndGet;
	}
	public void setIncrementAndGet(long incrementAndGet) {
		this.incrementAndGet = incrementAndGet;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	String format;
	public Greeting(long incrementAndGet, String format) {
		this.incrementAndGet=incrementAndGet;
		this.format = format;
	}

}
