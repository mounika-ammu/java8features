package newjava8featuresdec;
interface Animal {
	public int sum(int a,int b);
	
}
public class DemoExample3 {
	public static void main(String[] args) {
	Animal aa=(a,b)->{
			return a+b;
		};
	System.out.println(aa.sum(2, 5));		
		
		
	
		
		
	

	}
}
//no access modifier,no return type ,NO method name is called lambda expression