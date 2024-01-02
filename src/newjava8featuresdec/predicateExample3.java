package newjava8featuresdec;

import java.util.function.Predicate;
// predicate take one parameter as input and it will return  boolean as output
// use only if you have conditinal checks in your programm
public class predicateExample3 {
	public static void main(String[] args) {
		Predicate<Integer>a=(i)->(i%2==0);
		System.out.println(a.test(2));
		System.out.println(a.test(3));
		
	}

}
