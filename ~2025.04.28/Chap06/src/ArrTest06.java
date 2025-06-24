import java.util.Arrays;

public class ArrTest06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr1 = new int[2][];
		arr1[0] = new int[] {1, 2};
		arr1[1] = new int[] {3, 4, 5};
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr1[0]));
		System.out.println(Arrays.toString(arr1[1]));
		
		System.out.println("==================");
		
		int[][][] arr2 = new int[2][][];
		arr2[0] = new int[2][];
		arr2[0][0] = new int[] {1, 2, 3};
		arr2[0][1] = new int[] {4, 5};
		
		arr2[1] = new int[3][];
		arr2[1][0] = new int[] {6, 7, 8};
		arr2[1][1] = new int[] {9, 10};
		arr2[1][2] = new int[] {11};
		
	//	System.out.println(Arrays.toString(arr2));
	//	System.out.println(Arrays.toString(arr2[0]));
	//	System.out.println(Arrays.toString(arr2[0][0]));
		
		System.out.println(Arrays.deepToString(arr1));
		System.out.println(Arrays.deepToString(arr2));

		
	}

}
