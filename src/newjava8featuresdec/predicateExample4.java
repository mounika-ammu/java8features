package newjava8featuresdec;

import java.util.function.Predicate;

public class predicateExample4 {
	public static void main(String[] args) {
		String[] names= {"mounika","alla","grapes","ghh"};
		
		Predicate<String> s=s1->s1.length()>4;
		for(String p:names) {
		System.out.println(s.test(p));
			
		}
		
	}

}
