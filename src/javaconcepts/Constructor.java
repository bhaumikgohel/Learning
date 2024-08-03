package javaconcepts;

public class Constructor {

	Constructor(){
		System.out.println("This is Default Constructor");
	}
	
	public static void con1() {
		System.out.println("This is method call with object");
	}

	public static void main(String[] args) {
		
		// Default constructor call while object is created
	
		new Constructor();
		
		con1();
	
	}
	
}
