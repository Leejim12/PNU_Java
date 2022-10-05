package com.ruby.java.ch06;

public class member {
	private String name;
	private int age;

	public member() {
//		this.name = "guest";
//		age = 0;
		this("guest");
	}
/// 리팩토링
	public member(String name) {
//		this.name = name;
//		age = 0;
		this(name,0);
	}

	public member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
	}

	public void show() {
		System.out.println("name = "+ name + "age = " + age);
	}
	
	public static void main(String[] args) {
		System.out.println("main() 메서드 실행");
		member m1 = new member();
		member m2 = new member("Amy");
		member m3 = new member("Amy", 23);
		show();
		show();
		show();
		
	}
		
}