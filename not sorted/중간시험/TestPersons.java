package 중간시험;
//////////////////////////////////////// Person //////////////////////////////////
abstract class Person implements Message{
	 @Override
	public String toString() {
		return "[Person]" + pnum + " /" + name + " /" + age ;
	}
	 public String pnum;
	 public String name; 
	 public int age;
	 public String msg;
	 
	 public Person(String pnum,String name,int age, String msg) {
		 this.pnum = pnum;
		 this.name = name;
		 this.age = age;
		 this.msg = msg;
	 }
	 
	 abstract void show();//toString()를 호출하여 sysout으로 처리
	 abstract void increase();//salary, scholarship, or dayPay를 10% 증가
	 public String getMessage() {
		 return msg;
	 }
	 public void setMessage(String msg) {
		 this.msg = msg;
	 }
	 public void getConnection() {
		 System.out.println("network ok");
	 }
}

///////////////////////////////////// Employee /////////////////////////// ** 
class Employee extends Person implements Message{
	@Override
	public String toString() {
		return "[Employee]" + super.toString() + " /" + job + " /" + dept + " /" + salary;
	}

	public String job;
	public String dept;
	public int salary;

	public Employee(String pnum,String name, int age, String job, String dept, int salary, String msg) {
			super(pnum,name,age, msg);
			this.job = job;
			this.dept = dept;
			this.salary = salary;
	 }
	 
	public void show() {
		System.out.println(this.toString());
		 
	 }
	 
	 public void increase() {
		 this.salary = (int) (salary * 1.1);
	 }

	
}
///////////////////////////////////// Designer ///////////////////////////////////////
class Designer extends Employee implements Message{
	 @Override
	public String toString() {
		return "[Designer]" + super.toString() + " /" + language + " /" + workYear;
	}

	 public String language;
	 public int workYear;
	
	public Designer(String pnum,String name, int age, String job, String dept, int salary, String language, int workYear, String msg) {
		super(pnum,name,age,job,dept,salary,msg);
		this.language = language;
		this.workYear = workYear;
	}
	
	public void show() {
		System.out.println(this.toString());
	 }
	 
	 public void increase() {
		 super.increase();
	 }

	
}
///////////////////////////////////// Student ///////////////////////////////////////
class Student extends Person implements Message{
	 @Override
	public String toString() {
		return "[Student]" + super.toString() + " /" + schoolName
				+ " /" + schoolyear + " /" + scholarship;
	}
	 public String schoolName;
	 public int schoolyear;
	 public int scholarship;
	 
	 public Student(String pnum,String name,int age,String schoolName, int schoolyear, int scholarship, String msg) {
		 super(pnum,name,age, msg);
		 this.schoolName = schoolName;
		 this.schoolyear = schoolyear;
		 this.scholarship = scholarship;
	 }
	 
	 public void show() {
			System.out.println(this.toString());
	 }
	 
	 public void increase() {
		 this.scholarship = (int) (scholarship * 1.1);
	 }
}	 
///////////////////////////////////// WorkStudent ///////////////////////////////////////	 
class WorkStudent extends Student implements Message{
	 @Override
	public String toString() {
		return "[WorkStudent]" + super.toString() + "/" + job + "/" + dayPay;
	}

	 public String pnum;
	 public String name; 
	 public int age;
	 public String schoolName;
	 public int schoolyear;
	 public int scholarship;
	 public String job;
	 public int dayPay;
	
	 public WorkStudent(String pnum,String name,int age,String schoolName, int schoolyear, int scholarship,String job, int dayPay, String msg) {
		 super(pnum,name,age,schoolName,schoolyear,scholarship,msg);
		 this.job = job;
		 this.dayPay = dayPay;
	 }
		public void show() {
			System.out.println(this.toString());
		 }
		 
		 public void increase() {
			 this.dayPay= (int) (dayPay* 1.1);
			 
		 }		 
		 
}

/// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//////

public class TestPersons{
	Person p[]  = new Person[4]; 
	
	private static void showAll(Person[] p) {
		for (int i = 0; i<p.length;i++) {
			p[i].getConnection();
			p[i].show();
			System.out.println(p[i].getMessage() + "\n");
		}

	}
	public static void increaseAll(Person[] p) {
        for (int i = 0; i<p.length;i++) {
        	p[i].increase(); // 동적바인딩 구현
        }
	}
	
	public static void getData(Person[] p) {
		Employee e = new Employee("p01", "민수", 10, "DB", "Design", 200000, "직원입니다.");
        Designer d = new Designer("p02","장수", 22, "solder", "ASS", 250000, "자바", 2004, "디자이너 입니다.");
        Student s = new Student("p03","진호",23,"한양대", 2010, 300000,"학생입니다.");
        WorkStudent wss = new WorkStudent("p04","가은",25,"부산대", 2011, 205000,"제빵사", 300000,"근로생 입니다.");
        p[0] = e;
        p[1] = d;
        p[2] = s;
        p[3] = wss;
	}
	
///////////////////// main /////
	public static void main(String[] args) {
        Person [] setPerson = new Person[4];
        
        getData(setPerson);
        showAll(setPerson);
        System.out.println("---------------------------- ▼ 임금 상승 이후 ▼ ------------------------------------");
        increaseAll(setPerson);
        showAll(setPerson);	

        

	}

}
