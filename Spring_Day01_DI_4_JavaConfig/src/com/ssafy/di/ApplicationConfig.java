package com.ssafy.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	@Bean
	public Desktop desktop() {
		return new Desktop(); // 싱글톤. 새롭게 생성되는 것 아님.
	}
	
	@Bean
	public Programmer programmer() {
		// 생성자 주입
		Programmer p = new Programmer(desktop());
		return p;
	}
}
