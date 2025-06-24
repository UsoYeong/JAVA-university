import java.util.Arrays;

public class ArrTest08 {

	public static void main(String[] args) {
		int[] arr = {3, 1, 4, 5, 2};
		System.out.println("변경전 : " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("변경후 : " + Arrays.toString(arr));
		

	}

}
