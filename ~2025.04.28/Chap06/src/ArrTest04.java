import java.util.Arrays;

public class ArrTest04 {

	public static void main(String[] args) {
		int[][] arr1;
		int arr2[][];
		int[] arr3[];
		
		// arr1 = {{1, 2} {3, 4}}; //에러
		arr1 = new int[][] {{1,2}, {3,4}};
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr1[0]));
		System.out.println(Arrays.toString(arr1[1]));

	}

}
