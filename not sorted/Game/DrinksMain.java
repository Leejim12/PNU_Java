package Game;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;



public class DrinksMain {



	public static void main(String[] args) {



		{

			Juice j = new Juice("오렌지 쥬스", 3500);			j.drink();

			Coffee c = new Coffee("아이스 아메리카노", 2000);	c.drink();

			Beer b = new Beer("테라", 3500);					b.drink();

			Water w = new Water("삼다수", 2000);				w.drink();

			Tea t = new Tea("옥수수수염차", 2000);				t.drink();

		}

		System.out.println("=================================================");

		// 다형성

		{

			Drinks[] d = new Drinks[5];

			

			d[0] = new Juice("오렌지 쥬스", 3500);

			d[1] = new Coffee("아이스 아메리카노", 2000);

			d[2] = new Beer("테라", 3500);

			d[3] = new Water("삼다수", 2000);

			d[4] = new Tea("옥수수수염차", 2000);

			

			for (Drinks t : d) {

				t.drink();

			}

		}

		System.out.println("===================컬렉션 연습===========================");
		{

			List<Drinks> list = new ArrayList<>();

			

			list.add(new Juice("오렌지 쥬스", 3500));

			list.add(new Coffee("아이스 아메리카노", 2000));

			list.add(new Beer("테라", 3500));

			list.add(new Water("삼다수", 2000));

			list.add(new Tea("옥수수수염차", 2000));

			
			System.out.println("*** ArrayList" + "\n");
			for (Drinks t : list) {

				t.drink();

			}

		}	
		{

			List<Drinks> list = new LinkedList<>();

			

			list.add(new Juice("오렌지 쥬스", 3500));

			list.add(new Coffee("아이스 아메리카노", 2000));

			list.add(new Beer("테라", 3500));

			list.add(new Water("삼다수", 2000));

			list.add(new Tea("옥수수수염차", 2000));

			
			System.out.println("*** LinkedList" + "\n");
			for (Drinks t : list) {

				t.drink();

			}

		}		
		{

			List<Drinks> list = new Vector<>();

			

			list.add(new Juice("오렌지 쥬스", 3500));

			list.add(new Coffee("아이스 아메리카노", 2000));

			list.add(new Beer("테라", 3500));

			list.add(new Water("삼다수", 2000));

			list.add(new Tea("옥수수수염차", 2000));

			
			System.out.println("*** Vector" + "\n");
			for (Drinks t : list) {

				t.drink();

			}

		}		
	}

}

///////////////////////// Drink Class ///////////////////////////////////////
class Drinks {
																	// 생성자
	private String name;							
	private int price;


																	// 초기화
	public Drinks() {

		name = "";

		price = 0;

	}

	
																	// setter
	public Drinks(String name, int price) {

		this.name = name;

		this.price = price;

	}

	
															// super의 drink 메소드 정의
	public void drink() {

		System.out.printf("%s를 마십니다. 가격은 %d원 입니다.", name, price);

	}

}


//////////////////////////////// Juice Class //////////////////////////////////
class Juice extends Drinks {



	public Juice(String name, int price) {

		super(name, price);

	}

	

	public void drink() {

		System.out.print("[JUICE]");

		super.drink();

		System.out.println();

	}

}


////////////////////////////////Coffee Class //////////////////////////////////
class Coffee extends Drinks {

	public Coffee(String name, int price) {

		super(name, price);

	}

	

	public void drink() {

		System.out.print("[COFFEE]");

		super.drink();

		System.out.println();

	}

}


////////////////////////////////Beer Class //////////////////////////////////
class Beer extends Drinks {

	public Beer(String name, int price) {

		super(name, price);

	}

	

	public void drink() {

		System.out.print("[BEER]");

		super.drink();

		System.out.println();

	}

}


//////////////////////////////// Water Class /////////////////////////////////////////
class Water extends Drinks {

	public Water(String name, int price) {

		super(name, price);

	}

	

	public void drink() {

		System.out.print("[WATER]");

		super.drink();

		System.out.println();

	}

}


////////////////////////////////Tea Class //////////////////////////////////
class Tea extends Drinks {

	public Tea(String name, int price) {

		super(name, price);

	}

	

	public void drink() {

		System.out.print("[TEA]");

		super.drink();

		System.out.println();

	}

}