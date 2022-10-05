package ch11;

public class Pra {

	public static void main(String[] args) {

//////////////////// 정상출력 ////////////////////////////
		try {
			int arr1[] = new int [4];
			arr1[3] = 30;
			System.out.println("OK");
		} catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("error");
			
		}

/////////// ArrayIndexOutOfBoundsException ////////////
		try {
			int arr2[] = new int [3];
			arr2[3] = 30;
			System.out.println("OK");
		} catch(ArrayIndexOutOfBoundsException e2) {
			System.out.println("error");
			
		}
		
////////////////// Div 0 예외처리	///////////////////////	
		int k = 0;
		int j = 0;
		try {
		int arr3[] = new int[3];
		arr3[2] = 5; 
		k = arr3[2];
		System.out.println(k / j);
		} catch(ArithmeticException e3) {
			System.out.println("Div 0 error");
		}
	}
}