package inherPra;
/////////////////////////////////////// Person Class /////////////////////////////////////////
class Person{
	protected String pno;
	private String pname;
	protected int age;
//	public Person(String pn,String name, int a) {
//		pno = pn; pname = name; age = a;
	public Person() {
		System.out.println("default 생성자");
		pno = null; pname = null; age = 0;
	}
	public Person(String pn) {
		pno = pn;
//		pno = pn; pname = null; age = 0;
	}

	public Person(String pn, String name) {
		this(pn);
		pname = name;
	}
	public Person(String pn, String name, int a) {
		this(pn,name);
		age = a;
	}	
	
	@Override
	public String toString() {
		return "Person [pno=" + pno + ", pname=" + pname + ", age=" + age + "]";
	}


	public void show() {
//		System.out.println("pno =" + pno + " pname =" + pname + " age = " + age);
		System.out.println(toString());
	}
}

// 오버라이드 : 상속일때만
// 오버로딩 : 상속과 관계없이. ( 한 클래스에 함수가 2개 이상 만들어 졌을 때) -> 이거 차이 명확하게 구별을 해야함.

/////////////////////////////////////// Student Class ////////////////////////////////
class Student extends Person{
	private String schoolName;
	private int schoolYear;

	public Student (String pn, String name, int a, String sn, int sy) {
//		super(pno, pname, age); 
//		Person(pno, pname, age); 생성자는 상속 안됨.
		super(pn, name, a);
		schoolName = sn; schoolYear = sy;
	}
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + ", schoolYear=" + schoolYear + "]";
	}
	public void show() { // 오버로딩. 깔아뭉갬. super.show();이거 주석 떼면 상위클래스 show 호출
//		super.show();
//		System.out.println("SchoolName =" + schoolName + "SchoolYear = " + schoolYear);
		System.out.println(toString());		
	}
	public void show(int a) {
//		System.out.println("SchoolName =" + schoolName + "SchoolYear = " + schoolYear);	
		System.out.println(toString());	
	}
}

/////////////////////////////////////// WorkStudent Class ////////////////////////////////
class WorkStudent extends Student{
	@Override
	public String toString() {
		return "WorkStudent [job=" + job + ", salary=" + salary + "]";
	}
	private String job;
	private int salary;
//	public WorkStudent() {job = null; salary = 0;} 
	public WorkStudent(String pn, String name, int a, String sname, int syear, String j, int pay) {
		super(pn, name, a, sname, syear);
		job = j;salary = pay;
			
	}
	
}


/////////////////////////////////////////// 본문 ///////////////////////////////////////////
public class ProcessPersons {
	static void display(Person[] p) {
		for(int i = 0; i < p.length;i++)
			p[i].show();	
	}
	
	public static void main(String[] args) {
		Person list[] = new Person[6];
		Person p = new Person();
		Person p1 = new Person("p001");
		Person p2 = new Person("p002","Hong");
		Person p3 = new Person("p003","Kim",20);
		
		Student s1 = new Student("p004", "Lee", 40, "신라대",5);
		WorkStudent ws = new WorkStudent("p001", "Hong", 30, "부산대", 3, "code", 1000);
		
		list[0] = p;
		list[1] = p1;
		list[2] = p2;
		list[3] = p3;
		list[4] = s1;
		list[5] = ws;
		
//		WorkStudent ws = new WorkStudent();
		p3.show();
		s1.show();
		ws.show();
		display(list);
		
//		show();
//		WorkStudent.show(); 객체멤버함수라서 안됨.
// 업캐스팅, 다운캐스팅 개념 검색해보기(상속관계에서). 타입캐스팅 --> (int)a
// C에서는 실수를 정수로 바꿔주는게 다운캐스팅. 
		
		
	}

}
