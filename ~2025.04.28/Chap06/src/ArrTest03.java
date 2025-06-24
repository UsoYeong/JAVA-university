import java.util.Arrays;

public class ArrTest03 {

	public static void main(String[] args) {
		
		int[] arr1;
		int arr2[];
		int[] arr3 = {1, 2, 3, 4, 5};
		int[] arr4 = new int[] {6, 7, 8, 9};
		
		// arr1 = {1, 3, 5};
		arr1 = new int[] {1, 3, 5};
		
		System.out.println(arr1);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("배열의 길이 : " + arr1.length);
	}

}
