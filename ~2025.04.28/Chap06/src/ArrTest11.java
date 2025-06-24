import java.util.Arrays;

public class ArrTest11 {
	public static void main(String[] args) {
		
		System.out.println("1차원 배열=========");

		int[] arr1 = {1, 2, 3};
		int[] arr2 = {1, 2, 3};
		
		System.out.println("== : " + (arr1 == arr2)); // 별도의 메모리 공간에 저장
		System.out.println("equals = " + Arrays.equals(arr1, arr2));
		
		System.out.println("2차원 배열=========");
		
		int[][] arr3 = {{1, 2}, {3, 4}};
		int[][] arr4 = {{1, 2}, {3, 4}};
		System.out.println("equals : " + Arrays.equals(arr3, arr4));
		System.out.println("deepEquals : " + Arrays.deepEquals(arr3, arr4));
		
	}

}
