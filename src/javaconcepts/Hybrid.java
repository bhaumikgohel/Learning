package javaconcepts;

public class Hybrid {

	void main() {
		System.out.println("This is Main method of mail class");
	}

}
class Shool extends Hybrid{
	static void School() {
		System.out.println("This is school");
	}
}
class student extends Shool{
	
	public void student() {
		System.out.println("This is student name");
	}
}
class Staff extends Hybrid{
	
	static int staff() {
		System.out.println("This is staff cabin");
		return 0;
	}
	public static void main(String[] args) {
	
		
		Staff s1 = new  Staff();
		s1.main();
		staff();
		
		student s2 = new student();
		s2.student();
		s2.School();
		
	}
}
