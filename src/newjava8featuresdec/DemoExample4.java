package newjava8featuresdec;

import java.util.ArrayList;
import java.util.function.Function;


class Student2{
	int rollNo;
	String stuName;
	int salary;
	public Student2(int rollNo, String stuName, int salary) {
		super();
		this.rollNo = rollNo;
		this.stuName = stuName;
		this.salary = salary;
	}
	
}
public class DemoExample4 {
	public static void main(String[] args) {
		ArrayList<Student2>as=new ArrayList<Student2>();
		as.add(new Student2(1,"mounika",20000));
		as.add(new Student2(2,"alla",30000));
		
		as.add(new Student2(3,"vani",40000));
		as.add(new Student2(4,"vijaya",1500000));
		
		
		Function<Student2,Integer>p1=e->{
			int sal = e.salary ;
		if(
		sal>12000&&sal<=20000) {
			return sal=10/100*sal+sal;
		}
			
			
		
		else if(sal>20000&&sal<=30000) {
			return sal=20/100*sal+sal;
		}
		
		else if(sal>30000&&sal<=40000) {
			 return sal=30/100*sal+sal;
		}
		
		
	
		return sal;
		
		};
		
		for(Student2 s:as) {
			Integer apply = p1.apply(s);
			System.out.println(apply);
		}
		
			
	

		
		
	}
	
}
	
	



