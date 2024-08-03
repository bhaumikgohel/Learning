package javaconcepts;

public class MethodOverld {

	public static void Low(int a, int b, int c) {
		a = b+c;
		System.out.println("Sum of a is a "+ a);
	}
	public static void Low(String d) {
	
		System.out.println("Multiply with d is " + d);
	}
	public static void main(String[] args) {
		
		Low(0, 50, 40);
		Low("bhaumik");
		
	}
}
