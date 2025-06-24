import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("정수를 입력하시오. : ");
		int num = scanner.nextInt();

		int reverse = 0; // 뒤집힌 숫자

		while (num != 0) {

			int tmp = num % 10; // 마지막 숫자를 가져옴
								// num = 12345 tmp = 5 reverse: 5
								// num = 1234 tmp = 4 reverse: 5 * 10 + 4 = 54
								// num = 123 tmp = 3 reverse: 54 * 10 + 3 = 543
								// num = 12 tmp = 2 reverse: 543 * 10 + 2 = 5432
								// num = 1 tmp = 1 reverse: 5432 * 10 + 1 = 54321
			reverse = reverse * 10 + tmp;

			num = num / 10; // num = 1 --> 1/10 = 0
		}
		System.out.println("뒤집힌 숫자는 : " + reverse);

		scanner.close();

	}

}
