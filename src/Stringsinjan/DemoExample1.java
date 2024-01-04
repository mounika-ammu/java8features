package Stringsinjan;

public class DemoExample1 {
	public static void main(String[] args) {
		String s1="mounika";
		String s2="mounika";
		System.out.println(s1==s2);
	}
// while creating string literal it will store data in constant pool again try to create a same name that tym
	
	//jvm will check already it will be there in constant pool or not .if it is there then again it will not stored 
	//https://www.google.com/imgres?imgurl=https%3A%2F%2Fres.cloudinary.com%2Fpracticaldev%2Fimage%2Ffetch%2Fs--i8o5ahKs--%2Fc_imagga_scale%2Cf_auto%2Cfl_progressive%2Ch_420%2Cq_auto%2Cw_1000%2Fhttps%3A%2F%2Fdev-to-uploads.s3.amazonaws.com%2Fuploads%2Farticles%2F79ffu9j89q121kcllxes.png&tbnid=B6s0-3T4ntjYcM&vet=12ahUKEwj81bfvyMCDAxWeTmwGHQbSBuQQMygTegQIARB0..i&imgrefurl=https%3A%2F%2Fdev.to%2Frohanharichandan%2Funderstanding-string-memory-allocation-in-java-why-not-to-use-operator-rather-to-use-stringequals-function-3n58&docid=BTGRWfcdL5ZN4M&w=1000&h=420&q=string%20heap%20memory%20usage%20in%20java&ved=2ahUKEwj81bfvyMCDAxWeTmwGHQbSBuQQMygTegQIARB0
}
