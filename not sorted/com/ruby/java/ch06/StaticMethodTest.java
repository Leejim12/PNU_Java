package com.ruby.java.ch06;

class Count{
	public static int totalCount;
	int count;
}

public class StaticMethodTest {
	int num = 123;

// 
public static void main(String[] args) {
	StaticMethodTest.print1();
	StaticMethodTest exam = new StaticMethodTest();
	exam.print2();
	Count c = new Count();
//		print1();
////		print2();
//		StaticMethodTest s = new StaticMethodTest();
//		s.print2();
		}

	

	
	
	public static void print1() {
		int num = 123; //여기서 새로 정의를 해주면 결국 됨.
		int num2 = num;
		System.out.println("hello");
	}
	public void print2() {
		int num3 = num;
		System.out.println("java");
	}
	
}
