import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 정수 입력받기
		System.out.println("숫자를 입력하세요 :");
		int num = scanner.nextInt();

		long nFac = 1;

		for (int i = 1; i <= num; i++) {
			nFac *= i; // nFac = nFac * i

		}
		System.out.println(num + "의 팩토리얼 값은 : " + nFac);

		scanner.close();


	}

}
