package ch07;

abstract class Employee{
	String name;
	int salary;
	
	public abstract void CalcSalary();
}

///////////////// Salesman ///////////////////////////////
class Salesman extends Employee{
	public void CalcSalary() {
		System.out.println("[Salesman] 급여 = 기본급 + 판매수당");
	}
}

//////////////// Concultant //////////////////////////////
class Concultant extends Employee{
	public void CalcSalary() {
		System.out.println("[Concultant] 급여 = 기본급 + 컨설팅 특별수당");
	}
}

/////////////// Manager ///////////////////////////////////
class Manager extends Employee{
	public void CalcSalary() {
		System.out.println("[Manager] 급여 = 기본급 + 팀 성과 수당");
	}
}

///////////// Director ///////////////////////////////////
class Director extends Manager{
}

public class HRSTest {

	public static void main(String[] args) {
		Salesman s = new Salesman();
		Concultant c = new Concultant();
		Manager m = new Manager();
		Director d = new Director();
		
		s.CalcSalary();
		c.CalcSalary();
		m.CalcSalary();
		d.CalcSalary();
	}

}
