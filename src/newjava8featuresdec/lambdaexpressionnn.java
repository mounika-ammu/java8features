package newjava8featuresdec;
interface Add{
	public int add(int a, int b);
}
public class lambdaexpressionnn {
public static void main(String[] args) {
	
	
//	Add a=new Add() {
//
//		@Override
//		public int add(int a, int b) {
//			// TODO Auto-generated method stub
//			return 0;
//		}
//		
//	};
	 
	Add a1=(a,b)->a+b;
	System.out.println(a1.add(2, 3));
		
	}


}


