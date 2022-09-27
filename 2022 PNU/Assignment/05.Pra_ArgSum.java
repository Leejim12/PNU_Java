package edu;

import java.util.Random;
import java.util.Scanner;

public class Pra_ArgSum {

	public static void main(String[] args) {

			
			Random random = new Random();
			int num1 = 0;
			int num2 = 0;
			int num3 = 0;
			int num4 = 0;
			int [][] a = new int[4][4];
			int [][] b = new int[4][4];
			int [][] c = new int[4][4];
			
			
			
			Scanner sc = new Scanner(System.in);
			
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
			
	        for(int i = 0 ; i < a.length ; ++i){
	            for(int j = 0 ; j < b[0].length ; ++j){
	                    c[i][j] += a[i][j] * b[i][j];
	                
	            }
	        }
			
	        for(int i = 0; i < c.length; ++i) {
	        	for(int j = 0; j <c[0].length ; ++j) {
	        		System.out.print(c[i][j]);
	        		System.out.print("\t");
	        	}
	        	System.out.println("\n");
	        }


		}
	}