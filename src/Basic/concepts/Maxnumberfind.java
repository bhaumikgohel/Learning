package Basic.concepts;

public class Maxnumberfind {

	public static void main(String[] args) {
	
		int [] a = new int[] {100,1,5,10,32,54,99,8,4,694};

		int max = a[0];
		
		for(int i=0; i<a.length;i++) {
			if(a[i]>max) 
			{
				max=a[i];
			
			}
			
		}

		System.out.println(max);
	}

}
