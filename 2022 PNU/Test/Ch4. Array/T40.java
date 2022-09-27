package edu;

public class Test40DsideSum {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int num = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num ++;
				}
		}

		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(i >= j)
				sum = sum + arr[i][j];
			}
		}
		
		System.out.println(sum);
		
		
	}

}