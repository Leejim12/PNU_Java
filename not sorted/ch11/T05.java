package ch11;

public class T05 {

	int battery = 0;
	
	public void charge(int time) {

		if(time<0) {
			time = 0;
		try{
			throw new Exception();
		}catch(NagativeNumberException e) {
			e.printStackTrace();
		}
		
		}
		
		battery += time;
		System.out.println("현재 배터리 : " + battery);
	}
	
	
	public static void main(String[] args) {
		
		T05 test = new T05();
		test.charge(30);
		test.charge(20);
		test.charge(-5);
	}

}