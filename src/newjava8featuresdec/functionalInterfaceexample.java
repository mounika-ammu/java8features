//package newjava8featuresdec;
//interface sing{
//	public void sayy(String msg);
//}
//
//public class functionalInterfaceexample implements sing{
//
//	@Override
//	public void sayy(String msg) {
//		//System.out.println("mounika");
//		// TODO Auto-generated method stub
//		//System.out.println(msg);
//
//		
//	}
//	public static void main(String[] args) {
//		
////		functionalInterfaceexample fie=new functionalInterfaceexample();
////		fie.sayy("mouni");
//	
//		//sing s1=(String msg)->{System.out.println(msg);
//		functionalInterfaceexample f=(String msg)->{System.out.println(msg);
//		
//		};
//		
//		f.sayy("fhghgh");
//	
//	}
//	
//
//}



package newjava8featuresdec;

interface sing {
    void sayy(String msg);
}

public class functionalInterfaceexample implements sing {
//sing s =new sing() {
//	
//}
   
//    public void sayy(String msg) {
//        // Implementation of the method
//        System.out.println(msg);
//        System.out.println("gfg");
//        
//    }

    public static void main(String[] args) {
        functionalInterfaceexample f = new functionalInterfaceexample();
        
        
        
        // Using lambda expression to implement the functional interface
        sing s1 = (String msg) -> {
            f.sayy(msg);
        };

        // Calling the method using the lambda expression
        s1.sayy("fhghgh");
    }
@Override
public void sayy(String msg) {
	// TODO Auto-generated method stub
	
}
}
