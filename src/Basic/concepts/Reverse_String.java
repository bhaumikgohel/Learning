package Basic.concepts;

public class Reverse_String {

	public static void main(String[] args) {
		
		String name = "Haapy new year";
		
		String space = " ";
		
		int count = name.length();
		
		for(int i=count-1;i>=0 ;i--) {
			space = space + name.charAt(i);
		}
		System.out.println(space);
		

	}

}
