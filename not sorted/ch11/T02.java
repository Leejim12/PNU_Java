package ch11;

public class T02 {

	public static void main(String[] args) {
		try {
			System.out.println("1");
			String s = null;
			s.length();
			System.out.println("2");
			System.out.println("3");
		} catch(Exception e) {
			System.out.println("오류발생");
		} finally {
			System.out.println("Ok");
		}
		System.out.println("4");
	}

}
