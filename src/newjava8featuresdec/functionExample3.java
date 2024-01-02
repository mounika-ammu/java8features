package newjava8featuresdec;

import java.util.ArrayList;
import java.util.function.Function;

class Employeeee {
	int salary;
	String name;
	int exp;

	public Employeeee(int salary, String name, int exp) {
		super();
		this.salary = salary;
		this.name = name;
		this.exp = exp;
	}

}

public class functionExample3 {
	public static void main(String[] args) {

		ArrayList<Employeeee> lis = new ArrayList<Employeeee>();
		lis.add(new Employeeee(15000, "mounika", 14));
		lis.add(new Employeeee(25000, "vani", 30));
		lis.add(new Employeeee(40000, "bfjj", 24));
		Function<Employeeee, Integer> f = (e) -> {
			int sal = e.salary;
			if (sal >= 10000 && sal <= 20000) {
				return (sal+sal * 10 / 100);
			} else if (sal >= 20000 && sal <= 30000) {
				return sal+sal * 20 / 100;
			} else if (sal >= 30000 && sal <= 50000) {
				return sal+sal * 30 / 100;
			} else if(sal>=50000&&sal<=60000) {
				return sal+sal * 40 / 100;
			}
			return sal;
			
		};
		for(Employeeee s:lis) {
			Integer apply = f.apply(s);
			System.out.println(apply);
		}

	}
}
