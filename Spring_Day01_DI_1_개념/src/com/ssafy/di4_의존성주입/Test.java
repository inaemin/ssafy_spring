package com.ssafy.di4_의존성주입;

import java.util.Scanner;

// 스프링 컨테이너 맛보기!
// 의존관계 역전 맛보기!
public class Test {
	public static void main(String[] args) {
		Desktop desktop = new Desktop();
		Laptop laptop = new Laptop();
		
		// 프로그래머가 데스크톱에 대한 의존성을 가지고 있다.		
//		Programmer p = new Programmer(desktop);
		Programmer p2 = new Programmer();
		p2.setComputer(laptop);
//		p2.coding();
		
		Scanner sc = new Scanner(System.in);
		Programmer p3 = new Programmer();
		while (true) {
			p3.setComputer(ComputerFactory.getComputer(sc.next()));
			p3.coding();
		}
//		sc.close();
	}
}
