package Assignment;

import java.util.Scanner;

public class KeyboardInput {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		int inum = scanner.nextInt();
		
		System.out.println("실수를 입력하세요 : ");
		double dnum = scanner.nextDouble();
		
		System.out.println("문자열을 입력하세요 : ");
		String str = scanner.next();
		
		System.out.println(inum);
		System.out.println(dnum);
		System.out.println(str);
	}

}
