package javaconcepts;

public class Samplethis {

	Samplethis(int a){
		System.out.println("This calling statement for a ");
	}
	Samplethis(int b, int c){
		this(5);
		System.out.println("This calling statement for b ");
	}
	Samplethis(int d, int e,int f){
		this(6,7);
		
		System.out.println("This calling statement for c ");
	}
	
	public static void main(String args[]) {
		
		new Samplethis(5, 6, 7);
		System.out.println("This is THIS CALLING Statement");
	}
	
}
