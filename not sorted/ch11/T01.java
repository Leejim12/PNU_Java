package ch11;

public class T01 {

	public static void main(String[] args) {
		
		try {
			String s = new String("Java");
			int len = s.length();
			s = null;
			s.length();
			int arr[] = new int[3];
			arr[3] = 30;
			System.out.println("OK");
			System.out.println(4/0);
			
		} catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("OK");
		} catch(NullPointerException e2) {
			e2.printStackTrace();
		} catch(Exception e) {
			System.out.println("오류발생 :" + e);
		} finally {
			System.out.println("finally ~~~");
		}
		System.out.println("Good");
	
	}// try 끝
}