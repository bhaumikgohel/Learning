package Interview;

public class Remove_SpecialChar_String {

	public static void main(String[] args) {
		
		String S1 = "@#$%^& This is new Year @#$%^&*( of 2024";
		
		String b = S1.replaceAll("[^0-9A-Za-z]", "");
		
		System.out.println(b);

	}

}
