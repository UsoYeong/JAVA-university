import java.util.Arrays;

public class ArrTest10 {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5, 6}; // original
		int[] arr2 = new int[arr1.length]; // copy
		
		//for(int i = 0; i < arr1.length; i++) {
		// arr2[i] = arr1[i];
		//	arr2 = Arrays.copyOf(arr1, 2);
		//}
		
		// arr2 = Arrays.copyOfRange(arr1, 3, 5);
		System.arraycopy(arr1, 3, arr2, 2, 3);
		System.out.println("원본 : " + Arrays.toString(arr1));
		System.out.println("원본 : " + Arrays.toString(arr2));
		
		int[] original = {1, 2, 3};
		int[] copy = Arrays.copyOf(original, original.length);
		System.out.println("Arrays.copy.Of = " + Arrays.toString(copy));
		
		int[] nums = {1, 2, 3, 4, 5};
		int[] range = Arrays.copyOfRange(nums, 1, 4);
		System.out.println("Arrays.copyOfRange = " + Arrays.toString(range));

	}

}
