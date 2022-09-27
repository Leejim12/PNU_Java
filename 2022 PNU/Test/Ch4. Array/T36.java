package edu;

public class Test36ArrLetter {

	public static void main(String[] args) {
		char letter = 'A';
		char[] AB = new char[26];
		
		for(int i = 0; i < AB.length;i++) {
			AB[i] = (char)(letter + i);
		}
		for(char c : AB) {
			System.out.print(c + "\t");
		}

	}

}
