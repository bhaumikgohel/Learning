package Interview;

public class Fibonacci {
	
	

	public static void main(String[] args) {

		String name = "Bhaumik";
		String c1 = " ";
		
		int i1 = 0, i2 = 1,i, i3, count=10;
		
		for(i=2;i<count;++i) {
			i3 = i1+i2;
			System.out.println(" "+i3);
			
			i1=i2;
			i2=i3;
		}
		
		int count1 = name.length();
		
		for(int j=count1-1;j>=0;j--) {
			c1 = c1 + name.charAt(j);
			
		}
		
		System.out.println("Reverse string " + c1);
	}

}
