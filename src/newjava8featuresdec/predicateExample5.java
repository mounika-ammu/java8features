package newjava8featuresdec;

import java.util.function.Predicate;

class Employee{
	String ename;
	int salary;
	int experience;
	public Employee(String ename, int salary, int experience) {
		super();
		this.ename = ename;
		this.salary = salary;
		this.experience = experience;
	}
	
}

public class predicateExample5 {
	public static void main(String[] args) {
		Employee e=new Employee("mounika",12000,3);
		Predicate<Employee> p1=(s)->s.salary>15000&&s.experience>3;
		System.out.println(p1.test(e));
		
	}

}
