package 중간시험;
// ** TestPersons에서 구현했으나, 인터페이스 연습 등으로 다른 방식으로 구현한 파일입니다.
//////////////////////////////////////// Person //////////////////////////////////
abstract class PersonP{
	 @Override
	public String toString() {
		return "[Person]" + pnum + " /" + name + " /" + age ;
	}
	 public String pnum;
	 public String name; 
	 public int age;
	 public String msg;
	 
	 public PersonP(String pnum,String name,int age, String msg) {
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
class EmployeeP extends PersonP implements Message{
	@Override
	public String toString() {
		return "[EmployeeP]" + super.toString() + " /" + job + " /" + dept + " /" + salary;
	}

	public String job;
	public String dept;
	public int salary;

	public EmployeeP(String pnum,String name, int age, String job, String dept, int salary, String msg) {
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
class DesignerP extends EmployeeP implements Message{
	 @Override
	public String toString() {
		return "[DesignerP]" + super.toString() + " /" + language + " /" + workYear;
	}

	 public String language;
	 public int workYear;
	
	public DesignerP(String pnum,String name, int age, String job, String dept, int salary, String language, int workYear, String msg) {
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
class StudentP extends PersonP implements Message{
	 @Override
	public String toString() {
		return "[Student]" + super.toString() + " /" + schoolName
				+ " /" + schoolyear + " /" + scholarship;
	}
	 public String schoolName;
	 public int schoolyear;
	 public int scholarship;
	 
	 public StudentP(String pnum,String name,int age,String schoolName, int schoolyear, int scholarship, String msg) {
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
///////////////////////////////////// WorkStudent ///////////////////////////////////////	 
class WorkStudentP extends StudentP implements Message{
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
	
	 public WorkStudentP(String pnum,String name,int age,String schoolName, int schoolyear, int scholarship,String job, int dayPay, String msg) {
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

public class TPerson{
	Person p[]  = new Person[4]; 
	
	private static void showAll(PersonP[] p) {
		for (int i = 0; i<p.length;i++) {
			p[i].getMessage();
			p[i].show();
			System.out.println(p[i].getMessage() + "\n");
		}

	}
	private static void showAll(Message[] m) {
		for (int i = 0; i<m.length;i++) {
			m[i].getMessage(); // 
//			m[i].show();
			Message.getConnection();
			System.out.println(m[i].getMessage() + "\n");
		}
		
	}
	public static void increaseAll(PersonP[] p) {
        for (int i = 0; i<p.length;i++) {
        	p[i].increase(); // 동적바인딩 구현
        }
	}
	
	public static void getData(PersonP[] p) {
		EmployeeP e = new EmployeeP("p01", "민수", 10, "DB", "Design", 2000, "직원입니다.");
        DesignerP d = new DesignerP("p02","장수", 22, "solder", "ASS", 20000, "자바", 2004, "디자이너 입니다.");
        StudentP s = new StudentP("p03","진호",23,"한양대", 2010, 30000,"학생입니다.");
        WorkStudentP wss = new WorkStudentP("p04","가은",25,"부산대", 2011, 205000,"제빵사", 30000,"근로생 입니다.");
        p[0] = e;
        p[1] = d;
        p[2] = s;
        p[3] = wss;
	}
	public static void getData(Message[] m) {
		Employee e = new Employee("p01", "민수", 10, "DB", "Design", 2000, "직원입니다.");
        Designer d = new Designer("p02","장수", 22, "solder", "ASS", 20000, "자바", 2004, "디자이너 입니다.");
        Student s = new Student("p03","진호",23,"한양대", 2010, 30000,"학생입니다.");
        WorkStudent wss = new WorkStudent("p04","가은",25,"부산대", 2011, 205000,"제빵사", 30000,"근로생 입니다.");
        m[0] = e;
        m[1] = d;
        m[2] = s;
        m[3] = wss;
	}
///////////////////// main /////
	public static void main(String[] args) {
        PersonP [] setPerson = new PersonP[4];
        Message [] m = new Message[4];
        
        getData(setPerson);
        getData(m);
        showAll(m);
        System.out.println("--------------------------- ▼ 임금 상승 이후 ▼ -------------------------------");
        increaseAll(setPerson);
        showAll(setPerson);	

        

	}

}
