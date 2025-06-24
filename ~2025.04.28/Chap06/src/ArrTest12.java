import java.util.Arrays;

public class ArrTest12 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		System.out.println("초기화 : " + Arrays.toString(arr));

		Arrays.fill(arr, 55);
		
		System.out.println("채우기 : " + Arrays.toString(arr));
		
		int[] arr2 = {1, 2, 5, 4, 3};
		Arrays.sort(arr2); // 1, 2, 3, 4, 5
		System.out.println("3의 index : " + Arrays.binarySearch(arr2, 9));

		

	}

}
