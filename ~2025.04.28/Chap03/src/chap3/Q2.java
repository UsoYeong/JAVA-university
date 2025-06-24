package chap3;
import java.util.Scanner;
public class Q2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int i = scanner.nextInt();

		if (i >= 90 && i < 100) {
			System.out.println("학점 : A " + i);
		} else if (i >= 80 && i < 90) {
			System.out.println("학점 B : " + i);
		} else if (i >= 80 && i < 90) {
			System.out.println("학점 C : " + i);
		} else if (i >= 70 && i < 80) {
			System.out.println("학점 D : " + i);
		} else if (i >= 60 && i < 70) {
			System.out.println("학점 E : " + i);
		} else {
			System.out.println("학점 F : " + i);
		}

		scanner.close();


	}

}
