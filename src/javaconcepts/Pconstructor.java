package javaconcepts;

public class Pconstructor {
	
	Pconstructor(int a) {
		
		a = a+a;
		System.out.println("This is Constructor of A " + a);
		
		
	}
	
	 Pconstructor(int b, int c) {
		 
		b = b + c;
		System.out.println("This is Constructor of B " + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//every time we have to create object and call the constructor, 
		// Over come of constructor problem we user this calling statement, With this calling statement we can not create every time object
		
		 new Pconstructor(5);
		new Pconstructor(10, 20);
		
		System.out.println();

	}

}
