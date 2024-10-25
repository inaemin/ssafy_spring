package com.ssafy.mvc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@MapperScan // 여기에 해줘도 됨.
public class SpringDay08MybatisSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDay08MybatisSpringApplication.class, args);
//		for (String name : context.getBeanDefinitionNames()) {
//			System.out.println(name);
//		}
	}

}
