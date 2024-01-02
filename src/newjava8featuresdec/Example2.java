package newjava8featuresdec;
interface Singining{
	public void sing();
}
public class Example2 {
	public static void main(String[] args) {
		
		Singining say=()->System.out.println("saying");
		say.sing();
		
	}

}
