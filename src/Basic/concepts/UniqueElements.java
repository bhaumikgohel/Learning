package Basic.concepts;

public class UniqueElements {

	public static void main(String[] args) {
		
		String arr[] = {"Aarey", "Poisar", "Dahanukarwadi", "Aarey","Poisar"};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				//both are equals then store print the value  
				if(arr[i].equals(arr[j])) {
					System.out.println(arr[i] );
				}
			}
		}
		
		
		

	}

}
