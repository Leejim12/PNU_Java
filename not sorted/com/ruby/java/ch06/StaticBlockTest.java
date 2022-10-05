package com.ruby.java.ch06;

public class StaticBlockTest {
	static {
		System.out.println("hello"); //코드영역에 있음. 먼저 실행됨.
		System.out.println("java");
	}
	public static void main(String[] args) {
		System.out.println("world!!");
	}
}
