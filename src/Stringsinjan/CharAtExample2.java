package Stringsinjan;
// odd characters
public class CharAtExample2 {
	public static void main(String[] args) {
		String s="welcome to java programming";
		for(int i=0;i<=s.length()-1;i++) {
			if(i%2!=0) {
				System.out.println("charAt " +  i+" "   + s.charAt(i));
				
			}
			
			
			
		}
		
	}

}
