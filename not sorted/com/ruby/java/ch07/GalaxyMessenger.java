package com.ruby.java.ch07;

public class GalaxyMessenger {

	
	public String getMessage() {
		return "galaxy";
	}
	
	public void setMessage(String msg) {
		System.out.println("galaxy에서 미시지를 설정합니다" + msg);
	
	}

	public void changeKeyboard() {
		System.out.println("키보드아이콘 터치 후 키보드를 변경합니다.");



	}
}
