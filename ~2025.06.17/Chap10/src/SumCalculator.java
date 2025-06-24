
public class SumCalculator {
	
	public static int getSum(int start, int end) {
		int sum = 0;
		for(int i = start; i <= end; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static int getSum(int start, int end, int step) {
		int sum = 0;
		for(int i = start; i <= end; i+=step) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// int s = getSum(1, 10);
		// System.out.println("합계 = " + s);
		System.out.println(getSum(1, 10));
		System.out.println(getSum(1, 10, 2));
		System.out.println(getSum(1, 10, 3));

	}

}
