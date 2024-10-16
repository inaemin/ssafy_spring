package com.ssafy.mvc.filter;

import java.io.IOException;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

//@Component // 단점: 경로를 지정할 수 없음.
//@Order(3) // Order 어노테이션을 통해서 순서지정가능, 숫자는 정수 범위면 가능 -> 주로 양수를 사용, 숫자가 낮을수록 먼저 사용됨
public class AFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("서블릿 전3");
		chain.doFilter(request, response);
		System.out.println("서블릿 후3");
	}
	
}
