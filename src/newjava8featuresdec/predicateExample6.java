package newjava8featuresdec;

import java.util.ArrayList;

import java.util.function.Predicate;

class Employeee{
	String name;
	int salary;
	int experience;
	public Employeee(String name, int salary, int experience) {
		super();
		this.name = name;
		this.salary = salary;
		this.experience = experience;
	}
	
}
public class predicateExample6 {
	public static void main(String[] args) {
		ArrayList<Employeee>e1=new ArrayList<Employeee>();
		e1.add(new Employeee("mounika",1200,3));
		e1.add(new Employeee("lahdkjshd",15000,4));
		Predicate<Employeee>p1=(e)->e.salary>5000&&e.experience>3;
		for(Employeee s:e1) {
			if(p1.test(s)) {
				
			
		
		System.out.println(s.name+" "+s.salary+" "+s.experience);
			
		}
		
		
	}
	}
}


