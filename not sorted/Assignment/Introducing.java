package Assignment;

import java.util.Scanner;

public class Introducing {
	String name;
	String birthday;
	double height;
	int weight;
	String job;
	
	
	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		Introducing me = new Introducing();
		
		System.out.println("이름을 입력하세요 : ");
		me.name = sc.next();
		System.out.println("생일을 입력하세요 : ");
		me.birthday = sc.next();
		System.out.println("신장을 입력하세요 : ");
		me.height = sc.nextDouble();
		System.out.println("몸무게를 입력하세요 : ");
		me.weight = sc.nextInt();
		System.out.println("직업을 입력하세요 : ");
		me.job = sc.next();
		
		System.out.println("이름 :" + me.name + " /생일 :" + me.birthday
				+ " /키 :" + me.height + " /몸무게 :" + me.weight + " /직업 :" + me.job);
	}

}
