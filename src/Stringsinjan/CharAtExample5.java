package Stringsinjan;
// frequency count
public class CharAtExample5 {
public static void main(String[] args) {
	String s="mouniii";
	int count=0;
	for(int i=0;i<=s.length()-1;i++) {
		if(s.charAt(i)=='i') {
			count++;
		}
	}
		System.out.println(count);
		
	}
	
	
	
}

//It returns char value for the particular index