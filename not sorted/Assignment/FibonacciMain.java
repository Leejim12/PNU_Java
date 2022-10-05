package Assignment;

import java.util.Scanner;

public class FibonacciMain {

	public static void main(String[] args) {

		// 정수를 입력 받기 위한 객체 생성
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		// 입력한 수가 0이면 프로그램 종료
		System.out.print(">>Number (Quit:0) : ");
		while((num = sc.nextInt()) != 0) {

			Fibonacci fb = new Fibonacci(num);	// ==> 파라미터 생성자 호출
			fb.print();

			System.out.println(">>-------------------------------");
			System.out.print(">>Number (Quit:0) : ");
		}
		System.out.println(">>Good Bye!!!");
		
		sc.close();
	}
}

class Fibonacci {

	private int num;
	
	public Fibonacci(int num) {
		this.num = num;
	}
	
	public void print() {
		int n1 = 0;
		int n2 = 1;
		
		//System.out.print(String.format("%d %d ", n1, n2));
		System.out.printf("%d %d ", n1, n2);
		
		for (int i = 2 ; i < num ; i++) {
			int sum = n1 + n2;
			System.out.printf("%d ", sum);

			n1 = n2;
			n2 = sum;
		}
		System.out.println();
	}	
}