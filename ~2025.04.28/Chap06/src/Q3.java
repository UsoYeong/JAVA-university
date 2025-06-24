import java.util.Arrays;

public class Q3 {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		int[] reverse = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			
			reverse[i] = arr[arr.length - 1 - i];
			
		}
		System.out.println("변경 전 배열 : " + Arrays.toString(arr));
		System.out.println("변경 후 배열 : " + Arrays.toString(reverse));
		
	}

}
