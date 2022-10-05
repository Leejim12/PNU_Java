package Student;



public class Student {
	private int sno;
	private String name;
	private float weight;
	
	public Student() {
		sno = 0;
		name = "min";
		weight = 0;
	}

	public Student(int sno, String name,float weight) {
	this.sno = sno;
	this.name = name;
	this.weight = weight;
}
// get 시리즈
	public int getSno() {
		return sno;
	}
	
	public String getName() {
		return name;
	}
	
	public float getWeight() {
		return weight;
	}
	
// set 시리즈
	public void setSno(int sno) {
		this.sno = sno;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}

	
//
//	public static Student(int sno, String name,float weight){
//		Student st = new Student();
//		st.setSno(sno);
//		st.setName(name);
//		st.setWeight(weight);	
//	}
//	
	
	
	
public void showStudent() {
	System.out.println("Student Number:" + sno);
	System.out.println("Student Name:" + name);
	System.out.println("Weight:" + weight);
	
}
//
//public class PrownStudent{
//	student s = new student();
//	s.getSno();
//	s.showStudent();
//
//}
}




