public class ArrTest07 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		
		System.out.println("일반 for문 ===============");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("index" + i + " : " + arr[i]);
		}
		System.out.println();
		System.out.println("확장된 for문 =====================");
		for(int x : arr) {
			System.out.println("값 : " + x);
		}
	}

}
