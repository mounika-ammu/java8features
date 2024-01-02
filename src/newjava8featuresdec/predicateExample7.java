package newjava8featuresdec;

import java.util.function.Predicate;

public class predicateExample7 {
	public static void main(String[] args) {
		int a[]= {5,15,20,25,30,35,40,45,50,55,60,65};
		Predicate<Integer>p1=i->i%2==0;
		Predicate<Integer>p2=i->i>50;
		for(int aa:a) {
			//and operator //or operator if we want we can use or operator // negate 
			if(p1.and(p2).test(aa)) {
				System.out.println(aa);
			}
			
		}
		
		
	}

}
//for(int n:a){
//if(p1.negate().test(n)) {
//System.out.println(n);

//}
// negate means it will reverse the actual output
//if we want to join the two perdicates then we use and ,or and negate