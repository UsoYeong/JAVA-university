
public class Q2 {

	public static void main(String[] args) {
		int[] arr = {12, 7, 20, 3, 15};
		
		int max = arr[0];
	    int min = arr[0];
	    
	    for (int i = 0; i < arr.length; i++) {
	    	if (arr[i] > max) 
	    		max = arr[i];
	    	
	    	if (arr[i] < min) 
	    		min = arr[i];
	    	}
			
		
	    
	    System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);


	}

}
