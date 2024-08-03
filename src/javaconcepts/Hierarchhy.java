package javaconcepts;

public class Hierarchhy {

	public void main() {
		System.out.println("This is Main class");
	}
	
}
class SupParent extends Hierarchhy{
	
	static void sub() {
		System.out.println("This is sub class derive from main class");
	}
	
public static void main(String[] args) {
		
		childd c1 = new childd();
		
		c1.main();
		sub();
		c1.child();

	}
}
class childd extends Hierarchhy{
	
	void child() {
		System.out.println("This is child method derive from Main class");
	}
	
	

}