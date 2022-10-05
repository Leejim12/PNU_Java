package Assignment;

import java.util.Scanner;

///////////////////////////////// 메인 //////////////////////////////////////////////////
public class FactorialMain {

	public static void main(String[] args) {

		// 정수를 입력 받기 위한 객체 생성
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		// 입력한 수가 0이면 프로그램 종료
		System.out.print(">>Number (Quit:0) : ");
		while((num = sc.nextInt()) != 0) {

			Factorial fb = new Factorial(num);	// ==> 파라미터 생성자 호출
			System.out.print(">>Number (Quit:0) : ");
			System.out.println(fb.getStr());
		}
		System.out.println(">>Good Bye!!!");
		
		sc.close();
	}
}

//////////////////////////////////////// Factorial 클래스 //////////////////////////////////////////

class Factorial {

	private String str;
	
	public Factorial(int num) {
		str = makeString(num);
	}

	private String makeString(int num) {
		int res = 1;
		String t = String.format("%d!=", num);
		
		for (int i = num ; 0 < i ; i--) {
			res *= i;
			t = String.format("%s*%d", t, i);
		}
		t += String.format("=%d", res);
		return t;
	}
	
	public String getStr() {
		return str;
	}
}