package InterfaceandAbstractConcept;



//Interface use key word to implement interface
//Interface have static and Final variables
//Interface have Abstract method
//Interface method haven't body
//Interface abstract methods are public
//We should not create object of interface
//Interface to Interface we use Extends keyword
//Interface support multiple inheritence
//Interface reference variable hold class object
//Interface static method only using by its interface name

interface shape{
	
	int height = 10;
	int width = 20;
	
	void sum();
	
	default void multiply() {
		int result = height*width;
		
		System.out.println("Multiply: "+result);
	}
	
	static void minus() {
		int result = width-height;
		System.out.println("Minus: "+result);
	}
	
}

public class Interfacedemo implements shape{
	
	public void sum() {
		int result = height + width;
		System.out.println("Sum: "+result);
	}

	public static void main(String[] args) {
		
		//Scenario 1
		
		//Interfacedemo d1 = new Interfacedemo();
		//d1.sum();
		//d1.multiply();
		
		//shape.minus();
		
		//Scenario 2
		
		//shape d1 = new Interfacedemo();
		//d1.sum();
		//d1.multiply();
		
		//shape.minus();
		
	}

}
