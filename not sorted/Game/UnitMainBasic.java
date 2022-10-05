package Game;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.Arrays;


//import inherPra.Drinks;



public class UnitMainBasic {

	public static void main(String[] args) {
		// 객체 생성
		{
			Tank t = new Tank("시저탱크", "포");			t.attack(); t.move();

			Airplane p = new Airplane("전투기", "미사일");	p.attack(); p.move();

			Submarine s = new Submarine("잠수함", "어뢰");	s.attack(); s.move();

			Soldier so = new Soldier("마린", "소총");	so.attack(); so.move();
			
			Unit u = new Unit();
			
			
			
			
			System.out.println(t.toString());
			System.out.println(p.toString());
			System.out.println(s.toString());
			System.out.println(so.toString());
			System.out.println(u.toString());
			
		}

		System.out.println("=================================================");

		// 다형성 [크기 4 배열 생성] → [배열 내에 객체 추가]
		{
			Unit[] d = new Unit[4];

			d[0] = new Tank("시저탱크", "포");
			d[1] = new Airplane("전투기", "미사일");
			d[2] = new Submarine("잠수함", "어뢰");
			d[3] = new Soldier("마린", "소총");

			for (Unit t : d) {
				t.attack();
				t.move();
				System.out.println(d.toString());
//				System.out.println(Arrays.toString(d[t]));
				
			}
			System.out.println(d.toString());
		}
		
		System.out.println("===================컬렉션 연습===========================");
		// Collection (ArrayList) * [List 생성] → [List 내에 add]
		{
			List<Unit> list = new ArrayList<>();		

			list.add(new Tank("시저탱크", "포"));

			list.add(new Airplane("전투기", "미사일"));

			list.add(new Submarine("핵잠수함", "핵어뢰"));

			list.add(new Soldier("핵 전투기", "핵미사일"));

			
			System.out.println("***** ArrayList *****");
			for (Unit t : list) {

				t.attack();
				t.move();
				System.out.println(list.toString() + "\n");
			}
			Tank t = new Tank("시저탱크", "포");			t.attack(); t.move();
			System.out.println(t.toString());


		}		
		{
			List<Unit> list = new LinkedList<>();		

			list.add(new Tank("시저탱크", "포"));

			list.add(new Airplane("전투기", "미사일"));

			list.add(new Submarine("핵잠수함", "핵어뢰"));

			list.add(new Soldier("핵 전투기", "핵미사일"));

			
			System.out.println("***** LinkedList *****");
			for (Unit t : list) {

				t.attack();
				t.move();
				System.out.println(list.toString() + "\n");
			}
			Tank t = new Tank("시저탱크", "포");			t.attack(); t.move();
			System.out.println(t.toString());


		}	
		{
			List<Unit> list = new Vector<>();		

			list.add(new Tank("시저탱크", "포"));

			list.add(new Airplane("전투기", "미사일"));

			list.add(new Submarine("핵잠수함", "핵어뢰"));

			list.add(new Soldier("핵 전투기", "핵미사일"));

			
			System.out.println("***** Vector *****");
			for (Unit t : list) {

				t.attack();
				t.move();
				System.out.println(list.toString());
			}
			Tank t = new Tank("시저탱크", "포");			t.attack(); t.move();
			System.out.println(t.toString() + "\n");


		}	
		

	}

}

///////////////////////// Unit Class (Super) ///////////////////////////////////////
class Unit {

	private String name;

	private String Armor;


	public Unit() {

		name = "";

		Armor = "";

	}

	

	public Unit(String name, String Armor) {

		this.name = name;

		this.Armor = Armor;

	}

	

	public void attack() {

		System.out.printf("%s를 쏩니다.[%s]", Armor, name);

	}

	public void move() {
		System.out.printf("이동을 시작합니다.[%s]", name);

	}
	
}

///////////////////////// Tank Class ///////////////////////////////////////
class Tank extends Unit {



	public Tank(String name, String Armor) {

		super(name, Armor);

	}

	

	public void attack() {

		System.out.print("[Tank]");

		super.attack();

		System.out.println();

	}
	public void move() {

		System.out.print("[Tank]");

		super.move();

		System.out.println();

	}
	
	
}

///////////////////////// Airplane Class ///////////////////////////////////////
class Airplane extends Unit {



public Airplane(String name, String Armor) {

super(name, Armor);

}



public void attack() {

System.out.print("[Airplane]");

super.attack();

System.out.println();

}
public void move() {

System.out.print("[Airplane]");

super.move();

System.out.println();

}
}

///////////////////////// Submarine Class ///////////////////////////////////////
class Submarine extends Unit {



	public Submarine(String name, String Armor) {

		super(name, Armor);

	}

	

	public void attack() {

		System.out.print("[Submarine]");

		super.attack();

		System.out.println();
	}
	public void move() {

		System.out.print("[Submarine]");

		super.move();

		System.out.println();
	}

}

///////////////////////// Soldier Class ///////////////////////////////////////
class Soldier extends Unit {



	public Soldier(String name, String Armor) {

		super(name, Armor);

	}

	

	public void attack() {

		System.out.print("[Soldier]");

		super.attack();

		System.out.println();

	}
	public void move() {

		System.out.print("[Soldier]");

		super.move();

		System.out.println();

	}
}