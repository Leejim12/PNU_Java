package edu;

public class multiTable {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 8; j++) {
				System.out.printf("%d * %d = %d\t", j, i, i*j);
					if(j % 7 == 0) System.out.print("\n");
						
			}
		}

	}

}
