package javaconcepts;

public class Samplemethod {

	void Add(int a, int b, int c) {
		
		a = b+c;
		System.out.println("SUM OF B and C :"+ a);
	}
	
	public static void div(int c, int d, int e) {
		
		e = c * d;
		System.out.println("Div is e :"+e);
	}
	
	public static void main(String[] args) {
		Samplemethod s1 = new Samplemethod();
		
		// non static method only access with object
		s1.Add(0, 20, 30);
		
		//For static method we can use directly
		div(5,3,0);
	}

}
