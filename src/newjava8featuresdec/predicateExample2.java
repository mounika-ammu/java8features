package newjava8featuresdec;

import java.util.function.Predicate;

public class predicateExample2 {
	public static void main(String[] args) {
		Predicate<String> p=s->(s.length()>4);
		System.out.println(p.test("welcome"));
		
	}

}
