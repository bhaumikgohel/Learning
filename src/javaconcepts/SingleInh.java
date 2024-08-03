package javaconcepts;

public class SingleInh {
	int i=90;
	 void mul(int a, int b, int c) {
		
	c = a*b;
	System.out.println("C value is :"+ c);
	}
	 
}

class child extends SingleInh{
	
	

	void div(int f, int g, int h) {
		h = f/g;
		System.out.println("This is child class of SingleInh Div of : " + h);
		
	}
	
	public static void main(String[] args) {
		child c1 = new child();
		
		c1.mul(5, 10, 0);
		
		c1.div(50, 5, 0);
		System.out.println("i value is :" + c1.i);
		
	}
}
