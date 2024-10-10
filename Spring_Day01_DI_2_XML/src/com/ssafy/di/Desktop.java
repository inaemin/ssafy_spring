package com.ssafy.di;

public class Desktop implements Computer {
//	private String CPU;
//	private String RAM;
	
	public Desktop() {
		System.out.println("생성이 되었습니다.");
	}
	
	public String getInfo() {
		return "데스크톱";
	}
}
