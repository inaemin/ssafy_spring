package com.ssafy.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

// 스프링 컨테이너 맛보기!
// 의존관계 역전 맛보기!
public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Desktop d = (Desktop) context.getBean("desktop");
		Laptop l = (Laptop) context.getBean("laptop");
		
		Programmer p = context.getBean("p", Programmer.class);
		
		p.setComputer(d);
		p.coding();
		
//		System.out.println(d.getInfo());
	}
}
