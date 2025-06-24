package chap3;
import java.util.Scanner;
public class Q3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("월을 입력하세요 : ");

		if (scanner.hasNextInt()) {
			int i = scanner.nextInt();

			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
				System.out.println(i + "월은 31일 입니다.");
			} else if (i == 4 || i == 6 || i == 9 || i == 11) {
				System.out.println(i + "월은 30일 입니다.");
			} else if (i == 2) {
				System.out.println(i + "월은 28일 입니다.");
			} else {
				System.out.println("잘못된 입력입니다. 1~12 까지의 숫자만 입력해 주세요.");
			}
		}
		scanner.close();


	}

}
