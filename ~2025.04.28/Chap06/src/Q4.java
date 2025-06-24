import java.util.Arrays;

public class Q4 {

	public static void main(String[] args) {
		int[] arr = {3, 4, 1, 2, 5};
		int[] back = new int[arr.length];
		
		Arrays.sort(arr); // 1, 2, 3, 4, 5
		
		for (int i : back) {
			{back[i] = arr[arr.length - 1 - i]; 
		}
			
		}
		
		System.out.println("내림차순 : " + Arrays.toString(back));

	}

}
