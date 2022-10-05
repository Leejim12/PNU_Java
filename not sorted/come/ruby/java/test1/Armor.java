package come.ruby.java.test1;
import java.util.Scanner;
public class Armor {

		@Override
	public String toString() {
		return "Armor [name=" + name + ", height=" + height + ", weight=" + weight + ", color=" + color + ", isFly="
				+ isFly + "]";
	}

		public Armor(String name, int height, int weight, String color, boolean isFly) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.color = color;
		this.isFly = isFly;
	}

		public String name;
		private int height;
		private int weight;
		private String color;
		private boolean isFly;
		
		public Armor() {
		// 생성자는 타입이 없당. 이게 생성자임~~~
			name = "john";
			// 디폴트 생성자를 자바가 알아서 생성해줌.
			// 생성자 선언, 값세팅.
		}
		
		public Armor(String name) {
			// 이건 괄호안에 바로 넣을 수 있게.
			this.name = name;
		}
		
		
		public void setName(String name) {
			this.name = name;
		}
		public void setheight(int height) {
			this.height = height;
		}
		public void setweight(int weight) {
			this.weight = weight;
		}
		public void setcolor(String color) {
			this.color = color;
		}
		public void setIsfly(boolean isFly) {
			this.isFly = isFly;
		}
		
		
		
		
		
		
		public String getName() {
			return name;
		}
		public int getheight() {
			return height;
		}
		
		public int getweight() {
			return weight;
		}
		
		public String getcolor() {
			return color;
		}
		
		public boolean getisFly() {
			return isFly;
		}
		
		
		
		
		public void setName() {
			String value = "mark6";
			name = value;
		}
		
		public void setheight() {
			int value = 0;
			height = value;
		}
		
		public void setweight() {
			int value = 0;
			weight = value;
		}
		public void setcolor() {
			String value = "mark6";
			name = value;
		}
		public void setIsFly() {
			boolean value = false;
			isFly = value;
		}


		
		
		
		
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		public int getWeight() {
			return weight;
		}
		public void setWeight(int weight) {
			this.weight = weight;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public boolean isFly() {
			return isFly;
		}
		public void setFly(boolean isFly) {
			this.isFly = isFly;
		}
		public void takeOff() {
			System.out.println("엔진을 구동");
			System.out.println("엔진 시동 실패");
//			return 0;
			System.out.println("속도 업");
			System.out.println("비행");
		}
		private void work() {
			System.out.println("work~~~~" + "\n");
		}
		
		public void dddd() {
			work();
		}
		
//		Private : 내부 사용가능, public : 전역변수
		
		public void Printname() {
			System.out.println("My Name is" + name);
		}


}
