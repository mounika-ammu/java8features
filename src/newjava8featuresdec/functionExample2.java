package newjava8featuresdec;

import java.util.function.Function;

public class functionExample2 {
public static void main(String[] args) {
	Function<String,Integer>s=(s1)->s1.length();
	System.out.println(s.apply("mounika"));
	
	
}
}
