import java.util.Scanner;

public class StarNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("원하는 숫자를 입력하세요 : ");
		int num = scanner.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		scanner.close();


	}

}
