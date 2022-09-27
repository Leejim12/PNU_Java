package edu;
import java.util.Random;
import java.util.Scanner;

public class Pra_ArgTranspose {

	public static void main(String[] args) {
		Random random = new Random();
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int B[][] = new int[3][3];
		int c[][] = new int[3][3];
		
		
		for(int i = 0; i  < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				a[i][j] = random.nextInt(100);		
			}
		}
		for(int i = 0; i  < b.length; i++) {
			for(int j = 0; j < b[i].length; j++) {
				b[i][j] = random.nextInt(100);		
			}
		}
		
		for(int i = 0; i  < b.length; i++) {
			for(int j = 0; j < b[i].length; j++) {
				B[i][j] = b[j][i];
			}
		}
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < B[0].length; j++) {
				for(int k = 0; k < a[0].length; k++ )
					c[i][j] += a[i][k] * B[k][j]; 
			}
		}
		
		
		System.out.println("행렬a입니다.");
        for(int i = 0; i < a.length; ++i) {
        	for(int j = 0; j <a[0].length ; ++j) {
        		System.out.print(a[i][j]);
        		System.out.print("\t");
        	}
        	System.out.println("\n");
        }
        
	}
}