package come.ruby.java.test1;
import java.util.Scanner;
public class SSS {


	
	public static void main(String[] args) {
		
		
		char TT = 'A';
		Armor ar = new Armor(); //객체 생성, ar : 인스턴스
		// ar---> 스택영역에 하나 생김. 얘가 힙의 주소를 가르키는거임 ( ar:참조형변수 )
		// 생성되자마자 실행되는것들 필요할 때 --> 생성자 ( 생성자도 함수임 )
		
//		Armor jim = new Armor();
//		armor.work();
//		armor.Printname();
		
		ar.setName("ABCS");		
		ar.setheight(800);
		ar.setweight(900);
		ar.setcolor("Red");
		ar.setIsFly();
		
		
		
		String n1 = ar.getName();
		int k1 = ar.getheight();
		int k2 = ar.getweight();
		String n2 = ar.getcolor();
		boolean b1 = ar.getisFly();
		
		ar.dddd();

		Scanner sc = new Scanner(System.in); 

		System.out.println("사용자 name:" + TT + "\n");
		
		
		System.out.println("[1번 Armor]");
		System.out.println("name:"+n1);
		System.out.println("height:"+k1 + "cm");
		System.out.println("weight:"+k2 + "cm");
		System.out.println("color:"+n2);
		System.out.println("isFly:"+b1 + "\n");
		
		System.out.println("[2번 Armor]");
		System.out.println("name" + ar.getName());
		System.out.println("height:" + ar.getheight() + "cm");
		System.out.println("weight:" + ar.getweight() + "cm");
		System.out.println("color:" + ar.getcolor() + "\n");
		

		System.out.println("[3번 Armor]");
		Armor ar2 = new Armor("홍이동",100,100,"RED",true);
		System.out.println("name:" + ar2.getName());
		System.out.println("height:" + ar2.getheight() + "cm");
		System.out.println("weight:" + ar2.getweight() + "cm");
		System.out.println("color:" + ar2.getcolor() + "\n");
		
		System.out.println("ar2 :" + ar2.toString());
	}

}
