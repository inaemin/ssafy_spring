package com.ssafy.di3_타입의존성제거;

/**
 * 인터페이스 Computer -> 느슨한 결합
 * Desktop, Laptop -> 강한 결합
 */
public class Test {
	public static void main(String[] args) {
		Desktop desktop = new Desktop();
		Laptop laptop = new Laptop();
		
		// 자바의 다형성, 동적바인딩
		Programmer p = new Programmer(desktop);
		
		p.coding();
	}
}