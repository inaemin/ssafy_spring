package com.ssafy.di1_의존성개념;

/**
 * Programmer는 2개의 의존성을 가지고 있음.
 * 1. 객체생성에 대한 의존성
 * 2. 타입에 대한 의존성
 */
public class Programmer {
	private Desktop desktop;
	
	public Programmer() {
		// 프로그래머를 한명 고용했다면 묻지도 따지지도 않고 컴퓨터를 한대 새로 사줌.
		this.desktop = new Desktop();
	}
	
	public void coding() {
		System.out.println(desktop.getInfo()+"으로 개발을 합니다.");
	}
}
