package newjava8featuresdec;
interface Addd{
	public int add(int a,int b);
}
public class functionalinterfaceexample3 implements Addd {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
		
	}
	public static void main(String[] args) {
		functionalinterfaceexample3 ac=new functionalinterfaceexample3();
		System.out.println(ac.add(2, 3));
	
		Addd aa=(int a,int b)->{
		return a+b;
	
		
	};
	
	
	System.out.println(aa.add(3, 3));
	
	

}
}
