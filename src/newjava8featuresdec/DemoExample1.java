package newjava8featuresdec;

import java.util.ArrayList;

class Student{
	int rollNo;
	String studentName;
	int salary;
	public Student(int rollNo, String studentName, int salary) {
		super();
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.salary = salary;
	}
	
}
public class DemoExample1 {
	public static void main(String[] args) {
		ArrayList<Student> as=new ArrayList<Student>();
		as.add( new Student(1,"mounika",2000));
		as.add(new Student(2,"vani",3000));
		as.add(new Student(3,"lavanaya",4000));
		for(Student a:as) {
			if(a.salary>2000) {
				System.out.println(a.studentName+" "+a.salary);
			}
		}
		
	}

}
