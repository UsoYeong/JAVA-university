package chap3;

import java.util.Scanner;

public class IfTest2 {
	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		
		if (scanner.hasNextInt()) {
			int i = scanner.nextInt();

		if (i >= 10) {
			if (i % 2 == 0) {
				System.out.println(i + "는 10보다 큰 짝수입니다.");
			} else {
				System.out.println(i + "는 10보다 큰 홀수입니다.");
			}

		} else {
			System.out.println(i + "는 10 보다 작습니다.");
		}

	}
		scanner.close();  

	}

}
