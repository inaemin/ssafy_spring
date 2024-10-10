package com.ssafy.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="p")
public class Programmer {
	@Autowired
	@Qualifier("laptop")
	private Computer computer;
	
	public Programmer() {
	}
	
	// 생성자 주입
	@Autowired
	public Programmer(Computer computer) {
		// 가지고 있는 데스크탑 한개 줘!
		this.computer = computer;
	}
	
	// 설정자를 이용해서 주입
	@Autowired
	public void setComputer(@Qualifier("desktop") Computer computer) {
		this.computer = computer;
	}
	
	// 메서드를 통해서 주입을 할 수도 있어! (중간에 바꾸거나.. 그런 작업을 할때)
	public void init(Computer computer) {
		this.computer = computer;
		// this.keyboard = keyboard;
	}

	public void coding() {
		System.out.println(computer.getInfo()+"으로 개발을 합니다.");
	}
}
