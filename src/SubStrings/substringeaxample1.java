package SubStrings;

public class substringeaxample1 {
	public static void main(String[] args) {
		String [] s= {"mounika alla","vani alla","anil alla","teja alla","hgfhgjhjhrhj"};
	String s1="alla";
	int length = s1.length();
	int length3 = s.length;
	for(int i=0;i<length3;i++) {
		int length2 = s[i].length();
		  String substr = s[i].substring(length2 - length);  
		  //System.out.println(substr);
		   //System.out.println(substr1);
	if(substr.equals("alla")) {
		System.out.println(s[i]);
	}
	
	
	

	}
}
}


   