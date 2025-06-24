package chap3;
import java.util.Scanner;
public class Q1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int i = scanner.nextInt();

		switch (i / 10) {

		case 10:
		case 9:
			System.out.println(i + "는 A입니다");
			break;
		case 8:
			System.out.println(i + "는 B입니다");
			break;
		case 7:
			System.out.println(i + "는 C입니다");
			break;
		case 6:
			System.out.println(i + "는 D입니다");
			break;
		default:
			System.out.println(i + "는 F입니다.");

			scanner.close();

		}
	}
}
