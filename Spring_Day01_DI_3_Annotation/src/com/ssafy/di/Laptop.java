package com.ssafy.di;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
	// 필드...
	
	public String getInfo() {
		// TODO Auto-generated method stub
		return "랩탑";
	}
}

