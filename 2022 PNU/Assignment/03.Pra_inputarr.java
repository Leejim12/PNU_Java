package edu;
import java.util.Scanner;
public class Pra_inputarr {
	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int [] a = new int[4];
		
		Scanner sc = new Scanner(System.in);
		
		a[0] = sc.nextInt();
		a[1] = sc.nextInt();
		a[2] = sc.nextInt();
		a[3] = sc.nextInt();
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		
	}

}
