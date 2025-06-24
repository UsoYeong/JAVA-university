import java.util.Scanner;

public class PrimeNumber {
		
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

			System.out.println("정수를 입력하시오. : ");
			int num = scanner.nextInt();

			boolean isPrime = true; // 소수 여부를 판단할 논리형 변수 isPrime을 true로 초기화

			if (num <= 1) {
				isPrime = false;
			} else {
				for (int i = 2; i <= num / 2; i++) { // 어차피 num의 절반을 넘는 수로는 나눌 수 없음
					if (num % i == 0) { // num이 i로 나누어 떨어지면, 나머지가 0이면 소수가 아님
						isPrime = false;
						break;
					}

				}
			}

			if (isPrime)
				System.out.println(num + "는 소수입니다.");
			else
				System.out.println(num + "는 소수가 아닙니다.");

			scanner.close();


	}

}
