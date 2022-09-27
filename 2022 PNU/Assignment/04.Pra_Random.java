package edu;
import java.util.Scanner;
import java.util.Random;
public class Pra_Random {
	public static void main(String[] args) {
		
		Random random = new Random();
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int [] a = new int[4];
		
		Scanner sc = new Scanner(System.in);
		
		a[0] = random.nextInt(100);
		a[1] = random.nextInt(100);
		a[2] = random.nextInt(100);
		a[3] = random.nextInt(100);
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		
	}

}