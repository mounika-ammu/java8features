package newjava8featuresdec;

import java.util.ArrayList;
import java.util.function.Predicate;

class Students{
	int salary;
	String stuName;
	int rollNo;
	public Students(int salary, String stuName, int rollNo) {
		super();
		this.salary = salary;
		this.stuName = stuName;
		this.rollNo = rollNo;
	}
	
	
}
public class DemoExample2 {
	public static void main(String[] args) {
		ArrayList<Students>ass=new ArrayList<Students>();
		Predicate<Students>p=e->
			e.salary>4000;
		
		ass.add(new Students(2000,"mounika",1));
		ass.add(new Students(3000,"vaniiii",2));
		ass.add(new Students(5000,"alllaaa",3));
		for(Students a:ass) {
			if(p.test(a)) {
				System.out.println(a.stuName+" "+a.salary);
			}
			
		}
		
	}

}
