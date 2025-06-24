
public class LoopTest01 {

	public static void main(String[] args) {
		
		int i = 1;
		int sum = 0;

		while (i <= 100) {
			sum += i;
			i = i + 1;

		}
		System.out.println("sum = " + sum);
		System.out.println("i = " + i);

	}

}
